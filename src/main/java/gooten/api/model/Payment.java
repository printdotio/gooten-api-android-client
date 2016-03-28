package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Payment  {
  
  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


