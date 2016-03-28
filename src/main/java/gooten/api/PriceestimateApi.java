package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.Order;
import gooten.api.model.OrderPriceResult;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class PriceestimateApi {
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
  * Get an order price
  * Get the price of an order, including discounts from a coupon.
   * @param order Order to potentially be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderPriceResult
  */
  public OrderPriceResult pOSTPriceestimate (Order order, Integer version, String source) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = order;
  
      // verify the required parameter 'order' is set
      if (order == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'order' when calling pOSTPriceestimate",
      new ApiException(400, "Missing the required parameter 'order' when calling pOSTPriceestimate"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling pOSTPriceestimate",
      new ApiException(400, "Missing the required parameter 'version' when calling pOSTPriceestimate"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling pOSTPriceestimate",
      new ApiException(400, "Missing the required parameter 'source' when calling pOSTPriceestimate"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/priceestimate/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  

  

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
           return (OrderPriceResult) ApiInvoker.deserialize(localVarResponse, "", OrderPriceResult.class);
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
   * Get an order price
   * Get the price of an order, including discounts from a coupon.
   * @param order Order to potentially be submitted   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api
  */
  public void pOSTPriceestimate (Order order, Integer version, String source, final Response.Listener<OrderPriceResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = order;

  
    // verify the required parameter 'order' is set
    if (order == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'order' when calling pOSTPriceestimate",
         new ApiException(400, "Missing the required parameter 'order' when calling pOSTPriceestimate"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling pOSTPriceestimate",
         new ApiException(400, "Missing the required parameter 'version' when calling pOSTPriceestimate"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling pOSTPriceestimate",
         new ApiException(400, "Missing the required parameter 'source' when calling pOSTPriceestimate"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/priceestimate/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
              responseListener.onResponse((OrderPriceResult) ApiInvoker.deserialize(localVarResponse,  "", OrderPriceResult.class));
              
              
            
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

