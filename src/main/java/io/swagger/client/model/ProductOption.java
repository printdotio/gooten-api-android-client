package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ProductOption  {
  
  @SerializedName("OptionId")
  private String optionId = null;
  @SerializedName("ValueId")
  private String valueId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Value")
  private String value = null;
  @SerializedName("ImageUrl")
  private String imageUrl = null;
  @SerializedName("ImageType")
  private String imageType = null;
  @SerializedName("RgbaColor")
  private String rgbaColor = null;
  @SerializedName("CmValue")
  private String cmValue = null;
  @SerializedName("SortValue")
  private String sortValue = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOptionId() {
    return optionId;
  }
  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getValueId() {
    return valueId;
  }
  public void setValueId(String valueId) {
    this.valueId = valueId;
  }

  
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
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
  public String getImageType() {
    return imageType;
  }
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRgbaColor() {
    return rgbaColor;
  }
  public void setRgbaColor(String rgbaColor) {
    this.rgbaColor = rgbaColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCmValue() {
    return cmValue;
  }
  public void setCmValue(String cmValue) {
    this.cmValue = cmValue;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSortValue() {
    return sortValue;
  }
  public void setSortValue(String sortValue) {
    this.sortValue = sortValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOption {\n");
    
    sb.append("  optionId: ").append(optionId).append("\n");
    sb.append("  valueId: ").append(valueId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("  imageType: ").append(imageType).append("\n");
    sb.append("  rgbaColor: ").append(rgbaColor).append("\n");
    sb.append("  cmValue: ").append(cmValue).append("\n");
    sb.append("  sortValue: ").append(sortValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
