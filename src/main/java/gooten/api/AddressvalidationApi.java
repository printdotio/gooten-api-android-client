package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.Result;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class AddressvalidationApi {
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
  public Result addressvalidation (String line1, String line2, String city, String state, String postalCode, String countryCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/addressvalidation/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "line1", line1));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "line2", line2));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "city", city));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "state", state));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
  

  

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
           return (Result) ApiInvoker.deserialize(localVarResponse, "", Result.class);
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
   * Validates an address and returns a suggested address (if available) and a validation score.
   * Validates an address and returns a suggested address (if available) and a validation score.
   * @param line1 Address line1.   * @param line2 Address line2.   * @param city Address city.   * @param state Address state.   * @param postalCode Address postal code/zip.   * @param countryCode Address country code.
  */
  public void addressvalidation (String line1, String line2, String city, String state, String postalCode, String countryCode, final Response.Listener<Result> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/addressvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "line1", line1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "line2", line2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "city", city));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "state", state));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "postalCode", postalCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    

    

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
              responseListener.onResponse((Result) ApiInvoker.deserialize(localVarResponse,  "", Result.class));
              
              
            
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

