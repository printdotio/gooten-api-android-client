package gooten.api.model;

import gooten.api.model.ProductBuildInfo;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductBuildInfoSpace  {
  
  @SerializedName("Id")
  private String id = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Index")
  private Long index = null;
  @SerializedName("DefaultRotation")
  private Long defaultRotation = null;
  @SerializedName("Layers")
  private List<ProductBuildInfo> layers = null;

  
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
  public Long getDefaultRotation() {
    return defaultRotation;
  }
  public void setDefaultRotation(Long defaultRotation) {
    this.defaultRotation = defaultRotation;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductBuildInfo> getLayers() {
    return layers;
  }
  public void setLayers(List<ProductBuildInfo> layers) {
    this.layers = layers;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildInfoSpace {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  defaultRotation: ").append(defaultRotation).append("\n");
    sb.append("  layers: ").append(layers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


