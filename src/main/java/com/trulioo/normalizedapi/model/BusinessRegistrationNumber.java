package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.BusinessRegistrationNumberMask;
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

public class BusinessRegistrationNumber {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_JURISDICTION = "Jurisdiction";
  @SerializedName(SERIALIZED_NAME_JURISDICTION)
  private String jurisdiction;

  public static final String SERIALIZED_NAME_SUPPORTED = "Supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private Boolean supported;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MASKS = "Masks";
  @SerializedName(SERIALIZED_NAME_MASKS)
  private List<BusinessRegistrationNumberMask> masks;

  public BusinessRegistrationNumber() {
  }

  public BusinessRegistrationNumber name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the business registration number
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BusinessRegistrationNumber description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Brief description of the business registration number
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BusinessRegistrationNumber country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country to which the business registration number applies
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public BusinessRegistrationNumber jurisdiction(String jurisdiction) {
    
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Optional jurisdiction to which the business registration number applies
   * @return jurisdiction
  **/
  @javax.annotation.Nullable

  public String getJurisdiction() {
    return jurisdiction;
  }


  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  public BusinessRegistrationNumber supported(Boolean supported) {
    
    this.supported = supported;
    return this;
  }

   /**
   * Whether the business registration number is supported by Trulioo&#39;s systems
   * @return supported
  **/
  @javax.annotation.Nullable

  public Boolean getSupported() {
    return supported;
  }


  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  public BusinessRegistrationNumber type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The specified type of this business registration number
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public BusinessRegistrationNumber masks(List<BusinessRegistrationNumberMask> masks) {
    
    this.masks = masks;
    return this;
  }

  public BusinessRegistrationNumber addMasksItem(BusinessRegistrationNumberMask masksItem) {
    if (this.masks == null) {
      this.masks = new ArrayList<>();
    }
    this.masks.add(masksItem);
    return this;
  }

   /**
   * The mask(s) describing this business registration number
   * @return masks
  **/
  @javax.annotation.Nullable

  public List<BusinessRegistrationNumberMask> getMasks() {
    return masks;
  }


  public void setMasks(List<BusinessRegistrationNumberMask> masks) {
    this.masks = masks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRegistrationNumber businessRegistrationNumber = (BusinessRegistrationNumber) o;
    return Objects.equals(this.name, businessRegistrationNumber.name) &&
        Objects.equals(this.description, businessRegistrationNumber.description) &&
        Objects.equals(this.country, businessRegistrationNumber.country) &&
        Objects.equals(this.jurisdiction, businessRegistrationNumber.jurisdiction) &&
        Objects.equals(this.supported, businessRegistrationNumber.supported) &&
        Objects.equals(this.type, businessRegistrationNumber.type) &&
        Objects.equals(this.masks, businessRegistrationNumber.masks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, country, jurisdiction, supported, type, masks);
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
    sb.append("class BusinessRegistrationNumber {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    masks: ").append(toIndentedString(masks)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Description");
    openapiFields.add("Country");
    openapiFields.add("Jurisdiction");
    openapiFields.add("Supported");
    openapiFields.add("Type");
    openapiFields.add("Masks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessRegistrationNumber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessRegistrationNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessRegistrationNumber is not found in the empty JSON string", BusinessRegistrationNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessRegistrationNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessRegistrationNumber` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("Jurisdiction") != null && !jsonObj.get("Jurisdiction").isJsonNull()) && !jsonObj.get("Jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Jurisdiction").toString()));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if (jsonObj.get("Masks") != null && !jsonObj.get("Masks").isJsonNull()) {
        JsonArray jsonArraymasks = jsonObj.getAsJsonArray("Masks");
        if (jsonArraymasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Masks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Masks` to be an array in the JSON string but got `%s`", jsonObj.get("Masks").toString()));
          }

          // validate the optional field `Masks` (array)
          for (int i = 0; i < jsonArraymasks.size(); i++) {
            BusinessRegistrationNumberMask.validateJsonObject(jsonArraymasks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessRegistrationNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessRegistrationNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessRegistrationNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessRegistrationNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessRegistrationNumber>() {
           @Override
           public void write(JsonWriter out, BusinessRegistrationNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessRegistrationNumber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessRegistrationNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessRegistrationNumber
  * @throws IOException if the JSON string is invalid with respect to BusinessRegistrationNumber
  */
  public static BusinessRegistrationNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessRegistrationNumber.class);
  }

 /**
  * Convert an instance of BusinessRegistrationNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

