package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.OrderStatusUpdateResult;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class OrderstatusApi {
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
  * Update an order status
  * Update status of each order item.
   * @param partnerBillingKey Partner billing key
   * @param id Order Id
   * @param orderStatusName Order status name for update
   * @return OrderStatusUpdateResult
  */
  public OrderStatusUpdateResult pOSTOrderstatus (String partnerBillingKey, String id, String orderStatusName) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'partnerBillingKey' is set
      if (partnerBillingKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'partnerBillingKey' when calling pOSTOrderstatus",
      new ApiException(400, "Missing the required parameter 'partnerBillingKey' when calling pOSTOrderstatus"));
      }
  
      // verify the required parameter 'id' is set
      if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling pOSTOrderstatus",
      new ApiException(400, "Missing the required parameter 'id' when calling pOSTOrderstatus"));
      }
  
      // verify the required parameter 'orderStatusName' is set
      if (orderStatusName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderStatusName' when calling pOSTOrderstatus",
      new ApiException(400, "Missing the required parameter 'orderStatusName' when calling pOSTOrderstatus"));
      }
  

  // create path and map variables
  String path = "/orderstatus/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "orderStatusName", orderStatusName));
  

  

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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (OrderStatusUpdateResult) ApiInvoker.deserialize(localVarResponse, "", OrderStatusUpdateResult.class);
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
   * Update an order status
   * Update status of each order item.
   * @param partnerBillingKey Partner billing key   * @param id Order Id   * @param orderStatusName Order status name for update
  */
  public void pOSTOrderstatus (String partnerBillingKey, String id, String orderStatusName, final Response.Listener<OrderStatusUpdateResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'partnerBillingKey' is set
    if (partnerBillingKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'partnerBillingKey' when calling pOSTOrderstatus",
         new ApiException(400, "Missing the required parameter 'partnerBillingKey' when calling pOSTOrderstatus"));
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling pOSTOrderstatus",
         new ApiException(400, "Missing the required parameter 'id' when calling pOSTOrderstatus"));
    }
    
    // verify the required parameter 'orderStatusName' is set
    if (orderStatusName == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'orderStatusName' when calling pOSTOrderstatus",
         new ApiException(400, "Missing the required parameter 'orderStatusName' when calling pOSTOrderstatus"));
    }
    

    // create path and map variables
    String path = "/orderstatus/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orderStatusName", orderStatusName));
    

    

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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            
            try {
              responseListener.onResponse((OrderStatusUpdateResult) ApiInvoker.deserialize(localVarResponse,  "", OrderStatusUpdateResult.class));
              
              
            
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

