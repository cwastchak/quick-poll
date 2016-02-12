package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse201;
import io.swagger.model.Patient;
import io.swagger.model.InlineResponse301;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.Equipment;
import io.swagger.model.InlineResponse3011;
import io.swagger.model.InlineResponse2007;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/patient", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/patient", description = "the patient API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class PatientApi {
  

  @ApiOperation(value = "", notes = "Add a new patient to the Sapphire System.", response = InlineResponse201.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 201, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 301, message = "Invalid Patient") })
  @RequestMapping(value = "", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse201> patientPost(

@ApiParam(value = "Details of the patient to be added" ,required=true ) @RequestBody Patient body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse201>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Finds and returns patient given the patient's Id", response = InlineResponse2005.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2005> patientIdGet(
@ApiParam(value = "The patient Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Updates a patient in the Sapphire System", response = Void.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 301, message = "Invalid Patient"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.PUT)
  public ResponseEntity<Void> patientIdPut(
@ApiParam(value = "Id of the patient to be updated",required=true ) @PathVariable("id") String id

,
    

@ApiParam(value = "Details of the patient to be updated" ,required=true ) @RequestBody Patient body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Marks a Patient with given Id as [ACTIVE]", response = Void.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}/activate", 
    
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<Void> patientIdActivateGet(
@ApiParam(value = "The patient Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Marks a Patient with given Id as [INACTIVE]", response = Void.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}/deactivate", 
    
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<Void> patientIdDeactivateGet(
@ApiParam(value = "The patient Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns information about the current device assigned to the patient (if applicable).", response = InlineResponse2006.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Company Not Found") })
  @RequestMapping(value = "/{id}/device", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2006> patientIdDeviceGet(
@ApiParam(value = "The Patient Id in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Updates the current device for a patient in the Sapphire System", response = Void.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 301, message = "Invalid Device"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}/device", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.PUT)
  public ResponseEntity<Void> patientIdDevicePut(
@ApiParam(value = "Id of the patient that the device should be assigned to",required=true ) @PathVariable("id") String id

,
    

@ApiParam(value = "Details of the equipment to be updated" ,required=true ) @RequestBody Equipment body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Finds and returns patient's Insurance Policies given the patient's Id", response = InlineResponse2007.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Patient Not Found") })
  @RequestMapping(value = "/{id}/insurance", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2007> patientIdInsuranceGet(
@ApiParam(value = "The patient Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
  }

  
}
