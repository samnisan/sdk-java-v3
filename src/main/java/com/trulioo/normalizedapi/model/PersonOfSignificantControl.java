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
 * PersonOfSignificantControl
 */

public class PersonOfSignificantControl {
  public static final String SERIALIZED_NAME_FIRST_GIVEN_NAME = "FirstGivenName";
  @SerializedName(SERIALIZED_NAME_FIRST_GIVEN_NAME)
  private String firstGivenName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "MiddleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_FIRST_SURNAME = "FirstSurname";
  @SerializedName(SERIALIZED_NAME_FIRST_SURNAME)
  private String firstSurname;

  public static final String SERIALIZED_NAME_SECOND_SURNAME = "SecondSurname";
  @SerializedName(SERIALIZED_NAME_SECOND_SURNAME)
  private String secondSurname;

  public static final String SERIALIZED_NAME_FULL_NAME = "FullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "BusinessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_YEAR_OF_BIRTH = "YearOfBirth";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_BIRTH)
  private String yearOfBirth;

  public static final String SERIALIZED_NAME_MONTH_OF_BIRTH = "MonthOfBirth";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_BIRTH)
  private String monthOfBirth;

  public static final String SERIALIZED_NAME_DAY_OF_BIRTH = "DayOfBirth";
  @SerializedName(SERIALIZED_NAME_DAY_OF_BIRTH)
  private String dayOfBirth;

  public PersonOfSignificantControl() {
  }

  public PersonOfSignificantControl firstGivenName(String firstGivenName) {
    
    this.firstGivenName = firstGivenName;
    return this;
  }

   /**
   * Get firstGivenName
   * @return firstGivenName
  **/
  @javax.annotation.Nullable

  public String getFirstGivenName() {
    return firstGivenName;
  }


  public void setFirstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
  }


  public PersonOfSignificantControl middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public PersonOfSignificantControl firstSurname(String firstSurname) {
    
    this.firstSurname = firstSurname;
    return this;
  }

   /**
   * Get firstSurname
   * @return firstSurname
  **/
  @javax.annotation.Nullable

  public String getFirstSurname() {
    return firstSurname;
  }


  public void setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
  }


  public PersonOfSignificantControl secondSurname(String secondSurname) {
    
    this.secondSurname = secondSurname;
    return this;
  }

   /**
   * Get secondSurname
   * @return secondSurname
  **/
  @javax.annotation.Nullable

  public String getSecondSurname() {
    return secondSurname;
  }


  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }


  public PersonOfSignificantControl fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public PersonOfSignificantControl businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @javax.annotation.Nullable

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public PersonOfSignificantControl yearOfBirth(String yearOfBirth) {
    
    this.yearOfBirth = yearOfBirth;
    return this;
  }

   /**
   * Get yearOfBirth
   * @return yearOfBirth
  **/
  @javax.annotation.Nullable

  public String getYearOfBirth() {
    return yearOfBirth;
  }


  public void setYearOfBirth(String yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }


  public PersonOfSignificantControl monthOfBirth(String monthOfBirth) {
    
    this.monthOfBirth = monthOfBirth;
    return this;
  }

   /**
   * Get monthOfBirth
   * @return monthOfBirth
  **/
  @javax.annotation.Nullable

  public String getMonthOfBirth() {
    return monthOfBirth;
  }


  public void setMonthOfBirth(String monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }


  public PersonOfSignificantControl dayOfBirth(String dayOfBirth) {
    
    this.dayOfBirth = dayOfBirth;
    return this;
  }

   /**
   * Get dayOfBirth
   * @return dayOfBirth
  **/
  @javax.annotation.Nullable

  public String getDayOfBirth() {
    return dayOfBirth;
  }


  public void setDayOfBirth(String dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonOfSignificantControl personOfSignificantControl = (PersonOfSignificantControl) o;
    return Objects.equals(this.firstGivenName, personOfSignificantControl.firstGivenName) &&
        Objects.equals(this.middleName, personOfSignificantControl.middleName) &&
        Objects.equals(this.firstSurname, personOfSignificantControl.firstSurname) &&
        Objects.equals(this.secondSurname, personOfSignificantControl.secondSurname) &&
        Objects.equals(this.fullName, personOfSignificantControl.fullName) &&
        Objects.equals(this.businessName, personOfSignificantControl.businessName) &&
        Objects.equals(this.yearOfBirth, personOfSignificantControl.yearOfBirth) &&
        Objects.equals(this.monthOfBirth, personOfSignificantControl.monthOfBirth) &&
        Objects.equals(this.dayOfBirth, personOfSignificantControl.dayOfBirth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstGivenName, middleName, firstSurname, secondSurname, fullName, businessName, yearOfBirth, monthOfBirth, dayOfBirth);
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
    sb.append("class PersonOfSignificantControl {\n");
    sb.append("    firstGivenName: ").append(toIndentedString(firstGivenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
    sb.append("    monthOfBirth: ").append(toIndentedString(monthOfBirth)).append("\n");
    sb.append("    dayOfBirth: ").append(toIndentedString(dayOfBirth)).append("\n");
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
    openapiFields.add("FirstGivenName");
    openapiFields.add("MiddleName");
    openapiFields.add("FirstSurname");
    openapiFields.add("SecondSurname");
    openapiFields.add("FullName");
    openapiFields.add("BusinessName");
    openapiFields.add("YearOfBirth");
    openapiFields.add("MonthOfBirth");
    openapiFields.add("DayOfBirth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonOfSignificantControl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonOfSignificantControl.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonOfSignificantControl is not found in the empty JSON string", PersonOfSignificantControl.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonOfSignificantControl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonOfSignificantControl` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FirstGivenName") != null && !jsonObj.get("FirstGivenName").isJsonNull()) && !jsonObj.get("FirstGivenName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstGivenName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstGivenName").toString()));
      }
      if ((jsonObj.get("MiddleName") != null && !jsonObj.get("MiddleName").isJsonNull()) && !jsonObj.get("MiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MiddleName").toString()));
      }
      if ((jsonObj.get("FirstSurname") != null && !jsonObj.get("FirstSurname").isJsonNull()) && !jsonObj.get("FirstSurname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstSurname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstSurname").toString()));
      }
      if ((jsonObj.get("SecondSurname") != null && !jsonObj.get("SecondSurname").isJsonNull()) && !jsonObj.get("SecondSurname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondSurname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondSurname").toString()));
      }
      if ((jsonObj.get("FullName") != null && !jsonObj.get("FullName").isJsonNull()) && !jsonObj.get("FullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FullName").toString()));
      }
      if ((jsonObj.get("BusinessName") != null && !jsonObj.get("BusinessName").isJsonNull()) && !jsonObj.get("BusinessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessName").toString()));
      }
      if ((jsonObj.get("YearOfBirth") != null && !jsonObj.get("YearOfBirth").isJsonNull()) && !jsonObj.get("YearOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `YearOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("YearOfBirth").toString()));
      }
      if ((jsonObj.get("MonthOfBirth") != null && !jsonObj.get("MonthOfBirth").isJsonNull()) && !jsonObj.get("MonthOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MonthOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MonthOfBirth").toString()));
      }
      if ((jsonObj.get("DayOfBirth") != null && !jsonObj.get("DayOfBirth").isJsonNull()) && !jsonObj.get("DayOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DayOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DayOfBirth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonOfSignificantControl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonOfSignificantControl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonOfSignificantControl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonOfSignificantControl.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonOfSignificantControl>() {
           @Override
           public void write(JsonWriter out, PersonOfSignificantControl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonOfSignificantControl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonOfSignificantControl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonOfSignificantControl
  * @throws IOException if the JSON string is invalid with respect to PersonOfSignificantControl
  */
  public static PersonOfSignificantControl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonOfSignificantControl.class);
  }

 /**
  * Convert an instance of PersonOfSignificantControl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

