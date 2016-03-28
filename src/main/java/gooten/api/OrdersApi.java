package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.PostSubmittedOrder;
import gooten.api.model.OrderResult;
import gooten.api.model.PostOrder;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class OrdersApi {
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
  * Get an order
  * Gets basic information about an order.
   * @param id Order Id
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Resultant info language. Defaults to &#39;en&#39;.
   * @return PostSubmittedOrder
  */
  public PostSubmittedOrder gETOrders (String id, Integer version, String source, String languageCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'id' is set
      if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling gETOrders",
      new ApiException(400, "Missing the required parameter 'id' when calling gETOrders"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling gETOrders",
      new ApiException(400, "Missing the required parameter 'version' when calling gETOrders"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling gETOrders",
      new ApiException(400, "Missing the required parameter 'source' when calling gETOrders"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/orders/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
  

  

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
           return (PostSubmittedOrder) ApiInvoker.deserialize(localVarResponse, "", PostSubmittedOrder.class);
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
   * Get an order
   * Gets basic information about an order.
   * @param id Order Id   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api   * @param languageCode Resultant info language. Defaults to &#39;en&#39;.
  */
  public void gETOrders (String id, Integer version, String source, String languageCode, final Response.Listener<PostSubmittedOrder> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling gETOrders",
         new ApiException(400, "Missing the required parameter 'id' when calling gETOrders"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling gETOrders",
         new ApiException(400, "Missing the required parameter 'version' when calling gETOrders"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling gETOrders",
         new ApiException(400, "Missing the required parameter 'source' when calling gETOrders"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/orders/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
    

    

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
              responseListener.onResponse((PostSubmittedOrder) ApiInvoker.deserialize(localVarResponse,  "", PostSubmittedOrder.class));
              
              
            
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
  * Submit an order
  * Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag.
   * @param order Order to be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderResult
  */
  public OrderResult pOSTOrders (PostOrder order, Integer version, String source) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = order;
  
      // verify the required parameter 'order' is set
      if (order == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'order' when calling pOSTOrders",
      new ApiException(400, "Missing the required parameter 'order' when calling pOSTOrders"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling pOSTOrders",
      new ApiException(400, "Missing the required parameter 'version' when calling pOSTOrders"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling pOSTOrders",
      new ApiException(400, "Missing the required parameter 'source' when calling pOSTOrders"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/orders/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
           return (OrderResult) ApiInvoker.deserialize(localVarResponse, "", OrderResult.class);
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
   * Submit an order
   * Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag.
   * @param order Order to be submitted   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api
  */
  public void pOSTOrders (PostOrder order, Integer version, String source, final Response.Listener<OrderResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = order;

  
    // verify the required parameter 'order' is set
    if (order == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'order' when calling pOSTOrders",
         new ApiException(400, "Missing the required parameter 'order' when calling pOSTOrders"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling pOSTOrders",
         new ApiException(400, "Missing the required parameter 'version' when calling pOSTOrders"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling pOSTOrders",
         new ApiException(400, "Missing the required parameter 'source' when calling pOSTOrders"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/orders/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

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
              responseListener.onResponse((OrderResult) ApiInvoker.deserialize(localVarResponse,  "", OrderResult.class));
              
              
            
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

