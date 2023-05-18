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
 * The credentials submission call for the Normalized API is a POST method call
 */

public class SubmitAddressVerificationCredentialsRequest {
  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "TransactionID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private String transactionID;

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

  public SubmitAddressVerificationCredentialsRequest() {
  }

  public SubmitAddressVerificationCredentialsRequest transactionID(String transactionID) {
    
    this.transactionID = transactionID;
    return this;
  }

   /**
   * The id for the transaction will be a GUID
   * @return transactionID
  **/
  @javax.annotation.Nullable

  public String getTransactionID() {
    return transactionID;
  }


  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }


  public SubmitAddressVerificationCredentialsRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username for credentials
   * @return username
  **/
  @javax.annotation.Nullable

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public SubmitAddressVerificationCredentialsRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for credentials
   * @return password
  **/
  @javax.annotation.Nullable

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitAddressVerificationCredentialsRequest username2(String username2) {
    
    this.username2 = username2;
    return this;
  }

   /**
   * Additional username
   * @return username2
  **/
  @javax.annotation.Nullable

  public String getUsername2() {
    return username2;
  }


  public void setUsername2(String username2) {
    this.username2 = username2;
  }


  public SubmitAddressVerificationCredentialsRequest password2(String password2) {
    
    this.password2 = password2;
    return this;
  }

   /**
   * Additional password
   * @return password2
  **/
  @javax.annotation.Nullable

  public String getPassword2() {
    return password2;
  }


  public void setPassword2(String password2) {
    this.password2 = password2;
  }


  public SubmitAddressVerificationCredentialsRequest username3(String username3) {
    
    this.username3 = username3;
    return this;
  }

   /**
   * Additional username
   * @return username3
  **/
  @javax.annotation.Nullable

  public String getUsername3() {
    return username3;
  }


  public void setUsername3(String username3) {
    this.username3 = username3;
  }


  public SubmitAddressVerificationCredentialsRequest password3(String password3) {
    
    this.password3 = password3;
    return this;
  }

   /**
   * Additional password
   * @return password3
  **/
  @javax.annotation.Nullable

  public String getPassword3() {
    return password3;
  }


  public void setPassword3(String password3) {
    this.password3 = password3;
  }


  public SubmitAddressVerificationCredentialsRequest username4(String username4) {
    
    this.username4 = username4;
    return this;
  }

   /**
   * Additional username
   * @return username4
  **/
  @javax.annotation.Nullable

  public String getUsername4() {
    return username4;
  }


  public void setUsername4(String username4) {
    this.username4 = username4;
  }


  public SubmitAddressVerificationCredentialsRequest password4(String password4) {
    
    this.password4 = password4;
    return this;
  }

   /**
   * Additional password
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
    SubmitAddressVerificationCredentialsRequest submitAddressVerificationCredentialsRequest = (SubmitAddressVerificationCredentialsRequest) o;
    return Objects.equals(this.transactionID, submitAddressVerificationCredentialsRequest.transactionID) &&
        Objects.equals(this.username, submitAddressVerificationCredentialsRequest.username) &&
        Objects.equals(this.password, submitAddressVerificationCredentialsRequest.password) &&
        Objects.equals(this.username2, submitAddressVerificationCredentialsRequest.username2) &&
        Objects.equals(this.password2, submitAddressVerificationCredentialsRequest.password2) &&
        Objects.equals(this.username3, submitAddressVerificationCredentialsRequest.username3) &&
        Objects.equals(this.password3, submitAddressVerificationCredentialsRequest.password3) &&
        Objects.equals(this.username4, submitAddressVerificationCredentialsRequest.username4) &&
        Objects.equals(this.password4, submitAddressVerificationCredentialsRequest.password4);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, username, password, username2, password2, username3, password3, username4, password4);
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
    sb.append("class SubmitAddressVerificationCredentialsRequest {\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
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
    openapiFields.add("TransactionID");
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
  * @throws IOException if the JSON Object is invalid with respect to SubmitAddressVerificationCredentialsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubmitAddressVerificationCredentialsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitAddressVerificationCredentialsRequest is not found in the empty JSON string", SubmitAddressVerificationCredentialsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitAddressVerificationCredentialsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitAddressVerificationCredentialsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TransactionID") != null && !jsonObj.get("TransactionID").isJsonNull()) && !jsonObj.get("TransactionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionID").toString()));
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
       if (!SubmitAddressVerificationCredentialsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitAddressVerificationCredentialsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitAddressVerificationCredentialsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitAddressVerificationCredentialsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitAddressVerificationCredentialsRequest>() {
           @Override
           public void write(JsonWriter out, SubmitAddressVerificationCredentialsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitAddressVerificationCredentialsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitAddressVerificationCredentialsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitAddressVerificationCredentialsRequest
  * @throws IOException if the JSON string is invalid with respect to SubmitAddressVerificationCredentialsRequest
  */
  public static SubmitAddressVerificationCredentialsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitAddressVerificationCredentialsRequest.class);
  }

 /**
  * Convert an instance of SubmitAddressVerificationCredentialsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

