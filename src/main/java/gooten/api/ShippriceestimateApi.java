package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.ShipEstimate;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class ShippriceestimateApi {
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
  * Get a baseline ship price for an item
  * Price returned is an estimate which may or may not be realistically attainable.
   * @param productId Product ID
   * @param countryCode Country Code it will be shipped to
   * @param currencyCode Currency Code the estimate should be in. Defaults to USD.
   * @return ShipEstimate
  */
  public ShipEstimate getShippriceestimate (Integer productId, String countryCode, String currencyCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'productId' is set
      if (productId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getShippriceestimate",
      new ApiException(400, "Missing the required parameter 'productId' when calling getShippriceestimate"));
      }
  
      // verify the required parameter 'countryCode' is set
      if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getShippriceestimate",
      new ApiException(400, "Missing the required parameter 'countryCode' when calling getShippriceestimate"));
      }
  

  // create path and map variables
  String path = "/shippriceestimate/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "productId", productId));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "currencyCode", currencyCode));
  

  

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
           return (ShipEstimate) ApiInvoker.deserialize(localVarResponse, "", ShipEstimate.class);
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
   * Get a baseline ship price for an item
   * Price returned is an estimate which may or may not be realistically attainable.
   * @param productId Product ID   * @param countryCode Country Code it will be shipped to   * @param currencyCode Currency Code the estimate should be in. Defaults to USD.
  */
  public void getShippriceestimate (Integer productId, String countryCode, String currencyCode, final Response.Listener<ShipEstimate> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'productId' is set
    if (productId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getShippriceestimate",
         new ApiException(400, "Missing the required parameter 'productId' when calling getShippriceestimate"));
    }
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getShippriceestimate",
         new ApiException(400, "Missing the required parameter 'countryCode' when calling getShippriceestimate"));
    }
    

    // create path and map variables
    String path = "/shippriceestimate/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "productId", productId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currencyCode", currencyCode));
    

    

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
              responseListener.onResponse((ShipEstimate) ApiInvoker.deserialize(localVarResponse,  "", ShipEstimate.class));
              
              
            
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

