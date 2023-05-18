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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class BusinessRegistrationNumberMask {
  public static final String SERIALIZED_NAME_MASK = "Mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_IGNORE_WHITESPACE = "IgnoreWhitespace";
  @SerializedName(SERIALIZED_NAME_IGNORE_WHITESPACE)
  private Boolean ignoreWhitespace;

  public static final String SERIALIZED_NAME_IGNORE_SPECIAL_CHARACTER = "IgnoreSpecialCharacter";
  @SerializedName(SERIALIZED_NAME_IGNORE_SPECIAL_CHARACTER)
  private Boolean ignoreSpecialCharacter;

  public static final String SERIALIZED_NAME_PREPEND_ZEROES = "PrependZeroes";
  @SerializedName(SERIALIZED_NAME_PREPEND_ZEROES)
  private Boolean prependZeroes;

  public static final String SERIALIZED_NAME_OVERWRITE_REPEATING = "OverwriteRepeating";
  @SerializedName(SERIALIZED_NAME_OVERWRITE_REPEATING)
  private Boolean overwriteRepeating;

  public BusinessRegistrationNumberMask() {
  }

  public BusinessRegistrationNumberMask mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The mask used to validate the format of the business registration number
   * @return mask
  **/
  @javax.annotation.Nullable

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public BusinessRegistrationNumberMask ignoreWhitespace(Boolean ignoreWhitespace) {
    
    this.ignoreWhitespace = ignoreWhitespace;
    return this;
  }

   /**
   * Flag showing whether we can ignore whitespace
   * @return ignoreWhitespace
  **/
  @javax.annotation.Nullable

  public Boolean getIgnoreWhitespace() {
    return ignoreWhitespace;
  }


  public void setIgnoreWhitespace(Boolean ignoreWhitespace) {
    this.ignoreWhitespace = ignoreWhitespace;
  }


  public BusinessRegistrationNumberMask ignoreSpecialCharacter(Boolean ignoreSpecialCharacter) {
    
    this.ignoreSpecialCharacter = ignoreSpecialCharacter;
    return this;
  }

   /**
   * Flag showing whether we can ignore special character
   * @return ignoreSpecialCharacter
  **/
  @javax.annotation.Nullable

  public Boolean getIgnoreSpecialCharacter() {
    return ignoreSpecialCharacter;
  }


  public void setIgnoreSpecialCharacter(Boolean ignoreSpecialCharacter) {
    this.ignoreSpecialCharacter = ignoreSpecialCharacter;
  }


  public BusinessRegistrationNumberMask prependZeroes(Boolean prependZeroes) {
    
    this.prependZeroes = prependZeroes;
    return this;
  }

   /**
   * Flag showing if 0s should be prepended to meet Mask Length
   * @return prependZeroes
  **/
  @javax.annotation.Nullable

  public Boolean getPrependZeroes() {
    return prependZeroes;
  }


  public void setPrependZeroes(Boolean prependZeroes) {
    this.prependZeroes = prependZeroes;
  }


  public BusinessRegistrationNumberMask overwriteRepeating(Boolean overwriteRepeating) {
    
    this.overwriteRepeating = overwriteRepeating;
    return this;
  }

   /**
   * Flag showing if repeating characters should be overwritten
   * @return overwriteRepeating
  **/
  @javax.annotation.Nullable

  public Boolean getOverwriteRepeating() {
    return overwriteRepeating;
  }


  public void setOverwriteRepeating(Boolean overwriteRepeating) {
    this.overwriteRepeating = overwriteRepeating;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRegistrationNumberMask businessRegistrationNumberMask = (BusinessRegistrationNumberMask) o;
    return Objects.equals(this.mask, businessRegistrationNumberMask.mask) &&
        Objects.equals(this.ignoreWhitespace, businessRegistrationNumberMask.ignoreWhitespace) &&
        Objects.equals(this.ignoreSpecialCharacter, businessRegistrationNumberMask.ignoreSpecialCharacter) &&
        Objects.equals(this.prependZeroes, businessRegistrationNumberMask.prependZeroes) &&
        Objects.equals(this.overwriteRepeating, businessRegistrationNumberMask.overwriteRepeating);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mask, ignoreWhitespace, ignoreSpecialCharacter, prependZeroes, overwriteRepeating);
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
    sb.append("class BusinessRegistrationNumberMask {\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    ignoreWhitespace: ").append(toIndentedString(ignoreWhitespace)).append("\n");
    sb.append("    ignoreSpecialCharacter: ").append(toIndentedString(ignoreSpecialCharacter)).append("\n");
    sb.append("    prependZeroes: ").append(toIndentedString(prependZeroes)).append("\n");
    sb.append("    overwriteRepeating: ").append(toIndentedString(overwriteRepeating)).append("\n");
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
    openapiFields.add("Mask");
    openapiFields.add("IgnoreWhitespace");
    openapiFields.add("IgnoreSpecialCharacter");
    openapiFields.add("PrependZeroes");
    openapiFields.add("OverwriteRepeating");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessRegistrationNumberMask
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessRegistrationNumberMask.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessRegistrationNumberMask is not found in the empty JSON string", BusinessRegistrationNumberMask.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessRegistrationNumberMask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessRegistrationNumberMask` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Mask") != null && !jsonObj.get("Mask").isJsonNull()) && !jsonObj.get("Mask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mask").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessRegistrationNumberMask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessRegistrationNumberMask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessRegistrationNumberMask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessRegistrationNumberMask.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessRegistrationNumberMask>() {
           @Override
           public void write(JsonWriter out, BusinessRegistrationNumberMask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessRegistrationNumberMask read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessRegistrationNumberMask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessRegistrationNumberMask
  * @throws IOException if the JSON string is invalid with respect to BusinessRegistrationNumberMask
  */
  public static BusinessRegistrationNumberMask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessRegistrationNumberMask.class);
  }

 /**
  * Convert an instance of BusinessRegistrationNumberMask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

