package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Equipment;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-12T15:25:58.099Z")
public class InlineResponse2006  {
  
  private Equipment device = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("device")
  public Equipment getDevice() {
    return device;
  }
  public void setDevice(Equipment device) {
    this.device = device;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(device, inlineResponse2006.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("  device: ").append(device).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
