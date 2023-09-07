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

public class DriverLicence {
  public static final String SERIALIZED_NAME_NUMBER = "Number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_DAY_OF_EXPIRY = "DayOfExpiry";
  @SerializedName(SERIALIZED_NAME_DAY_OF_EXPIRY)
  private Integer dayOfExpiry;

  public static final String SERIALIZED_NAME_MONTH_OF_EXPIRY = "MonthOfExpiry";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_EXPIRY)
  private Integer monthOfExpiry;

  public static final String SERIALIZED_NAME_YEAR_OF_EXPIRY = "YearOfExpiry";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_EXPIRY)
  private Integer yearOfExpiry;

  public DriverLicence() {
  }

  public DriverLicence number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Driver&#39;s Licence Number of the individual to be verified
   * @return number
  **/
  @javax.annotation.Nullable

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public DriverLicence state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of issue for Driver&#39;s Licence
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DriverLicence dayOfExpiry(Integer dayOfExpiry) {
    
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  @javax.annotation.Nullable

  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }


  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }


  public DriverLicence monthOfExpiry(Integer monthOfExpiry) {
    
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  @javax.annotation.Nullable

  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }


  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }


  public DriverLicence yearOfExpiry(Integer yearOfExpiry) {
    
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence year of expiry of the individual to be verified
   * @return yearOfExpiry
  **/
  @javax.annotation.Nullable

  public Integer getYearOfExpiry() {
    return yearOfExpiry;
  }


  public void setYearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverLicence driverLicence = (DriverLicence) o;
    return Objects.equals(this.number, driverLicence.number) &&
        Objects.equals(this.state, driverLicence.state) &&
        Objects.equals(this.dayOfExpiry, driverLicence.dayOfExpiry) &&
        Objects.equals(this.monthOfExpiry, driverLicence.monthOfExpiry) &&
        Objects.equals(this.yearOfExpiry, driverLicence.yearOfExpiry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, state, dayOfExpiry, monthOfExpiry, yearOfExpiry);
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
    sb.append("class DriverLicence {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dayOfExpiry: ").append(toIndentedString(dayOfExpiry)).append("\n");
    sb.append("    monthOfExpiry: ").append(toIndentedString(monthOfExpiry)).append("\n");
    sb.append("    yearOfExpiry: ").append(toIndentedString(yearOfExpiry)).append("\n");
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
    openapiFields.add("Number");
    openapiFields.add("State");
    openapiFields.add("DayOfExpiry");
    openapiFields.add("MonthOfExpiry");
    openapiFields.add("YearOfExpiry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DriverLicence
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DriverLicence.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DriverLicence is not found in the empty JSON string", DriverLicence.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DriverLicence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DriverLicence` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Number") != null && !jsonObj.get("Number").isJsonNull()) && !jsonObj.get("Number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Number").toString()));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DriverLicence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DriverLicence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DriverLicence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DriverLicence.class));

       return (TypeAdapter<T>) new TypeAdapter<DriverLicence>() {
           @Override
           public void write(JsonWriter out, DriverLicence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DriverLicence read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DriverLicence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DriverLicence
  * @throws IOException if the JSON string is invalid with respect to DriverLicence
  */
  public static DriverLicence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DriverLicence.class);
  }

 /**
  * Convert an instance of DriverLicence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

