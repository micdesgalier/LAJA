package ch.es.md.gestion.Entities;

import javax.persistence.*;

@Entity(name = "sondage")
public class SondageEntity {
    @Id // @GeneratedValue
    private int id_sondage;

    private int id_utilisateur;
    private String sujet;
    private boolean ouvert;
    private boolean bloque;

    public SondageEntity() {}

    public SondageEntity(int id_sondage, int id_utilisateur, String sujet, boolean ouvert, boolean bloque) {
        this.id_sondage = id_sondage;
        this.id_utilisateur = id_utilisateur;
        this.sujet = sujet;
        this.ouvert = ouvert;
        this.bloque = bloque;
    }

    public int getId() {
        return id_sondage;
    }

    public void setId(int id_sondage) {
        this.id_sondage = id_sondage;
    }

    public int getIdUtilisateur() {
        return id_utilisateur;
    }

    public void setIdUtilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public boolean isBloque() {
        return bloque;
    }

    public void setBloque(boolean bloque) {
        this.bloque = bloque;
    }
}
