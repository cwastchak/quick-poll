package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Organization;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse2001  {
  
  private Organization patient = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("patient")
  public Organization getPatient() {
    return patient;
  }
  public void setPatient(Organization patient) {
    this.patient = patient;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(patient, inlineResponse2001.patient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patient);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("  patient: ").append(patient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
