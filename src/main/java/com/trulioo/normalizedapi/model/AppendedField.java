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
 * &lt;p&gt;Types of fields you will see here include&lt;/p&gt;  &lt;table class&#x3D;\&quot;help-page-table\&quot;&gt;    &lt;thead&gt;      &lt;tr&gt;        &lt;td&gt;          &lt;b&gt;FieldName&lt;/b&gt;        &lt;/td&gt;        &lt;td&gt;          &lt;b&gt;Data&lt;/b&gt;        &lt;/td&gt;        &lt;td&gt;          &lt;b&gt;Comments&lt;/b&gt;        &lt;/td&gt;      &lt;/tr&gt;    &lt;/thead&gt;    &lt;tbody&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistState&lt;/td&gt;        &lt;td&gt;Clear&lt;/td&gt;        &lt;td&gt;If the submitted individual did not match any watchlist checks, the appended field data will appear as clear&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistState&lt;/td&gt;        &lt;td&gt;Hit&lt;/td&gt;        &lt;td&gt;If the submitted individual triggered a watchlist hit, the watchlistdata field also be included as below:&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistData&lt;/td&gt;        &lt;td&gt;Name|URL\\tName2|URL&lt;/td&gt;        &lt;td&gt; Name of the source a pipe (|) the url of the source each source is separated with a tab (\\t )&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;CanadaSixMonthResidency&lt;/td&gt;        &lt;td&gt;YES&lt;/td&gt;        &lt;td&gt;The Canadian Credit Agency provides a flag to indicate that an individual has been at the specified              residence for at least six months.The canadasixmonthresidency field is returned with a value of either YES or NO.&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;IsDeceased&lt;/td&gt;        &lt;td&gt;False&lt;/td&gt;        &lt;td&gt;The IsDeceased field is returned by various datasources to indicate whether the input information was screened against an available death file.              Check with your Trulioo Technical Account Manager to see which datasources support this option.&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;IsDeceased&lt;/td&gt;        &lt;td&gt;True&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;FraudFlag&lt;/td&gt;        &lt;td&gt;True&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;FraudFlag&lt;/td&gt;        &lt;td&gt;False&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;    &lt;/tbody&gt;  &lt;/table&gt;  &lt;p&gt;If you are retrieving transaction with address corrected values you will also see address fields in appended data&lt;/p&gt;
 */

public class AppendedField {
  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public AppendedField() {
  }

  public AppendedField fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 
   * @return fieldName
  **/
  @javax.annotation.Nullable

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public AppendedField data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  @javax.annotation.Nullable

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendedField appendedField = (AppendedField) o;
    return Objects.equals(this.fieldName, appendedField.fieldName) &&
        Objects.equals(this.data, appendedField.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, data);
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
    sb.append("class AppendedField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("FieldName");
    openapiFields.add("Data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppendedField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppendedField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendedField is not found in the empty JSON string", AppendedField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppendedField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendedField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FieldName") != null && !jsonObj.get("FieldName").isJsonNull()) && !jsonObj.get("FieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FieldName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendedField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendedField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendedField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendedField.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendedField>() {
           @Override
           public void write(JsonWriter out, AppendedField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendedField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendedField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendedField
  * @throws IOException if the JSON string is invalid with respect to AppendedField
  */
  public static AppendedField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendedField.class);
  }

 /**
  * Convert an instance of AppendedField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

