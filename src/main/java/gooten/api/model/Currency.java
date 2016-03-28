package gooten.api.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Currency  {
  
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Code")
  private String code = null;
  @SerializedName("Format")
  private String format = null;

  
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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


