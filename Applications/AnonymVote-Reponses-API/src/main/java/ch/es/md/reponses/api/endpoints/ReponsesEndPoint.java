
package ch.es.md.reponses.api.endpoints;

import ch.es.md.reponses.Entities.ReponseEntity;
import ch.es.md.reponses.api.ReponsesApi;
import ch.es.md.reponses.api.exceptions.ReponseNotFoundException;
import ch.es.md.reponses.api.model.Reponse;
import ch.es.md.reponses.repositories.ReponseRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class ReponsesEndPoint implements ReponsesApi {
    @Autowired
    private ReponseRepository reponseRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Reponse>> listReponsesUsingGET()
    {
        List<ReponseEntity> reponseEntities = null;
        reponseEntities = reponseRepository.findAll();

        List<Reponse> reponses  = new ArrayList<>();
        for (ReponseEntity reponseEntity : reponseEntities) {
            Reponse reponse = new Reponse();
            reponse.setIdReponse(reponseEntity.getId());
            reponse.setIdQuestion(reponseEntity.getIdQuestion());
            reponse.setIdChoix(reponseEntity.getIdChoix());
            reponse.setCode(reponseEntity.getCode());
            reponses.add(reponse);
        }
        return new ResponseEntity<List<Reponse>>(reponses,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addReponseUsingPOST(@RequestBody Reponse reponse) {
        ReponseEntity reponseEntity = new ReponseEntity();
        reponseEntity.setId(reponse.getIdReponse());
        reponseEntity.setIdQuestion(reponse.getIdQuestion());
        reponseEntity.setIdChoix(reponse.getIdChoix());
        reponseEntity.setCode(reponse.getCode());

        ReponseEntity reponseAdded = reponseRepository.save(reponseEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(reponseAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @Override
    public ResponseEntity<Reponse> listReponseUsingGET(Integer id) {
        Optional<ReponseEntity> opt = reponseRepository.findById(id);
        if (opt.isPresent()) {
            ReponseEntity reponseEntity = opt.get();
            Reponse reponse = new Reponse();
            reponseEntity.setId(reponse.getIdReponse());
            reponseEntity.setIdQuestion(reponse.getIdQuestion());
            reponseEntity.setIdChoix(reponse.getIdChoix());
            reponseEntity.setCode(reponse.getCode());

            return new ResponseEntity<Reponse>(reponse, HttpStatus.OK);
        } else {

            throw new ReponseNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> deleteReponseUsingID(Integer id) {
        Optional<ReponseEntity> opt = reponseRepository.findById(id);

        if (opt.isPresent()) {
            ReponseEntity reponseEntity = opt.get();

            reponseRepository.delete(reponseEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new ReponseNotFoundException(id);
        }
    }

    @Override
    public ResponseEntity<List<Reponse>> listReponsesUsingCode(String code)
    {
        List<ReponseEntity> reponseEntities = null;
        reponseEntities = reponseRepository.findAllByCode(code);

        List<Reponse> reponses  = new ArrayList<>();
        for (ReponseEntity reponseEntity : reponseEntities) {
            Reponse reponse = new Reponse();
            reponse.setIdReponse(reponseEntity.getId());
            reponse.setIdQuestion(reponseEntity.getIdQuestion());
            reponse.setIdChoix(reponseEntity.getIdChoix());
            reponse.setCode(reponseEntity.getCode());
            reponses.add(reponse);
        }
        return new ResponseEntity<List<Reponse>>(reponses,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Reponse>> listReponsesUsingIdQuestion(Integer idQuestion)
    {
        List<ReponseEntity> reponseEntities = null;
        reponseEntities = reponseRepository.findAllByIdQuestion(idQuestion);

        List<Reponse> reponses  = new ArrayList<>();
        for (ReponseEntity reponseEntity : reponseEntities) {
            Reponse reponse = new Reponse();
            reponse.setIdReponse(reponseEntity.getId());
            reponse.setIdQuestion(reponseEntity.getIdQuestion());
            reponse.setIdChoix(reponseEntity.getIdChoix());
            reponse.setCode(reponseEntity.getCode());
            reponses.add(reponse);
        }
        return new ResponseEntity<List<Reponse>>(reponses,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Reponse>> listReponsesUsingIdChoix(Integer idChoix)
    {
        List<ReponseEntity> reponseEntities = null;
        reponseEntities = reponseRepository.findAllByIdChoix(idChoix);

        List<Reponse> reponses  = new ArrayList<>();
        for (ReponseEntity reponseEntity : reponseEntities) {
            Reponse reponse = new Reponse();
            reponse.setIdReponse(reponseEntity.getId());
            reponse.setIdQuestion(reponseEntity.getIdQuestion());
            reponse.setIdChoix(reponseEntity.getIdChoix());
            reponse.setCode(reponseEntity.getCode());
            reponses.add(reponse);
        }
        return new ResponseEntity<List<Reponse>>(reponses,HttpStatus.OK);
    }
}
