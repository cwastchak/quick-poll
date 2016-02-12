package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class Equipment  {
  
  private String serialNumber = null;
  private String dataSource = null;
  private String equipmentType = null;
  private Date dateAssigned = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dataSource")
  public String getDataSource() {
    return dataSource;
  }
  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("equipmentType")
  public String getEquipmentType() {
    return equipmentType;
  }
  public void setEquipmentType(String equipmentType) {
    this.equipmentType = equipmentType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateAssigned")
  public Date getDateAssigned() {
    return dateAssigned;
  }
  public void setDateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Equipment equipment = (Equipment) o;
    return Objects.equals(serialNumber, equipment.serialNumber) &&
        Objects.equals(dataSource, equipment.dataSource) &&
        Objects.equals(equipmentType, equipment.equipmentType) &&
        Objects.equals(dateAssigned, equipment.dateAssigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, dataSource, equipmentType, dateAssigned);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Equipment {\n");
    
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  dataSource: ").append(dataSource).append("\n");
    sb.append("  equipmentType: ").append(equipmentType).append("\n");
    sb.append("  dateAssigned: ").append(dateAssigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
