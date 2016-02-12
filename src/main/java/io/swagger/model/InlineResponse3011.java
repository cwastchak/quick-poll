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
 * Errors returned from the equipment svc request.
 **/
@ApiModel(description = "Errors returned from the equipment svc request.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse3011  {
  
  private List<String> validationErrors = new ArrayList<String>();

  
  /**
   * List of validation errors that resulted from attempting to update the device.
   **/
  @ApiModelProperty(value = "List of validation errors that resulted from attempting to update the device.")
  @JsonProperty("validationErrors")
  public List<String> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse3011 inlineResponse3011 = (InlineResponse3011) o;
    return Objects.equals(validationErrors, inlineResponse3011.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationErrors);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse3011 {\n");
    
    sb.append("  validationErrors: ").append(validationErrors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
