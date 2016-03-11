package io.swagger.client.model;

import io.swagger.client.model.ShipPrice;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ShipOption  {
  
  @SerializedName("Id")
  private Long id = null;
  @SerializedName("MethodType")
  private String methodType = null;
  @SerializedName("MethodId")
  private Long methodId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("CarrierName")
  private String carrierName = null;
  @SerializedName("CarrierLogoUrl")
  private String carrierLogoUrl = null;
  @SerializedName("Price")
  private ShipPrice price = null;
  @SerializedName("EstBusinessDaysTilDelivery")
  private Long estBusinessDaysTilDelivery = null;

  
  /**
   * The ID that can be passed into the /orders POST endpoing as ShipCarrierMethodId to specify an item's shipping method.
   **/
  @ApiModelProperty(required = true, value = "The ID that can be passed into the /orders POST endpoing as ShipCarrierMethodId to specify an item's shipping method.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMethodType() {
    return methodType;
  }
  public void setMethodType(String methodType) {
    this.methodType = methodType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMethodId() {
    return methodId;
  }
  public void setMethodId(Long methodId) {
    this.methodId = methodId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCarrierLogoUrl() {
    return carrierLogoUrl;
  }
  public void setCarrierLogoUrl(String carrierLogoUrl) {
    this.carrierLogoUrl = carrierLogoUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ShipPrice getPrice() {
    return price;
  }
  public void setPrice(ShipPrice price) {
    this.price = price;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getEstBusinessDaysTilDelivery() {
    return estBusinessDaysTilDelivery;
  }
  public void setEstBusinessDaysTilDelivery(Long estBusinessDaysTilDelivery) {
    this.estBusinessDaysTilDelivery = estBusinessDaysTilDelivery;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipOption {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  methodType: ").append(methodType).append("\n");
    sb.append("  methodId: ").append(methodId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  carrierName: ").append(carrierName).append("\n");
    sb.append("  carrierLogoUrl: ").append(carrierLogoUrl).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  estBusinessDaysTilDelivery: ").append(estBusinessDaysTilDelivery).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
