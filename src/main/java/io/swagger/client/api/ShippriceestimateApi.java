package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.ShipEstimate;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ShippriceestimateApi {
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
   * Get a baseline ship price for an item
   * Price returned is an estimate which may or may not be realistically attainable.
   * @param productId Product ID
   * @param countryCode Country Code it will be shipped to
   * @param currencyCode Currency Code the estimate should be in. Defaults to USD.
   * @return ShipEstimate
   */
  public ShipEstimate  getShippriceestimate (Integer productId, String countryCode, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
       throw new ApiException(400, "Missing the required parameter 'productId' when calling getShippriceestimate");
    }
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       throw new ApiException(400, "Missing the required parameter 'countryCode' when calling getShippriceestimate");
    }
    

    // create path and map variables
    String localVarPath = "/shippriceestimate/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "productId", productId));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "currencyCode", currencyCode));
    

    

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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ShipEstimate) ApiInvoker.deserialize(localVarResponse, "", ShipEstimate.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
