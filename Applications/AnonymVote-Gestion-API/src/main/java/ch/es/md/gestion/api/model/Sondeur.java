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
 * Sondeur
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-10T12:50:36.192684100+02:00[Europe/Paris]")
public class Sondeur   {
  @JsonProperty("login")
  private String login;

  @JsonProperty("mot_de_passe")
  private String motDePasse;

  @JsonProperty("id_sondeur")
  private Integer idSondeur;

  public Sondeur login(String login) {
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

  public Sondeur motDePasse(String motDePasse) {
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

  public Sondeur idSondeur(Integer idSondeur) {
    this.idSondeur = idSondeur;
    return this;
  }

  /**
   * Get idSondeur
   * @return idSondeur
  */
  @Schema(name = "idSondeur", defaultValue = "")


  public Integer getIdSondeur() {
    return idSondeur;
  }

  public void setIdSondeur(Integer idSondeur) {
    this.idSondeur = idSondeur;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sondeur sondeur = (Sondeur) o;
    return Objects.equals(this.login, sondeur.login) &&
        Objects.equals(this.motDePasse, sondeur.motDePasse) &&
        Objects.equals(this.idSondeur, sondeur.idSondeur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, motDePasse, idSondeur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sondeur {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    motDePasse: ").append(toIndentedString(motDePasse)).append("\n");
    sb.append("    idSondeur: ").append(toIndentedString(idSondeur)).append("\n");
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

