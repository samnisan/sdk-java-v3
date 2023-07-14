package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.PersonOfSignificantControl;
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

public class Business {
  public static final String SERIALIZED_NAME_BUSINESS_NAME = "BusinessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_TRADESTYLE_NAME = "TradestyleName";
  @SerializedName(SERIALIZED_NAME_TRADESTYLE_NAME)
  private String tradestyleName;

  public static final String SERIALIZED_NAME_TAX_I_D_NUMBER = "TaxIDNumber";
  @SerializedName(SERIALIZED_NAME_TAX_I_D_NUMBER)
  private String taxIDNumber;

  public static final String SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER = "BusinessRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER)
  private String businessRegistrationNumber;

  public static final String SERIALIZED_NAME_DAY_OF_INCORPORATION = "DayOfIncorporation";
  @SerializedName(SERIALIZED_NAME_DAY_OF_INCORPORATION)
  private Integer dayOfIncorporation;

  public static final String SERIALIZED_NAME_MONTH_OF_INCORPORATION = "MonthOfIncorporation";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_INCORPORATION)
  private Integer monthOfIncorporation;

  public static final String SERIALIZED_NAME_YEAR_OF_INCORPORATION = "YearOfIncorporation";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_INCORPORATION)
  private Integer yearOfIncorporation;

  public static final String SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION = "JurisdictionOfIncorporation";
  @SerializedName(SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION)
  private String jurisdictionOfIncorporation;

  public static final String SERIALIZED_NAME_SHAREHOLDER_LIST_DOCUMENT = "ShareholderListDocument";
  @SerializedName(SERIALIZED_NAME_SHAREHOLDER_LIST_DOCUMENT)
  private Boolean shareholderListDocument;

  public static final String SERIALIZED_NAME_FINANCIAL_INFORMATION_DOCUMENT = "FinancialInformationDocument";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INFORMATION_DOCUMENT)
  private Boolean financialInformationDocument;

  public static final String SERIALIZED_NAME_DUNS_NUMBER = "DUNSNumber";
  @SerializedName(SERIALIZED_NAME_DUNS_NUMBER)
  private String dunsNumber;

  public static final String SERIALIZED_NAME_ENHANCED_PROFILE = "EnhancedProfile";
  @SerializedName(SERIALIZED_NAME_ENHANCED_PROFILE)
  private Boolean enhancedProfile;
  
  public static final String SERIALIZED_NAME_ENTITIES = "Entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private Boolean entities;

  public static final String SERIALIZED_NAME_PEOPLE_OF_SIGNIFICANT_CONTROL = "PeopleOfSignificantControl";
  @SerializedName(SERIALIZED_NAME_PEOPLE_OF_SIGNIFICANT_CONTROL)
  private List<PersonOfSignificantControl> peopleOfSignificantControl;

  public static final String SERIALIZED_NAME_FILINGS = "Filings";
  @SerializedName(SERIALIZED_NAME_FILINGS)
  private Boolean filings;

  public static final String SERIALIZED_NAME_ARTICLE_OF_ASSOCIATION = "ArticleOfAssociation";
  @SerializedName(SERIALIZED_NAME_ARTICLE_OF_ASSOCIATION)
  private Boolean articleOfAssociation;

  public static final String SERIALIZED_NAME_REGISTRATION_DETAILS = "RegistrationDetails";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DETAILS)
  private Boolean registrationDetails;

  public static final String SERIALIZED_NAME_ANNUAL_REPORT = "AnnualReport";
  @SerializedName(SERIALIZED_NAME_ANNUAL_REPORT)
  private Boolean annualReport;

  public Business() {
  }

  public Business businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business to be verified
   * @return businessName
  **/
  @javax.annotation.Nullable

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Business tradestyleName(String tradestyleName) {
    
    this.tradestyleName = tradestyleName;
    return this;
  }

   /**
   * Trade Style Name of the business to be verified
   * @return tradestyleName
  **/
  @javax.annotation.Nullable

  public String getTradestyleName() {
    return tradestyleName;
  }


  public void setTradestyleName(String tradestyleName) {
    this.tradestyleName = tradestyleName;
  }


  public Business taxIDNumber(String taxIDNumber) {
    
    this.taxIDNumber = taxIDNumber;
    return this;
  }

   /**
   * Tax ID Number of the business to be verified
   * @return taxIDNumber
  **/
  @javax.annotation.Nullable

  public String getTaxIDNumber() {
    return taxIDNumber;
  }


  public void setTaxIDNumber(String taxIDNumber) {
    this.taxIDNumber = taxIDNumber;
  }


  public Business businessRegistrationNumber(String businessRegistrationNumber) {
    
    this.businessRegistrationNumber = businessRegistrationNumber;
    return this;
  }

   /**
   * Registration number of business to be verified
   * @return businessRegistrationNumber
  **/
  @javax.annotation.Nullable

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }


  public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
  }


  public Business dayOfIncorporation(Integer dayOfIncorporation) {
    
    this.dayOfIncorporation = dayOfIncorporation;
    return this;
  }

   /**
   * Day of incorporation of the business to be verified
   * @return dayOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getDayOfIncorporation() {
    return dayOfIncorporation;
  }


  public void setDayOfIncorporation(Integer dayOfIncorporation) {
    this.dayOfIncorporation = dayOfIncorporation;
  }


  public Business monthOfIncorporation(Integer monthOfIncorporation) {
    
    this.monthOfIncorporation = monthOfIncorporation;
    return this;
  }

   /**
   * Month of incorporation of the business to be verified
   * @return monthOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getMonthOfIncorporation() {
    return monthOfIncorporation;
  }


  public void setMonthOfIncorporation(Integer monthOfIncorporation) {
    this.monthOfIncorporation = monthOfIncorporation;
  }


  public Business yearOfIncorporation(Integer yearOfIncorporation) {
    
    this.yearOfIncorporation = yearOfIncorporation;
    return this;
  }

   /**
   * Year of incorporation of the business to be verified
   * @return yearOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getYearOfIncorporation() {
    return yearOfIncorporation;
  }


  public void setYearOfIncorporation(Integer yearOfIncorporation) {
    this.yearOfIncorporation = yearOfIncorporation;
  }


  public Business jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * Jurisdiction Of Incorporation of the business to be verified
   * @return jurisdictionOfIncorporation
  **/
  @javax.annotation.Nullable

  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }


  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }


  public Business shareholderListDocument(Boolean shareholderListDocument) {
    
    this.shareholderListDocument = shareholderListDocument;
    return this;
  }

   /**
   * Whether or not to retrieve shareholderList document
   * @return shareholderListDocument
  **/
  @javax.annotation.Nullable

  public Boolean getShareholderListDocument() {
    return shareholderListDocument;
  }


  public void setShareholderListDocument(Boolean shareholderListDocument) {
    this.shareholderListDocument = shareholderListDocument;
  }


  public Business financialInformationDocument(Boolean financialInformationDocument) {
    
    this.financialInformationDocument = financialInformationDocument;
    return this;
  }

   /**
   * Whether or not to retrieve financial information document
   * @return financialInformationDocument
  **/
  @javax.annotation.Nullable

  public Boolean getFinancialInformationDocument() {
    return financialInformationDocument;
  }


  public void setFinancialInformationDocument(Boolean financialInformationDocument) {
    this.financialInformationDocument = financialInformationDocument;
  }


  public Business dunsNumber(String dunsNumber) {
    
    this.dunsNumber = dunsNumber;
    return this;
  }

   /**
   * Duns Number
   * @return dunsNumber
  **/
  @javax.annotation.Nullable

  public String getDunsNumber() {
    return dunsNumber;
  }


  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }

  public Business enhancedProfile(Boolean enhancedProfile) {
    
    this.enhancedProfile = enhancedProfile;
    return this;
  }

   /**
   * Whether or not to retrieve enhancedProfile detail
   * @return enhancedProfile
  **/
  @javax.annotation.Nullable

  public Boolean getEnhancedProfile() {
    return enhancedProfile;
  }


  public void setEnhancedProfile(Boolean enhancedProfile) {
    this.enhancedProfile = enhancedProfile;
  }


  public Business entities(Boolean entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Whether or not to retrieve entity detail
   * @return entities
  **/
  @javax.annotation.Nullable

  public Boolean getEntities() {
    return entities;
  }


  public void setEntities(Boolean entities) {
    this.entities = entities;
  }


  public Business peopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
    
    this.peopleOfSignificantControl = peopleOfSignificantControl;
    return this;
  }

  public Business addPeopleOfSignificantControlItem(PersonOfSignificantControl peopleOfSignificantControlItem) {
    if (this.peopleOfSignificantControl == null) {
      this.peopleOfSignificantControl = new ArrayList<>();
    }
    this.peopleOfSignificantControl.add(peopleOfSignificantControlItem);
    return this;
  }

   /**
   * A list of people to check for their matchstatus
   * @return peopleOfSignificantControl
  **/
  @javax.annotation.Nullable

  public List<PersonOfSignificantControl> getPeopleOfSignificantControl() {
    return peopleOfSignificantControl;
  }


  public void setPeopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
    this.peopleOfSignificantControl = peopleOfSignificantControl;
  }


  public Business filings(Boolean filings) {
    
    this.filings = filings;
    return this;
  }

   /**
   * Whether or not to retrieve filing detail
   * @return filings
  **/
  @javax.annotation.Nullable

  public Boolean getFilings() {
    return filings;
  }


  public void setFilings(Boolean filings) {
    this.filings = filings;
  }


  public Business articleOfAssociation(Boolean articleOfAssociation) {
    
    this.articleOfAssociation = articleOfAssociation;
    return this;
  }

   /**
   * Whether or not to retrieve article of association document
   * @return articleOfAssociation
  **/
  @javax.annotation.Nullable

  public Boolean getArticleOfAssociation() {
    return articleOfAssociation;
  }


  public void setArticleOfAssociation(Boolean articleOfAssociation) {
    this.articleOfAssociation = articleOfAssociation;
  }


  public Business registrationDetails(Boolean registrationDetails) {
    
    this.registrationDetails = registrationDetails;
    return this;
  }

   /**
   * Whether or not to retrieve registration detail document
   * @return registrationDetails
  **/
  @javax.annotation.Nullable

  public Boolean getRegistrationDetails() {
    return registrationDetails;
  }


  public void setRegistrationDetails(Boolean registrationDetails) {
    this.registrationDetails = registrationDetails;
  }


  public Business annualReport(Boolean annualReport) {
    
    this.annualReport = annualReport;
    return this;
  }

   /**
   * Whether or not to retrieve annual report document
   * @return annualReport
  **/
  @javax.annotation.Nullable

  public Boolean getAnnualReport() {
    return annualReport;
  }


  public void setAnnualReport(Boolean annualReport) {
    this.annualReport = annualReport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Business business = (Business) o;
    return Objects.equals(this.businessName, business.businessName) &&
        Objects.equals(this.tradestyleName, business.tradestyleName) &&
        Objects.equals(this.taxIDNumber, business.taxIDNumber) &&
        Objects.equals(this.businessRegistrationNumber, business.businessRegistrationNumber) &&
        Objects.equals(this.dayOfIncorporation, business.dayOfIncorporation) &&
        Objects.equals(this.monthOfIncorporation, business.monthOfIncorporation) &&
        Objects.equals(this.yearOfIncorporation, business.yearOfIncorporation) &&
        Objects.equals(this.jurisdictionOfIncorporation, business.jurisdictionOfIncorporation) &&
        Objects.equals(this.shareholderListDocument, business.shareholderListDocument) &&
        Objects.equals(this.financialInformationDocument, business.financialInformationDocument) &&
        Objects.equals(this.dunsNumber, business.dunsNumber) &&
        Objects.equals(this.enhancedProfile, business.enhancedProfile) &&
        Objects.equals(this.entities, business.entities) &&
        Objects.equals(this.peopleOfSignificantControl, business.peopleOfSignificantControl) &&
        Objects.equals(this.filings, business.filings) &&
        Objects.equals(this.articleOfAssociation, business.articleOfAssociation) &&
        Objects.equals(this.registrationDetails, business.registrationDetails) &&
        Objects.equals(this.annualReport, business.annualReport);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, tradestyleName, taxIDNumber, businessRegistrationNumber, dayOfIncorporation, monthOfIncorporation, yearOfIncorporation, jurisdictionOfIncorporation, shareholderListDocument, financialInformationDocument, dunsNumber, enhancedProfile, entities, peopleOfSignificantControl, filings, articleOfAssociation, registrationDetails, annualReport);
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
    sb.append("class Business {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    tradestyleName: ").append(toIndentedString(tradestyleName)).append("\n");
    sb.append("    taxIDNumber: ").append(toIndentedString(taxIDNumber)).append("\n");
    sb.append("    businessRegistrationNumber: ").append(toIndentedString(businessRegistrationNumber)).append("\n");
    sb.append("    dayOfIncorporation: ").append(toIndentedString(dayOfIncorporation)).append("\n");
    sb.append("    monthOfIncorporation: ").append(toIndentedString(monthOfIncorporation)).append("\n");
    sb.append("    yearOfIncorporation: ").append(toIndentedString(yearOfIncorporation)).append("\n");
    sb.append("    jurisdictionOfIncorporation: ").append(toIndentedString(jurisdictionOfIncorporation)).append("\n");
    sb.append("    shareholderListDocument: ").append(toIndentedString(shareholderListDocument)).append("\n");
    sb.append("    financialInformationDocument: ").append(toIndentedString(financialInformationDocument)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("    enhancedProfile: ").append(toIndentedString(enhancedProfile)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    peopleOfSignificantControl: ").append(toIndentedString(peopleOfSignificantControl)).append("\n");
    sb.append("    filings: ").append(toIndentedString(filings)).append("\n");
    sb.append("    articleOfAssociation: ").append(toIndentedString(articleOfAssociation)).append("\n");
    sb.append("    registrationDetails: ").append(toIndentedString(registrationDetails)).append("\n");
    sb.append("    annualReport: ").append(toIndentedString(annualReport)).append("\n");
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
    openapiFields.add("BusinessName");
    openapiFields.add("TradestyleName");
    openapiFields.add("TaxIDNumber");
    openapiFields.add("BusinessRegistrationNumber");
    openapiFields.add("DayOfIncorporation");
    openapiFields.add("MonthOfIncorporation");
    openapiFields.add("YearOfIncorporation");
    openapiFields.add("JurisdictionOfIncorporation");
    openapiFields.add("ShareholderListDocument");
    openapiFields.add("FinancialInformationDocument");
    openapiFields.add("DunsNumber");
    openapiFields.add("EnhancedProfile");
    openapiFields.add("Entities");
    openapiFields.add("PeopleOfSignificantControl");
    openapiFields.add("Filings");
    openapiFields.add("ArticleOfAssociation");
    openapiFields.add("RegistrationDetails");
    openapiFields.add("AnnualReport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Business
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Business.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Business is not found in the empty JSON string", Business.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Business.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Business` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("BusinessName") != null && !jsonObj.get("BusinessName").isJsonNull()) && !jsonObj.get("BusinessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessName").toString()));
      }
      if ((jsonObj.get("TradestyleName") != null && !jsonObj.get("TradestyleName").isJsonNull()) && !jsonObj.get("TradestyleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TradestyleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TradestyleName").toString()));
      }
      if ((jsonObj.get("TaxIDNumber") != null && !jsonObj.get("TaxIDNumber").isJsonNull()) && !jsonObj.get("TaxIDNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxIDNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxIDNumber").toString()));
      }
      if ((jsonObj.get("BusinessRegistrationNumber") != null && !jsonObj.get("BusinessRegistrationNumber").isJsonNull()) && !jsonObj.get("BusinessRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessRegistrationNumber").toString()));
      }
      if ((jsonObj.get("JurisdictionOfIncorporation") != null && !jsonObj.get("JurisdictionOfIncorporation").isJsonNull()) && !jsonObj.get("JurisdictionOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JurisdictionOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JurisdictionOfIncorporation").toString()));
      }
      if ((jsonObj.get("DunsNumber") != null && !jsonObj.get("DunsNumber").isJsonNull()) && !jsonObj.get("DunsNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DunsNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DunsNumber").toString()));
      }
      if (jsonObj.get("PeopleOfSignificantControl") != null && !jsonObj.get("PeopleOfSignificantControl").isJsonNull()) {
        JsonArray jsonArraypeopleOfSignificantControl = jsonObj.getAsJsonArray("PeopleOfSignificantControl");
        if (jsonArraypeopleOfSignificantControl != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PeopleOfSignificantControl").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PeopleOfSignificantControl` to be an array in the JSON string but got `%s`", jsonObj.get("PeopleOfSignificantControl").toString()));
          }

          // validate the optional field `PeopleOfSignificantControl` (array)
          for (int i = 0; i < jsonArraypeopleOfSignificantControl.size(); i++) {
            PersonOfSignificantControl.validateJsonObject(jsonArraypeopleOfSignificantControl.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Business.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Business' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Business> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Business.class));

       return (TypeAdapter<T>) new TypeAdapter<Business>() {
           @Override
           public void write(JsonWriter out, Business value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Business read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Business given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Business
  * @throws IOException if the JSON string is invalid with respect to Business
  */
  public static Business fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Business.class);
  }

 /**
  * Convert an instance of Business to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

