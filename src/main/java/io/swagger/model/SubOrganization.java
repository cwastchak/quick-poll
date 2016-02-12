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
public class SubOrganization  {
  
  private String organizationId = null;
  private String name = null;
  private String address = null;
  private String address2 = null;
  private String city = null;
  private String state = null;
  private String postalCode = null;
  private String country = null;
  private String timezone = null;
  private Boolean active = null;
  private String parentOrgId = null;
  private String companyType = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parentOrgId")
  public String getParentOrgId() {
    return parentOrgId;
  }
  public void setParentOrgId(String parentOrgId) {
    this.parentOrgId = parentOrgId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("companyType")
  public String getCompanyType() {
    return companyType;
  }
  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubOrganization subOrganization = (SubOrganization) o;
    return Objects.equals(organizationId, subOrganization.organizationId) &&
        Objects.equals(name, subOrganization.name) &&
        Objects.equals(address, subOrganization.address) &&
        Objects.equals(address2, subOrganization.address2) &&
        Objects.equals(city, subOrganization.city) &&
        Objects.equals(state, subOrganization.state) &&
        Objects.equals(postalCode, subOrganization.postalCode) &&
        Objects.equals(country, subOrganization.country) &&
        Objects.equals(timezone, subOrganization.timezone) &&
        Objects.equals(active, subOrganization.active) &&
        Objects.equals(parentOrgId, subOrganization.parentOrgId) &&
        Objects.equals(companyType, subOrganization.companyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, name, address, address2, city, state, postalCode, country, timezone, active, parentOrgId, companyType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubOrganization {\n");
    
    sb.append("  organizationId: ").append(organizationId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  parentOrgId: ").append(parentOrgId).append("\n");
    sb.append("  companyType: ").append(companyType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
