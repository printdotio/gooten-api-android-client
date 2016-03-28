package gooten.api.model;

import gooten.api.model.OrderItemImage;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class OrderItem  {
  
  @SerializedName("Quantity")
  private Long quantity = null;
  @SerializedName("SKU")
  private String SKU = null;
  @SerializedName("ShipCarrierMethodId")
  private Long shipCarrierMethodId = null;
  @SerializedName("Images")
  private List<OrderItemImage> images = null;

  
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
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getShipCarrierMethodId() {
    return shipCarrierMethodId;
  }
  public void setShipCarrierMethodId(Long shipCarrierMethodId) {
    this.shipCarrierMethodId = shipCarrierMethodId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderItemImage> getImages() {
    return images;
  }
  public void setImages(List<OrderItemImage> images) {
    this.images = images;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  SKU: ").append(SKU).append("\n");
    sb.append("  shipCarrierMethodId: ").append(shipCarrierMethodId).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


