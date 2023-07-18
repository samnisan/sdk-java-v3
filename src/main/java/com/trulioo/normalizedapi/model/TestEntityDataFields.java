/*
 * NAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.Business;
import com.trulioo.normalizedapi.model.Communication;
import com.trulioo.normalizedapi.model.Document;
import com.trulioo.normalizedapi.model.DriverLicence;
import com.trulioo.normalizedapi.model.Location;
import com.trulioo.normalizedapi.model.NationalId;
import com.trulioo.normalizedapi.model.Passport;
import com.trulioo.normalizedapi.model.PersonInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trulioo.normalizedapi.JSON;

/**
 * TestEntityDataFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-14T09:53:55.537580900-07:00[America/Los_Angeles]")
public class TestEntityDataFields {
  public static final String SERIALIZED_NAME_PERSON_INFO = "PersonInfo";
  @SerializedName(SERIALIZED_NAME_PERSON_INFO)
  private PersonInfo personInfo;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_COMMUNICATION = "Communication";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION)
  private Communication communication;

  public static final String SERIALIZED_NAME_DRIVER_LICENCE = "DriverLicence";
  @SerializedName(SERIALIZED_NAME_DRIVER_LICENCE)
  private DriverLicence driverLicence;

  public static final String SERIALIZED_NAME_NATIONAL_IDS = "NationalIds";
  @SerializedName(SERIALIZED_NAME_NATIONAL_IDS)
  private List<NationalId> nationalIds;

  public static final String SERIALIZED_NAME_PASSPORT = "Passport";
  @SerializedName(SERIALIZED_NAME_PASSPORT)
  private Passport passport;

  public static final String SERIALIZED_NAME_DOCUMENT = "Document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Document document;

  public static final String SERIALIZED_NAME_BUSINESS = "Business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private Business business;

  public static final String SERIALIZED_NAME_COUNTRY_SPECIFIC = "CountrySpecific";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SPECIFIC)
  private Map<String, Map<String, String>> countrySpecific;

  public static final String SERIALIZED_NAME_TEST_ENTITY_NAME = "TestEntityName";
  @SerializedName(SERIALIZED_NAME_TEST_ENTITY_NAME)
  private String testEntityName;

  public TestEntityDataFields() {
  }

  public TestEntityDataFields personInfo(PersonInfo personInfo) {
    
    this.personInfo = personInfo;
    return this;
  }

   /**
   * Get personInfo
   * @return personInfo
  **/
  @javax.annotation.Nullable
  public PersonInfo getPersonInfo() {
    return personInfo;
  }


  public void setPersonInfo(PersonInfo personInfo) {
    this.personInfo = personInfo;
  }


  public TestEntityDataFields location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public TestEntityDataFields communication(Communication communication) {
    
    this.communication = communication;
    return this;
  }

   /**
   * Get communication
   * @return communication
  **/
  @javax.annotation.Nullable
  public Communication getCommunication() {
    return communication;
  }


  public void setCommunication(Communication communication) {
    this.communication = communication;
  }


  public TestEntityDataFields driverLicence(DriverLicence driverLicence) {
    
    this.driverLicence = driverLicence;
    return this;
  }

   /**
   * Get driverLicence
   * @return driverLicence
  **/
  @javax.annotation.Nullable
  public DriverLicence getDriverLicence() {
    return driverLicence;
  }


  public void setDriverLicence(DriverLicence driverLicence) {
    this.driverLicence = driverLicence;
  }


  public TestEntityDataFields nationalIds(List<NationalId> nationalIds) {
    
    this.nationalIds = nationalIds;
    return this;
  }

  public TestEntityDataFields addNationalIdsItem(NationalId nationalIdsItem) {
    if (this.nationalIds == null) {
      this.nationalIds = new ArrayList<>();
    }
    this.nationalIds.add(nationalIdsItem);
    return this;
  }

   /**
   * National Identification Information
   * @return nationalIds
  **/
  @javax.annotation.Nullable
  public List<NationalId> getNationalIds() {
    return nationalIds;
  }


  public void setNationalIds(List<NationalId> nationalIds) {
    this.nationalIds = nationalIds;
  }


  public TestEntityDataFields passport(Passport passport) {
    
    this.passport = passport;
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
  @javax.annotation.Nullable
  public Passport getPassport() {
    return passport;
  }


  public void setPassport(Passport passport) {
    this.passport = passport;
  }


  public TestEntityDataFields document(Document document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  public Document getDocument() {
    return document;
  }


  public void setDocument(Document document) {
    this.document = document;
  }


  public TestEntityDataFields business(Business business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable
  public Business getBusiness() {
    return business;
  }


  public void setBusiness(Business business) {
    this.business = business;
  }


  public TestEntityDataFields countrySpecific(Map<String, Map<String, String>> countrySpecific) {
    
    this.countrySpecific = countrySpecific;
    return this;
  }

  public TestEntityDataFields putCountrySpecificItem(String key, Map<String, String> countrySpecificItem) {
    if (this.countrySpecific == null) {
      this.countrySpecific = new HashMap<>();
    }
    this.countrySpecific.put(key, countrySpecificItem);
    return this;
  }

   /**
   * CountrySpecific fields  {\&quot;Country\&quot; : {\&quot;Field1\&quot; : \&quot;Value\&quot;,  \&quot;Field2\&quot; : \&quot;Value\&quot;  }}
   * @return countrySpecific
  **/
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getCountrySpecific() {
    return countrySpecific;
  }


  public void setCountrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
  }


  public TestEntityDataFields testEntityName(String testEntityName) {
    
    this.testEntityName = testEntityName;
    return this;
  }

   /**
   * Friendly name for the test entity
   * @return testEntityName
  **/
  @javax.annotation.Nullable
  public String getTestEntityName() {
    return testEntityName;
  }


  public void setTestEntityName(String testEntityName) {
    this.testEntityName = testEntityName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestEntityDataFields testEntityDataFields = (TestEntityDataFields) o;
    return Objects.equals(this.personInfo, testEntityDataFields.personInfo) &&
        Objects.equals(this.location, testEntityDataFields.location) &&
        Objects.equals(this.communication, testEntityDataFields.communication) &&
        Objects.equals(this.driverLicence, testEntityDataFields.driverLicence) &&
        Objects.equals(this.nationalIds, testEntityDataFields.nationalIds) &&
        Objects.equals(this.passport, testEntityDataFields.passport) &&
        Objects.equals(this.document, testEntityDataFields.document) &&
        Objects.equals(this.business, testEntityDataFields.business) &&
        Objects.equals(this.countrySpecific, testEntityDataFields.countrySpecific) &&
        Objects.equals(this.testEntityName, testEntityDataFields.testEntityName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(personInfo, location, communication, driverLicence, nationalIds, passport, document, business, countrySpecific, testEntityName);
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
    sb.append("class TestEntityDataFields {\n");
    sb.append("    personInfo: ").append(toIndentedString(personInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    driverLicence: ").append(toIndentedString(driverLicence)).append("\n");
    sb.append("    nationalIds: ").append(toIndentedString(nationalIds)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    countrySpecific: ").append(toIndentedString(countrySpecific)).append("\n");
    sb.append("    testEntityName: ").append(toIndentedString(testEntityName)).append("\n");
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
    openapiFields.add("PersonInfo");
    openapiFields.add("Location");
    openapiFields.add("Communication");
    openapiFields.add("DriverLicence");
    openapiFields.add("NationalIds");
    openapiFields.add("Passport");
    openapiFields.add("Document");
    openapiFields.add("Business");
    openapiFields.add("Risk");
    openapiFields.add("CountrySpecific");
    openapiFields.add("TestEntityName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestEntityDataFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestEntityDataFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestEntityDataFields is not found in the empty JSON string", TestEntityDataFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestEntityDataFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestEntityDataFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `PersonInfo`
      if (jsonObj.get("PersonInfo") != null && !jsonObj.get("PersonInfo").isJsonNull()) {
        PersonInfo.validateJsonObject(jsonObj.getAsJsonObject("PersonInfo"));
      }
      // validate the optional field `Location`
      if (jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull()) {
        Location.validateJsonObject(jsonObj.getAsJsonObject("Location"));
      }
      // validate the optional field `Communication`
      if (jsonObj.get("Communication") != null && !jsonObj.get("Communication").isJsonNull()) {
        Communication.validateJsonObject(jsonObj.getAsJsonObject("Communication"));
      }
      // validate the optional field `DriverLicence`
      if (jsonObj.get("DriverLicence") != null && !jsonObj.get("DriverLicence").isJsonNull()) {
        DriverLicence.validateJsonObject(jsonObj.getAsJsonObject("DriverLicence"));
      }
      if (jsonObj.get("NationalIds") != null && !jsonObj.get("NationalIds").isJsonNull()) {
        JsonArray jsonArraynationalIds = jsonObj.getAsJsonArray("NationalIds");
        if (jsonArraynationalIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("NationalIds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `NationalIds` to be an array in the JSON string but got `%s`", jsonObj.get("NationalIds").toString()));
          }

          // validate the optional field `NationalIds` (array)
          for (int i = 0; i < jsonArraynationalIds.size(); i++) {
            NationalId.validateJsonObject(jsonArraynationalIds.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Passport`
      if (jsonObj.get("Passport") != null && !jsonObj.get("Passport").isJsonNull()) {
        Passport.validateJsonObject(jsonObj.getAsJsonObject("Passport"));
      }
      // validate the optional field `Document`
      if (jsonObj.get("Document") != null && !jsonObj.get("Document").isJsonNull()) {
        Document.validateJsonObject(jsonObj.getAsJsonObject("Document"));
      }
      // validate the optional field `Business`
      if (jsonObj.get("Business") != null && !jsonObj.get("Business").isJsonNull()) {
        Business.validateJsonObject(jsonObj.getAsJsonObject("Business"));
      }
      if ((jsonObj.get("TestEntityName") != null && !jsonObj.get("TestEntityName").isJsonNull()) && !jsonObj.get("TestEntityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TestEntityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TestEntityName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestEntityDataFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestEntityDataFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestEntityDataFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestEntityDataFields.class));

       return (TypeAdapter<T>) new TypeAdapter<TestEntityDataFields>() {
           @Override
           public void write(JsonWriter out, TestEntityDataFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestEntityDataFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestEntityDataFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestEntityDataFields
  * @throws IOException if the JSON string is invalid with respect to TestEntityDataFields
  */
  public static TestEntityDataFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestEntityDataFields.class);
  }

 /**
  * Convert an instance of TestEntityDataFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

