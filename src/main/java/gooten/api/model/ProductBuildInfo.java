package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductBuildInfo  {
  
  @SerializedName("Id")
  private String id = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Type")
  private String type = null;
  @SerializedName("ZIndex")
  private Long zIndex = null;
  @SerializedName("X1")
  private Long x1 = null;
  @SerializedName("X2")
  private Long x2 = null;
  @SerializedName("Y1")
  private Long y1 = null;
  @SerializedName("Y2")
  private Long y2 = null;
  @SerializedName("Color")
  private String color = null;
  @SerializedName("BackgroundImageUrl")
  private String backgroundImageUrl = null;
  @SerializedName("OverlayImageUrl")
  private String overlayImageUrl = null;
  @SerializedName("FontName")
  private String fontName = null;
  @SerializedName("FontSize")
  private String fontSize = null;
  @SerializedName("FontHAlignment")
  private String fontHAlignment = null;
  @SerializedName("FontVAlighment")
  private String fontVAlighment = null;
  @SerializedName("DefaultText")
  private String defaultText = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getZIndex() {
    return zIndex;
  }
  public void setZIndex(Long zIndex) {
    this.zIndex = zIndex;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getX1() {
    return x1;
  }
  public void setX1(Long x1) {
    this.x1 = x1;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getX2() {
    return x2;
  }
  public void setX2(Long x2) {
    this.x2 = x2;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getY1() {
    return y1;
  }
  public void setY1(Long y1) {
    this.y1 = y1;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getY2() {
    return y2;
  }
  public void setY2(Long y2) {
    this.y2 = y2;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }
  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOverlayImageUrl() {
    return overlayImageUrl;
  }
  public void setOverlayImageUrl(String overlayImageUrl) {
    this.overlayImageUrl = overlayImageUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFontName() {
    return fontName;
  }
  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFontSize() {
    return fontSize;
  }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFontHAlignment() {
    return fontHAlignment;
  }
  public void setFontHAlignment(String fontHAlignment) {
    this.fontHAlignment = fontHAlignment;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFontVAlighment() {
    return fontVAlighment;
  }
  public void setFontVAlighment(String fontVAlighment) {
    this.fontVAlighment = fontVAlighment;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDefaultText() {
    return defaultText;
  }
  public void setDefaultText(String defaultText) {
    this.defaultText = defaultText;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildInfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  zIndex: ").append(zIndex).append("\n");
    sb.append("  x1: ").append(x1).append("\n");
    sb.append("  x2: ").append(x2).append("\n");
    sb.append("  y1: ").append(y1).append("\n");
    sb.append("  y2: ").append(y2).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  backgroundImageUrl: ").append(backgroundImageUrl).append("\n");
    sb.append("  overlayImageUrl: ").append(overlayImageUrl).append("\n");
    sb.append("  fontName: ").append(fontName).append("\n");
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  fontHAlignment: ").append(fontHAlignment).append("\n");
    sb.append("  fontVAlighment: ").append(fontVAlighment).append("\n");
    sb.append("  defaultText: ").append(defaultText).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


