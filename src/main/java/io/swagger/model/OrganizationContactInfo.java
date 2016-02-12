package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class OrganizationContactInfo  {
  
  private String firstName = null;
  private String lastName = null;
  private String pointOfContactDetails = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pointOfContactDetails")
  public String getPointOfContactDetails() {
    return pointOfContactDetails;
  }
  public void setPointOfContactDetails(String pointOfContactDetails) {
    this.pointOfContactDetails = pointOfContactDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationContactInfo organizationContactInfo = (OrganizationContactInfo) o;
    return Objects.equals(firstName, organizationContactInfo.firstName) &&
        Objects.equals(lastName, organizationContactInfo.lastName) &&
        Objects.equals(pointOfContactDetails, organizationContactInfo.pointOfContactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, pointOfContactDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationContactInfo {\n");
    
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  pointOfContactDetails: ").append(pointOfContactDetails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
