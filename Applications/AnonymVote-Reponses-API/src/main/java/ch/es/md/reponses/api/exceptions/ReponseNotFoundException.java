package ch.es.md.reponses.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ReponseNotFoundException extends RuntimeException {
    public ReponseNotFoundException(Integer id) {
        super("Reponse " + id + " non trouvée");
    }
}
