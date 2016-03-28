package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductOptionValueSettings  {
  
  @SerializedName("IconUrl")
  private String iconUrl = null;
  @SerializedName("IconType")
  private String iconType = null;
  @SerializedName("ColorRgba")
  private String colorRgba = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getIconType() {
    return iconType;
  }
  public void setIconType(String iconType) {
    this.iconType = iconType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getColorRgba() {
    return colorRgba;
  }
  public void setColorRgba(String colorRgba) {
    this.colorRgba = colorRgba;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionValueSettings {\n");
    
    sb.append("  iconUrl: ").append(iconUrl).append("\n");
    sb.append("  iconType: ").append(iconType).append("\n");
    sb.append("  colorRgba: ").append(colorRgba).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


