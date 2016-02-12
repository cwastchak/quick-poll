package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PolicyInfo;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse2007  {
  
  private List<PolicyInfo> policies = new ArrayList<PolicyInfo>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policies")
  public List<PolicyInfo> getPolicies() {
    return policies;
  }
  public void setPolicies(List<PolicyInfo> policies) {
    this.policies = policies;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(policies, inlineResponse2007.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
