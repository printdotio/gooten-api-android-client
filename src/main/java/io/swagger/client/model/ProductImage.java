package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductImage  {
  
  @SerializedName("Url")
  private String url = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Index")
  private Long index = null;
  @SerializedName("Id")
  private String id = null;
  @SerializedName("ImageTypes")
  private List<String> imageTypes = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }

  
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
  public List<String> getImageTypes() {
    return imageTypes;
  }
  public void setImageTypes(List<String> imageTypes) {
    this.imageTypes = imageTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImage {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  imageTypes: ").append(imageTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
