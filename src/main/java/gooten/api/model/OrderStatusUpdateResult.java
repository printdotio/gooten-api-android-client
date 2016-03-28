package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class OrderStatusUpdateResult  {
  
  @SerializedName("HadError")
  private Boolean hadError = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusUpdateResult {\n");
    
    sb.append("  hadError: ").append(hadError).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


