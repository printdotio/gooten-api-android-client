package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.PreconfiguredProductsInsertResponse;
import io.swagger.client.model.PreconfiguredProductInsert;
import io.swagger.client.model.PreconfiguredProductsResponse;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PreconfiguredproductsApi {
  String basePath = "http://localhost/api";
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
  public PreconfiguredProductsInsertResponse  createPreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws ApiException {
    Object localVarPostBody = preconfiguredProductInsert;
    
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
       throw new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling createPreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling createPreconfiguredproducts");
    }
    

    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
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
  public PreconfiguredProductsInsertResponse  deletePreconfiguredproducts (Integer version, String source, String sku) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling deletePreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling deletePreconfiguredproducts");
    }
    

    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "sku", sku));
    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
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
  public PreconfiguredProductsResponse  getPreconfiguredproducts (String countryCode, Integer version, String source, String languageCode, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       throw new ApiException(400, "Missing the required parameter 'countryCode' when calling getPreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling getPreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling getPreconfiguredproducts");
    }
    

    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "languageCode", languageCode));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "currencyCode", currencyCode));
    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (PreconfiguredProductsResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
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
  public PreconfiguredProductsInsertResponse  updatePreconfiguredproducts (PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws ApiException {
    Object localVarPostBody = preconfiguredProductInsert;
    
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
       throw new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException(400, "Missing the required parameter 'version' when calling updatePreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling updatePreconfiguredproducts");
    }
    

    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json").replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString())).replaceAll("\\{" + "source" + "\\}", apiInvoker.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (PreconfiguredProductsInsertResponse) ApiInvoker.deserialize(localVarResponse, "", PreconfiguredProductsInsertResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
