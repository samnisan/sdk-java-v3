package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.Address;
import com.trulioo.normalizedapi.model.BusinessSearchResponseIndustryCode;
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
 * Result
 */

public class Result {
  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "BusinessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_MATCHING_SCORE = "MatchingScore";
  @SerializedName(SERIALIZED_NAME_MATCHING_SCORE)
  private String matchingScore;

  public static final String SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER = "BusinessRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER)
  private String businessRegistrationNumber;

  public static final String SERIALIZED_NAME_DUNS_NUMBER = "dunsNumber";
  @SerializedName(SERIALIZED_NAME_DUNS_NUMBER)
  private String dunsNumber;

  public static final String SERIALIZED_NAME_BUSINESS_TAX_I_D_NUMBER = "BusinessTaxIDNumber";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TAX_I_D_NUMBER)
  private String businessTaxIDNumber;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_NUMBER = "BusinessLicenseNumber";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_NUMBER)
  private String businessLicenseNumber;

  public static final String SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION = "JurisdictionOfIncorporation";
  @SerializedName(SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION)
  private String jurisdictionOfIncorporation;

  public static final String SERIALIZED_NAME_FULL_ADDRESS = "FullAddress";
  @SerializedName(SERIALIZED_NAME_FULL_ADDRESS)
  private String fullAddress;

  public static final String SERIALIZED_NAME_BUSINESS_STATUS = "BusinessStatus";
  @SerializedName(SERIALIZED_NAME_BUSINESS_STATUS)
  private String businessStatus;

  public static final String SERIALIZED_NAME_ORIGINAL_BUSINESS_STATUS = "OriginalBusinessStatus";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_BUSINESS_STATUS)
  private String originalBusinessStatus;

  public static final String SERIALIZED_NAME_TRADE_STYLE_NAME = "TradeStyleName";
  @SerializedName(SERIALIZED_NAME_TRADE_STYLE_NAME)
  private String tradeStyleName;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "BusinessType";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_OTHER_BUSINESS_NAMES = "OtherBusinessNames";
  @SerializedName(SERIALIZED_NAME_OTHER_BUSINESS_NAMES)
  private List<String> otherBusinessNames;

  public static final String SERIALIZED_NAME_WEBSITE = "Website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_TELEPHONE = "Telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TAX_I_D_NUMBER = "TaxIDNumber";
  @SerializedName(SERIALIZED_NAME_TAX_I_D_NUMBER)
  private String taxIDNumber;

  public static final String SERIALIZED_NAME_TAX_I_D_NUMBERS = "TaxIDNumbers";
  @SerializedName(SERIALIZED_NAME_TAX_I_D_NUMBERS)
  private List<String> taxIDNumbers;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_WEB_DOMAIN = "WebDomain";
  @SerializedName(SERIALIZED_NAME_WEB_DOMAIN)
  private String webDomain;

  public static final String SERIALIZED_NAME_WEB_DOMAINS = "WebDomains";
  @SerializedName(SERIALIZED_NAME_WEB_DOMAINS)
  private List<String> webDomains;

  public static final String SERIALIZED_NAME_NAICS = "Naics";
  @SerializedName(SERIALIZED_NAME_NAICS)
  private List<BusinessSearchResponseIndustryCode> naics;

  public static final String SERIALIZED_NAME_SIC = "Sic";
  @SerializedName(SERIALIZED_NAME_SIC)
  private List<BusinessSearchResponseIndustryCode> sic;

  public Result() {
  }

  public Result index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * 
   * @return index
  **/
  @javax.annotation.Nullable

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public Result businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * 
   * @return businessName
  **/
  @javax.annotation.Nullable

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Result matchingScore(String matchingScore) {
    
    this.matchingScore = matchingScore;
    return this;
  }

   /**
   * 
   * @return matchingScore
  **/
  @javax.annotation.Nullable

  public String getMatchingScore() {
    return matchingScore;
  }


  public void setMatchingScore(String matchingScore) {
    this.matchingScore = matchingScore;
  }


  public Result businessRegistrationNumber(String businessRegistrationNumber) {
    
    this.businessRegistrationNumber = businessRegistrationNumber;
    return this;
  }

   /**
   * 
   * @return businessRegistrationNumber
  **/
  @javax.annotation.Nullable

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }


  public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
  }


  public Result dunsNumber(String dunsNumber) {
    
    this.dunsNumber = dunsNumber;
    return this;
  }

   /**
   * 
   * @return dunsNumber
  **/
  @javax.annotation.Nullable

  public String getDunsNumber() {
    return dunsNumber;
  }


  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }


  public Result businessTaxIDNumber(String businessTaxIDNumber) {
    
    this.businessTaxIDNumber = businessTaxIDNumber;
    return this;
  }

   /**
   * 
   * @return businessTaxIDNumber
  **/
  @javax.annotation.Nullable

  public String getBusinessTaxIDNumber() {
    return businessTaxIDNumber;
  }


  public void setBusinessTaxIDNumber(String businessTaxIDNumber) {
    this.businessTaxIDNumber = businessTaxIDNumber;
  }


  public Result businessLicenseNumber(String businessLicenseNumber) {
    
    this.businessLicenseNumber = businessLicenseNumber;
    return this;
  }

   /**
   * 
   * @return businessLicenseNumber
  **/
  @javax.annotation.Nullable

  public String getBusinessLicenseNumber() {
    return businessLicenseNumber;
  }


  public void setBusinessLicenseNumber(String businessLicenseNumber) {
    this.businessLicenseNumber = businessLicenseNumber;
  }


  public Result jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * 
   * @return jurisdictionOfIncorporation
  **/
  @javax.annotation.Nullable

  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }


  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }


  public Result fullAddress(String fullAddress) {
    
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * 
   * @return fullAddress
  **/
  @javax.annotation.Nullable

  public String getFullAddress() {
    return fullAddress;
  }


  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  public Result businessStatus(String businessStatus) {
    
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Business Status
   * @return businessStatus
  **/
  @javax.annotation.Nullable

  public String getBusinessStatus() {
    return businessStatus;
  }


  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }


  public Result originalBusinessStatus(String originalBusinessStatus) {
    
    this.originalBusinessStatus = originalBusinessStatus;
    return this;
  }

   /**
   * Original Business Status
   * @return originalBusinessStatus
  **/
  @javax.annotation.Nullable

  public String getOriginalBusinessStatus() {
    return originalBusinessStatus;
  }


  public void setOriginalBusinessStatus(String originalBusinessStatus) {
    this.originalBusinessStatus = originalBusinessStatus;
  }


  public Result tradeStyleName(String tradeStyleName) {
    
    this.tradeStyleName = tradeStyleName;
    return this;
  }

   /**
   * Trade Style Name
   * @return tradeStyleName
  **/
  @javax.annotation.Nullable

  public String getTradeStyleName() {
    return tradeStyleName;
  }


  public void setTradeStyleName(String tradeStyleName) {
    this.tradeStyleName = tradeStyleName;
  }


  public Result businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Business Type
   * @return businessType
  **/
  @javax.annotation.Nullable

  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public Result address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public Result otherBusinessNames(List<String> otherBusinessNames) {
    
    this.otherBusinessNames = otherBusinessNames;
    return this;
  }

  public Result addOtherBusinessNamesItem(String otherBusinessNamesItem) {
    if (this.otherBusinessNames == null) {
      this.otherBusinessNames = new ArrayList<>();
    }
    this.otherBusinessNames.add(otherBusinessNamesItem);
    return this;
  }

   /**
   * 
   * @return otherBusinessNames
  **/
  @javax.annotation.Nullable

  public List<String> getOtherBusinessNames() {
    return otherBusinessNames;
  }


  public void setOtherBusinessNames(List<String> otherBusinessNames) {
    this.otherBusinessNames = otherBusinessNames;
  }


  public Result website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * 
   * @return website
  **/
  @javax.annotation.Nullable

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public Result telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 
   * @return telephone
  **/
  @javax.annotation.Nullable

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Result taxIDNumber(String taxIDNumber) {
    
    this.taxIDNumber = taxIDNumber;
    return this;
  }

   /**
   * 
   * @return taxIDNumber
  **/
  @javax.annotation.Nullable

  public String getTaxIDNumber() {
    return taxIDNumber;
  }


  public void setTaxIDNumber(String taxIDNumber) {
    this.taxIDNumber = taxIDNumber;
  }


  public Result taxIDNumbers(List<String> taxIDNumbers) {
    
    this.taxIDNumbers = taxIDNumbers;
    return this;
  }

  public Result addTaxIDNumbersItem(String taxIDNumbersItem) {
    if (this.taxIDNumbers == null) {
      this.taxIDNumbers = new ArrayList<>();
    }
    this.taxIDNumbers.add(taxIDNumbersItem);
    return this;
  }

   /**
   * 
   * @return taxIDNumbers
  **/
  @javax.annotation.Nullable

  public List<String> getTaxIDNumbers() {
    return taxIDNumbers;
  }


  public void setTaxIDNumbers(List<String> taxIDNumbers) {
    this.taxIDNumbers = taxIDNumbers;
  }


  public Result emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 
   * @return emailAddress
  **/
  @javax.annotation.Nullable

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Result webDomain(String webDomain) {
    
    this.webDomain = webDomain;
    return this;
  }

   /**
   * 
   * @return webDomain
  **/
  @javax.annotation.Nullable

  public String getWebDomain() {
    return webDomain;
  }


  public void setWebDomain(String webDomain) {
    this.webDomain = webDomain;
  }


  public Result webDomains(List<String> webDomains) {
    
    this.webDomains = webDomains;
    return this;
  }

  public Result addWebDomainsItem(String webDomainsItem) {
    if (this.webDomains == null) {
      this.webDomains = new ArrayList<>();
    }
    this.webDomains.add(webDomainsItem);
    return this;
  }

   /**
   * 
   * @return webDomains
  **/
  @javax.annotation.Nullable

  public List<String> getWebDomains() {
    return webDomains;
  }


  public void setWebDomains(List<String> webDomains) {
    this.webDomains = webDomains;
  }


  public Result naics(List<BusinessSearchResponseIndustryCode> naics) {
    
    this.naics = naics;
    return this;
  }

  public Result addNaicsItem(BusinessSearchResponseIndustryCode naicsItem) {
    if (this.naics == null) {
      this.naics = new ArrayList<>();
    }
    this.naics.add(naicsItem);
    return this;
  }

   /**
   * North American Industry Classification System
   * @return naics
  **/
  @javax.annotation.Nullable

  public List<BusinessSearchResponseIndustryCode> getNaics() {
    return naics;
  }


  public void setNaics(List<BusinessSearchResponseIndustryCode> naics) {
    this.naics = naics;
  }


  public Result sic(List<BusinessSearchResponseIndustryCode> sic) {
    
    this.sic = sic;
    return this;
  }

  public Result addSicItem(BusinessSearchResponseIndustryCode sicItem) {
    if (this.sic == null) {
      this.sic = new ArrayList<>();
    }
    this.sic.add(sicItem);
    return this;
  }

   /**
   * Standard Industrial Classification
   * @return sic
  **/
  @javax.annotation.Nullable

  public List<BusinessSearchResponseIndustryCode> getSic() {
    return sic;
  }


  public void setSic(List<BusinessSearchResponseIndustryCode> sic) {
    this.sic = sic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.index, result.index) &&
        Objects.equals(this.businessName, result.businessName) &&
        Objects.equals(this.matchingScore, result.matchingScore) &&
        Objects.equals(this.businessRegistrationNumber, result.businessRegistrationNumber) &&
        Objects.equals(this.dunsNumber, result.dunsNumber) &&
        Objects.equals(this.businessTaxIDNumber, result.businessTaxIDNumber) &&
        Objects.equals(this.businessLicenseNumber, result.businessLicenseNumber) &&
        Objects.equals(this.jurisdictionOfIncorporation, result.jurisdictionOfIncorporation) &&
        Objects.equals(this.fullAddress, result.fullAddress) &&
        Objects.equals(this.businessStatus, result.businessStatus) &&
        Objects.equals(this.originalBusinessStatus, result.originalBusinessStatus) &&
        Objects.equals(this.tradeStyleName, result.tradeStyleName) &&
        Objects.equals(this.businessType, result.businessType) &&
        Objects.equals(this.address, result.address) &&
        Objects.equals(this.otherBusinessNames, result.otherBusinessNames) &&
        Objects.equals(this.website, result.website) &&
        Objects.equals(this.telephone, result.telephone) &&
        Objects.equals(this.taxIDNumber, result.taxIDNumber) &&
        Objects.equals(this.taxIDNumbers, result.taxIDNumbers) &&
        Objects.equals(this.emailAddress, result.emailAddress) &&
        Objects.equals(this.webDomain, result.webDomain) &&
        Objects.equals(this.webDomains, result.webDomains) &&
        Objects.equals(this.naics, result.naics) &&
        Objects.equals(this.sic, result.sic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, businessName, matchingScore, businessRegistrationNumber, dunsNumber, businessTaxIDNumber, businessLicenseNumber, jurisdictionOfIncorporation, fullAddress, businessStatus, originalBusinessStatus, tradeStyleName, businessType, address, otherBusinessNames, website, telephone, taxIDNumber, taxIDNumbers, emailAddress, webDomain, webDomains, naics, sic);
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
    sb.append("class Result {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    matchingScore: ").append(toIndentedString(matchingScore)).append("\n");
    sb.append("    businessRegistrationNumber: ").append(toIndentedString(businessRegistrationNumber)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("    businessTaxIDNumber: ").append(toIndentedString(businessTaxIDNumber)).append("\n");
    sb.append("    businessLicenseNumber: ").append(toIndentedString(businessLicenseNumber)).append("\n");
    sb.append("    jurisdictionOfIncorporation: ").append(toIndentedString(jurisdictionOfIncorporation)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    originalBusinessStatus: ").append(toIndentedString(originalBusinessStatus)).append("\n");
    sb.append("    tradeStyleName: ").append(toIndentedString(tradeStyleName)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    otherBusinessNames: ").append(toIndentedString(otherBusinessNames)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    taxIDNumber: ").append(toIndentedString(taxIDNumber)).append("\n");
    sb.append("    taxIDNumbers: ").append(toIndentedString(taxIDNumbers)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    webDomain: ").append(toIndentedString(webDomain)).append("\n");
    sb.append("    webDomains: ").append(toIndentedString(webDomains)).append("\n");
    sb.append("    naics: ").append(toIndentedString(naics)).append("\n");
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
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
    openapiFields.add("Index");
    openapiFields.add("BusinessName");
    openapiFields.add("MatchingScore");
    openapiFields.add("BusinessRegistrationNumber");
    openapiFields.add("dunsNumber");
    openapiFields.add("BusinessTaxIDNumber");
    openapiFields.add("BusinessLicenseNumber");
    openapiFields.add("JurisdictionOfIncorporation");
    openapiFields.add("FullAddress");
    openapiFields.add("BusinessStatus");
    openapiFields.add("OriginalBusinessStatus");
    openapiFields.add("TradeStyleName");
    openapiFields.add("BusinessType");
    openapiFields.add("Address");
    openapiFields.add("OtherBusinessNames");
    openapiFields.add("Website");
    openapiFields.add("Telephone");
    openapiFields.add("TaxIDNumber");
    openapiFields.add("TaxIDNumbers");
    openapiFields.add("EmailAddress");
    openapiFields.add("WebDomain");
    openapiFields.add("WebDomains");
    openapiFields.add("Naics");
    openapiFields.add("Sic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Result
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Result.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Result is not found in the empty JSON string", Result.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Result.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Result` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Index") != null && !jsonObj.get("Index").isJsonNull()) && !jsonObj.get("Index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Index").toString()));
      }
      if ((jsonObj.get("BusinessName") != null && !jsonObj.get("BusinessName").isJsonNull()) && !jsonObj.get("BusinessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessName").toString()));
      }
      if ((jsonObj.get("MatchingScore") != null && !jsonObj.get("MatchingScore").isJsonNull()) && !jsonObj.get("MatchingScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MatchingScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MatchingScore").toString()));
      }
      if ((jsonObj.get("BusinessRegistrationNumber") != null && !jsonObj.get("BusinessRegistrationNumber").isJsonNull()) && !jsonObj.get("BusinessRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessRegistrationNumber").toString()));
      }
      if ((jsonObj.get("dunsNumber") != null && !jsonObj.get("dunsNumber").isJsonNull()) && !jsonObj.get("dunsNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dunsNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dunsNumber").toString()));
      }
      if ((jsonObj.get("BusinessTaxIDNumber") != null && !jsonObj.get("BusinessTaxIDNumber").isJsonNull()) && !jsonObj.get("BusinessTaxIDNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessTaxIDNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessTaxIDNumber").toString()));
      }
      if ((jsonObj.get("BusinessLicenseNumber") != null && !jsonObj.get("BusinessLicenseNumber").isJsonNull()) && !jsonObj.get("BusinessLicenseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessLicenseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessLicenseNumber").toString()));
      }
      if ((jsonObj.get("JurisdictionOfIncorporation") != null && !jsonObj.get("JurisdictionOfIncorporation").isJsonNull()) && !jsonObj.get("JurisdictionOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JurisdictionOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JurisdictionOfIncorporation").toString()));
      }
      if ((jsonObj.get("FullAddress") != null && !jsonObj.get("FullAddress").isJsonNull()) && !jsonObj.get("FullAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FullAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FullAddress").toString()));
      }
      if ((jsonObj.get("BusinessStatus") != null && !jsonObj.get("BusinessStatus").isJsonNull()) && !jsonObj.get("BusinessStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessStatus").toString()));
      }
      if ((jsonObj.get("OriginalBusinessStatus") != null && !jsonObj.get("OriginalBusinessStatus").isJsonNull()) && !jsonObj.get("OriginalBusinessStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OriginalBusinessStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OriginalBusinessStatus").toString()));
      }
      if ((jsonObj.get("TradeStyleName") != null && !jsonObj.get("TradeStyleName").isJsonNull()) && !jsonObj.get("TradeStyleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TradeStyleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TradeStyleName").toString()));
      }
      if ((jsonObj.get("BusinessType") != null && !jsonObj.get("BusinessType").isJsonNull()) && !jsonObj.get("BusinessType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessType").toString()));
      }
      // validate the optional field `Address`
      if (jsonObj.get("Address") != null && !jsonObj.get("Address").isJsonNull()) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("Address"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("OtherBusinessNames") != null && !jsonObj.get("OtherBusinessNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OtherBusinessNames` to be an array in the JSON string but got `%s`", jsonObj.get("OtherBusinessNames").toString()));
      }
      if ((jsonObj.get("Website") != null && !jsonObj.get("Website").isJsonNull()) && !jsonObj.get("Website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Website").toString()));
      }
      if ((jsonObj.get("Telephone") != null && !jsonObj.get("Telephone").isJsonNull()) && !jsonObj.get("Telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Telephone").toString()));
      }
      if ((jsonObj.get("TaxIDNumber") != null && !jsonObj.get("TaxIDNumber").isJsonNull()) && !jsonObj.get("TaxIDNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxIDNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxIDNumber").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("TaxIDNumbers") != null && !jsonObj.get("TaxIDNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxIDNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("TaxIDNumbers").toString()));
      }
      if ((jsonObj.get("EmailAddress") != null && !jsonObj.get("EmailAddress").isJsonNull()) && !jsonObj.get("EmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmailAddress").toString()));
      }
      if ((jsonObj.get("WebDomain") != null && !jsonObj.get("WebDomain").isJsonNull()) && !jsonObj.get("WebDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WebDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WebDomain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("WebDomains") != null && !jsonObj.get("WebDomains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `WebDomains` to be an array in the JSON string but got `%s`", jsonObj.get("WebDomains").toString()));
      }
      if (jsonObj.get("Naics") != null && !jsonObj.get("Naics").isJsonNull()) {
        JsonArray jsonArraynaics = jsonObj.getAsJsonArray("Naics");
        if (jsonArraynaics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Naics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Naics` to be an array in the JSON string but got `%s`", jsonObj.get("Naics").toString()));
          }

          // validate the optional field `Naics` (array)
          for (int i = 0; i < jsonArraynaics.size(); i++) {
            BusinessSearchResponseIndustryCode.validateJsonObject(jsonArraynaics.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("Sic") != null && !jsonObj.get("Sic").isJsonNull()) {
        JsonArray jsonArraysic = jsonObj.getAsJsonArray("Sic");
        if (jsonArraysic != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Sic").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Sic` to be an array in the JSON string but got `%s`", jsonObj.get("Sic").toString()));
          }

          // validate the optional field `Sic` (array)
          for (int i = 0; i < jsonArraysic.size(); i++) {
            BusinessSearchResponseIndustryCode.validateJsonObject(jsonArraysic.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Result.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Result' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Result> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Result.class));

       return (TypeAdapter<T>) new TypeAdapter<Result>() {
           @Override
           public void write(JsonWriter out, Result value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Result read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Result given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Result
  * @throws IOException if the JSON string is invalid with respect to Result
  */
  public static Result fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Result.class);
  }

 /**
  * Convert an instance of Result to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

