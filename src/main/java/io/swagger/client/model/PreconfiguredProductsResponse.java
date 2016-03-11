package io.swagger.client.model;

import io.swagger.client.model.PreconfiguredProduct;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PreconfiguredProductsResponse  {
  
  @SerializedName("PreconfiguredProducts")
  private List<PreconfiguredProduct> preconfiguredProducts = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PreconfiguredProduct> getPreconfiguredProducts() {
    return preconfiguredProducts;
  }
  public void setPreconfiguredProducts(List<PreconfiguredProduct> preconfiguredProducts) {
    this.preconfiguredProducts = preconfiguredProducts;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredProductsResponse {\n");
    
    sb.append("  preconfiguredProducts: ").append(preconfiguredProducts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
