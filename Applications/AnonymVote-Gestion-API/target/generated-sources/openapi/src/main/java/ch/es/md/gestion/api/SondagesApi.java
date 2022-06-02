/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.es.md.gestion.api;

import ch.es.md.gestion.api.model.Question;
import ch.es.md.gestion.api.model.Sondage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T11:39:30.917961300+02:00[Europe/Paris]")
@Validated
@Tag(name = "sondages", description = "the sondages API")
public interface SondagesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /sondages : addSondage
     *
     * @param sondage  (optional)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "addSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "201", description = "Created"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.POST,
        value = "/sondages",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> addSondageUsingPOST(

@Parameter(name = "" )   @Valid @RequestBody(required = false) Sondage sondage) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /sondages/{id} : deleteSondage
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "deleteSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/sondages/{id}"
    )
    default ResponseEntity<Void> deleteSondageUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /sondages/{id}/fermer : fermerSondage
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "fermerSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.PUT,
        value = "/sondages/{id}/fermer"
    )
    default ResponseEntity<Void> fermerSondageUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/{id}/questions : ListQuestionsSondage
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "ListQuestionsSondage", tags={ "questions-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Question.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/{id}/questions",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Question>> listQuestionsSondageUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 6, \"question\" : \"question\", \"id_question\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/{id} : ListSondage
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "ListSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Sondage> listSondageUsingGET(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/creation
     * Liste tout les sondages en création
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/creation",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Sondage>> listSondagesCreationUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/fermes
     * Liste tout les sondages fermes
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/fermes",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Sondage>> listSondagesFermesUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/ouverts
     * Liste tout les sondages ouverts
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/ouverts",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Sondage>> listSondagesOuvertsUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages
     * Liste tout les sondages
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Sondage>> listSondagesUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sondages/utilisateur/{login}
     * Liste tout les sondages d&#39;un utilisateur
     *
     * @param login login (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Sondage.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/sondages/utilisateur/{login}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Sondage>> listSondagesUtilisateurUsingGET(@Parameter(name = "login", description = "login", required = true) @PathVariable("login") String login

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id_sondage\" : 0, \"ouvert\" : true, \"id_utilisateur\" : 6, \"sujet\" : \"sujet\", \"bloque\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /sondages/{id}/ouvrir : ouvrirSondage
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "ouvrirSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.PUT,
        value = "/sondages/{id}/ouvrir"
    )
    default ResponseEntity<Void> ouvrirSondageUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /sondages/{id} : updateSondage
     *
     * @param id id (required)
     * @param sondage  (optional)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "updateSondage", tags={ "sondages-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.PUT,
        value = "/sondages/{id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateSondageUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

,

@Parameter(name = "" )   @Valid @RequestBody(required = false) Sondage sondage) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
