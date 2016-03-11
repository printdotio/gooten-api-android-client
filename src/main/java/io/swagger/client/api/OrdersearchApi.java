package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.SubmittedOrderList;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class OrdersearchApi {
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
   * Search an orders
   * Search through the orders and return information about orders that match search criteria.
   * @param genericValues Any value which is related to order (partner name, address, phone, couponCode, etc...)
   * @param lastName Partner last name
   * @param email Partner email
   * @param postalCode Billing/Shipping address postal code
   * @param startDate Start date of the date range when order was created
   * @param endDate End date of the date range when order was created
   * @param uniqueUserId User Id
   * @param partnerId Partner Id
   * @param pageSize How many items to return in reponse.
   * @param page Page number, how many items to skip.
   * @return SubmittedOrderList
   */
  public SubmittedOrderList  gETOrdersearch (String genericValues, String lastName, String email, String postalCode, String startDate, String endDate, String uniqueUserId, Integer partnerId, Integer pageSize, Integer page) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/ordersearch/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "genericValues", genericValues));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "lastName", lastName));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "uniqueUserId", uniqueUserId));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "partnerId", partnerId));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "pageSize", pageSize));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    

    

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
        return (SubmittedOrderList) ApiInvoker.deserialize(localVarResponse, "", SubmittedOrderList.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
