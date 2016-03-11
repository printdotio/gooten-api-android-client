package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ShipToAddress  {
  
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("Line1")
  private String line1 = null;
  @SerializedName("Line2")
  private String line2 = null;
  @SerializedName("City")
  private String city = null;
  @SerializedName("State")
  private String state = null;
  @SerializedName("CountryCode")
  private String countryCode = null;
  @SerializedName("PostalCode")
  private String postalCode = null;
  @SerializedName("IsBusinessAddress")
  private Boolean isBusinessAddress = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("Email")
  private String email = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsBusinessAddress() {
    return isBusinessAddress;
  }
  public void setIsBusinessAddress(Boolean isBusinessAddress) {
    this.isBusinessAddress = isBusinessAddress;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipToAddress {\n");
    
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  line1: ").append(line1).append("\n");
    sb.append("  line2: ").append(line2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  isBusinessAddress: ").append(isBusinessAddress).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
