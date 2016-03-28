package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductPreviewResponse  {
  
  @SerializedName("Url")
  private String url = null;
  @SerializedName("HadError")
  private Boolean hadError = null;
  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewResponse {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  hadError: ").append(hadError).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


