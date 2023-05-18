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
 * VerifyAddressCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class VerifyAddressCredentials {
  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USERNAME2 = "Username2";
  @SerializedName(SERIALIZED_NAME_USERNAME2)
  private String username2;

  public static final String SERIALIZED_NAME_PASSWORD2 = "Password2";
  @SerializedName(SERIALIZED_NAME_PASSWORD2)
  private String password2;

  public static final String SERIALIZED_NAME_USERNAME3 = "Username3";
  @SerializedName(SERIALIZED_NAME_USERNAME3)
  private String username3;

  public static final String SERIALIZED_NAME_PASSWORD3 = "Password3";
  @SerializedName(SERIALIZED_NAME_PASSWORD3)
  private String password3;

  public static final String SERIALIZED_NAME_USERNAME4 = "Username4";
  @SerializedName(SERIALIZED_NAME_USERNAME4)
  private String username4;

  public static final String SERIALIZED_NAME_PASSWORD4 = "Password4";
  @SerializedName(SERIALIZED_NAME_PASSWORD4)
  private String password4;

  public VerifyAddressCredentials() {
  }

  public VerifyAddressCredentials username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public VerifyAddressCredentials password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public VerifyAddressCredentials username2(String username2) {
    
    this.username2 = username2;
    return this;
  }

   /**
   * Get username2
   * @return username2
  **/
  @javax.annotation.Nullable

  public String getUsername2() {
    return username2;
  }


  public void setUsername2(String username2) {
    this.username2 = username2;
  }


  public VerifyAddressCredentials password2(String password2) {
    
    this.password2 = password2;
    return this;
  }

   /**
   * Get password2
   * @return password2
  **/
  @javax.annotation.Nullable

  public String getPassword2() {
    return password2;
  }


  public void setPassword2(String password2) {
    this.password2 = password2;
  }


  public VerifyAddressCredentials username3(String username3) {
    
    this.username3 = username3;
    return this;
  }

   /**
   * Get username3
   * @return username3
  **/
  @javax.annotation.Nullable

  public String getUsername3() {
    return username3;
  }


  public void setUsername3(String username3) {
    this.username3 = username3;
  }


  public VerifyAddressCredentials password3(String password3) {
    
    this.password3 = password3;
    return this;
  }

   /**
   * Get password3
   * @return password3
  **/
  @javax.annotation.Nullable

  public String getPassword3() {
    return password3;
  }


  public void setPassword3(String password3) {
    this.password3 = password3;
  }


  public VerifyAddressCredentials username4(String username4) {
    
    this.username4 = username4;
    return this;
  }

   /**
   * Get username4
   * @return username4
  **/
  @javax.annotation.Nullable

  public String getUsername4() {
    return username4;
  }


  public void setUsername4(String username4) {
    this.username4 = username4;
  }


  public VerifyAddressCredentials password4(String password4) {
    
    this.password4 = password4;
    return this;
  }

   /**
   * Get password4
   * @return password4
  **/
  @javax.annotation.Nullable

  public String getPassword4() {
    return password4;
  }


  public void setPassword4(String password4) {
    this.password4 = password4;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyAddressCredentials verifyAddressCredentials = (VerifyAddressCredentials) o;
    return Objects.equals(this.username, verifyAddressCredentials.username) &&
        Objects.equals(this.password, verifyAddressCredentials.password) &&
        Objects.equals(this.username2, verifyAddressCredentials.username2) &&
        Objects.equals(this.password2, verifyAddressCredentials.password2) &&
        Objects.equals(this.username3, verifyAddressCredentials.username3) &&
        Objects.equals(this.password3, verifyAddressCredentials.password3) &&
        Objects.equals(this.username4, verifyAddressCredentials.username4) &&
        Objects.equals(this.password4, verifyAddressCredentials.password4);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, username2, password2, username3, password3, username4, password4);
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
    sb.append("class VerifyAddressCredentials {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username2: ").append(toIndentedString(username2)).append("\n");
    sb.append("    password2: ").append(toIndentedString(password2)).append("\n");
    sb.append("    username3: ").append(toIndentedString(username3)).append("\n");
    sb.append("    password3: ").append(toIndentedString(password3)).append("\n");
    sb.append("    username4: ").append(toIndentedString(username4)).append("\n");
    sb.append("    password4: ").append(toIndentedString(password4)).append("\n");
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
    openapiFields.add("Username");
    openapiFields.add("Password");
    openapiFields.add("Username2");
    openapiFields.add("Password2");
    openapiFields.add("Username3");
    openapiFields.add("Password3");
    openapiFields.add("Username4");
    openapiFields.add("Password4");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyAddressCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyAddressCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyAddressCredentials is not found in the empty JSON string", VerifyAddressCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerifyAddressCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyAddressCredentials` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Username") != null && !jsonObj.get("Username").isJsonNull()) && !jsonObj.get("Username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username").toString()));
      }
      if ((jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) && !jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
      if ((jsonObj.get("Username2") != null && !jsonObj.get("Username2").isJsonNull()) && !jsonObj.get("Username2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username2").toString()));
      }
      if ((jsonObj.get("Password2") != null && !jsonObj.get("Password2").isJsonNull()) && !jsonObj.get("Password2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password2").toString()));
      }
      if ((jsonObj.get("Username3") != null && !jsonObj.get("Username3").isJsonNull()) && !jsonObj.get("Username3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username3").toString()));
      }
      if ((jsonObj.get("Password3") != null && !jsonObj.get("Password3").isJsonNull()) && !jsonObj.get("Password3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password3").toString()));
      }
      if ((jsonObj.get("Username4") != null && !jsonObj.get("Username4").isJsonNull()) && !jsonObj.get("Username4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username4").toString()));
      }
      if ((jsonObj.get("Password4") != null && !jsonObj.get("Password4").isJsonNull()) && !jsonObj.get("Password4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password4").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyAddressCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyAddressCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyAddressCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyAddressCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyAddressCredentials>() {
           @Override
           public void write(JsonWriter out, VerifyAddressCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyAddressCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifyAddressCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyAddressCredentials
  * @throws IOException if the JSON string is invalid with respect to VerifyAddressCredentials
  */
  public static VerifyAddressCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyAddressCredentials.class);
  }

 /**
  * Convert an instance of VerifyAddressCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

