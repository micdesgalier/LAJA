
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.ChoixEntity;
import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.api.ChoixApi;
import ch.es.md.gestion.api.exceptions.ChoixNotFoundException;
import ch.es.md.gestion.api.exceptions.QuestionNotFoundException;
import ch.es.md.gestion.api.model.Choix;
import ch.es.md.gestion.api.model.Question;
import ch.es.md.gestion.repositories.ChoixRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class ChoixEndPoint implements ChoixApi {
    @Autowired
    private ChoixRepository choixRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Choix>> listChoixUsingGET()
    {
        List<ChoixEntity> choixEntities = null;
        choixEntities = choixRepository.findAll();

        List<Choix> choixList  = new ArrayList<>();
        for (ChoixEntity choixEntity : choixEntities) {
            Choix choix = new Choix();
            choix.setIdChoix(choixEntity.getId());
            choix.setIdQuestion(choixEntity.getIdQuestion());
            choix.setChoix(choixEntity.getChoix());
            choix.setNbChoisi(choixEntity.getNbChoisi());
            choixList.add(choix);
        }
        return new ResponseEntity<List<Choix>>(choixList,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addChoixUsingPOST(@RequestBody Choix choix) {
        ChoixEntity choixEntity = new ChoixEntity();
        choixEntity.setId(choix.getIdChoix());
        choixEntity.setIdQuestion(choix.getIdQuestion());
        choixEntity.setChoix(choix.getChoix());
        choixEntity.setNbChoisi(choix.getNbChoisi());

        ChoixEntity choixAdded = choixRepository.save(choixEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(choixAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @Override
    public ResponseEntity<Choix> listChoixUsingGET(Integer id) {
        Optional<ChoixEntity> opt = choixRepository.findById(id);
        if (opt.isPresent()) {
            ChoixEntity choixEntity = opt.get();
            Choix choix = new Choix();
            choix.setIdChoix(choixEntity.getId());
            choix.setIdQuestion(choixEntity.getIdQuestion());
            choix.setChoix(choixEntity.getChoix());
            choix.setNbChoisi(choixEntity.getNbChoisi());

            return new ResponseEntity<Choix>(choix, HttpStatus.OK);
        } else {

            throw new ChoixNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> updateChoixUsingID(Integer id, @RequestBody Choix choix) {
        Optional<ChoixEntity> opt = choixRepository.findById(id);

        if (opt.isPresent()) {
            ChoixEntity choixEntity = opt.get();
            choixEntity.setId(choix.getIdChoix());
            choixEntity.setIdQuestion(choix.getIdQuestion());
            choixEntity.setChoix(choix.getChoix());
            choixEntity.setNbChoisi(choix.getNbChoisi());

            choixRepository.save(choixEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new ChoixNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> deleteChoixUsingID(Integer id) {
        Optional<ChoixEntity> opt = choixRepository.findById(id);

        if (opt.isPresent()) {
            ChoixEntity choixEntity = opt.get();

            choixRepository.delete(choixEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new ChoixNotFoundException(id);
        }
    }
}
