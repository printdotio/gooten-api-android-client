package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserInfo  {
  
  @SerializedName("LanguageCode")
  private String languageCode = null;
  @SerializedName("CountryCode")
  private String countryCode = null;
  @SerializedName("CountryName")
  private String countryName = null;
  @SerializedName("CurrencyName")
  private String currencyName = null;
  @SerializedName("CurrencyCode")
  private String currencyCode = null;
  @SerializedName("CurrencyFormat")
  private String currencyFormat = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
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
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyName() {
    return currencyName;
  }
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyFormat() {
    return currencyFormat;
  }
  public void setCurrencyFormat(String currencyFormat) {
    this.currencyFormat = currencyFormat;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("  languageCode: ").append(languageCode).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  countryName: ").append(countryName).append("\n");
    sb.append("  currencyName: ").append(currencyName).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  currencyFormat: ").append(currencyFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
