
package ch.es.md.gestion.api.endpoints;

import ch.es.md.gestion.Entities.CodeEntity;
import ch.es.md.gestion.api.CodesApi;
import ch.es.md.gestion.api.exceptions.CodeNotFoundException;
import ch.es.md.gestion.api.model.Code;
import ch.es.md.gestion.repositories.CodeRepository;
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
public class CodesEndPoint implements CodesApi {
    @Autowired
    private CodeRepository codeRepository;

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
    public ResponseEntity<Void> addCodeUsingPOST(@RequestBody Code code) {
        CodeEntity codeEntity = new CodeEntity();
        codeEntity.setId(code.getIdCode());
        codeEntity.setIdUtilisateur(code.getIdUtilisateur());
        codeEntity.setIdSondage(code.getIdSondage());
        codeEntity.setCode(code.getCode());

        CodeEntity codeAdded = codeRepository.save(codeEntity);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(codeAdded.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
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
}
