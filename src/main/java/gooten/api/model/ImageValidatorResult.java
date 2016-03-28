package gooten.api.model;

import gooten.api.model.ValidationFailure;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ImageValidatorResult  {
  
  @SerializedName("HadError")
  private Boolean hadError = null;
  @SerializedName("Issues")
  private List<ValidationFailure> issues = null;

  
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
  public List<ValidationFailure> getIssues() {
    return issues;
  }
  public void setIssues(List<ValidationFailure> issues) {
    this.issues = issues;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageValidatorResult {\n");
    
    sb.append("  hadError: ").append(hadError).append("\n");
    sb.append("  issues: ").append(issues).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


