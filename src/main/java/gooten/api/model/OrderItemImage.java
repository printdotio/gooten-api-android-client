package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class OrderItemImage  {
  
  @SerializedName("Url")
  private String url = null;
  @SerializedName("Index")
  private Long index = null;
  @SerializedName("ThumbnailUrl")
  private String thumbnailUrl = null;
  @SerializedName("ManipCommand")
  private String manipCommand = null;
  @SerializedName("SpaceId")
  private String spaceId = null;

  
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
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getManipCommand() {
    return manipCommand;
  }
  public void setManipCommand(String manipCommand) {
    this.manipCommand = manipCommand;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemImage {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  thumbnailUrl: ").append(thumbnailUrl).append("\n");
    sb.append("  manipCommand: ").append(manipCommand).append("\n");
    sb.append("  spaceId: ").append(spaceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


