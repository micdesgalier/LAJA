package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "utilisateur")
public class UtilisateurEntity {
    @Id // @GeneratedValue
    private int id_utilisateur;
    private String login;
    private String mot_de_passe;
    private boolean type;

    public UtilisateurEntity() {}

    public UtilisateurEntity(int id_utilisateur, String login, String mot_de_passe, boolean type) {
        this.id_utilisateur = id_utilisateur;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
        this.type = type;
    }

    public int getId() {
        return id_utilisateur;
    }

    public void setId(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return mot_de_passe;
    }

    public void setMotDePasse(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
