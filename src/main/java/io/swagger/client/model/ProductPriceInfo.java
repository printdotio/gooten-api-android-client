package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductPriceInfo  {
  
  @SerializedName("Price")
  private Long price = null;
  @SerializedName("CurrencyCode")
  private String currencyCode = null;
  @SerializedName("FormattedPrice")
  private String formattedPrice = null;
  @SerializedName("CurrencyFormat")
  private String currencyFormat = null;
  @SerializedName("CurrencyDigits")
  private Long currencyDigits = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
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
  public String getFormattedPrice() {
    return formattedPrice;
  }
  public void setFormattedPrice(String formattedPrice) {
    this.formattedPrice = formattedPrice;
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

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCurrencyDigits() {
    return currencyDigits;
  }
  public void setCurrencyDigits(Long currencyDigits) {
    this.currencyDigits = currencyDigits;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceInfo {\n");
    
    sb.append("  price: ").append(price).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  formattedPrice: ").append(formattedPrice).append("\n");
    sb.append("  currencyFormat: ").append(currencyFormat).append("\n");
    sb.append("  currencyDigits: ").append(currencyDigits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
