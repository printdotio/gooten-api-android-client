package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SkuQuantityPair  {
  
  @SerializedName("SKU")
  private String SKU = null;
  @SerializedName("Quantity")
  private Long quantity = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuQuantityPair {\n");
    
    sb.append("  SKU: ").append(SKU).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
