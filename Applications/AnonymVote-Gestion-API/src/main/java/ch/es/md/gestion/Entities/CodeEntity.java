package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "code")
public class CodeEntity {
    @Id // @GeneratedValue
    private int id_code;

    private int id_utilisateur;
    private int id_sondage;
    private String code;

    public CodeEntity() {}

    public CodeEntity(int id_code, int id_utilisateur, int id_sondage, String code) {
        this.id_code = id_code;
        this.id_utilisateur = id_utilisateur;
        this.id_sondage = id_sondage;
        this.code = code;
    }

    public int getId() {
        return id_code;
    }

    public void setId(int id_code) {
        this.id_code = id_code;
    }

    public int getIdUtilisateur() {
        return id_utilisateur;
    }

    public void setIdUtilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public int getIdSondage() {
        return id_sondage;
    }

    public void setIdSondage(int id_sondage) {
        this.id_sondage = id_sondage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
