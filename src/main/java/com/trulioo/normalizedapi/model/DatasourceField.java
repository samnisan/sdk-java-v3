package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * 
 */

public class DatasourceField {
  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRU_MATCH_VALUE = "TruMatchValue";
  @SerializedName(SERIALIZED_NAME_TRU_MATCH_VALUE)
  private String truMatchValue;

  public static final String SERIALIZED_NAME_TRU_MATCH_THRESHOLD = "TruMatchThreshold";
  @SerializedName(SERIALIZED_NAME_TRU_MATCH_THRESHOLD)
  private String truMatchThreshold;

  public static final String SERIALIZED_NAME_FIELD_GROUP = "FieldGroup";
  @SerializedName(SERIALIZED_NAME_FIELD_GROUP)
  private String fieldGroup;

  public DatasourceField() {
  }

  public DatasourceField fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 
   * @return fieldName
  **/
  @javax.annotation.Nullable

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public DatasourceField status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DatasourceField truMatchValue(String truMatchValue) {
    
    this.truMatchValue = truMatchValue;
    return this;
  }

   /**
   * 
   * @return truMatchValue
  **/
  @javax.annotation.Nullable

  public String getTruMatchValue() {
    return truMatchValue;
  }


  public void setTruMatchValue(String truMatchValue) {
    this.truMatchValue = truMatchValue;
  }


  public DatasourceField truMatchThreshold(String truMatchThreshold) {
    
    this.truMatchThreshold = truMatchThreshold;
    return this;
  }

   /**
   * Get truMatchThreshold
   * @return truMatchThreshold
  **/
  @javax.annotation.Nullable

  public String getTruMatchThreshold() {
    return truMatchThreshold;
  }


  public void setTruMatchThreshold(String truMatchThreshold) {
    this.truMatchThreshold = truMatchThreshold;
  }


  public DatasourceField fieldGroup(String fieldGroup) {
    
    this.fieldGroup = fieldGroup;
    return this;
  }

   /**
   * 
   * @return fieldGroup
  **/
  @javax.annotation.Nullable

  public String getFieldGroup() {
    return fieldGroup;
  }


  public void setFieldGroup(String fieldGroup) {
    this.fieldGroup = fieldGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasourceField datasourceField = (DatasourceField) o;
    return Objects.equals(this.fieldName, datasourceField.fieldName) &&
        Objects.equals(this.status, datasourceField.status) &&
        Objects.equals(this.truMatchValue, datasourceField.truMatchValue) &&
        Objects.equals(this.truMatchThreshold, datasourceField.truMatchThreshold) &&
        Objects.equals(this.fieldGroup, datasourceField.fieldGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, status, truMatchValue, truMatchThreshold, fieldGroup);
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
    sb.append("class DatasourceField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    truMatchValue: ").append(toIndentedString(truMatchValue)).append("\n");
    sb.append("    truMatchThreshold: ").append(toIndentedString(truMatchThreshold)).append("\n");
    sb.append("    fieldGroup: ").append(toIndentedString(fieldGroup)).append("\n");
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
    openapiFields.add("FieldName");
    openapiFields.add("Status");
    openapiFields.add("TruMatchValue");
    openapiFields.add("TruMatchThreshold");
    openapiFields.add("FieldGroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatasourceField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DatasourceField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasourceField is not found in the empty JSON string", DatasourceField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatasourceField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasourceField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FieldName") != null && !jsonObj.get("FieldName").isJsonNull()) && !jsonObj.get("FieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FieldName").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
      if ((jsonObj.get("TruMatchValue") != null && !jsonObj.get("TruMatchValue").isJsonNull()) && !jsonObj.get("TruMatchValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TruMatchValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TruMatchValue").toString()));
      }
      if ((jsonObj.get("TruMatchThreshold") != null && !jsonObj.get("TruMatchThreshold").isJsonNull()) && !jsonObj.get("TruMatchThreshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TruMatchThreshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TruMatchThreshold").toString()));
      }
      if ((jsonObj.get("FieldGroup") != null && !jsonObj.get("FieldGroup").isJsonNull()) && !jsonObj.get("FieldGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FieldGroup").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasourceField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasourceField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasourceField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasourceField.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasourceField>() {
           @Override
           public void write(JsonWriter out, DatasourceField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasourceField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasourceField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasourceField
  * @throws IOException if the JSON string is invalid with respect to DatasourceField
  */
  public static DatasourceField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasourceField.class);
  }

 /**
  * Convert an instance of DatasourceField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

