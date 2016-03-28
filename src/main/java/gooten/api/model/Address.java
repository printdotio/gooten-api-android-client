package gooten.api.model;

import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Address  {
  
  @SerializedName("City")
  private String city = null;
  @SerializedName("CountryCode")
  private String countryCode = null;
  @SerializedName("PostalCode")
  private String postalCode = null;
  @SerializedName("StateOrProvinceCode")
  private String stateOrProvinceCode = null;
  @SerializedName("StreetLines")
  private List<String> streetLines = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStateOrProvinceCode() {
    return stateOrProvinceCode;
  }
  public void setStateOrProvinceCode(String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getStreetLines() {
    return streetLines;
  }
  public void setStreetLines(List<String> streetLines) {
    this.streetLines = streetLines;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  city: ").append(city).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  stateOrProvinceCode: ").append(stateOrProvinceCode).append("\n");
    sb.append("  streetLines: ").append(streetLines).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


