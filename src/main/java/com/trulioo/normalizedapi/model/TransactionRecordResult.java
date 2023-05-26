package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.DataField;
import com.trulioo.normalizedapi.model.Record;
import com.trulioo.normalizedapi.model.ServiceError;
import java.io.IOException;
import java.time.OffsetDateTime;
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

public class TransactionRecordResult {
  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "TransactionID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private String transactionID;

  public static final String SERIALIZED_NAME_UPLOADED_DT = "UploadedDt";
  @SerializedName(SERIALIZED_NAME_UPLOADED_DT)
  private OffsetDateTime uploadedDt;

  public static final String SERIALIZED_NAME_COMPLETED_DT = "CompletedDt";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DT)
  private OffsetDateTime completedDt;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "ProductName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_RECORD = "Record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private Record record;

  public static final String SERIALIZED_NAME_CUSTOMER_REFERENCE_I_D = "CustomerReferenceID";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REFERENCE_I_D)
  private String customerReferenceID;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ServiceError> errors;

  public static final String SERIALIZED_NAME_INPUT_FIELDS = "InputFields";
  @SerializedName(SERIALIZED_NAME_INPUT_FIELDS)
  private List<DataField> inputFields;

  public TransactionRecordResult() {
  }

  public TransactionRecordResult transactionID(String transactionID) {
    
    this.transactionID = transactionID;
    return this;
  }

   /**
   * The id for the transaction it will be a GUID
   * @return transactionID
  **/
  @javax.annotation.Nullable

  public String getTransactionID() {
    return transactionID;
  }


  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }


  public TransactionRecordResult uploadedDt(OffsetDateTime uploadedDt) {
    
    this.uploadedDt = uploadedDt;
    return this;
  }

   /**
   * Time in UTC
   * @return uploadedDt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUploadedDt() {
    return uploadedDt;
  }


  public void setUploadedDt(OffsetDateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
  }


  public TransactionRecordResult completedDt(OffsetDateTime completedDt) {
    
    this.completedDt = completedDt;
    return this;
  }

   /**
   * Time in UTC
   * @return completedDt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCompletedDt() {
    return completedDt;
  }


  public void setCompletedDt(OffsetDateTime completedDt) {
    this.completedDt = completedDt;
  }


  public TransactionRecordResult countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public TransactionRecordResult productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Product Name
   * @return productName
  **/
  @javax.annotation.Nullable

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public TransactionRecordResult record(Record record) {
    
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @javax.annotation.Nullable

  public Record getRecord() {
    return record;
  }


  public void setRecord(Record record) {
    this.record = record;
  }


  public TransactionRecordResult customerReferenceID(String customerReferenceID) {
    
    this.customerReferenceID = customerReferenceID;
    return this;
  }

   /**
   * Customer Reference Id
   * @return customerReferenceID
  **/
  @javax.annotation.Nullable

  public String getCustomerReferenceID() {
    return customerReferenceID;
  }


  public void setCustomerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
  }


  public TransactionRecordResult errors(List<ServiceError> errors) {
    
    this.errors = errors;
    return this;
  }

  public TransactionRecordResult addErrorsItem(ServiceError errorsItem) {
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


  public TransactionRecordResult inputFields(List<DataField> inputFields) {
    
    this.inputFields = inputFields;
    return this;
  }

  public TransactionRecordResult addInputFieldsItem(DataField inputFieldsItem) {
    if (this.inputFields == null) {
      this.inputFields = new ArrayList<>();
    }
    this.inputFields.add(inputFieldsItem);
    return this;
  }

   /**
   * 
   * @return inputFields
  **/
  @javax.annotation.Nullable

  public List<DataField> getInputFields() {
    return inputFields;
  }


  public void setInputFields(List<DataField> inputFields) {
    this.inputFields = inputFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRecordResult transactionRecordResult = (TransactionRecordResult) o;
    return Objects.equals(this.transactionID, transactionRecordResult.transactionID) &&
        Objects.equals(this.uploadedDt, transactionRecordResult.uploadedDt) &&
        Objects.equals(this.completedDt, transactionRecordResult.completedDt) &&
        Objects.equals(this.countryCode, transactionRecordResult.countryCode) &&
        Objects.equals(this.productName, transactionRecordResult.productName) &&
        Objects.equals(this.record, transactionRecordResult.record) &&
        Objects.equals(this.customerReferenceID, transactionRecordResult.customerReferenceID) &&
        Objects.equals(this.errors, transactionRecordResult.errors) &&
        Objects.equals(this.inputFields, transactionRecordResult.inputFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, uploadedDt, completedDt, countryCode, productName, record, customerReferenceID, errors, inputFields);
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
    sb.append("class TransactionRecordResult {\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    uploadedDt: ").append(toIndentedString(uploadedDt)).append("\n");
    sb.append("    completedDt: ").append(toIndentedString(completedDt)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    customerReferenceID: ").append(toIndentedString(customerReferenceID)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    inputFields: ").append(toIndentedString(inputFields)).append("\n");
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
    openapiFields.add("TransactionID");
    openapiFields.add("UploadedDt");
    openapiFields.add("CompletedDt");
    openapiFields.add("CountryCode");
    openapiFields.add("ProductName");
    openapiFields.add("Record");
    openapiFields.add("CustomerReferenceID");
    openapiFields.add("Errors");
    openapiFields.add("InputFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRecordResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionRecordResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRecordResult is not found in the empty JSON string", TransactionRecordResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionRecordResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRecordResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TransactionID") != null && !jsonObj.get("TransactionID").isJsonNull()) && !jsonObj.get("TransactionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionID").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      if ((jsonObj.get("ProductName") != null && !jsonObj.get("ProductName").isJsonNull()) && !jsonObj.get("ProductName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProductName").toString()));
      }
      // validate the optional field `Record`
      if (jsonObj.get("Record") != null && !jsonObj.get("Record").isJsonNull()) {
        Record.validateJsonObject(jsonObj.getAsJsonObject("Record"));
      }
      if ((jsonObj.get("CustomerReferenceID") != null && !jsonObj.get("CustomerReferenceID").isJsonNull()) && !jsonObj.get("CustomerReferenceID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomerReferenceID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomerReferenceID").toString()));
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
      if (jsonObj.get("InputFields") != null && !jsonObj.get("InputFields").isJsonNull()) {
        JsonArray jsonArrayinputFields = jsonObj.getAsJsonArray("InputFields");
        if (jsonArrayinputFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("InputFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `InputFields` to be an array in the JSON string but got `%s`", jsonObj.get("InputFields").toString()));
          }

          // validate the optional field `InputFields` (array)
          for (int i = 0; i < jsonArrayinputFields.size(); i++) {
            DataField.validateJsonObject(jsonArrayinputFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRecordResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRecordResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRecordResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRecordResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRecordResult>() {
           @Override
           public void write(JsonWriter out, TransactionRecordResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRecordResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRecordResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRecordResult
  * @throws IOException if the JSON string is invalid with respect to TransactionRecordResult
  */
  public static TransactionRecordResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRecordResult.class);
  }

 /**
  * Convert an instance of TransactionRecordResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

