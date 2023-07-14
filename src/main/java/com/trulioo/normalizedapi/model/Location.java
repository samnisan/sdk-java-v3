package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.LocationAdditionalFields;
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

public class Location {
  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "BuildingNumber";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "BuildingName";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_UNIT_NUMBER = "UnitNumber";
  @SerializedName(SERIALIZED_NAME_UNIT_NUMBER)
  private String unitNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "StreetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_STREET_TYPE = "StreetType";
  @SerializedName(SERIALIZED_NAME_STREET_TYPE)
  private String streetType;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_SUBURB = "Suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_COUNTY = "County";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county;

  public static final String SERIALIZED_NAME_STATE_PROVINCE_CODE = "StateProvinceCode";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE_CODE)
  private String stateProvinceCode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PO_BOX = "POBox";
  @SerializedName(SERIALIZED_NAME_PO_BOX)
  private String poBox;

  public static final String SERIALIZED_NAME_ADDITIONAL_FIELDS = "AdditionalFields";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_FIELDS)
  private LocationAdditionalFields additionalFields;

  public Location() {
  }

  public Location buildingNumber(String buildingNumber) {
    
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * House / Civic / Building number of home address
   * @return buildingNumber
  **/
  @javax.annotation.Nullable

  public String getBuildingNumber() {
    return buildingNumber;
  }


  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public Location buildingName(String buildingName) {
    
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Name of building of home address
   * @return buildingName
  **/
  @javax.annotation.Nullable

  public String getBuildingName() {
    return buildingName;
  }


  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public Location unitNumber(String unitNumber) {
    
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Flat/Unit/Apartment number of home address
   * @return unitNumber
  **/
  @javax.annotation.Nullable

  public String getUnitNumber() {
    return unitNumber;
  }


  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }


  public Location streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name of primary residence
   * @return streetName
  **/
  @javax.annotation.Nullable

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public Location streetType(String streetType) {
    
    this.streetType = streetType;
    return this;
  }

   /**
   * Street type of primary residence (e.g. St, Rd etc)
   * @return streetType
  **/
  @javax.annotation.Nullable

  public String getStreetType() {
    return streetType;
  }


  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }


  public Location city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of home address
   * @return city
  **/
  @javax.annotation.Nullable

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Location suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * Suburb / Subdivision / Municipality of home address
   * @return suburb
  **/
  @javax.annotation.Nullable

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public Location county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * County / District of home address
   * @return county
  **/
  @javax.annotation.Nullable

  public String getCounty() {
    return county;
  }


  public void setCounty(String county) {
    this.county = county;
  }


  public Location stateProvinceCode(String stateProvinceCode) {
    
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * State of primary residence. US sources expect 2 characters. Australian sources expect 2 or 3 characters.
   * @return stateProvinceCode
  **/
  @javax.annotation.Nullable

  public String getStateProvinceCode() {
    return stateProvinceCode;
  }


  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }


  public Location country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of physical address (ISO 3166-1 alpha-2)
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Location postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP Code or Postal Code of home address
   * @return postalCode
  **/
  @javax.annotation.Nullable

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Location poBox(String poBox) {
    
    this.poBox = poBox;
    return this;
  }

   /**
   * Post Office Box
   * @return poBox
  **/
  @javax.annotation.Nullable

  public String getPoBox() {
    return poBox;
  }


  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }


  public Location additionalFields(LocationAdditionalFields additionalFields) {
    
    this.additionalFields = additionalFields;
    return this;
  }

   /**
   * Get additionalFields
   * @return additionalFields
  **/
  @javax.annotation.Nullable

  public LocationAdditionalFields getAdditionalFields() {
    return additionalFields;
  }


  public void setAdditionalFields(LocationAdditionalFields additionalFields) {
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
    Location location = (Location) o;
    return Objects.equals(this.buildingNumber, location.buildingNumber) &&
        Objects.equals(this.buildingName, location.buildingName) &&
        Objects.equals(this.unitNumber, location.unitNumber) &&
        Objects.equals(this.streetName, location.streetName) &&
        Objects.equals(this.streetType, location.streetType) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.suburb, location.suburb) &&
        Objects.equals(this.county, location.county) &&
        Objects.equals(this.stateProvinceCode, location.stateProvinceCode) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.poBox, location.poBox) &&
        Objects.equals(this.additionalFields, location.additionalFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingNumber, buildingName, unitNumber, streetName, streetType, city, suburb, county, stateProvinceCode, country, postalCode, poBox, additionalFields);
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
    sb.append("class Location {\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
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
    openapiFields.add("BuildingNumber");
    openapiFields.add("BuildingName");
    openapiFields.add("UnitNumber");
    openapiFields.add("StreetName");
    openapiFields.add("StreetType");
    openapiFields.add("City");
    openapiFields.add("Suburb");
    openapiFields.add("County");
    openapiFields.add("StateProvinceCode");
    openapiFields.add("Country");
    openapiFields.add("PostalCode");
    openapiFields.add("poBox");
    openapiFields.add("AdditionalFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Location
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Location.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Location is not found in the empty JSON string", Location.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Location.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Location` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("BuildingNumber") != null && !jsonObj.get("BuildingNumber").isJsonNull()) && !jsonObj.get("BuildingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildingNumber").toString()));
      }
      if ((jsonObj.get("BuildingName") != null && !jsonObj.get("BuildingName").isJsonNull()) && !jsonObj.get("BuildingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildingName").toString()));
      }
      if ((jsonObj.get("UnitNumber") != null && !jsonObj.get("UnitNumber").isJsonNull()) && !jsonObj.get("UnitNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UnitNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UnitNumber").toString()));
      }
      if ((jsonObj.get("StreetName") != null && !jsonObj.get("StreetName").isJsonNull()) && !jsonObj.get("StreetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreetName").toString()));
      }
      if ((jsonObj.get("StreetType") != null && !jsonObj.get("StreetType").isJsonNull()) && !jsonObj.get("StreetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreetType").toString()));
      }
      if ((jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull()) && !jsonObj.get("City").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `City` to be a primitive type in the JSON string but got `%s`", jsonObj.get("City").toString()));
      }
      if ((jsonObj.get("Suburb") != null && !jsonObj.get("Suburb").isJsonNull()) && !jsonObj.get("Suburb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Suburb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Suburb").toString()));
      }
      if ((jsonObj.get("County") != null && !jsonObj.get("County").isJsonNull()) && !jsonObj.get("County").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `County` to be a primitive type in the JSON string but got `%s`", jsonObj.get("County").toString()));
      }
      if ((jsonObj.get("StateProvinceCode") != null && !jsonObj.get("StateProvinceCode").isJsonNull()) && !jsonObj.get("StateProvinceCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StateProvinceCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StateProvinceCode").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("PostalCode") != null && !jsonObj.get("PostalCode").isJsonNull()) && !jsonObj.get("PostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PostalCode").toString()));
      }
      if ((jsonObj.get("poBox") != null && !jsonObj.get("poBox").isJsonNull()) && !jsonObj.get("poBox").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poBox` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poBox").toString()));
      }
      // validate the optional field `AdditionalFields`
      if (jsonObj.get("AdditionalFields") != null && !jsonObj.get("AdditionalFields").isJsonNull()) {
        LocationAdditionalFields.validateJsonObject(jsonObj.getAsJsonObject("AdditionalFields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Location.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Location' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Location> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Location.class));

       return (TypeAdapter<T>) new TypeAdapter<Location>() {
           @Override
           public void write(JsonWriter out, Location value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Location read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Location given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Location
  * @throws IOException if the JSON string is invalid with respect to Location
  */
  public static Location fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Location.class);
  }

 /**
  * Convert an instance of Location to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

