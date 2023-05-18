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

public class Document {
  public static final String SERIALIZED_NAME_DOCUMENT_FRONT_IMAGE = "DocumentFrontImage";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_FRONT_IMAGE)
  private byte[] documentFrontImage;

  public static final String SERIALIZED_NAME_DOCUMENT_BACK_IMAGE = "DocumentBackImage";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_BACK_IMAGE)
  private byte[] documentBackImage;

  public static final String SERIALIZED_NAME_LIVE_PHOTO = "LivePhoto";
  @SerializedName(SERIALIZED_NAME_LIVE_PHOTO)
  private byte[] livePhoto;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "DocumentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ACCEPT_INCOMPLETE_DOCUMENT = "AcceptIncompleteDocument";
  @SerializedName(SERIALIZED_NAME_ACCEPT_INCOMPLETE_DOCUMENT)
  private Boolean acceptIncompleteDocument;

  public static final String SERIALIZED_NAME_VALIDATE_DOCUMENT_IMAGE_QUALITY = "ValidateDocumentImageQuality";
  @SerializedName(SERIALIZED_NAME_VALIDATE_DOCUMENT_IMAGE_QUALITY)
  private Boolean validateDocumentImageQuality;

  public Document() {
  }

  public Document documentFrontImage(byte[] documentFrontImage) {
    
    this.documentFrontImage = documentFrontImage;
    return this;
  }

   /**
   * Front of the document
   * @return documentFrontImage
  **/
  @javax.annotation.Nullable

  public byte[] getDocumentFrontImage() {
    return documentFrontImage;
  }


  public void setDocumentFrontImage(byte[] documentFrontImage) {
    this.documentFrontImage = documentFrontImage;
  }


  public Document documentBackImage(byte[] documentBackImage) {
    
    this.documentBackImage = documentBackImage;
    return this;
  }

   /**
   * Back of the document
   * @return documentBackImage
  **/
  @javax.annotation.Nullable

  public byte[] getDocumentBackImage() {
    return documentBackImage;
  }


  public void setDocumentBackImage(byte[] documentBackImage) {
    this.documentBackImage = documentBackImage;
  }


  public Document livePhoto(byte[] livePhoto) {
    
    this.livePhoto = livePhoto;
    return this;
  }

   /**
   * Selfie image
   * @return livePhoto
  **/
  @javax.annotation.Nullable

  public byte[] getLivePhoto() {
    return livePhoto;
  }


  public void setLivePhoto(byte[] livePhoto) {
    this.livePhoto = livePhoto;
  }


  public Document documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Document type
   * @return documentType
  **/
  @javax.annotation.Nullable

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public Document acceptIncompleteDocument(Boolean acceptIncompleteDocument) {
    
    this.acceptIncompleteDocument = acceptIncompleteDocument;
    return this;
  }

   /**
   * Accept Incomplete Document
   * @return acceptIncompleteDocument
  **/
  @javax.annotation.Nullable

  public Boolean getAcceptIncompleteDocument() {
    return acceptIncompleteDocument;
  }


  public void setAcceptIncompleteDocument(Boolean acceptIncompleteDocument) {
    this.acceptIncompleteDocument = acceptIncompleteDocument;
  }


  public Document validateDocumentImageQuality(Boolean validateDocumentImageQuality) {
    
    this.validateDocumentImageQuality = validateDocumentImageQuality;
    return this;
  }

   /**
   * Validate Document Image Quality
   * @return validateDocumentImageQuality
  **/
  @javax.annotation.Nullable

  public Boolean getValidateDocumentImageQuality() {
    return validateDocumentImageQuality;
  }


  public void setValidateDocumentImageQuality(Boolean validateDocumentImageQuality) {
    this.validateDocumentImageQuality = validateDocumentImageQuality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Arrays.equals(this.documentFrontImage, document.documentFrontImage) &&
        Arrays.equals(this.documentBackImage, document.documentBackImage) &&
        Arrays.equals(this.livePhoto, document.livePhoto) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.acceptIncompleteDocument, document.acceptIncompleteDocument) &&
        Objects.equals(this.validateDocumentImageQuality, document.validateDocumentImageQuality);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(documentFrontImage), Arrays.hashCode(documentBackImage), Arrays.hashCode(livePhoto), documentType, acceptIncompleteDocument, validateDocumentImageQuality);
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
    sb.append("class Document {\n");
    sb.append("    documentFrontImage: ").append(toIndentedString(documentFrontImage)).append("\n");
    sb.append("    documentBackImage: ").append(toIndentedString(documentBackImage)).append("\n");
    sb.append("    livePhoto: ").append(toIndentedString(livePhoto)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    acceptIncompleteDocument: ").append(toIndentedString(acceptIncompleteDocument)).append("\n");
    sb.append("    validateDocumentImageQuality: ").append(toIndentedString(validateDocumentImageQuality)).append("\n");
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
    openapiFields.add("DocumentFrontImage");
    openapiFields.add("DocumentBackImage");
    openapiFields.add("LivePhoto");
    openapiFields.add("DocumentType");
    openapiFields.add("AcceptIncompleteDocument");
    openapiFields.add("ValidateDocumentImageQuality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Document
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Document.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Document is not found in the empty JSON string", Document.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Document.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Document` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DocumentType") != null && !jsonObj.get("DocumentType").isJsonNull()) && !jsonObj.get("DocumentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Document.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Document' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Document> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Document.class));

       return (TypeAdapter<T>) new TypeAdapter<Document>() {
           @Override
           public void write(JsonWriter out, Document value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Document read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Document given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Document
  * @throws IOException if the JSON string is invalid with respect to Document
  */
  public static Document fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Document.class);
  }

 /**
  * Convert an instance of Document to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

