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
 * ProblemDetails
 */

public class ProblemDetails {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DETAIL = "Detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "Instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public ProblemDetails() {
  }

  public ProblemDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ProblemDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProblemDetails status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public ProblemDetails detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ProblemDetails instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.type, problemDetails.type) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.status, problemDetails.status) &&
        Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.instance, problemDetails.instance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
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
    sb.append("class ProblemDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Title");
    openapiFields.add("Status");
    openapiFields.add("Detail");
    openapiFields.add("Instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProblemDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProblemDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProblemDetails is not found in the empty JSON string", ProblemDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProblemDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProblemDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if ((jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonNull()) && !jsonObj.get("Title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Title").toString()));
      }
      if ((jsonObj.get("Detail") != null && !jsonObj.get("Detail").isJsonNull()) && !jsonObj.get("Detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Detail").toString()));
      }
      if ((jsonObj.get("Instance") != null && !jsonObj.get("Instance").isJsonNull()) && !jsonObj.get("Instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Instance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProblemDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProblemDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProblemDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProblemDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ProblemDetails>() {
           @Override
           public void write(JsonWriter out, ProblemDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProblemDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProblemDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProblemDetails
  * @throws IOException if the JSON string is invalid with respect to ProblemDetails
  */
  public static ProblemDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProblemDetails.class);
  }

 /**
  * Convert an instance of ProblemDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

