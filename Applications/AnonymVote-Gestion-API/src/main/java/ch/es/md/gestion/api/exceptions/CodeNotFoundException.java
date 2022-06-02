package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CodeNotFoundException extends RuntimeException {
    public CodeNotFoundException(Integer id) {
        super("Code " + id + " non trouvé");
    }
}
