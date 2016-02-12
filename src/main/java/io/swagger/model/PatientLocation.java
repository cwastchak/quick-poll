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
public class PatientLocation  {
  
  private String zipCode = null;
  private String address = null;
  private String address2 = null;
  private String city = null;
  private String countryCode = null;
  private String state = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
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
   * The 3 digit country code of the patient's home country.
   **/
  @ApiModelProperty(value = "The 3 digit country code of the patient's home country.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientLocation patientLocation = (PatientLocation) o;
    return Objects.equals(zipCode, patientLocation.zipCode) &&
        Objects.equals(address, patientLocation.address) &&
        Objects.equals(address2, patientLocation.address2) &&
        Objects.equals(city, patientLocation.city) &&
        Objects.equals(countryCode, patientLocation.countryCode) &&
        Objects.equals(state, patientLocation.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, address, address2, city, countryCode, state);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientLocation {\n");
    
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
