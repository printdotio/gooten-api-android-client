package gooten.api;

import gooten.api.client.ApiInvoker;
import gooten.api.client.ApiException;
import gooten.api.client.Pair;

import gooten.api.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import gooten.api.model.ProductVariantResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


public class ProductvariantsApi {
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
  * Get a list of available product variations. Includes pricing information
  * Get a list of all available product variations, or if one passes in a specific product type id (productId), gets a list of available variations of a recipe product.
   * @param countryCode The country code the order would be shipped to. For example, &#39;US&#39; or &#39;FR&#39;
   * @param productId Recipe product ID, such as those returned from the /products service
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api, widget
   * @param partnerBillingKey Partner billing key
   * @param all Whether or not to return all available printio products, or just ones in your recipe. Pass &#39;true&#39; or &#39;false&#39;.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return ProductVariantResponse
  */
  public ProductVariantResponse getProductvariants (String countryCode, String productId, Integer version, String source, String partnerBillingKey, String all, String languageCode, String currencyCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'countryCode' is set
      if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getProductvariants",
      new ApiException(400, "Missing the required parameter 'countryCode' when calling getProductvariants"));
      }
  
      // verify the required parameter 'productId' is set
      if (productId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getProductvariants",
      new ApiException(400, "Missing the required parameter 'productId' when calling getProductvariants"));
      }
  
      // verify the required parameter 'version' is set
      if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling getProductvariants",
      new ApiException(400, "Missing the required parameter 'version' when calling getProductvariants"));
      }
  
      // verify the required parameter 'source' is set
      if (source == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'source' when calling getProductvariants",
      new ApiException(400, "Missing the required parameter 'source' when calling getProductvariants"));
      }
  

  // create path and map variables
  String path = "/v/{version}/source/{source}/productvariants/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "productId", productId));
  
          queryParams.addAll(ApiInvoker.parameterToPairs("", "all", all));
  
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
           return (ProductVariantResponse) ApiInvoker.deserialize(localVarResponse, "", ProductVariantResponse.class);
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
   * Get a list of available product variations. Includes pricing information
   * Get a list of all available product variations, or if one passes in a specific product type id (productId), gets a list of available variations of a recipe product.
   * @param countryCode The country code the order would be shipped to. For example, &#39;US&#39; or &#39;FR&#39;   * @param productId Recipe product ID, such as those returned from the /products service   * @param version Version of the api being used   * @param source Description of the source-- ios, android, api, widget   * @param partnerBillingKey Partner billing key   * @param all Whether or not to return all available printio products, or just ones in your recipe. Pass &#39;true&#39; or &#39;false&#39;.   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
  */
  public void getProductvariants (String countryCode, String productId, Integer version, String source, String partnerBillingKey, String all, String languageCode, String currencyCode, final Response.Listener<ProductVariantResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getProductvariants",
         new ApiException(400, "Missing the required parameter 'countryCode' when calling getProductvariants"));
    }
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getProductvariants",
         new ApiException(400, "Missing the required parameter 'productId' when calling getProductvariants"));
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'version' when calling getProductvariants",
         new ApiException(400, "Missing the required parameter 'version' when calling getProductvariants"));
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'source' when calling getProductvariants",
         new ApiException(400, "Missing the required parameter 'source' when calling getProductvariants"));
    }
    

    // create path and map variables
    String path = "/v/{version}/source/{source}/productvariants/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "partnerBillingKey", partnerBillingKey));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "productId", productId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "all", all));
    
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
              responseListener.onResponse((ProductVariantResponse) ApiInvoker.deserialize(localVarResponse,  "", ProductVariantResponse.class));
              
              
            
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

