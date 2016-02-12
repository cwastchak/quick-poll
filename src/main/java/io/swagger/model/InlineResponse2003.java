package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Patient;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse2003  {
  
  private List<Patient> patients = new ArrayList<Patient>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("patients")
  public List<Patient> getPatients() {
    return patients;
  }
  public void setPatients(List<Patient> patients) {
    this.patients = patients;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(patients, inlineResponse2003.patients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patients);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("  patients: ").append(patients).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
