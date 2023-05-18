package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.DataFields;
import com.trulioo.normalizedapi.model.ServiceError;
import com.trulioo.normalizedapi.model.VerifyRequestMetadata;
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
public class VerifyRequest {
  /**
   * The type of verification to perform. i.e &#39;Live&#39; or &#39;Demo&#39;
   */
  @JsonAdapter(VerificationTypeEnum.Adapter.class)
  public enum VerificationTypeEnum {
    LIVE("Live"),
    
    DEMO("Demo");

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

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

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

  public static final String SERIALIZED_NAME_REQUEST_ERRORS = "RequestErrors";
  @SerializedName(SERIALIZED_NAME_REQUEST_ERRORS)
  private List<ServiceError> requestErrors;

  public static final String SERIALIZED_NAME_VERBOSE_MODE = "VerboseMode";
  @SerializedName(SERIALIZED_NAME_VERBOSE_MODE)
  private Boolean verboseMode = false;

  public static final String SERIALIZED_NAME_REQUEST_METADATA = "RequestMetadata";
  @SerializedName(SERIALIZED_NAME_REQUEST_METADATA)
  private List<VerifyRequestMetadata> requestMetadata;

  public VerifyRequest() {
  }

  public VerifyRequest verificationType(VerificationTypeEnum verificationType) {
    
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


  public VerifyRequest packageId(String packageId) {
    
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


  public VerifyRequest callBackUrl(String callBackUrl) {
    
    this.callBackUrl = callBackUrl;
    return this;
  }

   /**
   * Get callBackUrl
   * @return callBackUrl
  **/
  @javax.annotation.Nullable

  public String getCallBackUrl() {
    return callBackUrl;
  }


  public void setCallBackUrl(String callBackUrl) {
    this.callBackUrl = callBackUrl;
  }


  public VerifyRequest timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public VerifyRequest cleansedAddress(Boolean cleansedAddress) {
    
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


  public VerifyRequest consentForDataSources(List<String> consentForDataSources) {
    
    this.consentForDataSources = consentForDataSources;
    return this;
  }

  public VerifyRequest addConsentForDataSourcesItem(String consentForDataSourcesItem) {
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


  public VerifyRequest countryCode(String countryCode) {
    
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


  public VerifyRequest customerReferenceID(String customerReferenceID) {
    
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


  public VerifyRequest dataFields(DataFields dataFields) {
    
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


  public VerifyRequest requestErrors(List<ServiceError> requestErrors) {
    
    this.requestErrors = requestErrors;
    return this;
  }

  public VerifyRequest addRequestErrorsItem(ServiceError requestErrorsItem) {
    if (this.requestErrors == null) {
      this.requestErrors = new ArrayList<>();
    }
    this.requestErrors.add(requestErrorsItem);
    return this;
  }

   /**
   * 
   * @return requestErrors
  **/
  @javax.annotation.Nullable

  public List<ServiceError> getRequestErrors() {
    return requestErrors;
  }


  public void setRequestErrors(List<ServiceError> requestErrors) {
    this.requestErrors = requestErrors;
  }


  public VerifyRequest verboseMode(Boolean verboseMode) {
    
    this.verboseMode = verboseMode;
    return this;
  }

   /**
   * Verbose Mode Output Flag.
   * @return verboseMode
  **/
  @javax.annotation.Nullable

  public Boolean getVerboseMode() {
    return verboseMode;
  }


  public void setVerboseMode(Boolean verboseMode) {
    this.verboseMode = verboseMode;
  }


  public VerifyRequest requestMetadata(List<VerifyRequestMetadata> requestMetadata) {
    
    this.requestMetadata = requestMetadata;
    return this;
  }

  public VerifyRequest addRequestMetadataItem(VerifyRequestMetadata requestMetadataItem) {
    if (this.requestMetadata == null) {
      this.requestMetadata = new ArrayList<>();
    }
    this.requestMetadata.add(requestMetadataItem);
    return this;
  }

   /**
   * Get requestMetadata
   * @return requestMetadata
  **/
  @javax.annotation.Nullable

  public List<VerifyRequestMetadata> getRequestMetadata() {
    return requestMetadata;
  }


  public void setRequestMetadata(List<VerifyRequestMetadata> requestMetadata) {
    this.requestMetadata = requestMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyRequest verifyRequest = (VerifyRequest) o;
    return Objects.equals(this.verificationType, verifyRequest.verificationType) &&
        Objects.equals(this.packageId, verifyRequest.packageId) &&
        Objects.equals(this.callBackUrl, verifyRequest.callBackUrl) &&
        Objects.equals(this.timeout, verifyRequest.timeout) &&
        Objects.equals(this.cleansedAddress, verifyRequest.cleansedAddress) &&
        Objects.equals(this.consentForDataSources, verifyRequest.consentForDataSources) &&
        Objects.equals(this.countryCode, verifyRequest.countryCode) &&
        Objects.equals(this.customerReferenceID, verifyRequest.customerReferenceID) &&
        Objects.equals(this.dataFields, verifyRequest.dataFields) &&
        Objects.equals(this.requestErrors, verifyRequest.requestErrors) &&
        Objects.equals(this.verboseMode, verifyRequest.verboseMode) &&
        Objects.equals(this.requestMetadata, verifyRequest.requestMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationType, packageId, callBackUrl, timeout, cleansedAddress, consentForDataSources, countryCode, customerReferenceID, dataFields, requestErrors, verboseMode, requestMetadata);
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
    sb.append("class VerifyRequest {\n");
    sb.append("    verificationType: ").append(toIndentedString(verificationType)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    cleansedAddress: ").append(toIndentedString(cleansedAddress)).append("\n");
    sb.append("    consentForDataSources: ").append(toIndentedString(consentForDataSources)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    customerReferenceID: ").append(toIndentedString(customerReferenceID)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
    sb.append("    requestErrors: ").append(toIndentedString(requestErrors)).append("\n");
    sb.append("    verboseMode: ").append(toIndentedString(verboseMode)).append("\n");
    sb.append("    requestMetadata: ").append(toIndentedString(requestMetadata)).append("\n");
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
    openapiFields.add("Timeout");
    openapiFields.add("CleansedAddress");
    openapiFields.add("ConsentForDataSources");
    openapiFields.add("CountryCode");
    openapiFields.add("CustomerReferenceID");
    openapiFields.add("DataFields");
    openapiFields.add("RequestErrors");
    openapiFields.add("VerboseMode");
    openapiFields.add("RequestMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyRequest is not found in the empty JSON string", VerifyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerifyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("RequestErrors") != null && !jsonObj.get("RequestErrors").isJsonNull()) {
        JsonArray jsonArrayrequestErrors = jsonObj.getAsJsonArray("RequestErrors");
        if (jsonArrayrequestErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RequestErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RequestErrors` to be an array in the JSON string but got `%s`", jsonObj.get("RequestErrors").toString()));
          }

          // validate the optional field `RequestErrors` (array)
          for (int i = 0; i < jsonArrayrequestErrors.size(); i++) {
            ServiceError.validateJsonObject(jsonArrayrequestErrors.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("RequestMetadata") != null && !jsonObj.get("RequestMetadata").isJsonNull()) {
        JsonArray jsonArrayrequestMetadata = jsonObj.getAsJsonArray("RequestMetadata");
        if (jsonArrayrequestMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RequestMetadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RequestMetadata` to be an array in the JSON string but got `%s`", jsonObj.get("RequestMetadata").toString()));
          }

          // validate the optional field `RequestMetadata` (array)
          for (int i = 0; i < jsonArrayrequestMetadata.size(); i++) {
            VerifyRequestMetadata.validateJsonObject(jsonArrayrequestMetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyRequest>() {
           @Override
           public void write(JsonWriter out, VerifyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyRequest
  * @throws IOException if the JSON string is invalid with respect to VerifyRequest
  */
  public static VerifyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyRequest.class);
  }

 /**
  * Convert an instance of VerifyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

