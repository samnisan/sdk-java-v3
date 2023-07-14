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

public class BusinessLocation {
  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

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

  public static final String SERIALIZED_NAME_ADDRESS1 = "Address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public BusinessLocation() {
  }

  public BusinessLocation index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * The index in the list of locations.  Currently only 1 and 2 are valid if in a collection of more than 1
   * @return index
  **/
  @javax.annotation.Nullable

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public BusinessLocation buildingNumber(String buildingNumber) {
    
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


  public BusinessLocation buildingName(String buildingName) {
    
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


  public BusinessLocation unitNumber(String unitNumber) {
    
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


  public BusinessLocation streetName(String streetName) {
    
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


  public BusinessLocation streetType(String streetType) {
    
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


  public BusinessLocation city(String city) {
    
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


  public BusinessLocation suburb(String suburb) {
    
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


  public BusinessLocation county(String county) {
    
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


  public BusinessLocation stateProvinceCode(String stateProvinceCode) {
    
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


  public BusinessLocation country(String country) {
    
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


  public BusinessLocation postalCode(String postalCode) {
    
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


  public BusinessLocation poBox(String poBox) {
    
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


  public BusinessLocation address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * A non-segmented version of the first line of the address
   * @return address1
  **/
  @javax.annotation.Nullable

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLocation businessLocation = (BusinessLocation) o;
    return Objects.equals(this.index, businessLocation.index) &&
        Objects.equals(this.buildingNumber, businessLocation.buildingNumber) &&
        Objects.equals(this.buildingName, businessLocation.buildingName) &&
        Objects.equals(this.unitNumber, businessLocation.unitNumber) &&
        Objects.equals(this.streetName, businessLocation.streetName) &&
        Objects.equals(this.streetType, businessLocation.streetType) &&
        Objects.equals(this.city, businessLocation.city) &&
        Objects.equals(this.suburb, businessLocation.suburb) &&
        Objects.equals(this.county, businessLocation.county) &&
        Objects.equals(this.stateProvinceCode, businessLocation.stateProvinceCode) &&
        Objects.equals(this.country, businessLocation.country) &&
        Objects.equals(this.postalCode, businessLocation.postalCode) &&
        Objects.equals(this.poBox, businessLocation.poBox) &&
        Objects.equals(this.address1, businessLocation.address1);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, buildingNumber, buildingName, unitNumber, streetName, streetType, city, suburb, county, stateProvinceCode, country, postalCode, poBox, address1);
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
    sb.append("class BusinessLocation {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
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
    openapiFields.add("Index");
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
    openapiFields.add("Address1");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessLocation is not found in the empty JSON string", BusinessLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessLocation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("Address1") != null && !jsonObj.get("Address1").isJsonNull()) && !jsonObj.get("Address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Address1").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessLocation>() {
           @Override
           public void write(JsonWriter out, BusinessLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessLocation
  * @throws IOException if the JSON string is invalid with respect to BusinessLocation
  */
  public static BusinessLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessLocation.class);
  }

 /**
  * Convert an instance of BusinessLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

