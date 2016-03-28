package gooten.api.model;

import gooten.api.model.Preconfiguration;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PreconfiguredItem  {
  
  @SerializedName("ProductId")
  private Long productId = null;
  @SerializedName("ProductVariantSku")
  private String productVariantSku = null;
  @SerializedName("Preconfigurations")
  private List<Preconfiguration> preconfigurations = null;

  
  /**
   * The ID of the product this item references.
   **/
  @ApiModelProperty(required = true, value = "The ID of the product this item references.")
  public Long getProductId() {
    return productId;
  }
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  
  /**
   * The sku of the product variant this item references.
   **/
  @ApiModelProperty(required = true, value = "The sku of the product variant this item references.")
  public String getProductVariantSku() {
    return productVariantSku;
  }
  public void setProductVariantSku(String productVariantSku) {
    this.productVariantSku = productVariantSku;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Preconfiguration> getPreconfigurations() {
    return preconfigurations;
  }
  public void setPreconfigurations(List<Preconfiguration> preconfigurations) {
    this.preconfigurations = preconfigurations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredItem {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  productVariantSku: ").append(productVariantSku).append("\n");
    sb.append("  preconfigurations: ").append(preconfigurations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


