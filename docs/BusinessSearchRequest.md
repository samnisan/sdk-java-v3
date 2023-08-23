

# BusinessSearchRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**test** | **Boolean** |  |  [optional] [readonly] |
|**searchType** | [**SearchTypeEnum**](#SearchTypeEnum) | The type of search to perform. i.e &#39;Live&#39; or &#39;Demo&#39; |  [optional] |
|**packageId** | **String** | The Package ID to run the transaction under which can be obtained by your Customer Success Manager or via a support ticket. |  [optional] |
|**callBackUrl** | **String** |  |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**consentForDataSources** | **List&lt;String&gt;** | Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried. |  [optional] |
|**business** | [**BusinessSearchRequestBusinessSearchModel**](BusinessSearchRequestBusinessSearchModel.md) |  |  [optional] |
|**countryCode** | **String** | The country code for which the verification needs to be performed. |  [optional] |
|**requestErrors** | [**List&lt;ServiceError&gt;**](ServiceError.md) |  |  [optional] |



## Enum: SearchTypeEnum

| Name | Value            |
|------|------------------|
| LIVE | &quot;Live&quot; |
| DEMO | &quot;Demo&quot; |
| TEST | &quot;Test&quot; |



