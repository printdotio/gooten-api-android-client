package io.swagger.client.model;

import io.swagger.client.model.Image;
import io.swagger.client.model.Meta;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PostOrderItem  {
  
  @SerializedName("Quantity")
  private Long quantity = null;
  @SerializedName("SKU")
  private String SKU = null;
  @SerializedName("ShipCarrierMethodId")
  private Long shipCarrierMethodId = null;
  @SerializedName("ShipType")
  private String shipType = null;
  @SerializedName("Images")
  private List<Image> images = null;
  @SerializedName("SourceId")
  private String sourceId = null;
  @SerializedName("Meta")
  private Meta meta = null;

  
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
   * If one does not want to pass a ShipCarrierMethodId of a specific shipping method, one can instead pass 'Standard', 'Overnight', or 'Expedited' here.
   **/
  @ApiModelProperty(required = true, value = "If one does not want to pass a ShipCarrierMethodId of a specific shipping method, one can instead pass 'Standard', 'Overnight', or 'Expedited' here.")
  public String getShipType() {
    return shipType;
  }
  public void setShipType(String shipType) {
    this.shipType = shipType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  
  /**
   * An optional place to pass in an ID for the OrderItem.
   **/
  @ApiModelProperty(required = true, value = "An optional place to pass in an ID for the OrderItem.")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * An optional Map<string,string> of misc properties.
   **/
  @ApiModelProperty(required = true, value = "An optional Map<string,string> of misc properties.")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderItem {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  SKU: ").append(SKU).append("\n");
    sb.append("  shipCarrierMethodId: ").append(shipCarrierMethodId).append("\n");
    sb.append("  shipType: ").append(shipType).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
