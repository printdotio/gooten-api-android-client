package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.PaymentValidationResponse;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PaymentvalidationApi {
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
   * Submit payment validation for PayPal
   * Submit payment validation for PayPal
   * @param orderId Order Id returned from orders/POST
   * @param payPalKey The PayPal key returned from the Mobile SDK
   * @return PaymentValidationResponse
   */
  public PaymentValidationResponse  paymentvalidation (String orderId, String payPalKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
       throw new ApiException(400, "Missing the required parameter 'orderId' when calling paymentvalidation");
    }
    
    // verify the required parameter 'payPalKey' is set
    if (payPalKey == null) {
       throw new ApiException(400, "Missing the required parameter 'payPalKey' when calling paymentvalidation");
    }
    

    // create path and map variables
    String localVarPath = "/paymentvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "OrderId", orderId));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "PayPalKey", payPalKey));
    

    

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
        return (PaymentValidationResponse) ApiInvoker.deserialize(localVarResponse, "", PaymentValidationResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
