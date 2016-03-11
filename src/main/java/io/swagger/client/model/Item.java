package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Item  {
  
  @SerializedName("Quantity")
  private Long quantity = null;
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("Product")
  private String product = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
