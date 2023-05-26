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
 * RecordRule used for the transaction.
 */

public class RecordRule {
  public static final String SERIALIZED_NAME_RULE_NAME = "RuleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_NOTE = "Note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SECONDARY_RULE_NAME = "SecondaryRuleName";
  @SerializedName(SERIALIZED_NAME_SECONDARY_RULE_NAME)
  private String secondaryRuleName;

  public static final String SERIALIZED_NAME_SECONDARY_RULE_NOTE = "SecondaryRuleNote";
  @SerializedName(SERIALIZED_NAME_SECONDARY_RULE_NOTE)
  private String secondaryRuleNote;

  public RecordRule() {
  }

  public RecordRule ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of RecordRule.
   * @return ruleName
  **/
  @javax.annotation.Nullable

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public RecordRule note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Rule Description.
   * @return note
  **/
  @javax.annotation.Nullable

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public RecordRule secondaryRuleName(String secondaryRuleName) {
    
    this.secondaryRuleName = secondaryRuleName;
    return this;
  }

   /**
   * Name of the Secondary RecordRule.
   * @return secondaryRuleName
  **/
  @javax.annotation.Nullable

  public String getSecondaryRuleName() {
    return secondaryRuleName;
  }


  public void setSecondaryRuleName(String secondaryRuleName) {
    this.secondaryRuleName = secondaryRuleName;
  }


  public RecordRule secondaryRuleNote(String secondaryRuleNote) {
    
    this.secondaryRuleNote = secondaryRuleNote;
    return this;
  }

   /**
   * Secondary Rule Description.
   * @return secondaryRuleNote
  **/
  @javax.annotation.Nullable

  public String getSecondaryRuleNote() {
    return secondaryRuleNote;
  }


  public void setSecondaryRuleNote(String secondaryRuleNote) {
    this.secondaryRuleNote = secondaryRuleNote;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordRule recordRule = (RecordRule) o;
    return Objects.equals(this.ruleName, recordRule.ruleName) &&
        Objects.equals(this.note, recordRule.note) &&
        Objects.equals(this.secondaryRuleName, recordRule.secondaryRuleName) &&
        Objects.equals(this.secondaryRuleNote, recordRule.secondaryRuleNote);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleName, note, secondaryRuleName, secondaryRuleNote);
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
    sb.append("class RecordRule {\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    secondaryRuleName: ").append(toIndentedString(secondaryRuleName)).append("\n");
    sb.append("    secondaryRuleNote: ").append(toIndentedString(secondaryRuleNote)).append("\n");
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
    openapiFields.add("RuleName");
    openapiFields.add("Note");
    openapiFields.add("SecondaryRuleName");
    openapiFields.add("SecondaryRuleNote");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecordRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecordRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordRule is not found in the empty JSON string", RecordRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecordRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("RuleName") != null && !jsonObj.get("RuleName").isJsonNull()) && !jsonObj.get("RuleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RuleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RuleName").toString()));
      }
      if ((jsonObj.get("Note") != null && !jsonObj.get("Note").isJsonNull()) && !jsonObj.get("Note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Note").toString()));
      }
      if ((jsonObj.get("SecondaryRuleName") != null && !jsonObj.get("SecondaryRuleName").isJsonNull()) && !jsonObj.get("SecondaryRuleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondaryRuleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondaryRuleName").toString()));
      }
      if ((jsonObj.get("SecondaryRuleNote") != null && !jsonObj.get("SecondaryRuleNote").isJsonNull()) && !jsonObj.get("SecondaryRuleNote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondaryRuleNote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondaryRuleNote").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordRule.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordRule>() {
           @Override
           public void write(JsonWriter out, RecordRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecordRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordRule
  * @throws IOException if the JSON string is invalid with respect to RecordRule
  */
  public static RecordRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordRule.class);
  }

 /**
  * Convert an instance of RecordRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

