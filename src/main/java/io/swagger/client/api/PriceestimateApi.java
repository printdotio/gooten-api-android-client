package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Order;
import io.swagger.client.model.OrderPriceResult;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PriceestimateApi {
  String basePath = "http://localhost/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get an order price
   * Get the price of an order, including discounts from a coupon.
   * @param order Order to potentially be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderPriceResult
   */
  public OrderPriceResult  pOSTPriceestimate (Order order, Integer version, String source) throws ApiException {
    Object localVarPostBody = order;
    
    // verify the required parameter 'order' is set
    if (order == null) {
       throw new ApiException(400, "Missing the required parameter 'order' when calling pOSTPriceestimate");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling pOSTPriceestimate");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling pOSTPriceestimate");
    }
    

    // create path and map variables
    String localVarPath = "/priceestimate/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (OrderPriceResult) ApiInvoker.deserialize(localVarResponse, "", OrderPriceResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
