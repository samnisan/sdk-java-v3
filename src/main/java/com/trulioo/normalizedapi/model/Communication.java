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

public class Communication {
  public static final String SERIALIZED_NAME_MOBILE_NUMBER = "MobileNumber";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
  private String mobileNumber;

  public static final String SERIALIZED_NAME_TELEPHONE = "Telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TELEPHONE2 = "Telephone2";
  @SerializedName(SERIALIZED_NAME_TELEPHONE2)
  private String telephone2;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public Communication() {
  }

  public Communication mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile phone number
   * @return mobileNumber
  **/
  @javax.annotation.Nullable

  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  public Communication telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * Telephone number of the individual to be verified
   * @return telephone
  **/
  @javax.annotation.Nullable

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Communication telephone2(String telephone2) {
    
    this.telephone2 = telephone2;
    return this;
  }

   /**
   * Additional Phone/Mobile Number of the individual to be verified
   * @return telephone2
  **/
  @javax.annotation.Nullable

  public String getTelephone2() {
    return telephone2;
  }


  public void setTelephone2(String telephone2) {
    this.telephone2 = telephone2;
  }


  public Communication emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of the individual to be verified
   * @return emailAddress
  **/
  @javax.annotation.Nullable

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Communication communication = (Communication) o;
    return Objects.equals(this.mobileNumber, communication.mobileNumber) &&
        Objects.equals(this.telephone, communication.telephone) &&
        Objects.equals(this.telephone2, communication.telephone2) &&
        Objects.equals(this.emailAddress, communication.emailAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNumber, telephone, telephone2, emailAddress);
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
    sb.append("class Communication {\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    telephone2: ").append(toIndentedString(telephone2)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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
    openapiFields.add("MobileNumber");
    openapiFields.add("Telephone");
    openapiFields.add("Telephone2");
    openapiFields.add("EmailAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Communication
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Communication.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Communication is not found in the empty JSON string", Communication.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Communication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Communication` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MobileNumber") != null && !jsonObj.get("MobileNumber").isJsonNull()) && !jsonObj.get("MobileNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MobileNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MobileNumber").toString()));
      }
      if ((jsonObj.get("Telephone") != null && !jsonObj.get("Telephone").isJsonNull()) && !jsonObj.get("Telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Telephone").toString()));
      }
      if ((jsonObj.get("Telephone2") != null && !jsonObj.get("Telephone2").isJsonNull()) && !jsonObj.get("Telephone2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Telephone2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Telephone2").toString()));
      }
      if ((jsonObj.get("EmailAddress") != null && !jsonObj.get("EmailAddress").isJsonNull()) && !jsonObj.get("EmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmailAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Communication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Communication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Communication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Communication.class));

       return (TypeAdapter<T>) new TypeAdapter<Communication>() {
           @Override
           public void write(JsonWriter out, Communication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Communication read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Communication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Communication
  * @throws IOException if the JSON string is invalid with respect to Communication
  */
  public static Communication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Communication.class);
  }

 /**
  * Convert an instance of Communication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

