package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SondageNotFoundException extends RuntimeException {
    public SondageNotFoundException(Integer id) {
        super("Sondage " + id + " non trouvé");
    }
}
