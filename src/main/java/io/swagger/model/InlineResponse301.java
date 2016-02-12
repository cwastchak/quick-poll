package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Errors returned from the insert request.
 **/
@ApiModel(description = "Errors returned from the insert request.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse301  {
  
  private List<String> validationErrors = new ArrayList<String>();
  private List<String> duplicatePatients = new ArrayList<String>();

  
  /**
   * List of validation errors that resulted from attempting to insert the patient.
   **/
  @ApiModelProperty(value = "List of validation errors that resulted from attempting to insert the patient.")
  @JsonProperty("validationErrors")
  public List<String> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  
  /**
   * List of patients found with same information as the one that was attempted to be inserted.
   **/
  @ApiModelProperty(value = "List of patients found with same information as the one that was attempted to be inserted.")
  @JsonProperty("duplicatePatients")
  public List<String> getDuplicatePatients() {
    return duplicatePatients;
  }
  public void setDuplicatePatients(List<String> duplicatePatients) {
    this.duplicatePatients = duplicatePatients;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse301 inlineResponse301 = (InlineResponse301) o;
    return Objects.equals(validationErrors, inlineResponse301.validationErrors) &&
        Objects.equals(duplicatePatients, inlineResponse301.duplicatePatients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationErrors, duplicatePatients);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse301 {\n");
    
    sb.append("  validationErrors: ").append(validationErrors).append("\n");
    sb.append("  duplicatePatients: ").append(duplicatePatients).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
