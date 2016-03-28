package gooten.api.model;

import gooten.api.model.OrderItem;
import gooten.api.model.Payment;
import gooten.api.model.ShipToAddress;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Order  {
  
  @SerializedName("ShipToAddress")
  private ShipToAddress shipToAddress = null;
  @SerializedName("Items")
  private List<OrderItem> items = null;
  @SerializedName("Payment")
  private Payment payment = null;
  @SerializedName("CouponCode")
  private String couponCode = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ShipToAddress getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(ShipToAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderItem> getItems() {
    return items;
  }
  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Payment getPayment() {
    return payment;
  }
  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("  shipToAddress: ").append(shipToAddress).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  payment: ").append(payment).append("\n");
    sb.append("  couponCode: ").append(couponCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


