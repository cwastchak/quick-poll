package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;

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
@RequestMapping(value = "/company", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/company", description = "the company API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class CompanyApi {
  

  @ApiOperation(value = "", notes = "Returns a list of all companies the user has access to.  Should this only be top level companies? Or also offices?", response = InlineResponse200.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success") })
  @RequestMapping(value = "", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse200> companyGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns a company record given the Id of that company.", response = InlineResponse2001.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Company Not Found") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2001> companyIdGet(
@ApiParam(value = "The Organization Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns a list of DME typed companies underneath the company being passed in. <br><br>`*NOTE* At the moment the org service does not have a call that can support this call.  We need to make a request to them to get the company type added to the org-structure/{id} service.`", response = InlineResponse2002.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success") })
  @RequestMapping(value = "/{id}/dmeoffice", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2002> companyIdDmeofficeGet(
@ApiParam(value = "The DME Company's Organization Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Finds and returns all patients for a given company", response = InlineResponse2003.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Company Not Found") })
  @RequestMapping(value = "/{id}/patient", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2003> companyIdPatientGet(
@ApiParam(value = "The Company Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns a list of Sleep Lab typed companies underneath the company being passed in. <br><br>`*NOTE* At the moment the org service does not have a call that can support this call.  We need to make a request to them to get the company type added to the org-structure/{id} service.`", response = InlineResponse2002.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success") })
  @RequestMapping(value = "/{id}/sleeplab", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2002> companyIdSleeplabGet(
@ApiParam(value = "The Sleep Lab Company's Organization Id number in the Sapphire app",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns a DME Office Company record given the Id of that office and the parent company Id. <br><br>`*NOTE* This is a redundant call that needs to be analyzed. We can simply call 'companies/{id}' to get back the org details or we could make a get office API to call the 'sub-orgs/{id}' service that retuns a suborg object. In either case, we never will need both the org Id and the suborg Id since that simply isn't required to call the MS API.`", response = InlineResponse2004.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Company Not Found") })
  @RequestMapping(value = "/{orgid}/dmeoffice/{suborgid}", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2004> companyOrgidDmeofficeSuborgidGet(
@ApiParam(value = "The Organization Id number in the Sapphire app",required=true ) @PathVariable("orgid") String orgid

,
    
@ApiParam(value = "The Office or Sub Organization Id number in the Sapphire app",required=true ) @PathVariable("suborgid") String suborgid

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "", notes = "Returns a Sleep Lab Office Company record given the Id of that office and the parent company Id. <br><br>`*NOTE* This is a redundant call that needs to be analyzed. We can simply call 'companies/{id}' to get back the org details or we could make a get office API to call the 'sub-orgs/{id}' service that retuns a suborg object. In either case, we never will need both the org Id and the suborg Id since that simply isn't required to call the MS API.`", response = InlineResponse2004.class)
  @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
    @io.swagger.annotations.ApiResponse(code = 404, message = "Company Not Found") })
  @RequestMapping(value = "/{orgid}/sleeplab/{suborgid}", 
    produces = { "application/json", "text/xml" }, 
    consumes = { "application/json", "text/xml" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2004> companyOrgidSleeplabSuborgidGet(
@ApiParam(value = "The Organization Id number in the Sapphire app",required=true ) @PathVariable("orgid") String orgid

,
    
@ApiParam(value = "The Office or Sub Organization Id number in the Sapphire app",required=true ) @PathVariable("suborgid") String suborgid

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
  }

  
}
