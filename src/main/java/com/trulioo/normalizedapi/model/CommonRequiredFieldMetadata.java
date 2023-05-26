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
 * CommonRequiredFieldMetadata
 */

public class CommonRequiredFieldMetadata {
  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_LABEL = "FieldLabel";
  @SerializedName(SERIALIZED_NAME_FIELD_LABEL)
  private String fieldLabel;

  public CommonRequiredFieldMetadata() {
  }

  public CommonRequiredFieldMetadata fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public CommonRequiredFieldMetadata fieldLabel(String fieldLabel) {
    
    this.fieldLabel = fieldLabel;
    return this;
  }

   /**
   * Get fieldLabel
   * @return fieldLabel
  **/
  @javax.annotation.Nullable

  public String getFieldLabel() {
    return fieldLabel;
  }


  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRequiredFieldMetadata commonRequiredFieldMetadata = (CommonRequiredFieldMetadata) o;
    return Objects.equals(this.fieldName, commonRequiredFieldMetadata.fieldName) &&
        Objects.equals(this.fieldLabel, commonRequiredFieldMetadata.fieldLabel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldLabel);
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
    sb.append("class CommonRequiredFieldMetadata {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldLabel: ").append(toIndentedString(fieldLabel)).append("\n");
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
    openapiFields.add("FieldLabel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommonRequiredFieldMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommonRequiredFieldMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonRequiredFieldMetadata is not found in the empty JSON string", CommonRequiredFieldMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommonRequiredFieldMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonRequiredFieldMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FieldName") != null && !jsonObj.get("FieldName").isJsonNull()) && !jsonObj.get("FieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FieldName").toString()));
      }
      if ((jsonObj.get("FieldLabel") != null && !jsonObj.get("FieldLabel").isJsonNull()) && !jsonObj.get("FieldLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FieldLabel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonRequiredFieldMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonRequiredFieldMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonRequiredFieldMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonRequiredFieldMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonRequiredFieldMetadata>() {
           @Override
           public void write(JsonWriter out, CommonRequiredFieldMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonRequiredFieldMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommonRequiredFieldMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommonRequiredFieldMetadata
  * @throws IOException if the JSON string is invalid with respect to CommonRequiredFieldMetadata
  */
  public static CommonRequiredFieldMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonRequiredFieldMetadata.class);
  }

 /**
  * Convert an instance of CommonRequiredFieldMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

