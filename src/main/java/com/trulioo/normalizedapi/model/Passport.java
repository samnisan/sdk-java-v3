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

public class Passport {
  public static final String SERIALIZED_NAME_MRZ1 = "Mrz1";
  @SerializedName(SERIALIZED_NAME_MRZ1)
  private String mrz1;

  public static final String SERIALIZED_NAME_MRZ2 = "Mrz2";
  @SerializedName(SERIALIZED_NAME_MRZ2)
  private String mrz2;

  public static final String SERIALIZED_NAME_NUMBER = "Number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_DAY_OF_EXPIRY = "DayOfExpiry";
  @SerializedName(SERIALIZED_NAME_DAY_OF_EXPIRY)
  private Integer dayOfExpiry;

  public static final String SERIALIZED_NAME_MONTH_OF_EXPIRY = "MonthOfExpiry";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_EXPIRY)
  private Integer monthOfExpiry;

  public static final String SERIALIZED_NAME_YEAR_OF_EXPIRY = "YearOfExpiry";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_EXPIRY)
  private Integer yearOfExpiry;

  public Passport() {
  }

  public Passport mrz1(String mrz1) {
    
    this.mrz1 = mrz1;
    return this;
  }

   /**
   * Line 1 of the passport MRZ
   * @return mrz1
  **/
  @javax.annotation.Nullable

  public String getMrz1() {
    return mrz1;
  }


  public void setMrz1(String mrz1) {
    this.mrz1 = mrz1;
  }


  public Passport mrz2(String mrz2) {
    
    this.mrz2 = mrz2;
    return this;
  }

   /**
   * line 2 of the passport MRZ
   * @return mrz2
  **/
  @javax.annotation.Nullable

  public String getMrz2() {
    return mrz2;
  }


  public void setMrz2(String mrz2) {
    this.mrz2 = mrz2;
  }


  public Passport number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Passport Number
   * @return number
  **/
  @javax.annotation.Nullable

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public Passport dayOfExpiry(Integer dayOfExpiry) {
    
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  @javax.annotation.Nullable

  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }


  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }


  public Passport monthOfExpiry(Integer monthOfExpiry) {
    
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  @javax.annotation.Nullable

  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }


  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }


  public Passport yearOfExpiry(Integer yearOfExpiry) {
    
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence year of expiry of the individual to be verified
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
    Passport passport = (Passport) o;
    return Objects.equals(this.mrz1, passport.mrz1) &&
        Objects.equals(this.mrz2, passport.mrz2) &&
        Objects.equals(this.number, passport.number) &&
        Objects.equals(this.dayOfExpiry, passport.dayOfExpiry) &&
        Objects.equals(this.monthOfExpiry, passport.monthOfExpiry) &&
        Objects.equals(this.yearOfExpiry, passport.yearOfExpiry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrz1, mrz2, number, dayOfExpiry, monthOfExpiry, yearOfExpiry);
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
    sb.append("class Passport {\n");
    sb.append("    mrz1: ").append(toIndentedString(mrz1)).append("\n");
    sb.append("    mrz2: ").append(toIndentedString(mrz2)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("Mrz1");
    openapiFields.add("Mrz2");
    openapiFields.add("Number");
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
  * @throws IOException if the JSON Object is invalid with respect to Passport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Passport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Passport is not found in the empty JSON string", Passport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Passport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Passport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Mrz1") != null && !jsonObj.get("Mrz1").isJsonNull()) && !jsonObj.get("Mrz1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mrz1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mrz1").toString()));
      }
      if ((jsonObj.get("Mrz2") != null && !jsonObj.get("Mrz2").isJsonNull()) && !jsonObj.get("Mrz2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mrz2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mrz2").toString()));
      }
      if ((jsonObj.get("Number") != null && !jsonObj.get("Number").isJsonNull()) && !jsonObj.get("Number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Passport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Passport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Passport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Passport.class));

       return (TypeAdapter<T>) new TypeAdapter<Passport>() {
           @Override
           public void write(JsonWriter out, Passport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Passport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Passport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Passport
  * @throws IOException if the JSON string is invalid with respect to Passport
  */
  public static Passport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Passport.class);
  }

 /**
  * Convert an instance of Passport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

