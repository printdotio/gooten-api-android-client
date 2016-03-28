package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.PaymentValidationResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class PaymentvalidationApi {
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
  * Submit payment validation for PayPal
  * Submit payment validation for PayPal
   * @param orderId Order Id returned from orders/POST
   * @param payPalKey The PayPal key returned from the Mobile SDK
   * @return PaymentValidationResponse
  */
  public PaymentValidationResponse paymentvalidation (String orderId, String payPalKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'orderId' is set
      if (orderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling paymentvalidation",
      new ApiException(400, "Missing the required parameter 'orderId' when calling paymentvalidation"));
      }
  
      // verify the required parameter 'payPalKey' is set
      if (payPalKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'payPalKey' when calling paymentvalidation",
      new ApiException(400, "Missing the required parameter 'payPalKey' when calling paymentvalidation"));
      }
  

  // create path and map variables
  String path = "/paymentvalidation/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "OrderId", orderId));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "PayPalKey", payPalKey));
  

  

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
           return (PaymentValidationResponse) ApiInvoker.deserialize(localVarResponse, "", PaymentValidationResponse.class);
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
   * Submit payment validation for PayPal
   * Submit payment validation for PayPal
   * @param orderId Order Id returned from orders/POST   * @param payPalKey The PayPal key returned from the Mobile SDK
  */
  public void paymentvalidation (String orderId, String payPalKey, final Response.Listener<PaymentValidationResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling paymentvalidation",
         new ApiException(400, "Missing the required parameter 'orderId' when calling paymentvalidation"));
    }
    
    // verify the required parameter 'payPalKey' is set
    if (payPalKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'payPalKey' when calling paymentvalidation",
         new ApiException(400, "Missing the required parameter 'payPalKey' when calling paymentvalidation"));
    }
    

    // create path and map variables
    String path = "/paymentvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "OrderId", orderId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "PayPalKey", payPalKey));
    

    

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
              responseListener.onResponse((PaymentValidationResponse) ApiInvoker.deserialize(localVarResponse,  "", PaymentValidationResponse.class));
              
              
            
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

