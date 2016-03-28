package gooten.api.model;

import gooten.api.model.PreconfiguredItem;
import gooten.api.model.PreconfiguredProductImage;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PreconfiguredProductInsert  {
  
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Price")
  private Long price = null;
  @SerializedName("Items")
  private List<PreconfiguredItem> items = null;
  @SerializedName("Images")
  private List<PreconfiguredProductImage> images = null;

  
  /**
   * A sku that uniquely identifies the preconfigured product.
   **/
  @ApiModelProperty(required = true, value = "A sku that uniquely identifies the preconfigured product.")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Optional price.
   **/
  @ApiModelProperty(required = true, value = "Optional price.")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
  }

  
  /**
   * The item[s] that constitue the product.
   **/
  @ApiModelProperty(required = true, value = "The item[s] that constitue the product.")
  public List<PreconfiguredItem> getItems() {
    return items;
  }
  public void setItems(List<PreconfiguredItem> items) {
    this.items = items;
  }

  
  /**
   * Product images. Can contain large and small images for web, mobile, etc
   **/
  @ApiModelProperty(required = true, value = "Product images. Can contain large and small images for web, mobile, etc")
  public List<PreconfiguredProductImage> getImages() {
    return images;
  }
  public void setImages(List<PreconfiguredProductImage> images) {
    this.images = images;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredProductInsert {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


