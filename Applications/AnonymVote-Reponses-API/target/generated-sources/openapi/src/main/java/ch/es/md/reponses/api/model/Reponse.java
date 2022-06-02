package ch.es.md.reponses.api.model;

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
 * Reponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T09:19:44.928711400+02:00[Europe/Paris]")
public class Reponse   {
  @JsonProperty("id_reponse")
  private Integer idReponse;

  @JsonProperty("id_question")
  private Integer idQuestion;

  @JsonProperty("id_choix")
  private Integer idChoix;

  @JsonProperty("code")
  private String code;

  public Reponse idReponse(Integer idReponse) {
    this.idReponse = idReponse;
    return this;
  }

  /**
   * Get idReponse
   * @return idReponse
  */
  @Schema(name = "idReponse", defaultValue = "")


  public Integer getIdReponse() {
    return idReponse;
  }

  public void setIdReponse(Integer idReponse) {
    this.idReponse = idReponse;
  }

  public Reponse idQuestion(Integer idQuestion) {
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

  public Reponse idChoix(Integer idChoix) {
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

  public Reponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @Schema(name = "code", defaultValue = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reponse reponse = (Reponse) o;
    return Objects.equals(this.idReponse, reponse.idReponse) &&
        Objects.equals(this.idQuestion, reponse.idQuestion) &&
        Objects.equals(this.idChoix, reponse.idChoix) &&
        Objects.equals(this.code, reponse.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idReponse, idQuestion, idChoix, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reponse {\n");
    
    sb.append("    idReponse: ").append(toIndentedString(idReponse)).append("\n");
    sb.append("    idQuestion: ").append(toIndentedString(idQuestion)).append("\n");
    sb.append("    idChoix: ").append(toIndentedString(idChoix)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

