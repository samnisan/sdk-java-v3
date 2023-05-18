package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.Result;
import com.trulioo.normalizedapi.model.ServiceError;
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

public class BusinessResult {
  public static final String SERIALIZED_NAME_RESULTS = "Results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Result> results;

  public static final String SERIALIZED_NAME_DATASOURCE_NAME = "DatasourceName";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_NAME)
  private String datasourceName;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ServiceError> errors;

  public BusinessResult() {
  }

  
  public BusinessResult(
     List<ServiceError> errors
  ) {
    this();
    this.errors = errors;
  }

  public BusinessResult results(List<Result> results) {
    
    this.results = results;
    return this;
  }

  public BusinessResult addResultsItem(Result resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * 
   * @return results
  **/
  @javax.annotation.Nullable

  public List<Result> getResults() {
    return results;
  }


  public void setResults(List<Result> results) {
    this.results = results;
  }


  public BusinessResult datasourceName(String datasourceName) {
    
    this.datasourceName = datasourceName;
    return this;
  }

   /**
   * 
   * @return datasourceName
  **/
  @javax.annotation.Nullable

  public String getDatasourceName() {
    return datasourceName;
  }


  public void setDatasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
  }


   /**
   * 
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<ServiceError> getErrors() {
    return errors;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessResult businessResult = (BusinessResult) o;
    return Objects.equals(this.results, businessResult.results) &&
        Objects.equals(this.datasourceName, businessResult.datasourceName) &&
        Objects.equals(this.errors, businessResult.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, datasourceName, errors);
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
    sb.append("class BusinessResult {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("Results");
    openapiFields.add("DatasourceName");
    openapiFields.add("Errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessResult is not found in the empty JSON string", BusinessResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Results") != null && !jsonObj.get("Results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("Results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Results` to be an array in the JSON string but got `%s`", jsonObj.get("Results").toString()));
          }

          // validate the optional field `Results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            Result.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("DatasourceName") != null && !jsonObj.get("DatasourceName").isJsonNull()) && !jsonObj.get("DatasourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DatasourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DatasourceName").toString()));
      }
      if (jsonObj.get("Errors") != null && !jsonObj.get("Errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("Errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Errors` to be an array in the JSON string but got `%s`", jsonObj.get("Errors").toString()));
          }

          // validate the optional field `Errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ServiceError.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessResult>() {
           @Override
           public void write(JsonWriter out, BusinessResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessResult
  * @throws IOException if the JSON string is invalid with respect to BusinessResult
  */
  public static BusinessResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessResult.class);
  }

 /**
  * Convert an instance of BusinessResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

