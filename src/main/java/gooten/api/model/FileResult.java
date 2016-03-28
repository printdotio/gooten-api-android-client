package gooten.api.model;

import gooten.api.model.Image;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class FileResult  {
  
  @SerializedName("Price")
  private List<Image> price = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Image> getPrice() {
    return price;
  }
  public void setPrice(List<Image> price) {
    this.price = price;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileResult {\n");
    
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


