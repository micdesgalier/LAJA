package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "sondeur")
public class SondeurEntity {
    @Id // @GeneratedValue
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Quote_Gen")
    private int id;
    private String login;
    private String mot_de_passe;

    public SondeurEntity() {}

    public SondeurEntity(int id, String login, String mot_de_passe) {
        this.id = id;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
