package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.LanguageDictionary;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class LanguagesApi {
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
  * Get text in a specified language
  * Get text in a specified language
   * @param languageCode Two-character language code, like \&quot;en\&quot; (english)
   * @param key A string used to query the language dictionary for specific values within a category.
   * @return LanguageDictionary
  */
  public LanguageDictionary getLanguageText (String languageCode, String key) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'languageCode' is set
      if (languageCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'languageCode' when calling getLanguageText",
      new ApiException(400, "Missing the required parameter 'languageCode' when calling getLanguageText"));
      }
  

  // create path and map variables
  String path = "/languages/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
  

  

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
           return (LanguageDictionary) ApiInvoker.deserialize(localVarResponse, "", LanguageDictionary.class);
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
   * Get text in a specified language
   * Get text in a specified language
   * @param languageCode Two-character language code, like \&quot;en\&quot; (english)   * @param key A string used to query the language dictionary for specific values within a category.
  */
  public void getLanguageText (String languageCode, String key, final Response.Listener<LanguageDictionary> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'languageCode' when calling getLanguageText",
         new ApiException(400, "Missing the required parameter 'languageCode' when calling getLanguageText"));
    }
    

    // create path and map variables
    String path = "/languages/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
    

    

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
              responseListener.onResponse((LanguageDictionary) ApiInvoker.deserialize(localVarResponse,  "", LanguageDictionary.class));
              
              
            
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

