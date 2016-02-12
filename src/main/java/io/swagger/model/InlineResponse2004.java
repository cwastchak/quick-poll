package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubOrganization;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse2004  {
  
  private SubOrganization office = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("office")
  public SubOrganization getOffice() {
    return office;
  }
  public void setOffice(SubOrganization office) {
    this.office = office;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(office, inlineResponse2004.office);
  }

  @Override
  public int hashCode() {
    return Objects.hash(office);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("  office: ").append(office).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
