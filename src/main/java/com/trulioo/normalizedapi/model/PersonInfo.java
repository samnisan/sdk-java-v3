package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.PersonInfoAdditionalFields;
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
 * Personal Information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class PersonInfo {
  public static final String SERIALIZED_NAME_FIRST_GIVEN_NAME = "FirstGivenName";
  @SerializedName(SERIALIZED_NAME_FIRST_GIVEN_NAME)
  private String firstGivenName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "MiddleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_FIRST_SUR_NAME = "FirstSurName";
  @SerializedName(SERIALIZED_NAME_FIRST_SUR_NAME)
  private String firstSurName;

  public static final String SERIALIZED_NAME_SECOND_SURNAME = "SecondSurname";
  @SerializedName(SERIALIZED_NAME_SECOND_SURNAME)
  private String secondSurname;

  public static final String SERIALIZED_NAME_ISO_LATIN1_NAME = "isoLatin1Name";
  @SerializedName(SERIALIZED_NAME_ISO_LATIN1_NAME)
  private String isoLatin1Name;

  public static final String SERIALIZED_NAME_DAY_OF_BIRTH = "DayOfBirth";
  @SerializedName(SERIALIZED_NAME_DAY_OF_BIRTH)
  private Integer dayOfBirth;

  public static final String SERIALIZED_NAME_MONTH_OF_BIRTH = "MonthOfBirth";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_BIRTH)
  private Integer monthOfBirth;

  public static final String SERIALIZED_NAME_YEAR_OF_BIRTH = "YearOfBirth";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_BIRTH)
  private Integer yearOfBirth;

  public static final String SERIALIZED_NAME_MINIMUM_AGE = "MinimumAge";
  @SerializedName(SERIALIZED_NAME_MINIMUM_AGE)
  private Integer minimumAge;

  public static final String SERIALIZED_NAME_GENDER = "Gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_ADDITIONAL_FIELDS = "AdditionalFields";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_FIELDS)
  private PersonInfoAdditionalFields additionalFields;

  public PersonInfo() {
  }

  public PersonInfo firstGivenName(String firstGivenName) {
    
    this.firstGivenName = firstGivenName;
    return this;
  }

   /**
   * First name of the individual to be verified
   * @return firstGivenName
  **/
  @javax.annotation.Nullable

  public String getFirstGivenName() {
    return firstGivenName;
  }


  public void setFirstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
  }


  public PersonInfo middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Second given name of the individual to be verified
   * @return middleName
  **/
  @javax.annotation.Nullable

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public PersonInfo firstSurName(String firstSurName) {
    
    this.firstSurName = firstSurName;
    return this;
  }

   /**
   * First (paternal) family name of the individual to be verified
   * @return firstSurName
  **/
  @javax.annotation.Nullable

  public String getFirstSurName() {
    return firstSurName;
  }


  public void setFirstSurName(String firstSurName) {
    this.firstSurName = firstSurName;
  }


  public PersonInfo secondSurname(String secondSurname) {
    
    this.secondSurname = secondSurname;
    return this;
  }

   /**
   * second family name of the individual to be verified
   * @return secondSurname
  **/
  @javax.annotation.Nullable

  public String getSecondSurname() {
    return secondSurname;
  }


  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }


  public PersonInfo isoLatin1Name(String isoLatin1Name) {
    
    this.isoLatin1Name = isoLatin1Name;
    return this;
  }

   /**
   * Enter full name in ISO Latin-1 character set
   * @return isoLatin1Name
  **/
  @javax.annotation.Nullable

  public String getIsoLatin1Name() {
    return isoLatin1Name;
  }


  public void setIsoLatin1Name(String isoLatin1Name) {
    this.isoLatin1Name = isoLatin1Name;
  }


  public PersonInfo dayOfBirth(Integer dayOfBirth) {
    
    this.dayOfBirth = dayOfBirth;
    return this;
  }

   /**
   * Day of birth date (e.g. 23 for a date of birth of 23/11/1975)
   * @return dayOfBirth
  **/
  @javax.annotation.Nullable

  public Integer getDayOfBirth() {
    return dayOfBirth;
  }


  public void setDayOfBirth(Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }


  public PersonInfo monthOfBirth(Integer monthOfBirth) {
    
    this.monthOfBirth = monthOfBirth;
    return this;
  }

   /**
   * Month of birth date (e.g. 11 for a date of birth of 23/11/1975)
   * @return monthOfBirth
  **/
  @javax.annotation.Nullable

  public Integer getMonthOfBirth() {
    return monthOfBirth;
  }


  public void setMonthOfBirth(Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }


  public PersonInfo yearOfBirth(Integer yearOfBirth) {
    
    this.yearOfBirth = yearOfBirth;
    return this;
  }

   /**
   * Year of birth date (e.g. 1975 for a date of birth of 23/11/1975)
   * @return yearOfBirth
  **/
  @javax.annotation.Nullable

  public Integer getYearOfBirth() {
    return yearOfBirth;
  }


  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }


  public PersonInfo minimumAge(Integer minimumAge) {
    
    this.minimumAge = minimumAge;
    return this;
  }

   /**
   * Minimum permitted age of the individual
   * @return minimumAge
  **/
  @javax.annotation.Nullable

  public Integer getMinimumAge() {
    return minimumAge;
  }


  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }


  public PersonInfo gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Single character M / F (M &#x3D; Male, F &#x3D; Female)
   * @return gender
  **/
  @javax.annotation.Nullable

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public PersonInfo additionalFields(PersonInfoAdditionalFields additionalFields) {
    
    this.additionalFields = additionalFields;
    return this;
  }

   /**
   * Get additionalFields
   * @return additionalFields
  **/
  @javax.annotation.Nullable

  public PersonInfoAdditionalFields getAdditionalFields() {
    return additionalFields;
  }


  public void setAdditionalFields(PersonInfoAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonInfo personInfo = (PersonInfo) o;
    return Objects.equals(this.firstGivenName, personInfo.firstGivenName) &&
        Objects.equals(this.middleName, personInfo.middleName) &&
        Objects.equals(this.firstSurName, personInfo.firstSurName) &&
        Objects.equals(this.secondSurname, personInfo.secondSurname) &&
        Objects.equals(this.isoLatin1Name, personInfo.isoLatin1Name) &&
        Objects.equals(this.dayOfBirth, personInfo.dayOfBirth) &&
        Objects.equals(this.monthOfBirth, personInfo.monthOfBirth) &&
        Objects.equals(this.yearOfBirth, personInfo.yearOfBirth) &&
        Objects.equals(this.minimumAge, personInfo.minimumAge) &&
        Objects.equals(this.gender, personInfo.gender) &&
        Objects.equals(this.additionalFields, personInfo.additionalFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstGivenName, middleName, firstSurName, secondSurname, isoLatin1Name, dayOfBirth, monthOfBirth, yearOfBirth, minimumAge, gender, additionalFields);
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
    sb.append("class PersonInfo {\n");
    sb.append("    firstGivenName: ").append(toIndentedString(firstGivenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    firstSurName: ").append(toIndentedString(firstSurName)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    isoLatin1Name: ").append(toIndentedString(isoLatin1Name)).append("\n");
    sb.append("    dayOfBirth: ").append(toIndentedString(dayOfBirth)).append("\n");
    sb.append("    monthOfBirth: ").append(toIndentedString(monthOfBirth)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
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
    openapiFields.add("FirstSurName");
    openapiFields.add("SecondSurname");
    openapiFields.add("isoLatin1Name");
    openapiFields.add("DayOfBirth");
    openapiFields.add("MonthOfBirth");
    openapiFields.add("YearOfBirth");
    openapiFields.add("MinimumAge");
    openapiFields.add("Gender");
    openapiFields.add("AdditionalFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonInfo is not found in the empty JSON string", PersonInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FirstGivenName") != null && !jsonObj.get("FirstGivenName").isJsonNull()) && !jsonObj.get("FirstGivenName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstGivenName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstGivenName").toString()));
      }
      if ((jsonObj.get("MiddleName") != null && !jsonObj.get("MiddleName").isJsonNull()) && !jsonObj.get("MiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MiddleName").toString()));
      }
      if ((jsonObj.get("FirstSurName") != null && !jsonObj.get("FirstSurName").isJsonNull()) && !jsonObj.get("FirstSurName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstSurName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstSurName").toString()));
      }
      if ((jsonObj.get("SecondSurname") != null && !jsonObj.get("SecondSurname").isJsonNull()) && !jsonObj.get("SecondSurname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondSurname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondSurname").toString()));
      }
      if ((jsonObj.get("isoLatin1Name") != null && !jsonObj.get("isoLatin1Name").isJsonNull()) && !jsonObj.get("isoLatin1Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isoLatin1Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isoLatin1Name").toString()));
      }
      if ((jsonObj.get("Gender") != null && !jsonObj.get("Gender").isJsonNull()) && !jsonObj.get("Gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Gender").toString()));
      }
      // validate the optional field `AdditionalFields`
      if (jsonObj.get("AdditionalFields") != null && !jsonObj.get("AdditionalFields").isJsonNull()) {
        PersonInfoAdditionalFields.validateJsonObject(jsonObj.getAsJsonObject("AdditionalFields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonInfo>() {
           @Override
           public void write(JsonWriter out, PersonInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonInfo
  * @throws IOException if the JSON string is invalid with respect to PersonInfo
  */
  public static PersonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonInfo.class);
  }

 /**
  * Convert an instance of PersonInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

