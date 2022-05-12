
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.api.SondeursApi;
import ch.es.md.gestion.api.SondeursApi;
import ch.es.md.gestion.Entities.SondeurEntity;
import ch.es.md.gestion.api.model.Sondeur;
import ch.es.md.gestion.api.exceptions.SondeurNotFoundException;
import ch.es.md.gestion.repositories.SondeurRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SondeursEndPoint implements SondeursApi {
    @Autowired
    private SondeurRepository sondeurRepository;

    public ResponseEntity<List<Sondeur>> listSondeursUsingGET(String login)
    {
        List<SondeurEntity> sondeurEntities = null;
        if (login == null) {
            sondeurEntities = sondeurRepository.findAll();
        } else {
            sondeurEntities = sondeurRepository.findByLoginLikeWithQuery("%"+login+"%");
        }
        List<Sondeur> sondeurs  = new ArrayList<>();
        for (SondeurEntity sondeurEntity : sondeurEntities) {
            Sondeur sondeur = new Sondeur();
            sondeur.setIdSondeur(sondeurEntity.getId());
            sondeur.setLogin(sondeurEntity.getLogin());
            sondeur.setMotDePasse(sondeurEntity.getMotDePasse());
            System.out.println("GET: " + sondeur.getMotDePasse());
            sondeurs.add(sondeur);
        }
        return new ResponseEntity<List<Sondeur>>(sondeurs,HttpStatus.OK);
    }

    public ResponseEntity<Void> addSondeurUsingPOST(@RequestBody Sondeur sondeur) {
        SondeurEntity sondeurEntity = new SondeurEntity();
        sondeurEntity.setLogin(sondeur.getLogin());
        sondeurEntity.setMotDePasse(sondeur.getMotDePasse());

        System.out.println("POST: " + sondeur.getMotDePasse());

        SondeurEntity sondeurAdded = sondeurRepository.save(sondeurEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(sondeurAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    public ResponseEntity<Sondeur> listSondeurUsingGET(Integer id) {
        Optional<SondeurEntity> opt = sondeurRepository.findById(id);
        if (opt.isPresent()) {
            SondeurEntity sondeurEntity = opt.get();
            Sondeur sondeur = new Sondeur();
            sondeur.setIdSondeur(sondeurEntity.getId());
            sondeur.setLogin(sondeurEntity.getLogin());
            sondeur.setMotDePasse(sondeurEntity.getMotDePasse());
            return new ResponseEntity<Sondeur>(sondeur, HttpStatus.OK);
        } else {

            throw new SondeurNotFoundException(id);
        }
    }
}
