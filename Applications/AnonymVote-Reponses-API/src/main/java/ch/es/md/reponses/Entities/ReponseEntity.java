package ch.es.md.reponses.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "reponse")
public class ReponseEntity {
    @Id // @GeneratedValue
    private int id_reponse;
    private int id_question;
    private int id_choix;
    private String code;

    public ReponseEntity() {}

    public ReponseEntity(int id_reponse, int id_question, int id_choix, String code) {
        this.id_reponse = id_reponse;
        this.id_question = id_question;
        this.id_choix = id_choix;
        this.code = code;
    }

    public int getId() {
        return id_reponse;
    }

    public void setId(int id_reponse) {
        this.id_reponse = id_reponse;
    }

    public int getIdQuestion() {
        return id_question;
    }

    public void setIdQuestion(int id_question) {
        this.id_question = id_question;
    }

    public int getIdChoix() {
        return id_choix;
    }

    public void setIdChoix(int id_choix) {
        this.id_choix = id_choix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
