package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Describes an insurance policy that the patient holds.
 **/
@ApiModel(description = "Describes an insurance policy that the patient holds.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class PolicyInfo  {
  
  public enum PolicyTypeEnum {
     primary,  secondary,  tertiary, 
  };
  private PolicyTypeEnum policyType = null;
  private String groupNumber = null;
  private String insuranceNumber = null;
  public enum PolicyRelationshipEnum {
     self,  spouse,  dependent, 
  };
  private PolicyRelationshipEnum policyRelationship = null;
  private String policyHolderName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policyType")
  public PolicyTypeEnum getPolicyType() {
    return policyType;
  }
  public void setPolicyType(PolicyTypeEnum policyType) {
    this.policyType = policyType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("groupNumber")
  public String getGroupNumber() {
    return groupNumber;
  }
  public void setGroupNumber(String groupNumber) {
    this.groupNumber = groupNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("insuranceNumber")
  public String getInsuranceNumber() {
    return insuranceNumber;
  }
  public void setInsuranceNumber(String insuranceNumber) {
    this.insuranceNumber = insuranceNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policyRelationship")
  public PolicyRelationshipEnum getPolicyRelationship() {
    return policyRelationship;
  }
  public void setPolicyRelationship(PolicyRelationshipEnum policyRelationship) {
    this.policyRelationship = policyRelationship;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policyHolderName")
  public String getPolicyHolderName() {
    return policyHolderName;
  }
  public void setPolicyHolderName(String policyHolderName) {
    this.policyHolderName = policyHolderName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyInfo policyInfo = (PolicyInfo) o;
    return Objects.equals(policyType, policyInfo.policyType) &&
        Objects.equals(groupNumber, policyInfo.groupNumber) &&
        Objects.equals(insuranceNumber, policyInfo.insuranceNumber) &&
        Objects.equals(policyRelationship, policyInfo.policyRelationship) &&
        Objects.equals(policyHolderName, policyInfo.policyHolderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyType, groupNumber, insuranceNumber, policyRelationship, policyHolderName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyInfo {\n");
    
    sb.append("  policyType: ").append(policyType).append("\n");
    sb.append("  groupNumber: ").append(groupNumber).append("\n");
    sb.append("  insuranceNumber: ").append(insuranceNumber).append("\n");
    sb.append("  policyRelationship: ").append(policyRelationship).append("\n");
    sb.append("  policyHolderName: ").append(policyHolderName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
