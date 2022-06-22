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
 * Question
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-22T18:32:35.287231500+02:00[Europe/Paris]")
public class Question   {
  @JsonProperty("id_question")
  private Integer idQuestion;

  @JsonProperty("id_sondage")
  private Integer idSondage;

  @JsonProperty("question")
  private String question;

  public Question idQuestion(Integer idQuestion) {
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

  public Question idSondage(Integer idSondage) {
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

  public Question question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
  @Schema(name = "question", defaultValue = "")


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.idQuestion, question.idQuestion) &&
        Objects.equals(this.idSondage, question.idSondage) &&
        Objects.equals(this.question, question.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idQuestion, idSondage, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    idQuestion: ").append(toIndentedString(idQuestion)).append("\n");
    sb.append("    idSondage: ").append(toIndentedString(idSondage)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

