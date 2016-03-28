package gooten.api.model;

import gooten.api.model.ImageSizeVm;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ImageValidationVm  {
  
  @SerializedName("Sku")
  private String sku = null;
  @SerializedName("Images")
  private List<ImageSizeVm> images = null;

  
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
  public List<ImageSizeVm> getImages() {
    return images;
  }
  public void setImages(List<ImageSizeVm> images) {
    this.images = images;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageValidationVm {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


