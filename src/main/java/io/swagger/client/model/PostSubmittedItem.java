package io.swagger.client.model;

import io.swagger.client.model.Meta;
import io.swagger.client.model.ProductPriceInfo;
import io.swagger.client.model.Shipment;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PostSubmittedItem  {
  
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("ProductId")
  private Long productId = null;
  @SerializedName("Product")
  private String product = null;
  @SerializedName("Quantity")
  private Long quantity = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("TrackingNumber")
  private String trackingNumber = null;
  @SerializedName("TrackingUrl")
  private String trackingUrl = null;
  @SerializedName("ShipCarrierName")
  private String shipCarrierName = null;
  @SerializedName("Price")
  private ProductPriceInfo price = null;
  @SerializedName("DiscountAmount")
  private ProductPriceInfo discountAmount = null;
  @SerializedName("SourceId")
  private String sourceId = null;
  @SerializedName("Meta")
  private Meta meta = null;
  @SerializedName("Shipments")
  private List<Shipment> shipments = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getProductId() {
    return productId;
  }
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  
  /**
   * The type of product that was bought
   **/
  @ApiModelProperty(required = true, value = "The type of product that was bought")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }

  
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
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  @ApiModelProperty(required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  @ApiModelProperty(required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  @ApiModelProperty(required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  public String getShipCarrierName() {
    return shipCarrierName;
  }
  public void setShipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getPrice() {
    return price;
  }
  public void setPrice(ProductPriceInfo price) {
    this.price = price;
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
   * Partner's internal ID-- entirely optional
   **/
  @ApiModelProperty(required = true, value = "Partner's internal ID-- entirely optional")
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

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSubmittedItem {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
    sb.append("  trackingUrl: ").append(trackingUrl).append("\n");
    sb.append("  shipCarrierName: ").append(shipCarrierName).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  discountAmount: ").append(discountAmount).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("  shipments: ").append(shipments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
