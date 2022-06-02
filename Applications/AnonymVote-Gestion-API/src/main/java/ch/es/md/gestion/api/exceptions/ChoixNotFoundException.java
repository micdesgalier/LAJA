package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ChoixNotFoundException extends RuntimeException {
    public ChoixNotFoundException(Integer id) {
        super("Choix " + id + " non trouvé");
    }
}
