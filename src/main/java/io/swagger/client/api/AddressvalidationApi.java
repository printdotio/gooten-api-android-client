package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Result;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AddressvalidationApi {
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
   * Validates an address and returns a suggested address (if available) and a validation score.
   * Validates an address and returns a suggested address (if available) and a validation score.
   * @param line1 Address line1.
   * @param line2 Address line2.
   * @param city Address city.
   * @param state Address state.
   * @param postalCode Address postal code/zip.
   * @param countryCode Address country code.
   * @return Result
   */
  public Result  addressvalidation (String line1, String line2, String city, String state, String postalCode, String countryCode) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/addressvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "line1", line1));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "line2", line2));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "city", city));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "state", state));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    

    

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
        return (Result) ApiInvoker.deserialize(localVarResponse, "", Result.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
