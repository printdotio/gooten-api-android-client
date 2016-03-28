package gooten.api.model;

import gooten.api.model.Currency;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Country  {
  
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Code")
  private String code = null;
  @SerializedName("IsSupported")
  private Boolean isSupported = null;
  @SerializedName("MeasurementCode")
  private String measurementCode = null;
  @SerializedName("FlagUrl")
  private String flagUrl = null;
  @SerializedName("DefaultCurrency")
  private Currency defaultCurrency = null;

  
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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsSupported() {
    return isSupported;
  }
  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMeasurementCode() {
    return measurementCode;
  }
  public void setMeasurementCode(String measurementCode) {
    this.measurementCode = measurementCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFlagUrl() {
    return flagUrl;
  }
  public void setFlagUrl(String flagUrl) {
    this.flagUrl = flagUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Currency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(Currency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  isSupported: ").append(isSupported).append("\n");
    sb.append("  measurementCode: ").append(measurementCode).append("\n");
    sb.append("  flagUrl: ").append(flagUrl).append("\n");
    sb.append("  defaultCurrency: ").append(defaultCurrency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


