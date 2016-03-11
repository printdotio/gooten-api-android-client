package io.swagger.client.model;

import io.swagger.client.model.Category;
import io.swagger.client.model.ProductImage;
import io.swagger.client.model.ProductInfo;
import io.swagger.client.model.ProductPriceInfo;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Product  {
  
  @SerializedName("Id")
  private Long id = null;
  @SerializedName("UId")
  private String uId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("ShortDescription")
  private String shortDescription = null;
  @SerializedName("HasAvailableProductVariants")
  private Boolean hasAvailableProductVariants = null;
  @SerializedName("HasProductTemplates")
  private Boolean hasProductTemplates = null;
  @SerializedName("FeaturedIndex")
  private Long featuredIndex = null;
  @SerializedName("MaxZoom")
  private Long maxZoom = null;
  @SerializedName("RetailPrice")
  private ProductPriceInfo retailPrice = null;
  @SerializedName("Info")
  private List<ProductInfo> info = null;
  @SerializedName("ProductImage")
  private List<ProductImage> productImage = null;
  @SerializedName("PriceInfo")
  private ProductPriceInfo priceInfo = null;
  @SerializedName("Categories")
  private List<Category> categories = null;

  
  /**
   * The product type id. Represents a type/class of products. Can later be passed into the productvariant service to get available product variations.
   **/
  @ApiModelProperty(required = true, value = "The product type id. Represents a type/class of products. Can later be passed into the productvariant service to get available product variations.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * An id that syncs between printio's staging and live environments.
   **/
  @ApiModelProperty(required = true, value = "An id that syncs between printio's staging and live environments.")
  public String getUId() {
    return uId;
  }
  public void setUId(String uId) {
    this.uId = uId;
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
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  
  /**
   * Whether or not the item returned is a Product, or ProductVariant. Items with a Sku will not have other product variants
   **/
  @ApiModelProperty(required = true, value = "Whether or not the item returned is a Product, or ProductVariant. Items with a Sku will not have other product variants")
  public Boolean getHasAvailableProductVariants() {
    return hasAvailableProductVariants;
  }
  public void setHasAvailableProductVariants(Boolean hasAvailableProductVariants) {
    this.hasAvailableProductVariants = hasAvailableProductVariants;
  }

  
  /**
   * Whether or not the product has variants with templates.
   **/
  @ApiModelProperty(required = true, value = "Whether or not the product has variants with templates.")
  public Boolean getHasProductTemplates() {
    return hasProductTemplates;
  }
  public void setHasProductTemplates(Boolean hasProductTemplates) {
    this.hasProductTemplates = hasProductTemplates;
  }

  
  /**
   * A value to sort featured items by. Note that this is null if IsFeatured=false
   **/
  @ApiModelProperty(required = true, value = "A value to sort featured items by. Note that this is null if IsFeatured=false")
  public Long getFeaturedIndex() {
    return featuredIndex;
  }
  public void setFeaturedIndex(Long featuredIndex) {
    this.featuredIndex = featuredIndex;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMaxZoom() {
    return maxZoom;
  }
  public void setMaxZoom(Long maxZoom) {
    this.maxZoom = maxZoom;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getRetailPrice() {
    return retailPrice;
  }
  public void setRetailPrice(ProductPriceInfo retailPrice) {
    this.retailPrice = retailPrice;
  }

  
  /**
   * Content describing the product.
   **/
  @ApiModelProperty(required = true, value = "Content describing the product.")
  public List<ProductInfo> getInfo() {
    return info;
  }
  public void setInfo(List<ProductInfo> info) {
    this.info = info;
  }

  
  /**
   * Product images. Note that this contains large and small images for web, mobile, etc
   **/
  @ApiModelProperty(required = true, value = "Product images. Note that this contains large and small images for web, mobile, etc")
  public List<ProductImage> getProductImage() {
    return productImage;
  }
  public void setProductImage(List<ProductImage> productImage) {
    this.productImage = productImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPriceInfo getPriceInfo() {
    return priceInfo;
  }
  public void setPriceInfo(ProductPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  uId: ").append(uId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  hasAvailableProductVariants: ").append(hasAvailableProductVariants).append("\n");
    sb.append("  hasProductTemplates: ").append(hasProductTemplates).append("\n");
    sb.append("  featuredIndex: ").append(featuredIndex).append("\n");
    sb.append("  maxZoom: ").append(maxZoom).append("\n");
    sb.append("  retailPrice: ").append(retailPrice).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  productImage: ").append(productImage).append("\n");
    sb.append("  priceInfo: ").append(priceInfo).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
