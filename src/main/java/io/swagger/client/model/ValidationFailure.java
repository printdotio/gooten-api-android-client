package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ValidationFailure  {
  
  @SerializedName("PropertyName")
  private String propertyName = null;
  @SerializedName("ErrorMessage")
  private String errorMessage = null;
  @SerializedName("AttemptedValue")
  private String attemptedValue = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPropertyName() {
    return propertyName;
  }
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAttemptedValue() {
    return attemptedValue;
  }
  public void setAttemptedValue(String attemptedValue) {
    this.attemptedValue = attemptedValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationFailure {\n");
    
    sb.append("  propertyName: ").append(propertyName).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("  attemptedValue: ").append(attemptedValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
