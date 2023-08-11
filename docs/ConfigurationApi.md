# ConfigurationApi

All URIs are relative to *http://api.trulioo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllDatasources**](ConfigurationApi.md#getAllDatasources) | **GET** /v3/configuration/alldatasources/{packageID} | Get All Datasources by Country |

<a id="getAllDatasources"></a>
# **getAllDatasources**
> List&lt;NormalizedDatasourceGroupsWithCountry&gt; getAllDatasources(packageID)

Get All Datasources by Country

Gets all datasource groups configured for your product.

### Example
```java
// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.ConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.trulioo.com");

    ConfigurationApi apiInstance = new ConfigurationApi(defaultClient);
    String packageID = "packageID_example"; // String | Package ID
    try {
      List<NormalizedDatasourceGroupsWithCountry> result = apiInstance.getAllDatasources(packageID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationApi#getAllDatasources");
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
| **packageID** | **String**| Package ID | |

### Return type

[**List&lt;NormalizedDatasourceGroupsWithCountry&gt;**](NormalizedDatasourceGroupsWithCountry.md)

### Authorization

[Bearer](../README.md#Bearer)

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