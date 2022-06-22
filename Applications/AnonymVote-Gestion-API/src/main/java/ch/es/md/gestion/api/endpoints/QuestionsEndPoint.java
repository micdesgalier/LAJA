
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.ChoixEntity;
import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.Entities.SondageEntity;
import ch.es.md.gestion.api.QuestionsApi;
import ch.es.md.gestion.api.exceptions.QuestionNotFoundException;
import ch.es.md.gestion.api.exceptions.SondageNotFoundException;
import ch.es.md.gestion.api.model.Choix;
import ch.es.md.gestion.api.model.Question;
import ch.es.md.gestion.repositories.ChoixRepository;
import ch.es.md.gestion.repositories.QuestionRepository;
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

@RestController
@CrossOrigin
public class QuestionsEndPoint implements QuestionsApi {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ChoixRepository choixRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Question>> listQuestionsUsingGET()
    {
        List<QuestionEntity> questionEntities = null;
        questionEntities = questionRepository.findAll();

        List<Question> questions  = new ArrayList<>();
        for (QuestionEntity questionEntity : questionEntities) {
            Question question = new Question();
            question.setIdQuestion(questionEntity.getId());
            question.setIdSondage(questionEntity.getIdSondage());
            question.setQuestion(questionEntity.getQuestion());
            questions.add(question);
        }
        return new ResponseEntity<List<Question>>(questions,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addQuestionUsingPOST(@RequestBody Question question) {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setId(question.getIdQuestion());
        questionEntity.setIdSondage(question.getIdSondage());
        questionEntity.setQuestion(question.getQuestion());

        QuestionEntity questionAdded = questionRepository.save(questionEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(questionAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @Override
    public ResponseEntity<Question> listQuestionUsingGET(Integer id) {
        Optional<QuestionEntity> opt = questionRepository.findById(id);
        if (opt.isPresent()) {
            QuestionEntity questionEntity = opt.get();
            Question question = new Question();
            question.setIdQuestion(questionEntity.getId());
            question.setIdSondage(questionEntity.getIdSondage());
            question.setQuestion(questionEntity.getQuestion());

            return new ResponseEntity<Question>(question, HttpStatus.OK);
        } else {

            throw new QuestionNotFoundException(id);
        }
    }

    @Override
    public ResponseEntity<List<Choix>> listChoixQuestionUsingID(Integer id)
    {
        List<ChoixEntity> choixEntities = questionRepository.findAllChoixByQuestionId(id);

        List<Choix> lchoix  = new ArrayList<>();
        for (ChoixEntity choixEntity : choixEntities) {
            Choix choix = new Choix();
            choix.setIdChoix(choixEntity.getId());
            choix.setIdQuestion(choixEntity.getIdQuestion());
            choix.setChoix(choixEntity.getChoix());
            choix.setNbChoisi(choixEntity.getNbChoisi());
            lchoix.add(choix);
        }
        return new ResponseEntity<List<Choix>>(lchoix, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> listLastQuestionUsingGET() {
        Integer lastId = questionRepository.findLastQuestionId();

        return new ResponseEntity<Integer>(lastId, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<Void> updateQuestionUsingID(Integer id, @RequestBody Question question) {
        Optional<QuestionEntity> opt = questionRepository.findById(id);

        if (opt.isPresent()) {
            QuestionEntity questionEntity = opt.get();
            questionEntity.setIdSondage(question.getIdSondage());
            questionEntity.setQuestion(question.getQuestion());

            questionRepository.save(questionEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new QuestionNotFoundException(id);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Void> deleteQuestionUsingID(Integer id) {
        Optional<QuestionEntity> opt = questionRepository.findById(id);

        if (opt.isPresent()) {

            choixRepository.deleteAllByQuestionId(id);

            QuestionEntity questionEntity = opt.get();

            questionRepository.delete(questionEntity);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {

            throw new SondageNotFoundException(id);
        }
    }
}
