package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.AppendedField;
import com.trulioo.normalizedapi.model.DatasourceField;
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
 * A result from a particular datasource
 */

public class DatasourceResult {
  public static final String SERIALIZED_NAME_DATASOURCE_STATUS = "DatasourceStatus";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_STATUS)
  private String datasourceStatus;

  public static final String SERIALIZED_NAME_DATASOURCE_NAME = "DatasourceName";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_NAME)
  private String datasourceName;

  public static final String SERIALIZED_NAME_DATASOURCE_FIELDS = "DatasourceFields";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_FIELDS)
  private List<DatasourceField> datasourceFields;

  public static final String SERIALIZED_NAME_APPENDED_FIELDS = "AppendedFields";
  @SerializedName(SERIALIZED_NAME_APPENDED_FIELDS)
  private List<AppendedField> appendedFields;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ServiceError> errors;

  public static final String SERIALIZED_NAME_FIELD_GROUPS = "FieldGroups";
  @SerializedName(SERIALIZED_NAME_FIELD_GROUPS)
  private List<String> fieldGroups;

  public DatasourceResult() {
  }

  public DatasourceResult datasourceStatus(String datasourceStatus) {
    
    this.datasourceStatus = datasourceStatus;
    return this;
  }

   /**
   * 
   * @return datasourceStatus
  **/
  @javax.annotation.Nullable

  public String getDatasourceStatus() {
    return datasourceStatus;
  }


  public void setDatasourceStatus(String datasourceStatus) {
    this.datasourceStatus = datasourceStatus;
  }


  public DatasourceResult datasourceName(String datasourceName) {
    
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


  public DatasourceResult datasourceFields(List<DatasourceField> datasourceFields) {
    
    this.datasourceFields = datasourceFields;
    return this;
  }

  public DatasourceResult addDatasourceFieldsItem(DatasourceField datasourceFieldsItem) {
    if (this.datasourceFields == null) {
      this.datasourceFields = new ArrayList<>();
    }
    this.datasourceFields.add(datasourceFieldsItem);
    return this;
  }

   /**
   * 
   * @return datasourceFields
  **/
  @javax.annotation.Nullable

  public List<DatasourceField> getDatasourceFields() {
    return datasourceFields;
  }


  public void setDatasourceFields(List<DatasourceField> datasourceFields) {
    this.datasourceFields = datasourceFields;
  }


  public DatasourceResult appendedFields(List<AppendedField> appendedFields) {
    
    this.appendedFields = appendedFields;
    return this;
  }

  public DatasourceResult addAppendedFieldsItem(AppendedField appendedFieldsItem) {
    if (this.appendedFields == null) {
      this.appendedFields = new ArrayList<>();
    }
    this.appendedFields.add(appendedFieldsItem);
    return this;
  }

   /**
   * 
   * @return appendedFields
  **/
  @javax.annotation.Nullable

  public List<AppendedField> getAppendedFields() {
    return appendedFields;
  }


  public void setAppendedFields(List<AppendedField> appendedFields) {
    this.appendedFields = appendedFields;
  }


  public DatasourceResult errors(List<ServiceError> errors) {
    
    this.errors = errors;
    return this;
  }

  public DatasourceResult addErrorsItem(ServiceError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<ServiceError> getErrors() {
    return errors;
  }


  public void setErrors(List<ServiceError> errors) {
    this.errors = errors;
  }


  public DatasourceResult fieldGroups(List<String> fieldGroups) {
    
    this.fieldGroups = fieldGroups;
    return this;
  }

  public DatasourceResult addFieldGroupsItem(String fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

   /**
   * 
   * @return fieldGroups
  **/
  @javax.annotation.Nullable

  public List<String> getFieldGroups() {
    return fieldGroups;
  }


  public void setFieldGroups(List<String> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasourceResult datasourceResult = (DatasourceResult) o;
    return Objects.equals(this.datasourceStatus, datasourceResult.datasourceStatus) &&
        Objects.equals(this.datasourceName, datasourceResult.datasourceName) &&
        Objects.equals(this.datasourceFields, datasourceResult.datasourceFields) &&
        Objects.equals(this.appendedFields, datasourceResult.appendedFields) &&
        Objects.equals(this.errors, datasourceResult.errors) &&
        Objects.equals(this.fieldGroups, datasourceResult.fieldGroups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceStatus, datasourceName, datasourceFields, appendedFields, errors, fieldGroups);
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
    sb.append("class DatasourceResult {\n");
    sb.append("    datasourceStatus: ").append(toIndentedString(datasourceStatus)).append("\n");
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    datasourceFields: ").append(toIndentedString(datasourceFields)).append("\n");
    sb.append("    appendedFields: ").append(toIndentedString(appendedFields)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
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
    openapiFields.add("DatasourceStatus");
    openapiFields.add("DatasourceName");
    openapiFields.add("DatasourceFields");
    openapiFields.add("AppendedFields");
    openapiFields.add("Errors");
    openapiFields.add("FieldGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatasourceResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DatasourceResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasourceResult is not found in the empty JSON string", DatasourceResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatasourceResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasourceResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DatasourceStatus") != null && !jsonObj.get("DatasourceStatus").isJsonNull()) && !jsonObj.get("DatasourceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DatasourceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DatasourceStatus").toString()));
      }
      if ((jsonObj.get("DatasourceName") != null && !jsonObj.get("DatasourceName").isJsonNull()) && !jsonObj.get("DatasourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DatasourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DatasourceName").toString()));
      }
      if (jsonObj.get("DatasourceFields") != null && !jsonObj.get("DatasourceFields").isJsonNull()) {
        JsonArray jsonArraydatasourceFields = jsonObj.getAsJsonArray("DatasourceFields");
        if (jsonArraydatasourceFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DatasourceFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DatasourceFields` to be an array in the JSON string but got `%s`", jsonObj.get("DatasourceFields").toString()));
          }

          // validate the optional field `DatasourceFields` (array)
          for (int i = 0; i < jsonArraydatasourceFields.size(); i++) {
            DatasourceField.validateJsonObject(jsonArraydatasourceFields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("AppendedFields") != null && !jsonObj.get("AppendedFields").isJsonNull()) {
        JsonArray jsonArrayappendedFields = jsonObj.getAsJsonArray("AppendedFields");
        if (jsonArrayappendedFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("AppendedFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `AppendedFields` to be an array in the JSON string but got `%s`", jsonObj.get("AppendedFields").toString()));
          }

          // validate the optional field `AppendedFields` (array)
          for (int i = 0; i < jsonArrayappendedFields.size(); i++) {
            AppendedField.validateJsonObject(jsonArrayappendedFields.get(i).getAsJsonObject());
          };
        }
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("FieldGroups") != null && !jsonObj.get("FieldGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FieldGroups` to be an array in the JSON string but got `%s`", jsonObj.get("FieldGroups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasourceResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasourceResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasourceResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasourceResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasourceResult>() {
           @Override
           public void write(JsonWriter out, DatasourceResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasourceResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasourceResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasourceResult
  * @throws IOException if the JSON string is invalid with respect to DatasourceResult
  */
  public static DatasourceResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasourceResult.class);
  }

 /**
  * Convert an instance of DatasourceResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

