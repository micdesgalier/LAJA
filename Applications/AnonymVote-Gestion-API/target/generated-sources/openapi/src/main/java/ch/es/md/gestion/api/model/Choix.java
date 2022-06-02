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
 * Choix
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T11:39:30.917961300+02:00[Europe/Paris]")
public class Choix   {
  @JsonProperty("id_choix")
  private Integer idChoix;

  @JsonProperty("id_question")
  private Integer idQuestion;

  @JsonProperty("choix")
  private String choix;

  @JsonProperty("nb_choisi")
  private Integer nbChoisi;

  public Choix idChoix(Integer idChoix) {
    this.idChoix = idChoix;
    return this;
  }

  /**
   * Get idChoix
   * @return idChoix
  */
  @Schema(name = "idChoix", defaultValue = "")


  public Integer getIdChoix() {
    return idChoix;
  }

  public void setIdChoix(Integer idChoix) {
    this.idChoix = idChoix;
  }

  public Choix idQuestion(Integer idQuestion) {
    this.idQuestion = idQuestion;
    return this;
  }

  /**
   * Get idQuestion
   * @return idQuestion
  */
  @Schema(name = "idQuestion", defaultValue = "")


  public Integer getIdQuestion() {
    return idQuestion;
  }

  public void setIdQuestion(Integer idQuestion) {
    this.idQuestion = idQuestion;
  }

  public Choix choix(String choix) {
    this.choix = choix;
    return this;
  }

  /**
   * Get choix
   * @return choix
  */
  @Schema(name = "choix", defaultValue = "")


  public String getChoix() {
    return choix;
  }

  public void setChoix(String choix) {
    this.choix = choix;
  }

  public Choix nbChoisi(Integer nbChoisi) {
    this.nbChoisi = nbChoisi;
    return this;
  }

  /**
   * Get nbChoisi
   * @return nbChoisi
  */
  @Schema(name = "nbChoisi", defaultValue = "")


  public Integer getNbChoisi() {
    return nbChoisi;
  }

  public void setNbChoisi(Integer nbChoisi) {
    this.nbChoisi = nbChoisi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Choix choix = (Choix) o;
    return Objects.equals(this.idChoix, choix.idChoix) &&
        Objects.equals(this.idQuestion, choix.idQuestion) &&
        Objects.equals(this.choix, choix.choix) &&
        Objects.equals(this.nbChoisi, choix.nbChoisi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idChoix, idQuestion, choix, nbChoisi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Choix {\n");
    
    sb.append("    idChoix: ").append(toIndentedString(idChoix)).append("\n");
    sb.append("    idQuestion: ").append(toIndentedString(idQuestion)).append("\n");
    sb.append("    choix: ").append(toIndentedString(choix)).append("\n");
    sb.append("    nbChoisi: ").append(toIndentedString(nbChoisi)).append("\n");
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

