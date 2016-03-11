package io.swagger.client.model;

import io.swagger.client.model.Meta;
import io.swagger.client.model.OrderPayment;
import io.swagger.client.model.PostOrderItem;
import io.swagger.client.model.ShipToAddress;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PostOrder  {
  
  @SerializedName("ShipToAddress")
  private ShipToAddress shipToAddress = null;
  @SerializedName("BillingAddress")
  private ShipToAddress billingAddress = null;
  @SerializedName("Items")
  private List<PostOrderItem> items = null;
  @SerializedName("Payment")
  private OrderPayment payment = null;
  @SerializedName("SourceId")
  private String sourceId = null;
  @SerializedName("IsPreSubmit")
  private Boolean isPreSubmit = null;
  @SerializedName("CouponCode")
  private String couponCode = null;
  @SerializedName("Meta")
  private Meta meta = null;

  
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
  public ShipToAddress getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(ShipToAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PostOrderItem> getItems() {
    return items;
  }
  public void setItems(List<PostOrderItem> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrderPayment getPayment() {
    return payment;
  }
  public void setPayment(OrderPayment payment) {
    this.payment = payment;
  }

  
  /**
   * Clients can submit an ID they use for the order here.
   **/
  @ApiModelProperty(required = true, value = "Clients can submit an ID they use for the order here.")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * Submit the order into PrePayment status.
   **/
  @ApiModelProperty(required = true, value = "Submit the order into PrePayment status.")
  public Boolean getIsPreSubmit() {
    return isPreSubmit;
  }
  public void setIsPreSubmit(Boolean isPreSubmit) {
    this.isPreSubmit = isPreSubmit;
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
    sb.append("class PostOrder {\n");
    
    sb.append("  shipToAddress: ").append(shipToAddress).append("\n");
    sb.append("  billingAddress: ").append(billingAddress).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  payment: ").append(payment).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  isPreSubmit: ").append(isPreSubmit).append("\n");
    sb.append("  couponCode: ").append(couponCode).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
