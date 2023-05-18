package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.Location;
import java.io.IOException;
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
 * Business Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class BusinessSearchRequestBusinessSearchModel {
  public static final String SERIALIZED_NAME_BUSINESS_NAME = "BusinessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_WEBSITE = "Website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION = "JurisdictionOfIncorporation";
  @SerializedName(SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION)
  private String jurisdictionOfIncorporation;

  public static final String SERIALIZED_NAME_DUNS_NUMBER = "dunsNumber";
  @SerializedName(SERIALIZED_NAME_DUNS_NUMBER)
  private String dunsNumber;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public BusinessSearchRequestBusinessSearchModel() {
  }

  public BusinessSearchRequestBusinessSearchModel businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business to be verified
   * @return businessName
  **/
  @javax.annotation.Nullable

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public BusinessSearchRequestBusinessSearchModel website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Website of the business
   * @return website
  **/
  @javax.annotation.Nullable

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public BusinessSearchRequestBusinessSearchModel jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * Jurisdiction Of Incorporation of the business to be verified
   * @return jurisdictionOfIncorporation
  **/
  @javax.annotation.Nullable

  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }


  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }


  public BusinessSearchRequestBusinessSearchModel dunsNumber(String dunsNumber) {
    
    this.dunsNumber = dunsNumber;
    return this;
  }

   /**
   * DUNS number of the business to be verified
   * @return dunsNumber
  **/
  @javax.annotation.Nullable

  public String getDunsNumber() {
    return dunsNumber;
  }


  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }


  public BusinessSearchRequestBusinessSearchModel location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSearchRequestBusinessSearchModel businessSearchRequestBusinessSearchModel = (BusinessSearchRequestBusinessSearchModel) o;
    return Objects.equals(this.businessName, businessSearchRequestBusinessSearchModel.businessName) &&
        Objects.equals(this.website, businessSearchRequestBusinessSearchModel.website) &&
        Objects.equals(this.jurisdictionOfIncorporation, businessSearchRequestBusinessSearchModel.jurisdictionOfIncorporation) &&
        Objects.equals(this.dunsNumber, businessSearchRequestBusinessSearchModel.dunsNumber) &&
        Objects.equals(this.location, businessSearchRequestBusinessSearchModel.location);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, website, jurisdictionOfIncorporation, dunsNumber, location);
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
    sb.append("class BusinessSearchRequestBusinessSearchModel {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    jurisdictionOfIncorporation: ").append(toIndentedString(jurisdictionOfIncorporation)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("BusinessName");
    openapiFields.add("Website");
    openapiFields.add("JurisdictionOfIncorporation");
    openapiFields.add("dunsNumber");
    openapiFields.add("Location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessSearchRequestBusinessSearchModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessSearchRequestBusinessSearchModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessSearchRequestBusinessSearchModel is not found in the empty JSON string", BusinessSearchRequestBusinessSearchModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessSearchRequestBusinessSearchModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessSearchRequestBusinessSearchModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("BusinessName") != null && !jsonObj.get("BusinessName").isJsonNull()) && !jsonObj.get("BusinessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessName").toString()));
      }
      if ((jsonObj.get("Website") != null && !jsonObj.get("Website").isJsonNull()) && !jsonObj.get("Website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Website").toString()));
      }
      if ((jsonObj.get("JurisdictionOfIncorporation") != null && !jsonObj.get("JurisdictionOfIncorporation").isJsonNull()) && !jsonObj.get("JurisdictionOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JurisdictionOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JurisdictionOfIncorporation").toString()));
      }
      if ((jsonObj.get("dunsNumber") != null && !jsonObj.get("dunsNumber").isJsonNull()) && !jsonObj.get("dunsNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dunsNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dunsNumber").toString()));
      }
      // validate the optional field `Location`
      if (jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull()) {
        Location.validateJsonObject(jsonObj.getAsJsonObject("Location"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessSearchRequestBusinessSearchModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessSearchRequestBusinessSearchModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessSearchRequestBusinessSearchModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessSearchRequestBusinessSearchModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessSearchRequestBusinessSearchModel>() {
           @Override
           public void write(JsonWriter out, BusinessSearchRequestBusinessSearchModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessSearchRequestBusinessSearchModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessSearchRequestBusinessSearchModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessSearchRequestBusinessSearchModel
  * @throws IOException if the JSON string is invalid with respect to BusinessSearchRequestBusinessSearchModel
  */
  public static BusinessSearchRequestBusinessSearchModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessSearchRequestBusinessSearchModel.class);
  }

 /**
  * Convert an instance of BusinessSearchRequestBusinessSearchModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

