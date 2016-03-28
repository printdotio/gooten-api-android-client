package gooten.api.model;

import gooten.api.model.ShipItem;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ShippingPricesResult  {
  
  @SerializedName("Result")
  private List<ShipItem> result = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ShipItem> getResult() {
    return result;
  }
  public void setResult(List<ShipItem> result) {
    this.result = result;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingPricesResult {\n");
    
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


