package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "sondeur")
public class SondeurEntity {
    @Id // @GeneratedValue
    private int id_sondeur;
    private String login;
    private String mot_de_passe;

    public SondeurEntity() {}

    public SondeurEntity(int id_sondeur, String login, String mot_de_passe) {
        this.id_sondeur = id_sondeur;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
    }

    public int getId() {
        return id_sondeur;
    }

    public void setId(int id_sondeur) {
        this.id_sondeur = id_sondeur;
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
}
