package gooten.api.model;

import gooten.api.model.ProductOption;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductOptionList  {
  
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Values")
  private List<ProductOption> values = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductOption> getValues() {
    return values;
  }
  public void setValues(List<ProductOption> values) {
    this.values = values;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionList {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


