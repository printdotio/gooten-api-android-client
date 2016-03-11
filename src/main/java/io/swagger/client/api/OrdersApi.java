package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.PostSubmittedOrder;
import io.swagger.client.model.OrderResult;
import io.swagger.client.model.PostOrder;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class OrdersApi {
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
   * Get an order
   * Gets basic information about an order.
   * @param id Order Id
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Resultant info language. Defaults to &#39;en&#39;.
   * @return PostSubmittedOrder
   */
  public PostSubmittedOrder  gETOrders (String id, Integer version, String source, String languageCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gETOrders");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling gETOrders");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling gETOrders");
    }
    

    // create path and map variables
    String localVarPath = "/orders/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
    

    

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
        return (PostSubmittedOrder) ApiInvoker.deserialize(localVarResponse, "", PostSubmittedOrder.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Submit an order
   * Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag.
   * @param order Order to be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderResult
   */
  public OrderResult  pOSTOrders (PostOrder order, Integer version, String source) throws ApiException {
    Object localVarPostBody = order;
    
    // verify the required parameter 'order' is set
    if (order == null) {
       throw new ApiException(400, "Missing the required parameter 'order' when calling pOSTOrders");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling pOSTOrders");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling pOSTOrders");
    }
    

    // create path and map variables
    String localVarPath = "/orders/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
        return (OrderResult) ApiInvoker.deserialize(localVarResponse, "", OrderResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
