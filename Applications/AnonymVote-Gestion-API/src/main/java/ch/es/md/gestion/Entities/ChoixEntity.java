package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "choix")
public class ChoixEntity {
    @Id // @GeneratedValue
    private int id_choix;

    private int id_question;
    private String choix;
    private int nb_choisi;

    public ChoixEntity() {}

    public ChoixEntity(int id_choix, int id_question, String choix, int nb_choisi) {
        this.id_choix = id_choix;
        this.id_question = id_question;
        this.choix = choix;
        this.nb_choisi = nb_choisi;
    }

    public int getId() {
        return id_choix;
    }

    public void setId(int id_choix) {
        this.id_choix = id_choix;
    }

    public int getIdQuestion() {
        return id_question;
    }

    public void setIdQuestion(int id_question) {
        this.id_question = id_question;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public int getNbChoisi() {
        return nb_choisi;
    }

    public void setNbChoisi(int nb_choisi) {
        this.nb_choisi = nb_choisi;
    }
}
