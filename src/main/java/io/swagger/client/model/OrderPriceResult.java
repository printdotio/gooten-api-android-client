package io.swagger.client.model;

import io.swagger.client.model.PriceInfo;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderPriceResult  {
  
  @SerializedName("Items")
  private PriceInfo items = null;
  @SerializedName("Shipping")
  private PriceInfo shipping = null;
  @SerializedName("Tax")
  private PriceInfo tax = null;
  @SerializedName("CouponCode")
  private PriceInfo couponCode = null;
  @SerializedName("CouponType")
  private String couponType = null;
  @SerializedName("CouponUsed")
  private String couponUsed = null;
  @SerializedName("HadCouponApply")
  private Boolean hadCouponApply = null;
  @SerializedName("DollarsOff")
  private Long dollarsOff = null;
  @SerializedName("PercentOff")
  private Long percentOff = null;
  @SerializedName("HadError")
  private Boolean hadError = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PriceInfo getItems() {
    return items;
  }
  public void setItems(PriceInfo items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PriceInfo getShipping() {
    return shipping;
  }
  public void setShipping(PriceInfo shipping) {
    this.shipping = shipping;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PriceInfo getTax() {
    return tax;
  }
  public void setTax(PriceInfo tax) {
    this.tax = tax;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PriceInfo getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(PriceInfo couponCode) {
    this.couponCode = couponCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCouponType() {
    return couponType;
  }
  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCouponUsed() {
    return couponUsed;
  }
  public void setCouponUsed(String couponUsed) {
    this.couponUsed = couponUsed;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHadCouponApply() {
    return hadCouponApply;
  }
  public void setHadCouponApply(Boolean hadCouponApply) {
    this.hadCouponApply = hadCouponApply;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getDollarsOff() {
    return dollarsOff;
  }
  public void setDollarsOff(Long dollarsOff) {
    this.dollarsOff = dollarsOff;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPercentOff() {
    return percentOff;
  }
  public void setPercentOff(Long percentOff) {
    this.percentOff = percentOff;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPriceResult {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  couponCode: ").append(couponCode).append("\n");
    sb.append("  couponType: ").append(couponType).append("\n");
    sb.append("  couponUsed: ").append(couponUsed).append("\n");
    sb.append("  hadCouponApply: ").append(hadCouponApply).append("\n");
    sb.append("  dollarsOff: ").append(dollarsOff).append("\n");
    sb.append("  percentOff: ").append(percentOff).append("\n");
    sb.append("  hadError: ").append(hadError).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
