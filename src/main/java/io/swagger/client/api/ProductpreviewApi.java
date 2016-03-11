package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.ProductPreviewResponse;
import io.swagger.client.model.ProductPreviewRequest;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ProductpreviewApi {
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
   * Submit an image (or images) to be rendered into a product preview.
   * Submit an image (or images) to be rendered into a product preview.
   * @param productPreviewRequest Request detailing the operation needing completed
   * @return ProductPreviewResponse
   */
  public ProductPreviewResponse  pOSTProductpreview (ProductPreviewRequest productPreviewRequest) throws ApiException {
    Object localVarPostBody = productPreviewRequest;
    
    // verify the required parameter 'productPreviewRequest' is set
    if (productPreviewRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'productPreviewRequest' when calling pOSTProductpreview");
    }
    

    // create path and map variables
    String localVarPath = "/productpreview/".replaceAll("\\{format\\}","json");

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
        return (ProductPreviewResponse) ApiInvoker.deserialize(localVarResponse, "", ProductPreviewResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
