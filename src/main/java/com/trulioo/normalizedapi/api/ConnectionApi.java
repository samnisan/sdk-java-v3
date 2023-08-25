package com.trulioo.normalizedapi.api;

import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.ApiResponse;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.Pair;

import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for sayHello
     * @param name Name to be returned in the response (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> The name that was in the request </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call sayHelloCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/connection/sayhello/{name}"
                .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sayHelloValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null || name.isEmpty()) {
            throw new ApiException("Missing the required parameter 'name' when calling sayHello(Async)");
        }

        return sayHelloCall(name, _callback);

    }

    /**
     * SayHello
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.  Applied a maximum length for the name parameter of 100 via a route constraint
     * @param name Name to be returned in the response (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> The name that was in the request </td><td>  -  </td></tr>
    </table>
     */
    public Object sayHello(String name) throws ApiException {
        ApiResponse<Object> localVarResp = sayHelloWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * SayHello
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.  Applied a maximum length for the name parameter of 100 via a route constraint
     * @param name Name to be returned in the response (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> The name that was in the request </td><td>  -  </td></tr>
    </table>
     */
    public ApiResponse<Object> sayHelloWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = sayHelloValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * SayHello (asynchronously)
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.  Applied a maximum length for the name parameter of 100 via a route constraint
     * @param name Name to be returned in the response (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> The name that was in the request </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call sayHelloAsync(String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = sayHelloValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for testAuthentication
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call testAuthenticationCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/connection/testauthentication";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testAuthenticationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return testAuthenticationCall(_callback);

    }

    /**
     * TestAuthentication
     * This method enables you to check if your credentials are valid. You will need to provide a valid token to ensure a successful response.
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
    </table>
     */
    public String testAuthentication() throws ApiException {
        ApiResponse<String> localVarResp = testAuthenticationWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * TestAuthentication
     * This method enables you to check if your credentials are valid. You will need to provide a valid token to ensure a successful response.
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
    </table>
     */
    public ApiResponse<String> testAuthenticationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = testAuthenticationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * TestAuthentication (asynchronously)
     * This method enables you to check if your credentials are valid. You will need to provide a valid token to ensure a successful response.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
    <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
    <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
    <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
    <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
    <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call testAuthenticationAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = testAuthenticationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
