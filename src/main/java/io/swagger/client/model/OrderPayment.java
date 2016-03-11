package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderPayment  {
  
  @SerializedName("BraintreeEncryptedCCNumber")
  private String braintreeEncryptedCCNumber = null;
  @SerializedName("BraintreeEncryptedCCExpDate")
  private String braintreeEncryptedCCExpDate = null;
  @SerializedName("BraintreeEncryptedCCV")
  private String braintreeEncryptedCCV = null;
  @SerializedName("BraintreePaymentNonce")
  private String braintreePaymentNonce = null;
  @SerializedName("PartnerBillingKey")
  private String partnerBillingKey = null;
  @SerializedName("Total")
  private Long total = null;
  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBraintreeEncryptedCCNumber() {
    return braintreeEncryptedCCNumber;
  }
  public void setBraintreeEncryptedCCNumber(String braintreeEncryptedCCNumber) {
    this.braintreeEncryptedCCNumber = braintreeEncryptedCCNumber;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBraintreeEncryptedCCExpDate() {
    return braintreeEncryptedCCExpDate;
  }
  public void setBraintreeEncryptedCCExpDate(String braintreeEncryptedCCExpDate) {
    this.braintreeEncryptedCCExpDate = braintreeEncryptedCCExpDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBraintreeEncryptedCCV() {
    return braintreeEncryptedCCV;
  }
  public void setBraintreeEncryptedCCV(String braintreeEncryptedCCV) {
    this.braintreeEncryptedCCV = braintreeEncryptedCCV;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBraintreePaymentNonce() {
    return braintreePaymentNonce;
  }
  public void setBraintreePaymentNonce(String braintreePaymentNonce) {
    this.braintreePaymentNonce = braintreePaymentNonce;
  }

  
  /**
   * A code that when passed allows the order to be submitted on credit.
   **/
  @ApiModelProperty(required = true, value = "A code that when passed allows the order to be submitted on credit.")
  public String getPartnerBillingKey() {
    return partnerBillingKey;
  }
  public void setPartnerBillingKey(String partnerBillingKey) {
    this.partnerBillingKey = partnerBillingKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPayment {\n");
    
    sb.append("  braintreeEncryptedCCNumber: ").append(braintreeEncryptedCCNumber).append("\n");
    sb.append("  braintreeEncryptedCCExpDate: ").append(braintreeEncryptedCCExpDate).append("\n");
    sb.append("  braintreeEncryptedCCV: ").append(braintreeEncryptedCCV).append("\n");
    sb.append("  braintreePaymentNonce: ").append(braintreePaymentNonce).append("\n");
    sb.append("  partnerBillingKey: ").append(partnerBillingKey).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
