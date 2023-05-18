package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.CommonRequiredFieldMetadata;
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
 * CommonProviderCacheSchema
 */

public class CommonProviderCacheSchema {
  public static final String SERIALIZED_NAME_SUPPORTS_CREDENTIAL_VALIDATION = "SupportsCredentialValidation";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_CREDENTIAL_VALIDATION)
  private Boolean supportsCredentialValidation;

  public static final String SERIALIZED_NAME_REQUIRED_FIELD_METADATA = "RequiredFieldMetadata";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FIELD_METADATA)
  private List<CommonRequiredFieldMetadata> requiredFieldMetadata;

  public CommonProviderCacheSchema() {
  }

  public CommonProviderCacheSchema supportsCredentialValidation(Boolean supportsCredentialValidation) {
    
    this.supportsCredentialValidation = supportsCredentialValidation;
    return this;
  }

   /**
   * Get supportsCredentialValidation
   * @return supportsCredentialValidation
  **/
  @javax.annotation.Nullable

  public Boolean getSupportsCredentialValidation() {
    return supportsCredentialValidation;
  }


  public void setSupportsCredentialValidation(Boolean supportsCredentialValidation) {
    this.supportsCredentialValidation = supportsCredentialValidation;
  }


  public CommonProviderCacheSchema requiredFieldMetadata(List<CommonRequiredFieldMetadata> requiredFieldMetadata) {
    
    this.requiredFieldMetadata = requiredFieldMetadata;
    return this;
  }

  public CommonProviderCacheSchema addRequiredFieldMetadataItem(CommonRequiredFieldMetadata requiredFieldMetadataItem) {
    if (this.requiredFieldMetadata == null) {
      this.requiredFieldMetadata = new ArrayList<>();
    }
    this.requiredFieldMetadata.add(requiredFieldMetadataItem);
    return this;
  }

   /**
   * Get requiredFieldMetadata
   * @return requiredFieldMetadata
  **/
  @javax.annotation.Nullable

  public List<CommonRequiredFieldMetadata> getRequiredFieldMetadata() {
    return requiredFieldMetadata;
  }


  public void setRequiredFieldMetadata(List<CommonRequiredFieldMetadata> requiredFieldMetadata) {
    this.requiredFieldMetadata = requiredFieldMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonProviderCacheSchema commonProviderCacheSchema = (CommonProviderCacheSchema) o;
    return Objects.equals(this.supportsCredentialValidation, commonProviderCacheSchema.supportsCredentialValidation) &&
        Objects.equals(this.requiredFieldMetadata, commonProviderCacheSchema.requiredFieldMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsCredentialValidation, requiredFieldMetadata);
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
    sb.append("class CommonProviderCacheSchema {\n");
    sb.append("    supportsCredentialValidation: ").append(toIndentedString(supportsCredentialValidation)).append("\n");
    sb.append("    requiredFieldMetadata: ").append(toIndentedString(requiredFieldMetadata)).append("\n");
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
    openapiFields.add("SupportsCredentialValidation");
    openapiFields.add("RequiredFieldMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommonProviderCacheSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommonProviderCacheSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonProviderCacheSchema is not found in the empty JSON string", CommonProviderCacheSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommonProviderCacheSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonProviderCacheSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("RequiredFieldMetadata") != null && !jsonObj.get("RequiredFieldMetadata").isJsonNull()) {
        JsonArray jsonArrayrequiredFieldMetadata = jsonObj.getAsJsonArray("RequiredFieldMetadata");
        if (jsonArrayrequiredFieldMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RequiredFieldMetadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RequiredFieldMetadata` to be an array in the JSON string but got `%s`", jsonObj.get("RequiredFieldMetadata").toString()));
          }

          // validate the optional field `RequiredFieldMetadata` (array)
          for (int i = 0; i < jsonArrayrequiredFieldMetadata.size(); i++) {
            CommonRequiredFieldMetadata.validateJsonObject(jsonArrayrequiredFieldMetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonProviderCacheSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonProviderCacheSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonProviderCacheSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonProviderCacheSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonProviderCacheSchema>() {
           @Override
           public void write(JsonWriter out, CommonProviderCacheSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonProviderCacheSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommonProviderCacheSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommonProviderCacheSchema
  * @throws IOException if the JSON string is invalid with respect to CommonProviderCacheSchema
  */
  public static CommonProviderCacheSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonProviderCacheSchema.class);
  }

 /**
  * Convert an instance of CommonProviderCacheSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

