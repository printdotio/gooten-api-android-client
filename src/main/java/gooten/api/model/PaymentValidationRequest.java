package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PaymentValidationRequest  {
  
  @SerializedName("OrderId")
  private String orderId = null;
  @SerializedName("PayPalKey")
  private String payPalKey = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPayPalKey() {
    return payPalKey;
  }
  public void setPayPalKey(String payPalKey) {
    this.payPalKey = payPalKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentValidationRequest {\n");
    
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  payPalKey: ").append(payPalKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


