package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ImageSizeVm  {
  
  @SerializedName("SpaceId")
  private String spaceId = null;
  @SerializedName("Width")
  private Long width = null;
  @SerializedName("Height")
  private Long height = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getWidth() {
    return width;
  }
  public void setWidth(Long width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getHeight() {
    return height;
  }
  public void setHeight(Long height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSizeVm {\n");
    
    sb.append("  spaceId: ").append(spaceId).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
