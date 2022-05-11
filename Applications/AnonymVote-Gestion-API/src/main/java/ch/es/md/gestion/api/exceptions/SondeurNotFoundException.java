package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SondeurNotFoundException extends RuntimeException {
    public SondeurNotFoundException(Integer id) {
        super("Sondeur " + id + " non trouvée");
    }
}
