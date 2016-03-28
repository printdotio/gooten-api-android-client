package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PaymentValidationResponse  {
  
  @SerializedName("IsValid")
  private Boolean isValid = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsValid() {
    return isValid;
  }
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentValidationResponse {\n");
    
    sb.append("  isValid: ").append(isValid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


