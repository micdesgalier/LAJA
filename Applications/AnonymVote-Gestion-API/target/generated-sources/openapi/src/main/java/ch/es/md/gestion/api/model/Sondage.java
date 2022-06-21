package ch.es.md.gestion.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Sondage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T13:47:29.624415+02:00[Europe/Paris]")
public class Sondage   {
  @JsonProperty("id_sondage")
  private Integer idSondage;

  @JsonProperty("id_utilisateur")
  private Integer idUtilisateur;

  @JsonProperty("sujet")
  private String sujet;

  @JsonProperty("ouvert")
  private Boolean ouvert;

  @JsonProperty("bloque")
  private Boolean bloque;

  public Sondage idSondage(Integer idSondage) {
    this.idSondage = idSondage;
    return this;
  }

  /**
   * Get idSondage
   * @return idSondage
  */
  @Schema(name = "idSondage", defaultValue = "")


  public Integer getIdSondage() {
    return idSondage;
  }

  public void setIdSondage(Integer idSondage) {
    this.idSondage = idSondage;
  }

  public Sondage idUtilisateur(Integer idUtilisateur) {
    this.idUtilisateur = idUtilisateur;
    return this;
  }

  /**
   * Get idUtilisateur
   * @return idUtilisateur
  */
  @Schema(name = "idUtilisateur", defaultValue = "")


  public Integer getIdUtilisateur() {
    return idUtilisateur;
  }

  public void setIdUtilisateur(Integer idUtilisateur) {
    this.idUtilisateur = idUtilisateur;
  }

  public Sondage sujet(String sujet) {
    this.sujet = sujet;
    return this;
  }

  /**
   * Get sujet
   * @return sujet
  */
  @Schema(name = "sujet", defaultValue = "")


  public String getSujet() {
    return sujet;
  }

  public void setSujet(String sujet) {
    this.sujet = sujet;
  }

  public Sondage ouvert(Boolean ouvert) {
    this.ouvert = ouvert;
    return this;
  }

  /**
   * Get ouvert
   * @return ouvert
  */
  @Schema(name = "ouvert", defaultValue = "")


  public Boolean getOuvert() {
    return ouvert;
  }

  public void setOuvert(Boolean ouvert) {
    this.ouvert = ouvert;
  }

  public Sondage bloque(Boolean bloque) {
    this.bloque = bloque;
    return this;
  }

  /**
   * Get bloque
   * @return bloque
  */
  @Schema(name = "bloque", defaultValue = "")


  public Boolean getBloque() {
    return bloque;
  }

  public void setBloque(Boolean bloque) {
    this.bloque = bloque;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sondage sondage = (Sondage) o;
    return Objects.equals(this.idSondage, sondage.idSondage) &&
        Objects.equals(this.idUtilisateur, sondage.idUtilisateur) &&
        Objects.equals(this.sujet, sondage.sujet) &&
        Objects.equals(this.ouvert, sondage.ouvert) &&
        Objects.equals(this.bloque, sondage.bloque);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSondage, idUtilisateur, sujet, ouvert, bloque);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sondage {\n");
    
    sb.append("    idSondage: ").append(toIndentedString(idSondage)).append("\n");
    sb.append("    idUtilisateur: ").append(toIndentedString(idUtilisateur)).append("\n");
    sb.append("    sujet: ").append(toIndentedString(sujet)).append("\n");
    sb.append("    ouvert: ").append(toIndentedString(ouvert)).append("\n");
    sb.append("    bloque: ").append(toIndentedString(bloque)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

