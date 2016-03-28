package gooten.api.model;

import gooten.api.model.ProductPreviewImage;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductPreviewRequest  {
  
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("Template")
  private String template = null;
  @SerializedName("Images")
  private List<ProductPreviewImage> images = null;
  @SerializedName("MaxHeight")
  private Long maxHeight = null;
  @SerializedName("MaxWidth")
  private Long maxWidth = null;

  
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
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductPreviewImage> getImages() {
    return images;
  }
  public void setImages(List<ProductPreviewImage> images) {
    this.images = images;
  }

  
  /**
   * Max height of the resultant image. Defaults to 500px
   **/
  @ApiModelProperty(required = true, value = "Max height of the resultant image. Defaults to 500px")
  public Long getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
  }

  
  /**
   * Max width of the resultant image. Defaults to 500px
   **/
  @ApiModelProperty(required = true, value = "Max width of the resultant image. Defaults to 500px")
  public Long getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewRequest {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  maxHeight: ").append(maxHeight).append("\n");
    sb.append("  maxWidth: ").append(maxWidth).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


