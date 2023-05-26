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

public class Address {
  public static final String SERIALIZED_NAME_UNIT_NUMBER = "UnitNumber";
  @SerializedName(SERIALIZED_NAME_UNIT_NUMBER)
  private String unitNumber;

  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "BuildingNumber";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "BuildingName";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

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

  public static final String SERIALIZED_NAME_STATE_PROVINCE_CODE = "StateProvinceCode";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE_CODE)
  private String stateProvinceCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_ADDRESS1 = "Address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "AddressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "StateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public Address() {
  }

  public Address unitNumber(String unitNumber) {
    
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Flat/Unit/Apartment number of address
   * @return unitNumber
  **/
  @javax.annotation.Nullable

  public String getUnitNumber() {
    return unitNumber;
  }


  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }


  public Address buildingNumber(String buildingNumber) {
    
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * House / Civic / Building number of address
   * @return buildingNumber
  **/
  @javax.annotation.Nullable

  public String getBuildingNumber() {
    return buildingNumber;
  }


  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public Address buildingName(String buildingName) {
    
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Name of building
   * @return buildingName
  **/
  @javax.annotation.Nullable

  public String getBuildingName() {
    return buildingName;
  }


  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public Address streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name
   * @return streetName
  **/
  @javax.annotation.Nullable

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public Address streetType(String streetType) {
    
    this.streetType = streetType;
    return this;
  }

   /**
   * Street type of address (Typically St, Rd etc)
   * @return streetType
  **/
  @javax.annotation.Nullable

  public String getStreetType() {
    return streetType;
  }


  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }


  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Address suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * Suburb / Subdivision / Municipality
   * @return suburb
  **/
  @javax.annotation.Nullable

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public Address stateProvinceCode(String stateProvinceCode) {
    
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * State or province of address. US sources expect 2 characters. Australian sources expect 2 or 3 characters.
   * @return stateProvinceCode
  **/
  @javax.annotation.Nullable

  public String getStateProvinceCode() {
    return stateProvinceCode;
  }


  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }


  public Address postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP Code or Postal Code
   * @return postalCode
  **/
  @javax.annotation.Nullable

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Address1
   * @return address1
  **/
  @javax.annotation.Nullable

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public Address addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Address Type
   * @return addressType
  **/
  @javax.annotation.Nullable

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public Address stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * State Province
   * @return stateProvince
  **/
  @javax.annotation.Nullable

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public Address country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Address countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.unitNumber, address.unitNumber) &&
        Objects.equals(this.buildingNumber, address.buildingNumber) &&
        Objects.equals(this.buildingName, address.buildingName) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetType, address.streetType) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.stateProvinceCode, address.stateProvinceCode) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.stateProvince, address.stateProvince) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.countryCode, address.countryCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitNumber, buildingNumber, buildingName, streetName, streetType, city, suburb, stateProvinceCode, postalCode, address1, addressType, stateProvince, country, countryCode);
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
    sb.append("class Address {\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("UnitNumber");
    openapiFields.add("BuildingNumber");
    openapiFields.add("BuildingName");
    openapiFields.add("StreetName");
    openapiFields.add("StreetType");
    openapiFields.add("City");
    openapiFields.add("Suburb");
    openapiFields.add("StateProvinceCode");
    openapiFields.add("PostalCode");
    openapiFields.add("Address1");
    openapiFields.add("AddressType");
    openapiFields.add("StateProvince");
    openapiFields.add("Country");
    openapiFields.add("CountryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Address.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Address` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("UnitNumber") != null && !jsonObj.get("UnitNumber").isJsonNull()) && !jsonObj.get("UnitNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UnitNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UnitNumber").toString()));
      }
      if ((jsonObj.get("BuildingNumber") != null && !jsonObj.get("BuildingNumber").isJsonNull()) && !jsonObj.get("BuildingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildingNumber").toString()));
      }
      if ((jsonObj.get("BuildingName") != null && !jsonObj.get("BuildingName").isJsonNull()) && !jsonObj.get("BuildingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildingName").toString()));
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
      if ((jsonObj.get("StateProvinceCode") != null && !jsonObj.get("StateProvinceCode").isJsonNull()) && !jsonObj.get("StateProvinceCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StateProvinceCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StateProvinceCode").toString()));
      }
      if ((jsonObj.get("PostalCode") != null && !jsonObj.get("PostalCode").isJsonNull()) && !jsonObj.get("PostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PostalCode").toString()));
      }
      if ((jsonObj.get("Address1") != null && !jsonObj.get("Address1").isJsonNull()) && !jsonObj.get("Address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Address1").toString()));
      }
      if ((jsonObj.get("AddressType") != null && !jsonObj.get("AddressType").isJsonNull()) && !jsonObj.get("AddressType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddressType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddressType").toString()));
      }
      if ((jsonObj.get("StateProvince") != null && !jsonObj.get("StateProvince").isJsonNull()) && !jsonObj.get("StateProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StateProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StateProvince").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Address read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

