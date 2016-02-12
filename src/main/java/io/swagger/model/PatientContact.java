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
public class PatientContact  {
  
  private String emailAddress = null;
  private String phoneNumber = null;
  public enum PreferredContactMethodEnum {
     phone,  email,  postalmail,
  };
  private PreferredContactMethodEnum preferredContactMethod = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("preferredContactMethod")
  public PreferredContactMethodEnum getPreferredContactMethod() {
    return preferredContactMethod;
  }
  public void setPreferredContactMethod(PreferredContactMethodEnum preferredContactMethod) {
    this.preferredContactMethod = preferredContactMethod;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientContact patientContact = (PatientContact) o;
    return Objects.equals(emailAddress, patientContact.emailAddress) &&
        Objects.equals(phoneNumber, patientContact.phoneNumber) &&
        Objects.equals(preferredContactMethod, patientContact.preferredContactMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, phoneNumber, preferredContactMethod);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientContact {\n");
    
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  preferredContactMethod: ").append(preferredContactMethod).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
