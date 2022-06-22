
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.ChoixEntity;
import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.Entities.SondageEntity;
import ch.es.md.gestion.Entities.UtilisateurEntity;
import ch.es.md.gestion.api.SondagesApi;
import ch.es.md.gestion.api.exceptions.SondageNotFoundException;
import ch.es.md.gestion.api.exceptions.UtilisateurNotFoundException;
import ch.es.md.gestion.api.model.Choix;
import ch.es.md.gestion.api.model.Question;
import ch.es.md.gestion.api.model.Sondage;
import ch.es.md.gestion.api.model.Utilisateur;
import ch.es.md.gestion.repositories.ChoixRepository;
import ch.es.md.gestion.repositories.QuestionRepository;
import ch.es.md.gestion.repositories.SondageRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.io.Console;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class SondagesEndPoint implements SondagesApi {
    @Autowired
    private SondageRepository sondageRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ChoixRepository choixRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Sondage>> listSondagesUsingGET()
    {
        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAll();

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {
            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sondage>> listSondagesUtilisateurUsingGET(String login) {

        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAllSondagesUtilisateur(login);

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {

            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sondage>> listSondagesOwnByUtilisateurUsingGET(String login) {

        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAllSondagesOwnByUtilisateur(login);

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {

            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sondage>> listSondagesOuvertsUsingGET()
    {
        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAllSondagesOuverts();

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {
            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sondage>> listSondagesCreationUsingGET()
    {
        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAllSondagesCreation();

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {
            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sondage>> listSondagesFermesUsingGET()
    {
        List<SondageEntity> sondageEntities = null;
        sondageEntities = sondageRepository.findAllSondagesFermes();

        List<Sondage> sondages  = new ArrayList<>();
        for (SondageEntity sondageEntity : sondageEntities) {
            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());
            sondages.add(sondage);
        }
        return new ResponseEntity<List<Sondage>>(sondages,HttpStatus.OK);
    }
    @Override
    public ResponseEntity<Integer> listLastSondageUsingGET() {
        Integer lastId = sondageRepository.findLastSondageId();

        return new ResponseEntity<Integer>(lastId, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Question>> listQuestionsSondageUsingID(Integer id)
    {
        List<QuestionEntity> questionEntities = sondageRepository.findAllQuestionBySondageId(id);

        List<Question> questions  = new ArrayList<>();
        for (QuestionEntity questionEntity : questionEntities) {
            Question question = new Question();
            question.setIdQuestion(questionEntity.getId());
            question.setIdSondage(questionEntity.getIdSondage());
            question.setQuestion(questionEntity.getQuestion());
            questions.add(question);
        }
        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addSondageUsingPOST(@RequestBody Sondage sondage) {
        SondageEntity sondageEntity = new SondageEntity();
        sondageEntity.setIdUtilisateur(sondage.getIdUtilisateur());
        sondageEntity.setSujet(sondage.getSujet());
        sondageEntity.setOuvert(sondage.getOuvert());
        sondageEntity.setBloque(sondage.getBloque());

        SondageEntity sondageAdded = sondageRepository.save(sondageEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(sondageAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @Override
    public ResponseEntity<Sondage> listSondageUsingGET(Integer id) {
        Optional<SondageEntity> opt = sondageRepository.findById(id);
        if (opt.isPresent()) {
            SondageEntity sondageEntity = opt.get();
            Sondage sondage = new Sondage();
            sondage.setIdSondage(sondageEntity.getId());
            sondage.setIdUtilisateur(sondageEntity.getIdUtilisateur());
            sondage.setSujet(sondageEntity.getSujet());
            sondage.setOuvert(sondageEntity.isOuvert());
            sondage.setBloque(sondageEntity.isBloque());

            return new ResponseEntity<Sondage>(sondage, HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> updateSondageUsingID(Integer id, @RequestBody Sondage sondage) {
        Optional<SondageEntity> opt = sondageRepository.findById(id);

        if (opt.isPresent()) {
            SondageEntity sondageEntity = opt.get();
            sondageEntity.setIdUtilisateur(sondage.getIdUtilisateur());
            sondageEntity.setSujet(sondage.getSujet());
            sondageEntity.setOuvert(sondage.getOuvert());
            sondageEntity.setBloque(sondage.getBloque());

            sondageRepository.save(sondageEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> ouvrirSondageUsingID(Integer id) {
        Optional<SondageEntity> opt = sondageRepository.findById(id);

        if (opt.isPresent()) {
            SondageEntity sondageEntity = opt.get();
            sondageEntity.setOuvert(true);
            sondageEntity.setBloque(true);

            sondageRepository.save(sondageEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> fermerSondageUsingID(Integer id) {
        Optional<SondageEntity> opt = sondageRepository.findById(id);

        if (opt.isPresent()) {
            SondageEntity sondageEntity = opt.get();
            sondageEntity.setOuvert(false);

            sondageRepository.save(sondageEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> deleteSondageUsingID(Integer id) {

        Optional<SondageEntity> opt = sondageRepository.findById(id);
        List<QuestionEntity> questionEntities = sondageRepository.findAllQuestionBySondageId(id);

        if (opt.isPresent()) {

            for (QuestionEntity questionEntity : questionEntities) {

                choixRepository.deleteAllByQuestionId(questionEntity.getId());
            }

            questionRepository.deleteAllBySondageId(id);

            SondageEntity sondageEntity = opt.get();

            sondageRepository.delete(sondageEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }
}
