package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException(Integer id) {
        super("Question " + id + " non trouvée");
    }
}
