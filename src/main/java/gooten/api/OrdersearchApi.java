package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.SubmittedOrderList;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class OrdersearchApi {
  String basePath = "https://localhost/api";
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
   * @param partnerBillingKey Partner billing key
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
  public SubmittedOrderList gETOrdersearch (String partnerBillingKey, String genericValues, String lastName, String email, String postalCode, String startDate, String endDate, String uniqueUserId, Integer partnerId, Integer pageSize, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'partnerBillingKey' is set
      if (partnerBillingKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'partnerBillingKey' when calling gETOrdersearch",
      new ApiException(400, "Missing the required parameter 'partnerBillingKey' when calling gETOrdersearch"));
      }
  

  // create path and map variables
  String path = "/ordersearch/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "genericValues", genericValues));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "lastName", lastName));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "uniqueUserId", uniqueUserId));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerId", partnerId));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "pageSize", pageSize));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
  

  

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SubmittedOrderList) ApiInvoker.deserialize(localVarResponse, "", SubmittedOrderList.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
            throw new ApiException(((VolleyError) ex.getCause()).networkResponse.statusCode, ((VolleyError) ex.getCause()).getMessage());
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Search an orders
   * Search through the orders and return information about orders that match search criteria.
   * @param partnerBillingKey Partner billing key   * @param genericValues Any value which is related to order (partner name, address, phone, couponCode, etc...)   * @param lastName Partner last name   * @param email Partner email   * @param postalCode Billing/Shipping address postal code   * @param startDate Start date of the date range when order was created   * @param endDate End date of the date range when order was created   * @param uniqueUserId User Id   * @param partnerId Partner Id   * @param pageSize How many items to return in reponse.   * @param page Page number, how many items to skip.
  */
  public void gETOrdersearch (String partnerBillingKey, String genericValues, String lastName, String email, String postalCode, String startDate, String endDate, String uniqueUserId, Integer partnerId, Integer pageSize, Integer page, final Response.Listener<SubmittedOrderList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'partnerBillingKey' is set
    if (partnerBillingKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'partnerBillingKey' when calling gETOrdersearch",
         new ApiException(400, "Missing the required parameter 'partnerBillingKey' when calling gETOrdersearch"));
    }
    

    // create path and map variables
    String path = "/ordersearch/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "genericValues", genericValues));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lastName", lastName));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uniqueUserId", uniqueUserId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerId", partnerId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pageSize", pageSize));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            
            try {
              responseListener.onResponse((SubmittedOrderList) ApiInvoker.deserialize(localVarResponse,  "", SubmittedOrderList.class));
              
              
            
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
            
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  
}

