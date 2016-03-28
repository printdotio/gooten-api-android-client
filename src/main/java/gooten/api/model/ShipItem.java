package gooten.api.model;

import gooten.api.model.ShipOption;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ShipItem  {
  
  @SerializedName("SKUs")
  private List<String> sKUs = null;
  @SerializedName("ShipOptions")
  private List<ShipOption> shipOptions = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getSKUs() {
    return sKUs;
  }
  public void setSKUs(List<String> sKUs) {
    this.sKUs = sKUs;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ShipOption> getShipOptions() {
    return shipOptions;
  }
  public void setShipOptions(List<ShipOption> shipOptions) {
    this.shipOptions = shipOptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipItem {\n");
    
    sb.append("  sKUs: ").append(sKUs).append("\n");
    sb.append("  shipOptions: ").append(shipOptions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


