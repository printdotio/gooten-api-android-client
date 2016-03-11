package io.swagger.client.model;

import io.swagger.client.model.Meta;
import io.swagger.client.model.PostSubmittedItem;
import io.swagger.client.model.ProductPriceInfo;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SearchSubmittedOrder  {
  
  @SerializedName("Id")
  private String id = null;
  @SerializedName("NiceId")
  private String niceId = null;
  @SerializedName("SourceId")
  private String sourceId = null;
  @SerializedName("Items")
  private List<PostSubmittedItem> items = null;
  @SerializedName("Total")
  private ProductPriceInfo total = null;
  @SerializedName("ShippingTotal")
  private ProductPriceInfo shippingTotal = null;
  @SerializedName("DiscountCode")
  private String discountCode = null;
  @SerializedName("DiscountAmount")
  private ProductPriceInfo discountAmount = null;
  @SerializedName("Meta")
  private Meta meta = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNiceId() {
    return niceId;
  }
  public void setNiceId(String niceId) {
    this.niceId = niceId;
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
  public String getDiscountCode() {
    return discountCode;
  }
  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
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
    sb.append("class SearchSubmittedOrder {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  niceId: ").append(niceId).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  shippingTotal: ").append(shippingTotal).append("\n");
    sb.append("  discountCode: ").append(discountCode).append("\n");
    sb.append("  discountAmount: ").append(discountAmount).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
