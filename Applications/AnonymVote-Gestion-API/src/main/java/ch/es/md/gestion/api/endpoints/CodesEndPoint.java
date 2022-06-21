
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.CodeEntity;
import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.Entities.SondageEntity;
import ch.es.md.gestion.Entities.UtilisateurEntity;
import ch.es.md.gestion.api.CodesApi;
import ch.es.md.gestion.api.exceptions.CodeNotFoundException;
import ch.es.md.gestion.api.exceptions.SondageNotFoundException;
import ch.es.md.gestion.api.exceptions.UtilisateurNotFoundException;
import ch.es.md.gestion.api.model.Code;
import ch.es.md.gestion.api.model.Question;
import ch.es.md.gestion.api.model.Sondage;
import ch.es.md.gestion.api.model.Utilisateur;
import ch.es.md.gestion.repositories.CodeRepository;
import ch.es.md.gestion.repositories.SondageRepository;
import ch.es.md.gestion.repositories.UtilisateurRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@CrossOrigin
public class CodesEndPoint implements CodesApi {
    @Autowired
    private CodeRepository codeRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private SondageRepository sondageRepository;

    @Value("${jwt.secret}")
    private String secretKey;

    @Override
    public ResponseEntity<List<Code>> listCodesUsingGET()
    {
        List<CodeEntity> codeEntities = null;
        codeEntities = codeRepository.findAll();

        List<Code> codes  = new ArrayList<>();
        for (CodeEntity codeEntity : codeEntities) {
            Code code = new Code();
            code.setIdCode(codeEntity.getId());
            code.setIdUtilisateur(codeEntity.getIdUtilisateur());
            code.setIdSondage(codeEntity.getIdSondage());
            code.setCode(codeEntity.getCode());
            codes.add(code);
        }
        return new ResponseEntity<List<Code>>(codes,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Code> listCodeUsingGET(Integer id) {
        Optional<CodeEntity> opt = codeRepository.findById(id);
        if (opt.isPresent()) {
            CodeEntity codeEntity = opt.get();
            Code code = new Code();
            code.setIdCode(codeEntity.getId());
            code.setIdUtilisateur(codeEntity.getIdUtilisateur());
            code.setIdSondage(codeEntity.getIdSondage());
            code.setCode(codeEntity.getCode());

            return new ResponseEntity<Code>(code, HttpStatus.OK);
        } else {

            throw new CodeNotFoundException(id);
        }
    }

    @GetMapping(value="/generate")
    public ResponseEntity<Void> generateCode(Integer p_idUtilisateur, Integer p_idSondage) {

        int length = 20;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedCode = RandomStringUtils.random(length, useLetters, useNumbers).toUpperCase();

        CodeEntity codeEntity = new CodeEntity();
        codeEntity.setIdUtilisateur(p_idUtilisateur);
        codeEntity.setIdSondage(p_idSondage);
        codeEntity.setCode(generatedCode);

        CodeEntity codeAdded = codeRepository.save(codeEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(codeAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
