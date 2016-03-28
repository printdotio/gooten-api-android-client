package gooten.api.model;

import gooten.api.model.ProductOptionList;
import gooten.api.model.ProductVariant;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductVariantResponse  {
  
  @SerializedName("ProductVariants")
  private List<ProductVariant> productVariants = null;
  @SerializedName("Options")
  private List<ProductOptionList> options = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductVariant> getProductVariants() {
    return productVariants;
  }
  public void setProductVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductOptionList> getOptions() {
    return options;
  }
  public void setOptions(List<ProductOptionList> options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantResponse {\n");
    
    sb.append("  productVariants: ").append(productVariants).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


