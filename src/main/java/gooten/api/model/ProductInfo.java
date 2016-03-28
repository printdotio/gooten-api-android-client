package gooten.api.model;

import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductInfo  {
  
  @SerializedName("ContentType")
  private String contentType = null;
  @SerializedName("Content")
  private List<String> content = null;
  @SerializedName("Key")
  private String key = null;
  @SerializedName("Index")
  private Long index = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getContent() {
    return content;
  }
  public void setContent(List<String> content) {
    this.content = content;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The suggested ordering of the content about the product.
   **/
  @ApiModelProperty(required = true, value = "The suggested ordering of the content about the product.")
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfo {\n");
    
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


