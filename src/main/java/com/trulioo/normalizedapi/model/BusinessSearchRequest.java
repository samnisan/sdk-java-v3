package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.BusinessSearchRequestBusinessSearchModel;
import com.trulioo.normalizedapi.model.ServiceError;
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
 * 
 */

public class BusinessSearchRequest {
  public static final String SERIALIZED_NAME_TEST = "Test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test;

  /**
   * The type of search to perform. i.e &#39;Live&#39; or &#39;Demo&#39;
   */
  @JsonAdapter(SearchTypeEnum.Adapter.class)
  public enum SearchTypeEnum {
    LIVE("Live"),
    
    DEMO("Demo");

    private String value;

    SearchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SearchTypeEnum fromValue(String value) {
      for (SearchTypeEnum b : SearchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SearchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SearchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SearchTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "SearchType";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private SearchTypeEnum searchType;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId;

  public static final String SERIALIZED_NAME_CALL_BACK_URL = "CallBackUrl";
  @SerializedName(SERIALIZED_NAME_CALL_BACK_URL)
  private String callBackUrl;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_CONSENT_FOR_DATA_SOURCES = "ConsentForDataSources";
  @SerializedName(SERIALIZED_NAME_CONSENT_FOR_DATA_SOURCES)
  private List<String> consentForDataSources;

  public static final String SERIALIZED_NAME_BUSINESS = "Business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private BusinessSearchRequestBusinessSearchModel business;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_REQUEST_ERRORS = "RequestErrors";
  @SerializedName(SERIALIZED_NAME_REQUEST_ERRORS)
  private List<ServiceError> requestErrors;

  public BusinessSearchRequest() {
  }

  
  public BusinessSearchRequest(
     Boolean test
  ) {
    this();
    this.test = test;
  }

   /**
   * Get test
   * @return test
  **/
  @javax.annotation.Nullable

  public Boolean getTest() {
    return test;
  }




  public BusinessSearchRequest searchType(SearchTypeEnum searchType) {
    
    this.searchType = searchType;
    return this;
  }

   /**
   * The type of search to perform. i.e &#39;Live&#39; or &#39;Demo&#39;
   * @return searchType
  **/
  @javax.annotation.Nullable

  public SearchTypeEnum getSearchType() {
    return searchType;
  }


  public void setSearchType(SearchTypeEnum searchType) {
    this.searchType = searchType;
  }


  public BusinessSearchRequest packageId(String packageId) {
    
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


  public BusinessSearchRequest callBackUrl(String callBackUrl) {
    
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


  public BusinessSearchRequest timeout(Integer timeout) {
    
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


  public BusinessSearchRequest consentForDataSources(List<String> consentForDataSources) {
    
    this.consentForDataSources = consentForDataSources;
    return this;
  }

  public BusinessSearchRequest addConsentForDataSourcesItem(String consentForDataSourcesItem) {
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


  public BusinessSearchRequest business(BusinessSearchRequestBusinessSearchModel business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable

  public BusinessSearchRequestBusinessSearchModel getBusiness() {
    return business;
  }


  public void setBusiness(BusinessSearchRequestBusinessSearchModel business) {
    this.business = business;
  }


  public BusinessSearchRequest countryCode(String countryCode) {
    
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


  public BusinessSearchRequest requestErrors(List<ServiceError> requestErrors) {
    
    this.requestErrors = requestErrors;
    return this;
  }

  public BusinessSearchRequest addRequestErrorsItem(ServiceError requestErrorsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSearchRequest businessSearchRequest = (BusinessSearchRequest) o;
    return Objects.equals(this.test, businessSearchRequest.test) &&
        Objects.equals(this.searchType, businessSearchRequest.searchType) &&
        Objects.equals(this.packageId, businessSearchRequest.packageId) &&
        Objects.equals(this.callBackUrl, businessSearchRequest.callBackUrl) &&
        Objects.equals(this.timeout, businessSearchRequest.timeout) &&
        Objects.equals(this.consentForDataSources, businessSearchRequest.consentForDataSources) &&
        Objects.equals(this.business, businessSearchRequest.business) &&
        Objects.equals(this.countryCode, businessSearchRequest.countryCode) &&
        Objects.equals(this.requestErrors, businessSearchRequest.requestErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(test, searchType, packageId, callBackUrl, timeout, consentForDataSources, business, countryCode, requestErrors);
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
    sb.append("class BusinessSearchRequest {\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    consentForDataSources: ").append(toIndentedString(consentForDataSources)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    requestErrors: ").append(toIndentedString(requestErrors)).append("\n");
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
    openapiFields.add("Test");
    openapiFields.add("SearchType");
    openapiFields.add("PackageId");
    openapiFields.add("CallBackUrl");
    openapiFields.add("Timeout");
    openapiFields.add("ConsentForDataSources");
    openapiFields.add("Business");
    openapiFields.add("CountryCode");
    openapiFields.add("RequestErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessSearchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessSearchRequest is not found in the empty JSON string", BusinessSearchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessSearchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessSearchRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SearchType") != null && !jsonObj.get("SearchType").isJsonNull()) && !jsonObj.get("SearchType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchType").toString()));
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
      // validate the optional field `Business`
      if (jsonObj.get("Business") != null && !jsonObj.get("Business").isJsonNull()) {
        BusinessSearchRequestBusinessSearchModel.validateJsonObject(jsonObj.getAsJsonObject("Business"));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessSearchRequest>() {
           @Override
           public void write(JsonWriter out, BusinessSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessSearchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessSearchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessSearchRequest
  * @throws IOException if the JSON string is invalid with respect to BusinessSearchRequest
  */
  public static BusinessSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessSearchRequest.class);
  }

 /**
  * Convert an instance of BusinessSearchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

