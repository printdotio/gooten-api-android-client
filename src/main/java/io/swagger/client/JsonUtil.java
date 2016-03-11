package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<List<Address>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("Country".equalsIgnoreCase(className)) {
      return new TypeToken<List<Country>>(){}.getType();
    }
    
    if ("CountryList".equalsIgnoreCase(className)) {
      return new TypeToken<List<CountryList>>(){}.getType();
    }
    
    if ("Currency".equalsIgnoreCase(className)) {
      return new TypeToken<List<Currency>>(){}.getType();
    }
    
    if ("FileResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<FileResult>>(){}.getType();
    }
    
    if ("Image".equalsIgnoreCase(className)) {
      return new TypeToken<List<Image>>(){}.getType();
    }
    
    if ("ImageSizeVm".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageSizeVm>>(){}.getType();
    }
    
    if ("ImageValidationVm".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageValidationVm>>(){}.getType();
    }
    
    if ("ImageValidatorResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageValidatorResult>>(){}.getType();
    }
    
    if ("Item".equalsIgnoreCase(className)) {
      return new TypeToken<List<Item>>(){}.getType();
    }
    
    if ("KeyValuePair".equalsIgnoreCase(className)) {
      return new TypeToken<List<KeyValuePair>>(){}.getType();
    }
    
    if ("LanguageDictionary".equalsIgnoreCase(className)) {
      return new TypeToken<List<LanguageDictionary>>(){}.getType();
    }
    
    if ("Meta".equalsIgnoreCase(className)) {
      return new TypeToken<List<Meta>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("OrderItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderItem>>(){}.getType();
    }
    
    if ("OrderItemImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderItemImage>>(){}.getType();
    }
    
    if ("OrderPayment".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderPayment>>(){}.getType();
    }
    
    if ("OrderPriceResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderPriceResult>>(){}.getType();
    }
    
    if ("OrderResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResult>>(){}.getType();
    }
    
    if ("OrderStatusUpdateResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatusUpdateResult>>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<List<Payment>>(){}.getType();
    }
    
    if ("PaymentValidationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentValidationRequest>>(){}.getType();
    }
    
    if ("PaymentValidationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentValidationResponse>>(){}.getType();
    }
    
    if ("PostOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<PostOrder>>(){}.getType();
    }
    
    if ("PostOrderItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<PostOrderItem>>(){}.getType();
    }
    
    if ("PostSubmittedItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<PostSubmittedItem>>(){}.getType();
    }
    
    if ("PostSubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<PostSubmittedOrder>>(){}.getType();
    }
    
    if ("Preconfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<Preconfiguration>>(){}.getType();
    }
    
    if ("PreconfiguredItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredItem>>(){}.getType();
    }
    
    if ("PreconfiguredProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredProduct>>(){}.getType();
    }
    
    if ("PreconfiguredProductImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredProductImage>>(){}.getType();
    }
    
    if ("PreconfiguredProductInsert".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredProductInsert>>(){}.getType();
    }
    
    if ("PreconfiguredProductsInsertResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredProductsInsertResponse>>(){}.getType();
    }
    
    if ("PreconfiguredProductsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PreconfiguredProductsResponse>>(){}.getType();
    }
    
    if ("PriceInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceInfo>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("ProductBuildInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductBuildInfo>>(){}.getType();
    }
    
    if ("ProductBuildInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductBuildInfoResponse>>(){}.getType();
    }
    
    if ("ProductBuildInfoSpace".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductBuildInfoSpace>>(){}.getType();
    }
    
    if ("ProductBuildOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductBuildOption>>(){}.getType();
    }
    
    if ("ProductImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductImage>>(){}.getType();
    }
    
    if ("ProductInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductInfo>>(){}.getType();
    }
    
    if ("ProductList".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductList>>(){}.getType();
    }
    
    if ("ProductOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductOption>>(){}.getType();
    }
    
    if ("ProductOptionList".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductOptionList>>(){}.getType();
    }
    
    if ("ProductOptionValueSettings".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductOptionValueSettings>>(){}.getType();
    }
    
    if ("ProductPreviewImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductPreviewImage>>(){}.getType();
    }
    
    if ("ProductPreviewImageSpec".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductPreviewImageSpec>>(){}.getType();
    }
    
    if ("ProductPreviewRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductPreviewRequest>>(){}.getType();
    }
    
    if ("ProductPreviewResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductPreviewResponse>>(){}.getType();
    }
    
    if ("ProductPriceInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductPriceInfo>>(){}.getType();
    }
    
    if ("ProductVariant".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductVariant>>(){}.getType();
    }
    
    if ("ProductVariantResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductVariantResponse>>(){}.getType();
    }
    
    if ("Result".equalsIgnoreCase(className)) {
      return new TypeToken<List<Result>>(){}.getType();
    }
    
    if ("SearchSubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<SearchSubmittedOrder>>(){}.getType();
    }
    
    if ("ShipEstimate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShipEstimate>>(){}.getType();
    }
    
    if ("ShipItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShipItem>>(){}.getType();
    }
    
    if ("ShipOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShipOption>>(){}.getType();
    }
    
    if ("ShipPrice".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShipPrice>>(){}.getType();
    }
    
    if ("ShipToAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShipToAddress>>(){}.getType();
    }
    
    if ("Shipment".equalsIgnoreCase(className)) {
      return new TypeToken<List<Shipment>>(){}.getType();
    }
    
    if ("ShippingPricesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingPricesRequest>>(){}.getType();
    }
    
    if ("ShippingPricesResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingPricesResult>>(){}.getType();
    }
    
    if ("SkuQuantityPair".equalsIgnoreCase(className)) {
      return new TypeToken<List<SkuQuantityPair>>(){}.getType();
    }
    
    if ("SubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubmittedOrder>>(){}.getType();
    }
    
    if ("SubmittedOrderList".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubmittedOrderList>>(){}.getType();
    }
    
    if ("UserInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserInfo>>(){}.getType();
    }
    
    if ("ValidationFailure".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidationFailure>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<Address>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("Country".equalsIgnoreCase(className)) {
      return new TypeToken<Country>(){}.getType();
    }
    
    if ("CountryList".equalsIgnoreCase(className)) {
      return new TypeToken<CountryList>(){}.getType();
    }
    
    if ("Currency".equalsIgnoreCase(className)) {
      return new TypeToken<Currency>(){}.getType();
    }
    
    if ("FileResult".equalsIgnoreCase(className)) {
      return new TypeToken<FileResult>(){}.getType();
    }
    
    if ("Image".equalsIgnoreCase(className)) {
      return new TypeToken<Image>(){}.getType();
    }
    
    if ("ImageSizeVm".equalsIgnoreCase(className)) {
      return new TypeToken<ImageSizeVm>(){}.getType();
    }
    
    if ("ImageValidationVm".equalsIgnoreCase(className)) {
      return new TypeToken<ImageValidationVm>(){}.getType();
    }
    
    if ("ImageValidatorResult".equalsIgnoreCase(className)) {
      return new TypeToken<ImageValidatorResult>(){}.getType();
    }
    
    if ("Item".equalsIgnoreCase(className)) {
      return new TypeToken<Item>(){}.getType();
    }
    
    if ("KeyValuePair".equalsIgnoreCase(className)) {
      return new TypeToken<KeyValuePair>(){}.getType();
    }
    
    if ("LanguageDictionary".equalsIgnoreCase(className)) {
      return new TypeToken<LanguageDictionary>(){}.getType();
    }
    
    if ("Meta".equalsIgnoreCase(className)) {
      return new TypeToken<Meta>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("OrderItem".equalsIgnoreCase(className)) {
      return new TypeToken<OrderItem>(){}.getType();
    }
    
    if ("OrderItemImage".equalsIgnoreCase(className)) {
      return new TypeToken<OrderItemImage>(){}.getType();
    }
    
    if ("OrderPayment".equalsIgnoreCase(className)) {
      return new TypeToken<OrderPayment>(){}.getType();
    }
    
    if ("OrderPriceResult".equalsIgnoreCase(className)) {
      return new TypeToken<OrderPriceResult>(){}.getType();
    }
    
    if ("OrderResult".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResult>(){}.getType();
    }
    
    if ("OrderStatusUpdateResult".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatusUpdateResult>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<Payment>(){}.getType();
    }
    
    if ("PaymentValidationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentValidationRequest>(){}.getType();
    }
    
    if ("PaymentValidationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentValidationResponse>(){}.getType();
    }
    
    if ("PostOrder".equalsIgnoreCase(className)) {
      return new TypeToken<PostOrder>(){}.getType();
    }
    
    if ("PostOrderItem".equalsIgnoreCase(className)) {
      return new TypeToken<PostOrderItem>(){}.getType();
    }
    
    if ("PostSubmittedItem".equalsIgnoreCase(className)) {
      return new TypeToken<PostSubmittedItem>(){}.getType();
    }
    
    if ("PostSubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<PostSubmittedOrder>(){}.getType();
    }
    
    if ("Preconfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<Preconfiguration>(){}.getType();
    }
    
    if ("PreconfiguredItem".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredItem>(){}.getType();
    }
    
    if ("PreconfiguredProduct".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredProduct>(){}.getType();
    }
    
    if ("PreconfiguredProductImage".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredProductImage>(){}.getType();
    }
    
    if ("PreconfiguredProductInsert".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredProductInsert>(){}.getType();
    }
    
    if ("PreconfiguredProductsInsertResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredProductsInsertResponse>(){}.getType();
    }
    
    if ("PreconfiguredProductsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PreconfiguredProductsResponse>(){}.getType();
    }
    
    if ("PriceInfo".equalsIgnoreCase(className)) {
      return new TypeToken<PriceInfo>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("ProductBuildInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ProductBuildInfo>(){}.getType();
    }
    
    if ("ProductBuildInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProductBuildInfoResponse>(){}.getType();
    }
    
    if ("ProductBuildInfoSpace".equalsIgnoreCase(className)) {
      return new TypeToken<ProductBuildInfoSpace>(){}.getType();
    }
    
    if ("ProductBuildOption".equalsIgnoreCase(className)) {
      return new TypeToken<ProductBuildOption>(){}.getType();
    }
    
    if ("ProductImage".equalsIgnoreCase(className)) {
      return new TypeToken<ProductImage>(){}.getType();
    }
    
    if ("ProductInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ProductInfo>(){}.getType();
    }
    
    if ("ProductList".equalsIgnoreCase(className)) {
      return new TypeToken<ProductList>(){}.getType();
    }
    
    if ("ProductOption".equalsIgnoreCase(className)) {
      return new TypeToken<ProductOption>(){}.getType();
    }
    
    if ("ProductOptionList".equalsIgnoreCase(className)) {
      return new TypeToken<ProductOptionList>(){}.getType();
    }
    
    if ("ProductOptionValueSettings".equalsIgnoreCase(className)) {
      return new TypeToken<ProductOptionValueSettings>(){}.getType();
    }
    
    if ("ProductPreviewImage".equalsIgnoreCase(className)) {
      return new TypeToken<ProductPreviewImage>(){}.getType();
    }
    
    if ("ProductPreviewImageSpec".equalsIgnoreCase(className)) {
      return new TypeToken<ProductPreviewImageSpec>(){}.getType();
    }
    
    if ("ProductPreviewRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ProductPreviewRequest>(){}.getType();
    }
    
    if ("ProductPreviewResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProductPreviewResponse>(){}.getType();
    }
    
    if ("ProductPriceInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ProductPriceInfo>(){}.getType();
    }
    
    if ("ProductVariant".equalsIgnoreCase(className)) {
      return new TypeToken<ProductVariant>(){}.getType();
    }
    
    if ("ProductVariantResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProductVariantResponse>(){}.getType();
    }
    
    if ("Result".equalsIgnoreCase(className)) {
      return new TypeToken<Result>(){}.getType();
    }
    
    if ("SearchSubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<SearchSubmittedOrder>(){}.getType();
    }
    
    if ("ShipEstimate".equalsIgnoreCase(className)) {
      return new TypeToken<ShipEstimate>(){}.getType();
    }
    
    if ("ShipItem".equalsIgnoreCase(className)) {
      return new TypeToken<ShipItem>(){}.getType();
    }
    
    if ("ShipOption".equalsIgnoreCase(className)) {
      return new TypeToken<ShipOption>(){}.getType();
    }
    
    if ("ShipPrice".equalsIgnoreCase(className)) {
      return new TypeToken<ShipPrice>(){}.getType();
    }
    
    if ("ShipToAddress".equalsIgnoreCase(className)) {
      return new TypeToken<ShipToAddress>(){}.getType();
    }
    
    if ("Shipment".equalsIgnoreCase(className)) {
      return new TypeToken<Shipment>(){}.getType();
    }
    
    if ("ShippingPricesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingPricesRequest>(){}.getType();
    }
    
    if ("ShippingPricesResult".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingPricesResult>(){}.getType();
    }
    
    if ("SkuQuantityPair".equalsIgnoreCase(className)) {
      return new TypeToken<SkuQuantityPair>(){}.getType();
    }
    
    if ("SubmittedOrder".equalsIgnoreCase(className)) {
      return new TypeToken<SubmittedOrder>(){}.getType();
    }
    
    if ("SubmittedOrderList".equalsIgnoreCase(className)) {
      return new TypeToken<SubmittedOrderList>(){}.getType();
    }
    
    if ("UserInfo".equalsIgnoreCase(className)) {
      return new TypeToken<UserInfo>(){}.getType();
    }
    
    if ("ValidationFailure".equalsIgnoreCase(className)) {
      return new TypeToken<ValidationFailure>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
