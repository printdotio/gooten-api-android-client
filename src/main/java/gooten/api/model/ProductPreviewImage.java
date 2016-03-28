package gooten.api.model;

import gooten.api.model.ProductPreviewImageSpec;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductPreviewImage  {
  
  @SerializedName("LayerId")
  private String layerId = null;
  @SerializedName("Image")
  private ProductPreviewImageSpec image = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLayerId() {
    return layerId;
  }
  public void setLayerId(String layerId) {
    this.layerId = layerId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProductPreviewImageSpec getImage() {
    return image;
  }
  public void setImage(ProductPreviewImageSpec image) {
    this.image = image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewImage {\n");
    
    sb.append("  layerId: ").append(layerId).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


