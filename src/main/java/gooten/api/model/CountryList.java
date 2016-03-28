package gooten.api.model;

import gooten.api.model.Country;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CountryList  {
  
  @SerializedName("Countries")
  private List<Country> countries = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Country> getCountries() {
    return countries;
  }
  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryList {\n");
    
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


