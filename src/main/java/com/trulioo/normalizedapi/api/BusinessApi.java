 package com.trulioo.normalizedapi.api;

 import com.trulioo.normalizedapi.*;
 
 import com.google.gson.reflect.TypeToken;
 
 import java.io.IOException;
 
 
 import com.trulioo.normalizedapi.model.BusinessRegistrationNumber;
 import com.trulioo.normalizedapi.model.BusinessSearchRequest;
 import com.trulioo.normalizedapi.model.BusinessSearchResponse;
 import com.trulioo.normalizedapi.model.BusinessVerifyRequest;
 import com.trulioo.normalizedapi.model.CountrySubdivision;
 import com.trulioo.normalizedapi.model.ProblemDetails;
 import com.trulioo.normalizedapi.model.VerifyResult;
 import org.apache.commons.lang3.StringUtils;
 
 import java.lang.reflect.Type;
 import java.util.*;
 import javax.ws.rs.core.GenericType;
 
 public class BusinessApi {
     private ApiClient localVarApiClient;
     private int localHostIndex;
     private String localCustomBaseUrl;
 
     public BusinessApi() {
         this(Configuration.getDefaultApiClient());
     }
 
     public BusinessApi(ApiClient apiClient) {
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
      * Build call for businessSearch
      * @param businessSearchRequest  (optional)
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
     public okhttp3.Call businessSearchCall(BusinessSearchRequest businessSearchRequest, final ApiCallback _callback) throws ApiException {
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
 
         Object localVarPostBody = businessSearchRequest;
 
         // create path and map variables
         String localVarPath = "/v3/business/search";
 
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
                 "application/json"
         };
         final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
         if (localVarContentType != null) {
             localVarHeaderParams.put("Content-Type", localVarContentType);
         }
 
         String[] localVarAuthNames = new String[] { "oAuth2" };
         return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
     }
 
     @SuppressWarnings("rawtypes")
     private okhttp3.Call businessSearchValidateBeforeCall(BusinessSearchRequest businessSearchRequest, final ApiCallback _callback) throws ApiException {
         return businessSearchCall(businessSearchRequest, _callback);
 
     }
 
     /**
      * Search
      * Calling this method will perform a business search.
      * @param businessSearchRequest  (optional)
      * @return BusinessSearchResponse
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
     public BusinessSearchResponse businessSearch(BusinessSearchRequest businessSearchRequest) throws ApiException {
         ApiResponse<BusinessSearchResponse> localVarResp = businessSearchWithHttpInfo(businessSearchRequest);
         return localVarResp.getData();
     }
 
     /**
      * Search
      * Calling this method will perform a business search.
      * @param businessSearchRequest  (optional)
      * @return ApiResponse&lt;BusinessSearchResponse&gt;
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
     public ApiResponse<BusinessSearchResponse> businessSearchWithHttpInfo(BusinessSearchRequest businessSearchRequest) throws ApiException {
         okhttp3.Call localVarCall = businessSearchValidateBeforeCall(businessSearchRequest, null);
         Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * Search (asynchronously)
      * Calling this method will perform a business search.
      * @param businessSearchRequest  (optional)
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
     public okhttp3.Call businessSearchAsync(BusinessSearchRequest businessSearchRequest, final ApiCallback<BusinessSearchResponse> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = businessSearchValidateBeforeCall(businessSearchRequest, _callback);
         Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for businessVerify
      * @param businessVerifyRequest  (optional)
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
     public okhttp3.Call businessVerifyCall(BusinessVerifyRequest businessVerifyRequest, final ApiCallback _callback) throws ApiException {
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
 
         Object localVarPostBody = businessVerifyRequest;
 
         // create path and map variables
         String localVarPath = "/v3/business/verify";
 
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
                 "application/json"
         };
         final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
         if (localVarContentType != null) {
             localVarHeaderParams.put("Content-Type", localVarContentType);
         }
 
         String[] localVarAuthNames = new String[] { "oAuth2" };
         return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
     }
 
     @SuppressWarnings("rawtypes")
     private okhttp3.Call businessVerifyValidateBeforeCall(BusinessVerifyRequest businessVerifyRequest, final ApiCallback _callback) throws ApiException {
         return businessVerifyCall(businessVerifyRequest, _callback);
 
     }
 
     /**
      * Verify
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result.  You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param businessVerifyRequest  (optional)
      * @return VerifyResult
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
     public VerifyResult businessVerify(BusinessVerifyRequest businessVerifyRequest) throws ApiException {
         ApiResponse<VerifyResult> localVarResp = businessVerifyWithHttpInfo(businessVerifyRequest);
         return localVarResp.getData();
     }
 
     /**
      * Verify
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result.  You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param businessVerifyRequest  (optional)
      * @return ApiResponse&lt;VerifyResult&gt;
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
     public ApiResponse<VerifyResult> businessVerifyWithHttpInfo(BusinessVerifyRequest businessVerifyRequest) throws ApiException {
         okhttp3.Call localVarCall = businessVerifyValidateBeforeCall(businessVerifyRequest, null);
         Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * Verify (asynchronously)
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result.  You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param businessVerifyRequest  (optional)
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
     public okhttp3.Call businessVerifyAsync(BusinessVerifyRequest businessVerifyRequest, final ApiCallback<VerifyResult> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = businessVerifyValidateBeforeCall(businessVerifyRequest, _callback);
         Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getBusinessRegistrationNumbers
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
     public okhttp3.Call getBusinessRegistrationNumbersCall(final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/business/businessregistrationnumbers";
 
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
     private okhttp3.Call getBusinessRegistrationNumbersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
         return getBusinessRegistrationNumbersCall(_callback);
 
     }
 
     /**
      * GetBusinessRegistrationNumbers
      * Gets the currently configured business registration numbers for optionally supplied country and jurisdiction
      * @return List&lt;BusinessRegistrationNumber&gt;
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
     public List<BusinessRegistrationNumber> getBusinessRegistrationNumbers() throws ApiException {
         ApiResponse<List<BusinessRegistrationNumber>> localVarResp = getBusinessRegistrationNumbersWithHttpInfo();
         return localVarResp.getData();
     }
 
     /**
      * GetBusinessRegistrationNumbers
      * Gets the currently configured business registration numbers for optionally supplied country and jurisdiction
      * @return ApiResponse&lt;List&lt;BusinessRegistrationNumber&gt;&gt;
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
     public ApiResponse<List<BusinessRegistrationNumber>> getBusinessRegistrationNumbersWithHttpInfo() throws ApiException {
         okhttp3.Call localVarCall = getBusinessRegistrationNumbersValidateBeforeCall(null);
         Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * GetBusinessRegistrationNumbers (asynchronously)
      * Gets the currently configured business registration numbers for optionally supplied country and jurisdiction
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
     public okhttp3.Call getBusinessRegistrationNumbersAsync(final ApiCallback<List<BusinessRegistrationNumber>> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getBusinessRegistrationNumbersValidateBeforeCall(_callback);
         Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getBusinessRegistrationNumbersWithParameters
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @param jurisdictionCode Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions (required)
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
     public okhttp3.Call getBusinessRegistrationNumbersWithParametersCall(String countryCode, String jurisdictionCode, final ApiCallback _callback) throws ApiException {
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

         String localVarPath = "/v3/business/businessregistrationnumbers";
         List<String> resources = Arrays.asList(countryCode, jurisdictionCode);
 
         for (String x : resources) {
             if (!StringUtils.isBlank(x)) {
                 localVarPath += "/" + localVarApiClient.escapeString(x);
             }
         }
 
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
     private okhttp3.Call getBusinessRegistrationNumbersWithParametersValidateBeforeCall(String countryCode, String jurisdictionCode, final ApiCallback _callback) throws ApiException {
         // if 'jurisdictionCode' is set, verify the required parameter 'countryCode' is also set.
         if (StringUtils.isBlank(countryCode) && !StringUtils.isBlank(jurisdictionCode)) {
             throw new ApiException("The parameter 'countryCode' is required in order to use the parameter 'jurisdictionCode' when calling getBusinessRegistrationNumbers(Async)");
         }
 
         return getBusinessRegistrationNumbersWithParametersCall(countryCode, jurisdictionCode, _callback);
     }
 
     /**
      * getBusinessRegistrationNumbersWithParameters
      * Gets the currently configured business registration numbers for a country and optionally supplied jurisdiction
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @param jurisdictionCode Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions (required)
      * @return List&lt;BusinessRegistrationNumber&gt;
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
     public List<BusinessRegistrationNumber> getBusinessRegistrationNumbersWithParameters(String countryCode, String jurisdictionCode) throws ApiException {
         ApiResponse<List<BusinessRegistrationNumber>> localVarResp = getBusinessRegistrationNumbersWithParametersWithHttpInfo(countryCode, jurisdictionCode);
         return localVarResp.getData();
     }
 
     /**
      * getBusinessRegistrationNumbersWithParameters
      * Gets the currently configured business registration numbers for a country and optionally supplied jurisdiction
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @param jurisdictionCode Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions (required)
      * @return ApiResponse&lt;List&lt;BusinessRegistrationNumber&gt;&gt;
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
     public ApiResponse<List<BusinessRegistrationNumber>> getBusinessRegistrationNumbersWithParametersWithHttpInfo(String countryCode, String jurisdictionCode) throws ApiException {
         okhttp3.Call localVarCall = getBusinessRegistrationNumbersWithParametersValidateBeforeCall(countryCode, jurisdictionCode, null);
         Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * getBusinessRegistrationNumbersWithParameters (asynchronously)
      * Gets the currently configured business registration numbers for a country and optionally supplied jurisdiction
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @param jurisdictionCode Optional jurisdiction code, get via the call to https://developer.trulioo.com/reference#getcountrysubdivisions (required)
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
     public okhttp3.Call getBusinessRegistrationNumbersWithParametersAsync(String countryCode, String jurisdictionCode, final ApiCallback<List<BusinessRegistrationNumber>> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getBusinessRegistrationNumbersWithParametersValidateBeforeCall(countryCode, jurisdictionCode, _callback);
         Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getCountryJOI
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
     public okhttp3.Call getCountryJOICall(final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/business/countryJOI/";
 
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
     private okhttp3.Call getCountryJOIValidateBeforeCall(final ApiCallback _callback) throws ApiException {
         return getCountryJOICall(_callback);
 
     }
 
     /**
      * GetCountryJOI
      * Gets all jurisdictions of incorporation for all countries.
      * @return List&lt;CountrySubdivision&gt;
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
     public List<CountrySubdivision> getCountryJOI() throws ApiException {
         ApiResponse<List<CountrySubdivision>> localVarResp = getCountryJOIWithHttpInfo();
         return localVarResp.getData();
     }
 
     /**
      * GetCountryJOI
      * Gets all jurisdictions of incorporation for all countries.
      * @return ApiResponse&lt;List&lt;CountrySubdivision&gt;&gt;
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
     public ApiResponse<List<CountrySubdivision>> getCountryJOIWithHttpInfo() throws ApiException {
         okhttp3.Call localVarCall = getCountryJOIValidateBeforeCall(null);
         Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * GetCountryJOI (asynchronously)
      * Gets all jurisdictions of incorporation for all countries.
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
     public okhttp3.Call getCountryJOIAsync(final ApiCallback<List<CountrySubdivision>> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getCountryJOIValidateBeforeCall(_callback);
         Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getCountryJOIWithCountryCode
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
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
     public okhttp3.Call getCountryJOIWithCountryCodeCall(String countryCode, final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/business/countryJOI/{countryCode}"
                 .replace("{" + "countryCode" + "}", localVarApiClient.escapeString(countryCode.toString()));
 
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
     private okhttp3.Call getCountryJOIWithCountryCodeValidateBeforeCall(String countryCode, final ApiCallback _callback) throws ApiException {
         // verify the required parameter 'countryCode' is set
         if (countryCode == null) {
             throw new ApiException("Missing the required parameter 'countryCode' when calling getCountryJOIWithCountryCode(Async)");
         }
 
         return getCountryJOIWithCountryCodeCall(countryCode, _callback);
 
     }
 
     /**
      * getCountryJOIWithCountryCode
      * Gets the jurisdictions of incorporation for a country.
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @return List&lt;CountrySubdivision&gt;
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
     public List<CountrySubdivision> getCountryJOIWithCountryCode(String countryCode) throws ApiException {
         ApiResponse<List<CountrySubdivision>> localVarResp = getCountryJOIWithCountryCodeWithHttpInfo(countryCode);
         return localVarResp.getData();
     }
 
     /**
      * getCountryJOIWithCountryCode
      * Gets the jurisdictions of incorporation for a country.
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
      * @return ApiResponse&lt;List&lt;CountrySubdivision&gt;&gt;
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
     public ApiResponse<List<CountrySubdivision>> getCountryJOIWithCountryCodeWithHttpInfo(String countryCode) throws ApiException {
         okhttp3.Call localVarCall = getCountryJOIWithCountryCodeValidateBeforeCall(countryCode, null);
         Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * getCountryJOIWithCountryCode (asynchronously)
      * Gets the jurisdictions of incorporation for a country.
      * @param countryCode Country alpha2 code, get via the call to https://developer.trulioo.com/reference#getcountrycodes (required)
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
     public okhttp3.Call getCountryJOIWithCountryCodeAsync(String countryCode, final ApiCallback<List<CountrySubdivision>> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getCountryJOIWithCountryCodeValidateBeforeCall(countryCode, _callback);
         Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
 }
 