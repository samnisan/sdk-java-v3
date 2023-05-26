# ConnectionApi

All URIs are relative to *http://api.trulioo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sayHello**](ConnectionApi.md#sayHello) | **GET** /v3/connection/sayhello/{name} | SayHello |
| [**testAuthentication**](ConnectionApi.md#testAuthentication) | **GET** /v3/connection/testauthentication | TestAuthentication |


<a name="sayHello"></a>
# **sayHello**
> Object sayHello(name)

SayHello

This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.  Applied a maximum length for the name parameter of 100 via a route constraint

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.ConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionApi apiInstance = new ConnectionApi(defaultClient);
    String name = "name_example"; // String | Name to be returned in the response
    try {
      Object result = apiInstance.sayHello(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionApi#sayHello");
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
| **name** | **String**| Name to be returned in the response | |

### Return type

**Object**

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
| **200** | The name that was in the request |  -  |

<a name="testAuthentication"></a>
# **testAuthentication**
> String testAuthentication()

TestAuthentication

This method enables you to check if your credentials are valid. You will need to provide a valid token to ensure a successful response.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.ConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionApi apiInstance = new ConnectionApi(defaultClient);
    try {
      String result = apiInstance.testAuthentication();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionApi#testAuthentication");
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

**String**

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

