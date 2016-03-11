package io.swagger.client.model;

import io.swagger.client.model.ProductBuildInfoSpace;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductBuildOption  {
  
  @SerializedName("Name")
  private String name = null;
  @SerializedName("ImageUrl")
  private String imageUrl = null;
  @SerializedName("IsDefault")
  private Boolean isDefault = null;
  @SerializedName("Category")
  private String category = null;
  @SerializedName("IsPartnerSpecific")
  private Boolean isPartnerSpecific = null;
  @SerializedName("Spaces")
  private List<ProductBuildInfoSpace> spaces = null;

  
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
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsPartnerSpecific() {
    return isPartnerSpecific;
  }
  public void setIsPartnerSpecific(Boolean isPartnerSpecific) {
    this.isPartnerSpecific = isPartnerSpecific;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductBuildInfoSpace> getSpaces() {
    return spaces;
  }
  public void setSpaces(List<ProductBuildInfoSpace> spaces) {
    this.spaces = spaces;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildOption {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("  isDefault: ").append(isDefault).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  isPartnerSpecific: ").append(isPartnerSpecific).append("\n");
    sb.append("  spaces: ").append(spaces).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
