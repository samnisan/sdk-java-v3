package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.NormalizedDatasourceGroupCountry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Datasource groups with country code
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-14T09:53:55.537580900-07:00[America/Los_Angeles]")
public class NormalizedDatasourceGroupsWithCountry {
  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DATASOURCES = "Datasources";
  @SerializedName(SERIALIZED_NAME_DATASOURCES)
  private List<NormalizedDatasourceGroupCountry> datasources;

  public NormalizedDatasourceGroupsWithCountry() {
  }

  public NormalizedDatasourceGroupsWithCountry country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public NormalizedDatasourceGroupsWithCountry datasources(List<NormalizedDatasourceGroupCountry> datasources) {
    
    this.datasources = datasources;
    return this;
  }

  public NormalizedDatasourceGroupsWithCountry addDatasourcesItem(NormalizedDatasourceGroupCountry datasourcesItem) {
    if (this.datasources == null) {
      this.datasources = new ArrayList<>();
    }
    this.datasources.add(datasourcesItem);
    return this;
  }

   /**
   * Get datasources
   * @return datasources
  **/
  @javax.annotation.Nullable
  public List<NormalizedDatasourceGroupCountry> getDatasources() {
    return datasources;
  }


  public void setDatasources(List<NormalizedDatasourceGroupCountry> datasources) {
    this.datasources = datasources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedDatasourceGroupsWithCountry normalizedDatasourceGroupsWithCountry = (NormalizedDatasourceGroupsWithCountry) o;
    return Objects.equals(this.country, normalizedDatasourceGroupsWithCountry.country) &&
        Objects.equals(this.datasources, normalizedDatasourceGroupsWithCountry.datasources);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, datasources);
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
    sb.append("class NormalizedDatasourceGroupsWithCountry {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
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
    openapiFields.add("Country");
    openapiFields.add("Datasources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormalizedDatasourceGroupsWithCountry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormalizedDatasourceGroupsWithCountry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormalizedDatasourceGroupsWithCountry is not found in the empty JSON string", NormalizedDatasourceGroupsWithCountry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NormalizedDatasourceGroupsWithCountry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NormalizedDatasourceGroupsWithCountry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if (jsonObj.get("Datasources") != null && !jsonObj.get("Datasources").isJsonNull()) {
        JsonArray jsonArraydatasources = jsonObj.getAsJsonArray("Datasources");
        if (jsonArraydatasources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Datasources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Datasources` to be an array in the JSON string but got `%s`", jsonObj.get("Datasources").toString()));
          }

          // validate the optional field `Datasources` (array)
          for (int i = 0; i < jsonArraydatasources.size(); i++) {
            NormalizedDatasourceGroupCountry.validateJsonObject(jsonArraydatasources.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormalizedDatasourceGroupsWithCountry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormalizedDatasourceGroupsWithCountry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormalizedDatasourceGroupsWithCountry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormalizedDatasourceGroupsWithCountry.class));

       return (TypeAdapter<T>) new TypeAdapter<NormalizedDatasourceGroupsWithCountry>() {
           @Override
           public void write(JsonWriter out, NormalizedDatasourceGroupsWithCountry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NormalizedDatasourceGroupsWithCountry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NormalizedDatasourceGroupsWithCountry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormalizedDatasourceGroupsWithCountry
  * @throws IOException if the JSON string is invalid with respect to NormalizedDatasourceGroupsWithCountry
  */
  public static NormalizedDatasourceGroupsWithCountry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormalizedDatasourceGroupsWithCountry.class);
  }

 /**
  * Convert an instance of NormalizedDatasourceGroupsWithCountry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

