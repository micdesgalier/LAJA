package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "question")
public class QuestionEntity {
    @Id // @GeneratedValue
    private int id_question;

    private int id_sondage;
    private String question;

    public QuestionEntity() {}

    public QuestionEntity(int id_question, int id_sondage, String question) {
        this.id_question = id_question;
        this.id_sondage = id_sondage;
        this.question = question;
    }

    public int getId() {
        return id_question;
    }

    public void setId(int id_question) {
        this.id_question = id_question;
    }

    public int getIdSondage() {
        return id_sondage;
    }

    public void setIdSondage(int id_sondage) {
        this.id_sondage = id_sondage;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
