package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductPreviewImageSpec  {
  
  @SerializedName("Url")
  private String url = null;
  @SerializedName("X1")
  private Long x1 = null;
  @SerializedName("X2")
  private Long x2 = null;
  @SerializedName("Y1")
  private Long y1 = null;
  @SerializedName("Y2")
  private Long y2 = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewImageSpec {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  x1: ").append(x1).append("\n");
    sb.append("  x2: ").append(x2).append("\n");
    sb.append("  y1: ").append(y1).append("\n");
    sb.append("  y2: ").append(y2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


