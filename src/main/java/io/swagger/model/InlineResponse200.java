package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Organization;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse200  {
  
  private List<Organization> companies = new ArrayList<Organization>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("companies")
  public List<Organization> getCompanies() {
    return companies;
  }
  public void setCompanies(List<Organization> companies) {
    this.companies = companies;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(companies, inlineResponse200.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  companies: ").append(companies).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
