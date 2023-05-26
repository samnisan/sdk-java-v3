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

public class NationalId {
  public static final String SERIALIZED_NAME_NUMBER = "Number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DISTRICT_OF_ISSUE = "DistrictOfIssue";
  @SerializedName(SERIALIZED_NAME_DISTRICT_OF_ISSUE)
  private String districtOfIssue;

  public static final String SERIALIZED_NAME_CITY_OF_ISSUE = "CityOfIssue";
  @SerializedName(SERIALIZED_NAME_CITY_OF_ISSUE)
  private String cityOfIssue;

  public static final String SERIALIZED_NAME_PROVINCE_OF_ISSUE = "ProvinceOfIssue";
  @SerializedName(SERIALIZED_NAME_PROVINCE_OF_ISSUE)
  private String provinceOfIssue;

  public static final String SERIALIZED_NAME_COUNTY_OF_ISSUE = "CountyOfIssue";
  @SerializedName(SERIALIZED_NAME_COUNTY_OF_ISSUE)
  private String countyOfIssue;

  public NationalId() {
  }

  public NationalId number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * 
   * @return number
  **/
  @javax.annotation.Nullable

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public NationalId type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Supported Types: NationalID, Health, SocialService, TaxIDNumber
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public NationalId districtOfIssue(String districtOfIssue) {
    
    this.districtOfIssue = districtOfIssue;
    return this;
  }

   /**
   * District that issued the ID
   * @return districtOfIssue
  **/
  @javax.annotation.Nullable

  public String getDistrictOfIssue() {
    return districtOfIssue;
  }


  public void setDistrictOfIssue(String districtOfIssue) {
    this.districtOfIssue = districtOfIssue;
  }


  public NationalId cityOfIssue(String cityOfIssue) {
    
    this.cityOfIssue = cityOfIssue;
    return this;
  }

   /**
   * City that issued the ID
   * @return cityOfIssue
  **/
  @javax.annotation.Nullable

  public String getCityOfIssue() {
    return cityOfIssue;
  }


  public void setCityOfIssue(String cityOfIssue) {
    this.cityOfIssue = cityOfIssue;
  }


  public NationalId provinceOfIssue(String provinceOfIssue) {
    
    this.provinceOfIssue = provinceOfIssue;
    return this;
  }

   /**
   * Province that issued the ID
   * @return provinceOfIssue
  **/
  @javax.annotation.Nullable

  public String getProvinceOfIssue() {
    return provinceOfIssue;
  }


  public void setProvinceOfIssue(String provinceOfIssue) {
    this.provinceOfIssue = provinceOfIssue;
  }


  public NationalId countyOfIssue(String countyOfIssue) {
    
    this.countyOfIssue = countyOfIssue;
    return this;
  }

   /**
   * County that issued the ID
   * @return countyOfIssue
  **/
  @javax.annotation.Nullable

  public String getCountyOfIssue() {
    return countyOfIssue;
  }


  public void setCountyOfIssue(String countyOfIssue) {
    this.countyOfIssue = countyOfIssue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationalId nationalId = (NationalId) o;
    return Objects.equals(this.number, nationalId.number) &&
        Objects.equals(this.type, nationalId.type) &&
        Objects.equals(this.districtOfIssue, nationalId.districtOfIssue) &&
        Objects.equals(this.cityOfIssue, nationalId.cityOfIssue) &&
        Objects.equals(this.provinceOfIssue, nationalId.provinceOfIssue) &&
        Objects.equals(this.countyOfIssue, nationalId.countyOfIssue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, districtOfIssue, cityOfIssue, provinceOfIssue, countyOfIssue);
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
    sb.append("class NationalId {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    districtOfIssue: ").append(toIndentedString(districtOfIssue)).append("\n");
    sb.append("    cityOfIssue: ").append(toIndentedString(cityOfIssue)).append("\n");
    sb.append("    provinceOfIssue: ").append(toIndentedString(provinceOfIssue)).append("\n");
    sb.append("    countyOfIssue: ").append(toIndentedString(countyOfIssue)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("DistrictOfIssue");
    openapiFields.add("CityOfIssue");
    openapiFields.add("ProvinceOfIssue");
    openapiFields.add("CountyOfIssue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NationalId
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NationalId.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NationalId is not found in the empty JSON string", NationalId.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NationalId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NationalId` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Number") != null && !jsonObj.get("Number").isJsonNull()) && !jsonObj.get("Number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Number").toString()));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if ((jsonObj.get("DistrictOfIssue") != null && !jsonObj.get("DistrictOfIssue").isJsonNull()) && !jsonObj.get("DistrictOfIssue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DistrictOfIssue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DistrictOfIssue").toString()));
      }
      if ((jsonObj.get("CityOfIssue") != null && !jsonObj.get("CityOfIssue").isJsonNull()) && !jsonObj.get("CityOfIssue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CityOfIssue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CityOfIssue").toString()));
      }
      if ((jsonObj.get("ProvinceOfIssue") != null && !jsonObj.get("ProvinceOfIssue").isJsonNull()) && !jsonObj.get("ProvinceOfIssue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProvinceOfIssue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProvinceOfIssue").toString()));
      }
      if ((jsonObj.get("CountyOfIssue") != null && !jsonObj.get("CountyOfIssue").isJsonNull()) && !jsonObj.get("CountyOfIssue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountyOfIssue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountyOfIssue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NationalId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NationalId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NationalId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NationalId.class));

       return (TypeAdapter<T>) new TypeAdapter<NationalId>() {
           @Override
           public void write(JsonWriter out, NationalId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NationalId read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NationalId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NationalId
  * @throws IOException if the JSON string is invalid with respect to NationalId
  */
  public static NationalId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NationalId.class);
  }

 /**
  * Convert an instance of NationalId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

