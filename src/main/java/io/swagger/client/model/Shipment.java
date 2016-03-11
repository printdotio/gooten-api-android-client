package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Shipment  {
  
  @SerializedName("TrackingNumber")
  private String trackingNumber = null;
  @SerializedName("TrackingUrl")
  private String trackingUrl = null;
  @SerializedName("ShipCarrierName")
  private String shipCarrierName = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getShipCarrierName() {
    return shipCarrierName;
  }
  public void setShipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
    sb.append("  trackingUrl: ").append(trackingUrl).append("\n");
    sb.append("  shipCarrierName: ").append(shipCarrierName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
