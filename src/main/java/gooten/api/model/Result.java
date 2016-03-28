package gooten.api.model;

import gooten.api.model.Address;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Result  {
  
  @SerializedName("IsValid")
  private Boolean isValid = null;
  @SerializedName("Reason")
  private String reason = null;
  @SerializedName("Score")
  private Long score = null;
  @SerializedName("ProposedAddress")
  private Address proposedAddress = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsValid() {
    return isValid;
  }
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Address getProposedAddress() {
    return proposedAddress;
  }
  public void setProposedAddress(Address proposedAddress) {
    this.proposedAddress = proposedAddress;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("  isValid: ").append(isValid).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  proposedAddress: ").append(proposedAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


