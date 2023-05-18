# VerificationsApi

All URIs are relative to *http://api.trulioo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentDownload**](VerificationsApi.md#getDocumentDownload) | **GET** /v3/verifications/documentdownload/{transactionRecordID}/{fieldName} | DocumentDownload |
| [**getPartialResult**](VerificationsApi.md#getPartialResult) | **GET** /v3/verifications/transaction/{transactionID}/partialresult | PartialResult |
| [**getTransactionRecord**](VerificationsApi.md#getTransactionRecord) | **GET** /v3/verifications/transactionrecord/{transactionRecordID} | GetTransactionRecord |
| [**getTransactionStatus**](VerificationsApi.md#getTransactionStatus) | **GET** /v3/verifications/transaction/{transactionID}/status | GetTransactionStatus |
| [**verify**](VerificationsApi.md#verify) | **POST** /v3/verifications/verify | Verify |


<a name="getDocumentDownload"></a>
# **getDocumentDownload**
> File getDocumentDownload(transactionRecordID, fieldName)

DocumentDownload

Download Document

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String transactionRecordID = "transactionRecordID_example"; // String | id of the transactionrecord, this will be a GUID
    String fieldName = "fieldName_example"; // String | document field name
    try {
      File result = apiInstance.getDocumentDownload(transactionRecordID, fieldName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getDocumentDownload");
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
| **transactionRecordID** | **String**| id of the transactionrecord, this will be a GUID | |
| **fieldName** | **String**| document field name | |

### Return type

[**File**](File.md)

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

<a name="getPartialResult"></a>
# **getPartialResult**
> VerifyResultPartial getPartialResult(transactionID)

PartialResult

This method is used to retrieve the partial result of an asynchronous transaction.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String transactionID = "transactionID_example"; // String | id of the asynchronous transaction, this will be a GUID
    try {
      VerifyResultPartial result = apiInstance.getPartialResult(transactionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getPartialResult");
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
| **transactionID** | **String**| id of the asynchronous transaction, this will be a GUID | |

### Return type

[**VerifyResultPartial**](VerifyResultPartial.md)

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

<a name="getTransactionRecord"></a>
# **getTransactionRecord**
> TransactionRecordResult getTransactionRecord(transactionRecordID)

GetTransactionRecord

This endpoint will provide the final results once the transaction completes. The response will have match signals per Name and Address fields and notify if the individual is verified. It may take a few minutes for the transaction to complete.Once the results are available, the callback status updates to “Success”. The Transaction Record ID (TRID) will be sent to the callback URL provided.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String transactionRecordID = "transactionRecordID_example"; // String | id of the transactionrecord, this will be a GUID
    try {
      TransactionRecordResult result = apiInstance.getTransactionRecord(transactionRecordID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getTransactionRecord");
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
| **transactionRecordID** | **String**| id of the transactionrecord, this will be a GUID | |

### Return type

[**TransactionRecordResult**](TransactionRecordResult.md)

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

<a name="getTransactionStatus"></a>
# **getTransactionStatus**
> TransactionStatus getTransactionStatus(transactionID)

GetTransactionStatus

This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String transactionID = "transactionID_example"; // String | id of the asynchronous transaction, this will be a GUID
    try {
      TransactionStatus result = apiInstance.getTransactionStatus(transactionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getTransactionStatus");
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
| **transactionID** | **String**| id of the asynchronous transaction, this will be a GUID | |

### Return type

[**TransactionStatus**](TransactionStatus.md)

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

<a name="verify"></a>
# **verify**
> VerifyResult verify(verifyRequest)

Verify

Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result. You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    VerifyRequest verifyRequest = new VerifyRequest(); // VerifyRequest | 
    try {
      VerifyResult result = apiInstance.verify(verifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verify");
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
| **verifyRequest** | [**VerifyRequest**](VerifyRequest.md)|  | [optional] |

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

