package io.swagger.client.model;

import io.swagger.client.model.SkuQuantityPair;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ShippingPricesRequest  {
  
  @SerializedName("ShipToPostalCode")
  private String shipToPostalCode = null;
  @SerializedName("ShipToCountry")
  private String shipToCountry = null;
  @SerializedName("ShipToState")
  private String shipToState = null;
  @SerializedName("CurrencyCode")
  private String currencyCode = null;
  @SerializedName("LanguageCode")
  private String languageCode = null;
  @SerializedName("Items")
  private List<SkuQuantityPair> items = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getShipToPostalCode() {
    return shipToPostalCode;
  }
  public void setShipToPostalCode(String shipToPostalCode) {
    this.shipToPostalCode = shipToPostalCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getShipToCountry() {
    return shipToCountry;
  }
  public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getShipToState() {
    return shipToState;
  }
  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
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
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<SkuQuantityPair> getItems() {
    return items;
  }
  public void setItems(List<SkuQuantityPair> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingPricesRequest {\n");
    
    sb.append("  shipToPostalCode: ").append(shipToPostalCode).append("\n");
    sb.append("  shipToCountry: ").append(shipToCountry).append("\n");
    sb.append("  shipToState: ").append(shipToState).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  languageCode: ").append(languageCode).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
