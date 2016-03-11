package io.swagger.client.model;

import io.swagger.client.model.ProductOption;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductVariant  {
  
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("MaxImages")
  private Long maxImages = null;
  @SerializedName("HasTemplates")
  private Boolean hasTemplates = null;
  @SerializedName("Options")
  private List<ProductOption> options = null;

  
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
  public Long getMaxImages() {
    return maxImages;
  }
  public void setMaxImages(Long maxImages) {
    this.maxImages = maxImages;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHasTemplates() {
    return hasTemplates;
  }
  public void setHasTemplates(Boolean hasTemplates) {
    this.hasTemplates = hasTemplates;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductOption> getOptions() {
    return options;
  }
  public void setOptions(List<ProductOption> options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariant {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  maxImages: ").append(maxImages).append("\n");
    sb.append("  hasTemplates: ").append(hasTemplates).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
