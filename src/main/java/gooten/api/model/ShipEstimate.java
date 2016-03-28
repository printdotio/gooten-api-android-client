package gooten.api.model;

import gooten.api.model.ShipPrice;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ShipEstimate  {
  
  @SerializedName("MinPrice")
  private ShipPrice minPrice = null;
  @SerializedName("MaxPrice")
  private ShipPrice maxPrice = null;
  @SerializedName("VendorCountryCode")
  private String vendorCountryCode = null;
  @SerializedName("CanShipExpedited")
  private Boolean canShipExpedited = null;
  @SerializedName("EstShipDays")
  private Long estShipDays = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ShipPrice getMinPrice() {
    return minPrice;
  }
  public void setMinPrice(ShipPrice minPrice) {
    this.minPrice = minPrice;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ShipPrice getMaxPrice() {
    return maxPrice;
  }
  public void setMaxPrice(ShipPrice maxPrice) {
    this.maxPrice = maxPrice;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVendorCountryCode() {
    return vendorCountryCode;
  }
  public void setVendorCountryCode(String vendorCountryCode) {
    this.vendorCountryCode = vendorCountryCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getCanShipExpedited() {
    return canShipExpedited;
  }
  public void setCanShipExpedited(Boolean canShipExpedited) {
    this.canShipExpedited = canShipExpedited;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getEstShipDays() {
    return estShipDays;
  }
  public void setEstShipDays(Long estShipDays) {
    this.estShipDays = estShipDays;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipEstimate {\n");
    
    sb.append("  minPrice: ").append(minPrice).append("\n");
    sb.append("  maxPrice: ").append(maxPrice).append("\n");
    sb.append("  vendorCountryCode: ").append(vendorCountryCode).append("\n");
    sb.append("  canShipExpedited: ").append(canShipExpedited).append("\n");
    sb.append("  estShipDays: ").append(estShipDays).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


