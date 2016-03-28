package gooten.api.model;

import gooten.api.model.Product;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProductList  {
  
  @SerializedName("Products")
  private List<Product> products = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Product> getProducts() {
    return products;
  }
  public void setProducts(List<Product> products) {
    this.products = products;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductList {\n");
    
    sb.append("  products: ").append(products).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


