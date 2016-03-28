package gooten.api.model;

import gooten.api.model.Meta;
import gooten.api.model.PostSubmittedItem;
import gooten.api.model.ProductPriceInfo;
import gooten.api.model.ShipToAddress;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PostSubmittedOrder  {
  
  @SerializedName("Id")
  private String id = null;
  @SerializedName("NiceId")
  private String niceId = null;
  @SerializedName("SouceId")
  private String souceId = null;
  @SerializedName("Items")
  private List<PostSubmittedItem> items = null;
  @SerializedName("Total")
  private ProductPriceInfo total = null;
  @SerializedName("ShippingTotal")
  private ProductPriceInfo shippingTotal = null;
  @SerializedName("DiscountAmount")
  private ProductPriceInfo discountAmount = null;
  @SerializedName("DiscountCode")
  private String discountCode = null;
  @SerializedName("BillingAddress")
  private ShipToAddress billingAddress = null;
  @SerializedName("ShippingAddress")
  private ShipToAddress shippingAddress = null;
  @SerializedName("Meta")
  private Meta meta = null;

  
  /**
   * The unique ID we use within our system.
   **/
  @ApiModelProperty(required = true, value = "The unique ID we use within our system.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * A short, non-unique ID that is optionally used for customer service.
   **/
  @ApiModelProperty(required = true, value = "A short, non-unique ID that is optionally used for customer service.")
  public String getNiceId() {
    return niceId;
  }
  public void setNiceId(String niceId) {
    this.niceId = niceId;
  }

  
  /**
   * Partner's internal ID-- entirely optional
   **/
  @ApiModelProperty(required = true, value = "Partner's internal ID-- entirely optional")
  public String getSouceId() {
    return souceId;
  }
  public void setSouceId(String souceId) {
    this.souceId = souceId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PostSubmittedItem> getItems() {
    return items;
  }
  public void setItems(List<PostSubmittedItem> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getTotal() {
    return total;
  }
  public void setTotal(ProductPriceInfo total) {
    this.total = total;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getShippingTotal() {
    return shippingTotal;
  }
  public void setShippingTotal(ProductPriceInfo shippingTotal) {
    this.shippingTotal = shippingTotal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getDiscountAmount() {
    return discountAmount;
  }
  public void setDiscountAmount(ProductPriceInfo discountAmount) {
    this.discountAmount = discountAmount;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDiscountCode() {
    return discountCode;
  }
  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
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
  public ShipToAddress getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(ShipToAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
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
    sb.append("class PostSubmittedOrder {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  niceId: ").append(niceId).append("\n");
    sb.append("  souceId: ").append(souceId).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  shippingTotal: ").append(shippingTotal).append("\n");
    sb.append("  discountAmount: ").append(discountAmount).append("\n");
    sb.append("  discountCode: ").append(discountCode).append("\n");
    sb.append("  billingAddress: ").append(billingAddress).append("\n");
    sb.append("  shippingAddress: ").append(shippingAddress).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


