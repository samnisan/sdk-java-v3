package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Transaction Status
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T00:47:05.036670600-07:00[America/Los_Angeles]")
public class TransactionStatus {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "TransactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_RECORD_ID = "TransactionRecordId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECORD_ID)
  private String transactionRecordId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPLOADED_DT = "UploadedDt";
  @SerializedName(SERIALIZED_NAME_UPLOADED_DT)
  private OffsetDateTime uploadedDt;

  public static final String SERIALIZED_NAME_IS_TIMED_OUT = "IsTimedOut";
  @SerializedName(SERIALIZED_NAME_IS_TIMED_OUT)
  private Boolean isTimedOut;

  public TransactionStatus() {
  }

  public TransactionStatus transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction ID of the transaction
   * @return transactionId
  **/
  @javax.annotation.Nullable

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public TransactionStatus transactionRecordId(String transactionRecordId) {
    
    this.transactionRecordId = transactionRecordId;
    return this;
  }

   /**
   * Transaction Record ID of the transaction available once the transaction has finished processing
   * @return transactionRecordId
  **/
  @javax.annotation.Nullable

  public String getTransactionRecordId() {
    return transactionRecordId;
  }


  public void setTransactionRecordId(String transactionRecordId) {
    this.transactionRecordId = transactionRecordId;
  }


  public TransactionStatus status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the transaction. Possible Values: Uploading, Processing, Completed, InProgress, Failed, WaitAsync, ToBeResumed, Canceled, TimeoutCanceled. Call GetTransactionRecord when status changes to Completed, Failed, Canceled or TimeoutCanceled to get the verification results.
   * @return status
  **/
  @javax.annotation.Nullable

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TransactionStatus uploadedDt(OffsetDateTime uploadedDt) {
    
    this.uploadedDt = uploadedDt;
    return this;
  }

   /**
   * Uploaded date for transaction
   * @return uploadedDt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUploadedDt() {
    return uploadedDt;
  }


  public void setUploadedDt(OffsetDateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
  }


  public TransactionStatus isTimedOut(Boolean isTimedOut) {
    
    this.isTimedOut = isTimedOut;
    return this;
  }

   /**
   * Set to true when transaction has timed out
   * @return isTimedOut
  **/
  @javax.annotation.Nullable

  public Boolean getIsTimedOut() {
    return isTimedOut;
  }


  public void setIsTimedOut(Boolean isTimedOut) {
    this.isTimedOut = isTimedOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatus transactionStatus = (TransactionStatus) o;
    return Objects.equals(this.transactionId, transactionStatus.transactionId) &&
        Objects.equals(this.transactionRecordId, transactionStatus.transactionRecordId) &&
        Objects.equals(this.status, transactionStatus.status) &&
        Objects.equals(this.uploadedDt, transactionStatus.uploadedDt) &&
        Objects.equals(this.isTimedOut, transactionStatus.isTimedOut);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, transactionRecordId, status, uploadedDt, isTimedOut);
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
    sb.append("class TransactionStatus {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionRecordId: ").append(toIndentedString(transactionRecordId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedDt: ").append(toIndentedString(uploadedDt)).append("\n");
    sb.append("    isTimedOut: ").append(toIndentedString(isTimedOut)).append("\n");
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
    openapiFields.add("TransactionId");
    openapiFields.add("TransactionRecordId");
    openapiFields.add("Status");
    openapiFields.add("UploadedDt");
    openapiFields.add("IsTimedOut");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionStatus is not found in the empty JSON string", TransactionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TransactionId") != null && !jsonObj.get("TransactionId").isJsonNull()) && !jsonObj.get("TransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionId").toString()));
      }
      if ((jsonObj.get("TransactionRecordId") != null && !jsonObj.get("TransactionRecordId").isJsonNull()) && !jsonObj.get("TransactionRecordId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionRecordId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionRecordId").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionStatus>() {
           @Override
           public void write(JsonWriter out, TransactionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionStatus
  * @throws IOException if the JSON string is invalid with respect to TransactionStatus
  */
  public static TransactionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionStatus.class);
  }

 /**
  * Convert an instance of TransactionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

