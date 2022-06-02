package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LoginErrorException extends RuntimeException {
    public LoginErrorException(String login) {
        super("Erreur de login pour " + login);
    }
}
