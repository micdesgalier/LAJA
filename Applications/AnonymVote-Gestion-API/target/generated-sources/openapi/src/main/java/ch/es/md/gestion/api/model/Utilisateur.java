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
 * Utilisateur
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T11:39:30.917961300+02:00[Europe/Paris]")
public class Utilisateur   {
  @JsonProperty("id_utilisateur")
  private Integer idUtilisateur;

  @JsonProperty("login")
  private String login;

  @JsonProperty("motDePasse")
  private String motDePasse;

  @JsonProperty("type")
  private Boolean type;

  public Utilisateur idUtilisateur(Integer idUtilisateur) {
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

  public Utilisateur login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  @Schema(name = "login", defaultValue = "")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Utilisateur motDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
    return this;
  }

  /**
   * Get motDePasse
   * @return motDePasse
  */
  @Schema(name = "motDePasse", defaultValue = "")


  public String getMotDePasse() {
    return motDePasse;
  }

  public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
  }

  public Utilisateur type(Boolean type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Schema(name = "type", defaultValue = "")


  public Boolean getType() {
    return type;
  }

  public void setType(Boolean type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utilisateur utilisateur = (Utilisateur) o;
    return Objects.equals(this.idUtilisateur, utilisateur.idUtilisateur) &&
        Objects.equals(this.login, utilisateur.login) &&
        Objects.equals(this.motDePasse, utilisateur.motDePasse) &&
        Objects.equals(this.type, utilisateur.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUtilisateur, login, motDePasse, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utilisateur {\n");
    
    sb.append("    idUtilisateur: ").append(toIndentedString(idUtilisateur)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    motDePasse: ").append(toIndentedString(motDePasse)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

