package io.swagger.client.model;

import io.swagger.client.model.KeyValuePair;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LanguageDictionary  {
  
  @SerializedName("category")
  private String category = null;
  @SerializedName("values")
  private List<KeyValuePair> values = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<KeyValuePair> getValues() {
    return values;
  }
  public void setValues(List<KeyValuePair> values) {
    this.values = values;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDictionary {\n");
    
    sb.append("  category: ").append(category).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
