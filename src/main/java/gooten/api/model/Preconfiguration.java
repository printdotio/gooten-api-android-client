package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Preconfiguration  {
  
  @SerializedName("SpaceId")
  private String spaceId = null;
  @SerializedName("Url")
  private String url = null;

  
  /**
   * Required only for multi-image items. The ID of the space where an image is to be placed. One can attain the SpaceId via inspecting the template data.
   **/
  @ApiModelProperty(required = true, value = "Required only for multi-image items. The ID of the space where an image is to be placed. One can attain the SpaceId via inspecting the template data.")
  public String getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  
  /**
   * The url of the image to be placed in the referenced layer.
   **/
  @ApiModelProperty(required = true, value = "The url of the image to be placed in the referenced layer.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preconfiguration {\n");
    
    sb.append("  spaceId: ").append(spaceId).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


