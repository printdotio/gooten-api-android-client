package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.PreconfiguredProductsInsertResponse;
import gooten.api.model.PreconfiguredProductInsert;
import gooten.api.model.PreconfiguredProductsResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class PreconfiguredproductsApi {
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
  * Insert a preconfigured product
  * Insert a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
  */
  public PreconfiguredProductsInsertResponse createPreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = preconfiguredProductInsert;
  
      // verify the required parameter 'preconfiguredProductInsert' is set
      if (preconfiguredProductInsert == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling createPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'version' when calling createPreconfiguredproducts"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling createPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'source' when calling createPreconfiguredproducts"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
           return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
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
   * Insert a preconfigured product
   * Insert a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api
  */
  public void createPreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source, final Response.Listener<PreconfiguredProductsInsertResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = preconfiguredProductInsert;

  
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling createPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'version' when calling createPreconfiguredproducts"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling createPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'source' when calling createPreconfiguredproducts"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
              responseListener.onResponse((PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse,  "", PreconfiguredProductsInsertResponse.class));
              
              
            
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
  
  /**
  * Delete a preconfigured product
  * Delete a preconfigured product from your recipe.
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param sku The preconfigured product&#39;s sku.
   * @return PreconfiguredProductsInsertResponse
  */
  public PreconfiguredProductsInsertResponse deletePreconfiguredproducts (Integer version, String source, String sku) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling deletePreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'version' when calling deletePreconfiguredproducts"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling deletePreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'source' when calling deletePreconfiguredproducts"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "sku", sku));
  

  

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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
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
   * Delete a preconfigured product
   * Delete a preconfigured product from your recipe.
   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api   * @param sku The preconfigured product&#39;s sku.
  */
  public void deletePreconfiguredproducts (Integer version, String source, String sku, final Response.Listener<PreconfiguredProductsInsertResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling deletePreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'version' when calling deletePreconfiguredproducts"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling deletePreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'source' when calling deletePreconfiguredproducts"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sku", sku));
    

    

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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            
            try {
              responseListener.onResponse((PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse,  "", PreconfiguredProductsInsertResponse.class));
              
              
            
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
  
  /**
  * Get a list of your preconfigured products
  * Get a list of your preconfigured products. The products returned are entirely specific to your recipe.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return PreconfiguredProductsResponse
  */
  public PreconfiguredProductsResponse getPreconfiguredproducts (String countryCode, Integer version, String source, String languageCode, String currencyCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'countryCode' is set
      if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'countryCode' when calling getPreconfiguredproducts"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling getPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'version' when calling getPreconfiguredproducts"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling getPreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'source' when calling getPreconfiguredproducts"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
  
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
           return (PreconfiguredProductsResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsResponse.class);
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
   * Get a list of your preconfigured products
   * Get a list of your preconfigured products. The products returned are entirely specific to your recipe.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
  */
  public void getPreconfiguredproducts (String countryCode, Integer version, String source, String languageCode, String currencyCode, final Response.Listener<PreconfiguredProductsResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'countryCode' when calling getPreconfiguredproducts"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling getPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'version' when calling getPreconfiguredproducts"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling getPreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'source' when calling getPreconfiguredproducts"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
    
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
              responseListener.onResponse((PreconfiguredProductsResponse) ApiInvoker.deserialize(localVarResponse,  "", PreconfiguredProductsResponse.class));
              
              
            
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
  
  /**
  * Update a preconfigured product
  * Update a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
  */
  public PreconfiguredProductsInsertResponse updatePreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = preconfiguredProductInsert;
  
      // verify the required parameter 'preconfiguredProductInsert' is set
      if (preconfiguredProductInsert == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling updatePreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'version' when calling updatePreconfiguredproducts"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling updatePreconfiguredproducts",
      new ApiException(400, "Missing the required parameter 'source' when calling updatePreconfiguredproducts"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
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
   * Update a preconfigured product
   * Update a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api
  */
  public void updatePreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source, final Response.Listener<PreconfiguredProductsInsertResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = preconfiguredProductInsert;

  
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling updatePreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'version' when calling updatePreconfiguredproducts"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling updatePreconfiguredproducts",
         new ApiException(400, "Missing the required parameter 'source' when calling updatePreconfiguredproducts"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/preconfiguredproducts/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            
            try {
              responseListener.onResponse((PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse,  "", PreconfiguredProductsInsertResponse.class));
              
              
            
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

