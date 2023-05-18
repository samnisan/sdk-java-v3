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
 * Fraud Monitoring (Risk) Information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class RiskMonitorSettings {
  public static final String SERIALIZED_NAME_FREQUENCY = "Frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private String frequency;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "CallbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_IP = "Ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_USER_AGENT = "UserAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_DEVICE_I_D = "DeviceID";
  @SerializedName(SERIALIZED_NAME_DEVICE_I_D)
  private String deviceID;

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public RiskMonitorSettings() {
  }

  public RiskMonitorSettings frequency(String frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency to run a fraud check on the enrolled entity
   * @return frequency
  **/
  @javax.annotation.Nullable

  public String getFrequency() {
    return frequency;
  }


  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public RiskMonitorSettings callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback Url for Fraud product
   * @return callbackUrl
  **/
  @javax.annotation.Nullable

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public RiskMonitorSettings ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP address of the end user
   * @return ip
  **/
  @javax.annotation.Nullable

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public RiskMonitorSettings email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of end user
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public RiskMonitorSettings action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Contextual input for datasource
   * @return action
  **/
  @javax.annotation.Nullable

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public RiskMonitorSettings userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User Agent of end user
   * @return userAgent
  **/
  @javax.annotation.Nullable

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public RiskMonitorSettings deviceID(String deviceID) {
    
    this.deviceID = deviceID;
    return this;
  }

   /**
   * Device ID of end user
   * @return deviceID
  **/
  @javax.annotation.Nullable

  public String getDeviceID() {
    return deviceID;
  }


  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }


  public RiskMonitorSettings phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of end user
   * @return phone
  **/
  @javax.annotation.Nullable

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskMonitorSettings riskMonitorSettings = (RiskMonitorSettings) o;
    return Objects.equals(this.frequency, riskMonitorSettings.frequency) &&
        Objects.equals(this.callbackUrl, riskMonitorSettings.callbackUrl) &&
        Objects.equals(this.ip, riskMonitorSettings.ip) &&
        Objects.equals(this.email, riskMonitorSettings.email) &&
        Objects.equals(this.action, riskMonitorSettings.action) &&
        Objects.equals(this.userAgent, riskMonitorSettings.userAgent) &&
        Objects.equals(this.deviceID, riskMonitorSettings.deviceID) &&
        Objects.equals(this.phone, riskMonitorSettings.phone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, callbackUrl, ip, email, action, userAgent, deviceID, phone);
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
    sb.append("class RiskMonitorSettings {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("Frequency");
    openapiFields.add("CallbackUrl");
    openapiFields.add("Ip");
    openapiFields.add("Email");
    openapiFields.add("Action");
    openapiFields.add("UserAgent");
    openapiFields.add("DeviceID");
    openapiFields.add("Phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskMonitorSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RiskMonitorSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskMonitorSettings is not found in the empty JSON string", RiskMonitorSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RiskMonitorSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RiskMonitorSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Frequency") != null && !jsonObj.get("Frequency").isJsonNull()) && !jsonObj.get("Frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Frequency").toString()));
      }
      if ((jsonObj.get("CallbackUrl") != null && !jsonObj.get("CallbackUrl").isJsonNull()) && !jsonObj.get("CallbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CallbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CallbackUrl").toString()));
      }
      if ((jsonObj.get("Ip") != null && !jsonObj.get("Ip").isJsonNull()) && !jsonObj.get("Ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Ip").toString()));
      }
      if ((jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) && !jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
      if ((jsonObj.get("Action") != null && !jsonObj.get("Action").isJsonNull()) && !jsonObj.get("Action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Action").toString()));
      }
      if ((jsonObj.get("UserAgent") != null && !jsonObj.get("UserAgent").isJsonNull()) && !jsonObj.get("UserAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserAgent").toString()));
      }
      if ((jsonObj.get("DeviceID") != null && !jsonObj.get("DeviceID").isJsonNull()) && !jsonObj.get("DeviceID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeviceID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DeviceID").toString()));
      }
      if ((jsonObj.get("Phone") != null && !jsonObj.get("Phone").isJsonNull()) && !jsonObj.get("Phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskMonitorSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskMonitorSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskMonitorSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskMonitorSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskMonitorSettings>() {
           @Override
           public void write(JsonWriter out, RiskMonitorSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RiskMonitorSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RiskMonitorSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskMonitorSettings
  * @throws IOException if the JSON string is invalid with respect to RiskMonitorSettings
  */
  public static RiskMonitorSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskMonitorSettings.class);
  }

 /**
  * Convert an instance of RiskMonitorSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

