package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PatientContact;
import io.swagger.model.PatientLocation;
import io.swagger.model.PolicyInfo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class Patient  {
  
  private String patientId = null;
  private String orgId = null;
  private Date birthDate = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private Date setupDate = null;
  private PatientContact contact = null;
  private PatientLocation location = null;
  private List<PolicyInfo> policies = new ArrayList<PolicyInfo>();
  private List<String> clinicians = new ArrayList<String>();

  
  /**
   * Unique Id of the patient in the Sapphire App.
   **/
  @ApiModelProperty(value = "Unique Id of the patient in the Sapphire App.")
  @JsonProperty("patientId")
  public String getPatientId() {
    return patientId;
  }
  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  
  /**
   * Unique Id of the organization in the Sapphire App.
   **/
  @ApiModelProperty(value = "Unique Id of the organization in the Sapphire App.")
  @JsonProperty("orgId")
  public String getOrgId() {
    return orgId;
  }
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("birthDate")
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  
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
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
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
  @JsonProperty("setupDate")
  public Date getSetupDate() {
    return setupDate;
  }
  public void setSetupDate(Date setupDate) {
    this.setupDate = setupDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contact")
  public PatientContact getContact() {
    return contact;
  }
  public void setContact(PatientContact contact) {
    this.contact = contact;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  public PatientLocation getLocation() {
    return location;
  }
  public void setLocation(PatientLocation location) {
    this.location = location;
  }

  
  /**
   * Array of Insurance Policies for the Patient.
   **/
  @ApiModelProperty(value = "Array of Insurance Policies for the Patient.")
  @JsonProperty("policies")
  public List<PolicyInfo> getPolicies() {
    return policies;
  }
  public void setPolicies(List<PolicyInfo> policies) {
    this.policies = policies;
  }

  
  /**
   * List of Clinician Ids that relate to this patient.
   **/
  @ApiModelProperty(value = "List of Clinician Ids that relate to this patient.")
  @JsonProperty("clinicians")
  public List<String> getClinicians() {
    return clinicians;
  }
  public void setClinicians(List<String> clinicians) {
    this.clinicians = clinicians;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(patientId, patient.patientId) &&
        Objects.equals(orgId, patient.orgId) &&
        Objects.equals(birthDate, patient.birthDate) &&
        Objects.equals(firstName, patient.firstName) &&
        Objects.equals(middleName, patient.middleName) &&
        Objects.equals(lastName, patient.lastName) &&
        Objects.equals(setupDate, patient.setupDate) &&
        Objects.equals(contact, patient.contact) &&
        Objects.equals(location, patient.location) &&
        Objects.equals(policies, patient.policies) &&
        Objects.equals(clinicians, patient.clinicians);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patientId, orgId, birthDate, firstName, middleName, lastName, setupDate, contact, location, policies, clinicians);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    
    sb.append("  patientId: ").append(patientId).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  birthDate: ").append(birthDate).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  middleName: ").append(middleName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  setupDate: ").append(setupDate).append("\n");
    sb.append("  contact: ").append(contact).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  clinicians: ").append(clinicians).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
