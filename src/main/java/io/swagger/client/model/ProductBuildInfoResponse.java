package io.swagger.client.model;

import io.swagger.client.model.ProductBuildOption;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductBuildInfoResponse  {
  
  @SerializedName("Options")
  private List<ProductBuildOption> options = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductBuildOption> getOptions() {
    return options;
  }
  public void setOptions(List<ProductBuildOption> options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildInfoResponse {\n");
    
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
