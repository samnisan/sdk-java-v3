package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.DataFields;
import com.trulioo.normalizedapi.model.VerifyAddressCredentials;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trulioo.normalizedapi.JSON;

/**
 * The verification call for the Normalized API is a POST method call
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class VerifyAddressRequest {
  /**
   * The type of verification to perform. i.e &#39;Live&#39; or &#39;Demo&#39;
   */
  @JsonAdapter(VerificationTypeEnum.Adapter.class)
  public enum VerificationTypeEnum {
    LIVE("Live");

    private String value;

    VerificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationTypeEnum fromValue(String value) {
      for (VerificationTypeEnum b : VerificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_TYPE = "VerificationType";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_TYPE)
  private VerificationTypeEnum verificationType;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId;

  public static final String SERIALIZED_NAME_CALL_BACK_URL = "CallBackUrl";
  @SerializedName(SERIALIZED_NAME_CALL_BACK_URL)
  private String callBackUrl;

  public static final String SERIALIZED_NAME_CLEANSED_ADDRESS = "CleansedAddress";
  @SerializedName(SERIALIZED_NAME_CLEANSED_ADDRESS)
  private Boolean cleansedAddress;

  public static final String SERIALIZED_NAME_CONSENT_FOR_DATA_SOURCES = "ConsentForDataSources";
  @SerializedName(SERIALIZED_NAME_CONSENT_FOR_DATA_SOURCES)
  private List<String> consentForDataSources;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CUSTOMER_REFERENCE_I_D = "CustomerReferenceID";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REFERENCE_I_D)
  private String customerReferenceID;

  public static final String SERIALIZED_NAME_DATA_FIELDS = "DataFields";
  @SerializedName(SERIALIZED_NAME_DATA_FIELDS)
  private DataFields dataFields;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "ProviderName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_CREDENTIALS = "ProviderCredentials";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CREDENTIALS)
  private VerifyAddressCredentials providerCredentials;

  public VerifyAddressRequest() {
  }

  public VerifyAddressRequest verificationType(VerificationTypeEnum verificationType) {
    
    this.verificationType = verificationType;
    return this;
  }

   /**
   * The type of verification to perform. i.e &#39;Live&#39; or &#39;Demo&#39;
   * @return verificationType
  **/
  @javax.annotation.Nullable

  public VerificationTypeEnum getVerificationType() {
    return verificationType;
  }


  public void setVerificationType(VerificationTypeEnum verificationType) {
    this.verificationType = verificationType;
  }


  public VerifyAddressRequest packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * The Package ID to run the transaction under which can be obtained by your Customer Success Manager or via a support ticket.
   * @return packageId
  **/
  @javax.annotation.Nullable

  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public VerifyAddressRequest callBackUrl(String callBackUrl) {
    
    this.callBackUrl = callBackUrl;
    return this;
  }

   /**
   * 
   * @return callBackUrl
  **/
  @javax.annotation.Nullable

  public String getCallBackUrl() {
    return callBackUrl;
  }


  public void setCallBackUrl(String callBackUrl) {
    this.callBackUrl = callBackUrl;
  }


  public VerifyAddressRequest cleansedAddress(Boolean cleansedAddress) {
    
    this.cleansedAddress = cleansedAddress;
    return this;
  }

   /**
   * Set to true if you want to receive address cleanse information,  This will only change the response if you have address cleansing enabled for the country you are querying for.
   * @return cleansedAddress
  **/
  @javax.annotation.Nullable

  public Boolean getCleansedAddress() {
    return cleansedAddress;
  }


  public void setCleansedAddress(Boolean cleansedAddress) {
    this.cleansedAddress = cleansedAddress;
  }


  public VerifyAddressRequest consentForDataSources(List<String> consentForDataSources) {
    
    this.consentForDataSources = consentForDataSources;
    return this;
  }

  public VerifyAddressRequest addConsentForDataSourcesItem(String consentForDataSourcesItem) {
    if (this.consentForDataSources == null) {
      this.consentForDataSources = new ArrayList<>();
    }
    this.consentForDataSources.add(consentForDataSourcesItem);
    return this;
  }

   /**
   * Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried.
   * @return consentForDataSources
  **/
  @javax.annotation.Nullable

  public List<String> getConsentForDataSources() {
    return consentForDataSources;
  }


  public void setConsentForDataSources(List<String> consentForDataSources) {
    this.consentForDataSources = consentForDataSources;
  }


  public VerifyAddressRequest countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for which the verification needs to be performed.
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public VerifyAddressRequest customerReferenceID(String customerReferenceID) {
    
    this.customerReferenceID = customerReferenceID;
    return this;
  }

   /**
   * Customer Reference Id
   * @return customerReferenceID
  **/
  @javax.annotation.Nullable

  public String getCustomerReferenceID() {
    return customerReferenceID;
  }


  public void setCustomerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
  }


  public VerifyAddressRequest dataFields(DataFields dataFields) {
    
    this.dataFields = dataFields;
    return this;
  }

   /**
   * Get dataFields
   * @return dataFields
  **/
  @javax.annotation.Nullable

  public DataFields getDataFields() {
    return dataFields;
  }


  public void setDataFields(DataFields dataFields) {
    this.dataFields = dataFields;
  }


  public VerifyAddressRequest providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The organization that will provide the address verification.
   * @return providerName
  **/
  @javax.annotation.Nullable

  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public VerifyAddressRequest providerCredentials(VerifyAddressCredentials providerCredentials) {
    
    this.providerCredentials = providerCredentials;
    return this;
  }

   /**
   * Get providerCredentials
   * @return providerCredentials
  **/
  @javax.annotation.Nullable

  public VerifyAddressCredentials getProviderCredentials() {
    return providerCredentials;
  }


  public void setProviderCredentials(VerifyAddressCredentials providerCredentials) {
    this.providerCredentials = providerCredentials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyAddressRequest verifyAddressRequest = (VerifyAddressRequest) o;
    return Objects.equals(this.verificationType, verifyAddressRequest.verificationType) &&
        Objects.equals(this.packageId, verifyAddressRequest.packageId) &&
        Objects.equals(this.callBackUrl, verifyAddressRequest.callBackUrl) &&
        Objects.equals(this.cleansedAddress, verifyAddressRequest.cleansedAddress) &&
        Objects.equals(this.consentForDataSources, verifyAddressRequest.consentForDataSources) &&
        Objects.equals(this.countryCode, verifyAddressRequest.countryCode) &&
        Objects.equals(this.customerReferenceID, verifyAddressRequest.customerReferenceID) &&
        Objects.equals(this.dataFields, verifyAddressRequest.dataFields) &&
        Objects.equals(this.providerName, verifyAddressRequest.providerName) &&
        Objects.equals(this.providerCredentials, verifyAddressRequest.providerCredentials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationType, packageId, callBackUrl, cleansedAddress, consentForDataSources, countryCode, customerReferenceID, dataFields, providerName, providerCredentials);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyAddressRequest {\n");
    sb.append("    verificationType: ").append(toIndentedString(verificationType)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
    sb.append("    cleansedAddress: ").append(toIndentedString(cleansedAddress)).append("\n");
    sb.append("    consentForDataSources: ").append(toIndentedString(consentForDataSources)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    customerReferenceID: ").append(toIndentedString(customerReferenceID)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerCredentials: ").append(toIndentedString(providerCredentials)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("VerificationType");
    openapiFields.add("PackageId");
    openapiFields.add("CallBackUrl");
    openapiFields.add("CleansedAddress");
    openapiFields.add("ConsentForDataSources");
    openapiFields.add("CountryCode");
    openapiFields.add("CustomerReferenceID");
    openapiFields.add("DataFields");
    openapiFields.add("ProviderName");
    openapiFields.add("ProviderCredentials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyAddressRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyAddressRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyAddressRequest is not found in the empty JSON string", VerifyAddressRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerifyAddressRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyAddressRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("VerificationType") != null && !jsonObj.get("VerificationType").isJsonNull()) && !jsonObj.get("VerificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VerificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VerificationType").toString()));
      }
      if ((jsonObj.get("PackageId") != null && !jsonObj.get("PackageId").isJsonNull()) && !jsonObj.get("PackageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PackageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PackageId").toString()));
      }
      if ((jsonObj.get("CallBackUrl") != null && !jsonObj.get("CallBackUrl").isJsonNull()) && !jsonObj.get("CallBackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CallBackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CallBackUrl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ConsentForDataSources") != null && !jsonObj.get("ConsentForDataSources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConsentForDataSources` to be an array in the JSON string but got `%s`", jsonObj.get("ConsentForDataSources").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      if ((jsonObj.get("CustomerReferenceID") != null && !jsonObj.get("CustomerReferenceID").isJsonNull()) && !jsonObj.get("CustomerReferenceID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomerReferenceID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomerReferenceID").toString()));
      }
      // validate the optional field `DataFields`
      if (jsonObj.get("DataFields") != null && !jsonObj.get("DataFields").isJsonNull()) {
        DataFields.validateJsonObject(jsonObj.getAsJsonObject("DataFields"));
      }
      if ((jsonObj.get("ProviderName") != null && !jsonObj.get("ProviderName").isJsonNull()) && !jsonObj.get("ProviderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProviderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProviderName").toString()));
      }
      // validate the optional field `ProviderCredentials`
      if (jsonObj.get("ProviderCredentials") != null && !jsonObj.get("ProviderCredentials").isJsonNull()) {
        VerifyAddressCredentials.validateJsonObject(jsonObj.getAsJsonObject("ProviderCredentials"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyAddressRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyAddressRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyAddressRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyAddressRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyAddressRequest>() {
           @Override
           public void write(JsonWriter out, VerifyAddressRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyAddressRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifyAddressRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyAddressRequest
  * @throws IOException if the JSON string is invalid with respect to VerifyAddressRequest
  */
  public static VerifyAddressRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyAddressRequest.class);
  }

 /**
  * Convert an instance of VerifyAddressRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

