# BusinessApi

All URIs are relative to *http://api.trulioo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**businessSearch**](BusinessApi.md#businessSearch) | **POST** /v3/business/search | Search |
| [**businessVerify**](BusinessApi.md#businessVerify) | **POST** /v3/business/verify | Verify |
| [**getBusinessRegistrationNumbers**](BusinessApi.md#getBusinessRegistrationNumbers) | **GET** /v3/business/businessregistrationnumbers | GetBusinessRegistrationNumbers |
| [**getBusinessRegistrationNumbersWithParameters**](BusinessApi.md#getBusinessRegistrationNumbersWithParameters) | **GET** /v3/business/businessregistrationnumbers/{countryCode}/{jurisdictionCode} | getBusinessRegistrationNumbersWithParameters |
| [**getCountryJOI**](BusinessApi.md#getCountryJOI) | **GET** /v3/business/countryJOI/ | GetCountryJOI |
| [**getCountryJOIWithCountryCode**](BusinessApi.md#getCountryJOIWithCountryCode) | **GET** /v3/business/countryJOI/{countryCode} | getCountryJOIWithCountryCode |


<a name="businessSearch"></a>
# **businessSearch**
> BusinessSearchResponse businessSearch(businessSearchRequest)

Search

Calling this method will perform a business search.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    BusinessSearchRequest businessSearchRequest = new BusinessSearchRequest(); // BusinessSearchRequest | 
    try {
      BusinessSearchResponse result = apiInstance.businessSearch(businessSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessSearchRequest** | [**BusinessSearchRequest**](BusinessSearchRequest.md)|  | [optional] |

### Return type

[**BusinessSearchResponse**](BusinessSearchResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

<a name="businessVerify"></a>
# **businessVerify**
> VerifyResult businessVerify(businessVerifyRequest)

Verify

Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result.  You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    BusinessVerifyRequest businessVerifyRequest = new BusinessVerifyRequest(); // BusinessVerifyRequest | 
    try {
      VerifyResult result = apiInstance.businessVerify(businessVerifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessVerify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessVerifyRequest** | [**BusinessVerifyRequest**](BusinessVerifyRequest.md)|  | [optional] |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

<a name="getBusinessRegistrationNumbers"></a>
# **getBusinessRegistrationNumbers**
> List&lt;BusinessRegistrationNumber&gt; getBusinessRegistrationNumbers()

GetBusinessRegistrationNumbers

Gets the currently configured business registration numbers for optionally supplied country and jurisdiction

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    try {
      List<BusinessRegistrationNumber> result = apiInstance.getBusinessRegistrationNumbers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#getBusinessRegistrationNumbers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BusinessRegistrationNumber&gt;**](BusinessRegistrationNumber.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

<a name="getBusinessRegistrationNumbersWithParameters"></a>
# **getBusinessRegistrationNumbersWithParameters**
> List&lt;BusinessRegistrationNumber&gt; getBusinessRegistrationNumbersWithParameters(countryCode, jurisdictionCode)

getBusinessRegistrationNumbersWithParameters

Gets the currently configured business registration numbers for a country and optionally supplied jurisdiction

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String countryCode = "countryCode_example"; // String | Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes
    String jurisdictionCode = "jurisdictionCode_example"; // String | Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions
    try {
      List<BusinessRegistrationNumber> result = apiInstance.getBusinessRegistrationNumbersWithParameters(countryCode, jurisdictionCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#getBusinessRegistrationNumbersWithParameters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes | |
| **jurisdictionCode** | **String**| Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions | |

### Return type

[**List&lt;BusinessRegistrationNumber&gt;**](BusinessRegistrationNumber.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

<a name="getCountryJOI"></a>
# **getCountryJOI**
> List&lt;CountrySubdivision&gt; getCountryJOI()

GetCountryJOI

Gets all jurisdictions of incorporation for all countries.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    try {
      List<CountrySubdivision> result = apiInstance.getCountryJOI();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#getCountryJOI");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CountrySubdivision&gt;**](CountrySubdivision.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

<a name="getCountryJOIWithCountryCode"></a>
# **getCountryJOIWithCountryCode**
> List&lt;CountrySubdivision&gt; getCountryJOIWithCountryCode(countryCode)

getCountryJOIWithCountryCode

Gets the jurisdictions of incorporation for a country.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String countryCode = "countryCode_example"; // String | Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes
    try {
      List<CountrySubdivision> result = apiInstance.getCountryJOIWithCountryCode(countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#getCountryJOIWithCountryCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes | |

### Return type

[**List&lt;CountrySubdivision&gt;**](CountrySubdivision.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Your request could not be processed, there should be more details in the response. |  -  |
| **401** | The token you provided is not valid or you are using an account that is not enabled. |  -  |
| **408** | The request took longer to process than we waited. |  -  |
| **415** | You asked for a media type that we do not support. You should request application/json in the Content-Type header. |  -  |
| **500** | An error happened on the server without a specific message. |  -  |
| **200** | Success |  -  |

