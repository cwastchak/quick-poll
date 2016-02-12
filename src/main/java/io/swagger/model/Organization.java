package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrganizationContactInfo;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class Organization  {
  
  private String organizationId = null;
  private String name = null;
  private String address = null;
  private String address2 = null;
  private String city = null;
  private String state = null;
  private String postalCode = null;
  private String country = null;
  private String timezone = null;
  private String soldTo = null;
  private String shipTo = null;
  private OrganizationContactInfo contactInfo = null;
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
  @JsonProperty("soldTo")
  public String getSoldTo() {
    return soldTo;
  }
  public void setSoldTo(String soldTo) {
    this.soldTo = soldTo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("shipTo")
  public String getShipTo() {
    return shipTo;
  }
  public void setShipTo(String shipTo) {
    this.shipTo = shipTo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contactInfo")
  public OrganizationContactInfo getContactInfo() {
    return contactInfo;
  }
  public void setContactInfo(OrganizationContactInfo contactInfo) {
    this.contactInfo = contactInfo;
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
    Organization organization = (Organization) o;
    return Objects.equals(organizationId, organization.organizationId) &&
        Objects.equals(name, organization.name) &&
        Objects.equals(address, organization.address) &&
        Objects.equals(address2, organization.address2) &&
        Objects.equals(city, organization.city) &&
        Objects.equals(state, organization.state) &&
        Objects.equals(postalCode, organization.postalCode) &&
        Objects.equals(country, organization.country) &&
        Objects.equals(timezone, organization.timezone) &&
        Objects.equals(soldTo, organization.soldTo) &&
        Objects.equals(shipTo, organization.shipTo) &&
        Objects.equals(contactInfo, organization.contactInfo) &&
        Objects.equals(active, organization.active) &&
        Objects.equals(parentOrgId, organization.parentOrgId) &&
        Objects.equals(companyType, organization.companyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, name, address, address2, city, state, postalCode, country, timezone, soldTo, shipTo, contactInfo, active, parentOrgId, companyType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("  organizationId: ").append(organizationId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  soldTo: ").append(soldTo).append("\n");
    sb.append("  shipTo: ").append(shipTo).append("\n");
    sb.append("  contactInfo: ").append(contactInfo).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  parentOrgId: ").append(parentOrgId).append("\n");
    sb.append("  companyType: ").append(companyType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
