package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.BusinessResult;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class BusinessRecord {
  public static final String SERIALIZED_NAME_TRANSACTION_RECORD_I_D = "TransactionRecordID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECORD_I_D)
  private String transactionRecordID;

  public static final String SERIALIZED_NAME_RECORD_STATUS = "RecordStatus";
  @SerializedName(SERIALIZED_NAME_RECORD_STATUS)
  private String recordStatus;

  public static final String SERIALIZED_NAME_DATASOURCE_RESULTS = "DatasourceResults";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_RESULTS)
  private List<BusinessResult> datasourceResults;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ServiceError> errors;

  public BusinessRecord() {
  }

  public BusinessRecord transactionRecordID(String transactionRecordID) {
    
    this.transactionRecordID = transactionRecordID;
    return this;
  }

   /**
   * The TransactionRecordID, this is the ID you will use to fetch the transaction again.
   * @return transactionRecordID
  **/
  @javax.annotation.Nullable

  public String getTransactionRecordID() {
    return transactionRecordID;
  }


  public void setTransactionRecordID(String transactionRecordID) {
    this.transactionRecordID = transactionRecordID;
  }


  public BusinessRecord recordStatus(String recordStatus) {
    
    this.recordStatus = recordStatus;
    return this;
  }

   /**
   * &#39;match&#39; or &#39;nomatch&#39; if the verification passed the rules configured on your account this will be &#39;match&#39;.
   * @return recordStatus
  **/
  @javax.annotation.Nullable

  public String getRecordStatus() {
    return recordStatus;
  }


  public void setRecordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
  }


  public BusinessRecord datasourceResults(List<BusinessResult> datasourceResults) {
    
    this.datasourceResults = datasourceResults;
    return this;
  }

  public BusinessRecord addDatasourceResultsItem(BusinessResult datasourceResultsItem) {
    if (this.datasourceResults == null) {
      this.datasourceResults = new ArrayList<>();
    }
    this.datasourceResults.add(datasourceResultsItem);
    return this;
  }

   /**
   * Results for each datasource that was queried
   * @return datasourceResults
  **/
  @javax.annotation.Nullable

  public List<BusinessResult> getDatasourceResults() {
    return datasourceResults;
  }


  public void setDatasourceResults(List<BusinessResult> datasourceResults) {
    this.datasourceResults = datasourceResults;
  }


  public BusinessRecord errors(List<ServiceError> errors) {
    
    this.errors = errors;
    return this;
  }

  public BusinessRecord addErrorsItem(ServiceError errorsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRecord businessRecord = (BusinessRecord) o;
    return Objects.equals(this.transactionRecordID, businessRecord.transactionRecordID) &&
        Objects.equals(this.recordStatus, businessRecord.recordStatus) &&
        Objects.equals(this.datasourceResults, businessRecord.datasourceResults) &&
        Objects.equals(this.errors, businessRecord.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRecordID, recordStatus, datasourceResults, errors);
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
    sb.append("class BusinessRecord {\n");
    sb.append("    transactionRecordID: ").append(toIndentedString(transactionRecordID)).append("\n");
    sb.append("    recordStatus: ").append(toIndentedString(recordStatus)).append("\n");
    sb.append("    datasourceResults: ").append(toIndentedString(datasourceResults)).append("\n");
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
    openapiFields.add("TransactionRecordID");
    openapiFields.add("RecordStatus");
    openapiFields.add("DatasourceResults");
    openapiFields.add("Errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessRecord is not found in the empty JSON string", BusinessRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessRecord` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TransactionRecordID") != null && !jsonObj.get("TransactionRecordID").isJsonNull()) && !jsonObj.get("TransactionRecordID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionRecordID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionRecordID").toString()));
      }
      if ((jsonObj.get("RecordStatus") != null && !jsonObj.get("RecordStatus").isJsonNull()) && !jsonObj.get("RecordStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RecordStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RecordStatus").toString()));
      }
      if (jsonObj.get("DatasourceResults") != null && !jsonObj.get("DatasourceResults").isJsonNull()) {
        JsonArray jsonArraydatasourceResults = jsonObj.getAsJsonArray("DatasourceResults");
        if (jsonArraydatasourceResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DatasourceResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DatasourceResults` to be an array in the JSON string but got `%s`", jsonObj.get("DatasourceResults").toString()));
          }

          // validate the optional field `DatasourceResults` (array)
          for (int i = 0; i < jsonArraydatasourceResults.size(); i++) {
            BusinessResult.validateJsonObject(jsonArraydatasourceResults.get(i).getAsJsonObject());
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessRecord>() {
           @Override
           public void write(JsonWriter out, BusinessRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessRecord
  * @throws IOException if the JSON string is invalid with respect to BusinessRecord
  */
  public static BusinessRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessRecord.class);
  }

 /**
  * Convert an instance of BusinessRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

