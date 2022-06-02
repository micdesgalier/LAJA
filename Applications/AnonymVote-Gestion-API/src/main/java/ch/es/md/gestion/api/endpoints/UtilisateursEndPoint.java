
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.SondageEntity;
import ch.es.md.gestion.api.UtilisateursApi;
import ch.es.md.gestion.Entities.UtilisateurEntity;
import ch.es.md.gestion.api.exceptions.LoginErrorException;
import ch.es.md.gestion.api.model.Sondage;
import ch.es.md.gestion.api.model.Utilisateur;
import ch.es.md.gestion.api.exceptions.UtilisateurNotFoundException;
import ch.es.md.gestion.repositories.UtilisateurRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@SecurityRequirement(name = "bearerAuth")
public class UtilisateursEndPoint implements UtilisateursApi {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Utilisateur>> listUtilisateursUsingGET()
    {
        List<UtilisateurEntity> utilisateurEntities = null;
        utilisateurEntities = utilisateurRepository.findAll();

        List<Utilisateur> utilisateurs  = new ArrayList<>();

        for (UtilisateurEntity utilisateurEntity : utilisateurEntities) {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setIdUtilisateur(utilisateurEntity.getId());
            utilisateur.setLogin(utilisateurEntity.getLogin());
            utilisateur.setMotDePasse(utilisateurEntity.getMotDePasse());
            utilisateur.setType(utilisateurEntity.isType());
            utilisateurs.add(utilisateur);
        }

        return new ResponseEntity<List<Utilisateur>>(utilisateurs,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addUtilisateurUsingPOST(@RequestBody Utilisateur utilisateur) {
        UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
        utilisateurEntity.setLogin(utilisateur.getLogin());
        utilisateurEntity.setMotDePasse(utilisateur.getMotDePasse());
        utilisateurEntity.setType(utilisateur.getType());

        UtilisateurEntity utilisateurAdded = utilisateurRepository.save(utilisateurEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(utilisateurAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @Override
    public ResponseEntity<Utilisateur> listUtilisateurUsingGET(Integer id) {
        Optional<UtilisateurEntity> opt = utilisateurRepository.findById(id);
        if (opt.isPresent()) {
            UtilisateurEntity utilisateurEntity = opt.get();
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setIdUtilisateur(utilisateurEntity.getId());
            utilisateur.setLogin(utilisateurEntity.getLogin());
            utilisateur.setMotDePasse(utilisateurEntity.getMotDePasse());
            utilisateur.setType(utilisateurEntity.isType());
            return new ResponseEntity<Utilisateur>(utilisateur, HttpStatus.OK);
        } else {

            throw new UtilisateurNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> deleteUtilisateurUsingID(Integer id) {
        Optional<UtilisateurEntity> opt = utilisateurRepository.findById(id);

        if (opt.isPresent()) {
            UtilisateurEntity utilisateurEntity = opt.get();

            utilisateurRepository.delete(utilisateurEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new UtilisateurNotFoundException(id);
        }
    }

    @GetMapping(value="/tokens")
    public ResponseEntity<String> requestToken(String login, String password) {

        UtilisateurEntity utilisateur = utilisateurRepository.findByLogin(login);

        System.out.println(login);
        System.out.println(password);

        if (utilisateur != null) {
            if(utilisateur.getMotDePasse().equals(password)) {
                String token = Jwts.builder().setSubject(login).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, secretKey).compact();
                System.out.println(token);
                return new ResponseEntity<String>(token, HttpStatus.OK);
            }else {
                throw new LoginErrorException(login);
            }
        } else {

            throw new UtilisateurNotFoundException();
        }
    }
}
