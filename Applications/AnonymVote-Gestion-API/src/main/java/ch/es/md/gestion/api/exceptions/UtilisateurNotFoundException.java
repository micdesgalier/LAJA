package ch.es.md.gestion.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UtilisateurNotFoundException extends RuntimeException {
    public UtilisateurNotFoundException(Integer id) {
        super("Utilisateur " + id + " non trouvé");
    }
    public UtilisateurNotFoundException() {
        super("Utilisateur non trouvé");
    }
}
