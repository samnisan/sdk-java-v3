

# VerifyRequest

The verification call for the Normalized API is a POST method call

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationType** | [**VerificationTypeEnum**](#VerificationTypeEnum) | The type of verification to perform. i.e &#39;Live&#39; or &#39;Demo&#39; |  [optional] |
|**packageId** | **String** | The Package ID to run the transaction under which can be obtained by your Customer Success Manager or via a support ticket. |  [optional] |
|**callBackUrl** | **String** |  |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**cleansedAddress** | **Boolean** | Set to true if you want to receive address cleanse information,  This will only change the response if you have address cleansing enabled for the country you are querying for. |  [optional] |
|**consentForDataSources** | **List&lt;String&gt;** | Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried. |  [optional] |
|**countryCode** | **String** | The country code for which the verification needs to be performed. |  [optional] |
|**customerReferenceID** | **String** | Customer Reference Id |  [optional] |
|**dataFields** | [**DataFields**](DataFields.md) |  |  [optional] |
|**requestErrors** | [**List&lt;ServiceError&gt;**](ServiceError.md) |  |  [optional] |
|**verboseMode** | **Boolean** | Verbose Mode Output Flag. |  [optional] |
|**requestMetadata** | [**List&lt;VerifyRequestMetadata&gt;**](VerifyRequestMetadata.md) |  |  [optional] |



## Enum: VerificationTypeEnum

| Name | Value            |
|------|------------------|
| LIVE | &quot;Live&quot; |
| DEMO | &quot;Demo&quot; |
| TEST | &quot;Test&quot; |



