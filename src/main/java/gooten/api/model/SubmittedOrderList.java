package gooten.api.model;

import gooten.api.model.SearchSubmittedOrder;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class SubmittedOrderList  {
  
  @SerializedName("Orders")
  private List<SearchSubmittedOrder> orders = null;
  @SerializedName("TotalPages")
  private Long totalPages = null;
  @SerializedName("Page")
  private Long page = null;
  @SerializedName("HadError")
  private Boolean hadError = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<SearchSubmittedOrder> getOrders() {
    return orders;
  }
  public void setOrders(List<SearchSubmittedOrder> orders) {
    this.orders = orders;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPage() {
    return page;
  }
  public void setPage(Long page) {
    this.page = page;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedOrderList {\n");
    
    sb.append("  orders: ").append(orders).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  hadError: ").append(hadError).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


