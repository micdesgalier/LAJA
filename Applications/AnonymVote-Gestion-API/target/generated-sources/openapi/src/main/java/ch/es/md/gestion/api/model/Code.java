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
 * Code
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T11:39:30.917961300+02:00[Europe/Paris]")
public class Code   {
  @JsonProperty("id_code")
  private Integer idCode;

  @JsonProperty("id_utilisateur")
  private Integer idUtilisateur;

  @JsonProperty("id_sondage")
  private Integer idSondage;

  @JsonProperty("code")
  private String code;

  public Code idCode(Integer idCode) {
    this.idCode = idCode;
    return this;
  }

  /**
   * Get idCode
   * @return idCode
  */
  @Schema(name = "idCode", defaultValue = "")


  public Integer getIdCode() {
    return idCode;
  }

  public void setIdCode(Integer idCode) {
    this.idCode = idCode;
  }

  public Code idUtilisateur(Integer idUtilisateur) {
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

  public Code idSondage(Integer idSondage) {
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

  public Code code(String code) {
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
    Code code = (Code) o;
    return Objects.equals(this.idCode, code.idCode) &&
        Objects.equals(this.idUtilisateur, code.idUtilisateur) &&
        Objects.equals(this.idSondage, code.idSondage) &&
        Objects.equals(this.code, code.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCode, idUtilisateur, idSondage, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Code {\n");
    
    sb.append("    idCode: ").append(toIndentedString(idCode)).append("\n");
    sb.append("    idUtilisateur: ").append(toIndentedString(idUtilisateur)).append("\n");
    sb.append("    idSondage: ").append(toIndentedString(idSondage)).append("\n");
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

