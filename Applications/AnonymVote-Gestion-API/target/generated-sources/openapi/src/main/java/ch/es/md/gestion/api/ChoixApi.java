/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.es.md.gestion.api;

import ch.es.md.gestion.api.model.Choix;
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
@Tag(name = "choix", description = "the choix API")
public interface ChoixApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /choix : addChoix
     *
     * @param choix  (optional)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "addChoix", tags={ "choix-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "201", description = "Created"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.POST,
        value = "/choix",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> addChoixUsingPOST(

@Parameter(name = "" )   @Valid @RequestBody(required = false) Choix choix) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /choix/{id} : deleteChoix
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "deleteChoix", tags={ "choix-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/choix/{id}"
    )
    default ResponseEntity<Void> deleteChoixUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /choix
     * Liste toutes les choix
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "", tags={ "choix-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Choix.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/choix",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Choix>> listChoixUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nb_choisi\" : 1, \"choix\" : \"choix\", \"id_question\" : 6, \"id_choix\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /choix/{id} : ListChoix
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "ListChoix", tags={ "choix-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Choix.class))), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.GET,
        value = "/choix/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Choix> listChoixUsingGET(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nb_choisi\" : 1, \"choix\" : \"choix\", \"id_question\" : 6, \"id_choix\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /choix/{id} : updateChoix
     *
     * @param id id (required)
     * @param choix  (optional)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(summary = "updateChoix", tags={ "choix-end-point", }, responses = {  @ApiResponse(responseCode = "200", description = "OK"), @ApiResponse(responseCode = "401", description = "Unauthorized"), @ApiResponse(responseCode = "403", description = "Forbidden"), @ApiResponse(responseCode = "404", description = "Not Found") })
        @RequestMapping(
        method = RequestMethod.PUT,
        value = "/choix/{id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateChoixUsingID(@Parameter(name = "id", description = "id", required = true) @PathVariable("id") Integer id

,

@Parameter(name = "" )   @Valid @RequestBody(required = false) Choix choix) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
