 package com.trulioo.normalizedapi.api;

 import com.trulioo.normalizedapi.ApiCallback;
 import com.trulioo.normalizedapi.ApiClient;
 import com.trulioo.normalizedapi.ApiException;
 import com.trulioo.normalizedapi.ApiResponse;
 import com.trulioo.normalizedapi.Configuration;
 import com.trulioo.normalizedapi.Pair;
 import com.trulioo.normalizedapi.ProgressRequestBody;
 import com.trulioo.normalizedapi.ProgressResponseBody;
 
 import com.google.gson.reflect.TypeToken;
 
 import java.io.IOException;
 
 
 import java.io.File;
 import com.trulioo.normalizedapi.model.TransactionRecordResult;
 import com.trulioo.normalizedapi.model.TransactionStatus;
 import com.trulioo.normalizedapi.model.VerifyRequest;
 import com.trulioo.normalizedapi.model.VerifyResult;
 import com.trulioo.normalizedapi.model.VerifyResultPartial;
 
 import java.lang.reflect.Type;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.ws.rs.core.GenericType;
 
 public class VerificationsApi {
     private ApiClient localVarApiClient;
     private int localHostIndex;
     private String localCustomBaseUrl;
 
     public VerificationsApi() {
         this(Configuration.getDefaultApiClient());
     }
 
     public VerificationsApi(ApiClient apiClient) {
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
      * Build call for getDocumentDownload
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @param fieldName document field name (required)
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
     public okhttp3.Call getDocumentDownloadCall(String transactionRecordID, String fieldName, final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/verifications/documentdownload/{transactionRecordID}/{fieldName}"
             .replace("{" + "transactionRecordID" + "}", localVarApiClient.escapeString(transactionRecordID.toString()))
             .replace("{" + "fieldName" + "}", localVarApiClient.escapeString(fieldName.toString()));
 
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
     private okhttp3.Call getDocumentDownloadValidateBeforeCall(String transactionRecordID, String fieldName, final ApiCallback _callback) throws ApiException {
         // verify the required parameter 'transactionRecordID' is set
         if (transactionRecordID == null || transactionRecordID.isEmpty()) {
             throw new ApiException("Missing the required parameter 'transactionRecordID' when calling getDocumentDownload(Async)");
         }
 
         // verify the required parameter 'fieldName' is set
         if (fieldName == null || fieldName.isEmpty()) {
             throw new ApiException("Missing the required parameter 'fieldName' when calling getDocumentDownload(Async)");
         }
 
         return getDocumentDownloadCall(transactionRecordID, fieldName, _callback);
 
     }
 
     /**
      * DocumentDownload
      * Download Document
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @param fieldName document field name (required)
      * @return File
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
     public File getDocumentDownload(String transactionRecordID, String fieldName) throws ApiException {
         ApiResponse<File> localVarResp = getDocumentDownloadWithHttpInfo(transactionRecordID, fieldName);
         return localVarResp.getData();
     }
 
     /**
      * DocumentDownload
      * Download Document
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @param fieldName document field name (required)
      * @return ApiResponse&lt;File&gt;
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
     public ApiResponse<File> getDocumentDownloadWithHttpInfo(String transactionRecordID, String fieldName) throws ApiException {
         okhttp3.Call localVarCall = getDocumentDownloadValidateBeforeCall(transactionRecordID, fieldName, null);
         Type localVarReturnType = new TypeToken<File>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * DocumentDownload (asynchronously)
      * Download Document
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @param fieldName document field name (required)
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
     public okhttp3.Call getDocumentDownloadAsync(String transactionRecordID, String fieldName, final ApiCallback<File> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getDocumentDownloadValidateBeforeCall(transactionRecordID, fieldName, _callback);
         Type localVarReturnType = new TypeToken<File>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getPartialResult
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
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
     public okhttp3.Call getPartialResultCall(String transactionID, final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/verifications/transaction/{transactionID}/partialresult"
             .replace("{" + "transactionID" + "}", localVarApiClient.escapeString(transactionID.toString()));
 
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
     private okhttp3.Call getPartialResultValidateBeforeCall(String transactionID, final ApiCallback _callback) throws ApiException {
         // verify the required parameter 'transactionID' is set
         if (transactionID == null || transactionID.isEmpty()) {
             throw new ApiException("Missing the required parameter 'transactionID' when calling getPartialResult(Async)");
         }
 
         return getPartialResultCall(transactionID, _callback);
 
     }
 
     /**
      * PartialResult
      * This method is used to retrieve the partial result of an asynchronous transaction.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
      * @return VerifyResultPartial
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
     public VerifyResultPartial getPartialResult(String transactionID) throws ApiException {
         ApiResponse<VerifyResultPartial> localVarResp = getPartialResultWithHttpInfo(transactionID);
         return localVarResp.getData();
     }
 
     /**
      * PartialResult
      * This method is used to retrieve the partial result of an asynchronous transaction.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
      * @return ApiResponse&lt;VerifyResultPartial&gt;
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
     public ApiResponse<VerifyResultPartial> getPartialResultWithHttpInfo(String transactionID) throws ApiException {
         okhttp3.Call localVarCall = getPartialResultValidateBeforeCall(transactionID, null);
         Type localVarReturnType = new TypeToken<VerifyResultPartial>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * PartialResult (asynchronously)
      * This method is used to retrieve the partial result of an asynchronous transaction.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
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
     public okhttp3.Call getPartialResultAsync(String transactionID, final ApiCallback<VerifyResultPartial> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getPartialResultValidateBeforeCall(transactionID, _callback);
         Type localVarReturnType = new TypeToken<VerifyResultPartial>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getTransactionRecord
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
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
     public okhttp3.Call getTransactionRecordCall(String transactionRecordID, final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/verifications/transactionrecord/{transactionRecordID}"
             .replace("{" + "transactionRecordID" + "}", localVarApiClient.escapeString(transactionRecordID.toString()));
 
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
     private okhttp3.Call getTransactionRecordValidateBeforeCall(String transactionRecordID, final ApiCallback _callback) throws ApiException {
         // verify the required parameter 'transactionRecordID' is set
         if (transactionRecordID == null || transactionRecordID.isEmpty()) {
             throw new ApiException("Missing the required parameter 'transactionRecordID' when calling getTransactionRecord(Async)");
         }
 
         return getTransactionRecordCall(transactionRecordID, _callback);
 
     }
 
     /**
      * GetTransactionRecord
      * This endpoint will provide the final results once the transaction completes. The response will have match signals per Name and Address fields and notify if the individual is verified. It may take a few minutes for the transaction to complete.Once the results are available, the callback status updates to “Success”. The Transaction Record ID (TRID) will be sent to the callback URL provided.
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @return TransactionRecordResult
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
     public TransactionRecordResult getTransactionRecord(String transactionRecordID) throws ApiException {
         ApiResponse<TransactionRecordResult> localVarResp = getTransactionRecordWithHttpInfo(transactionRecordID);
         return localVarResp.getData();
     }
 
     /**
      * GetTransactionRecord
      * This endpoint will provide the final results once the transaction completes. The response will have match signals per Name and Address fields and notify if the individual is verified. It may take a few minutes for the transaction to complete.Once the results are available, the callback status updates to “Success”. The Transaction Record ID (TRID) will be sent to the callback URL provided.
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
      * @return ApiResponse&lt;TransactionRecordResult&gt;
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
     public ApiResponse<TransactionRecordResult> getTransactionRecordWithHttpInfo(String transactionRecordID) throws ApiException {
         okhttp3.Call localVarCall = getTransactionRecordValidateBeforeCall(transactionRecordID, null);
         Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * GetTransactionRecord (asynchronously)
      * This endpoint will provide the final results once the transaction completes. The response will have match signals per Name and Address fields and notify if the individual is verified. It may take a few minutes for the transaction to complete.Once the results are available, the callback status updates to “Success”. The Transaction Record ID (TRID) will be sent to the callback URL provided.
      * @param transactionRecordID id of the transactionrecord, this will be a GUID (required)
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
     public okhttp3.Call getTransactionRecordAsync(String transactionRecordID, final ApiCallback<TransactionRecordResult> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getTransactionRecordValidateBeforeCall(transactionRecordID, _callback);
         Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for getTransactionStatus
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
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
     public okhttp3.Call getTransactionStatusCall(String transactionID, final ApiCallback _callback) throws ApiException {
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
         String localVarPath = "/v3/verifications/transaction/{transactionID}/status"
             .replace("{" + "transactionID" + "}", localVarApiClient.escapeString(transactionID.toString()));
 
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
     private okhttp3.Call getTransactionStatusValidateBeforeCall(String transactionID, final ApiCallback _callback) throws ApiException {
         // verify the required parameter 'transactionID' is set
         if (transactionID == null || transactionID.isEmpty()) {
             throw new ApiException("Missing the required parameter 'transactionID' when calling getTransactionStatus(Async)");
         }
 
         return getTransactionStatusCall(transactionID, _callback);
 
     }
 
     /**
      * GetTransactionStatus
      * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
      * @return TransactionStatus
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
     public TransactionStatus getTransactionStatus(String transactionID) throws ApiException {
         ApiResponse<TransactionStatus> localVarResp = getTransactionStatusWithHttpInfo(transactionID);
         return localVarResp.getData();
     }
 
     /**
      * GetTransactionStatus
      * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
      * @return ApiResponse&lt;TransactionStatus&gt;
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
     public ApiResponse<TransactionStatus> getTransactionStatusWithHttpInfo(String transactionID) throws ApiException {
         okhttp3.Call localVarCall = getTransactionStatusValidateBeforeCall(transactionID, null);
         Type localVarReturnType = new TypeToken<TransactionStatus>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * GetTransactionStatus (asynchronously)
      * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
      * @param transactionID id of the asynchronous transaction, this will be a GUID (required)
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
     public okhttp3.Call getTransactionStatusAsync(String transactionID, final ApiCallback<TransactionStatus> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = getTransactionStatusValidateBeforeCall(transactionID, _callback);
         Type localVarReturnType = new TypeToken<TransactionStatus>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
     /**
      * Build call for verify
      * @param verifyRequest  (optional)
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
     public okhttp3.Call verifyCall(VerifyRequest verifyRequest, final ApiCallback _callback) throws ApiException {
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
 
         Object localVarPostBody = verifyRequest;
 
         // create path and map variables
         String localVarPath = "/v3/verifications/verify";
 
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
     private okhttp3.Call verifyValidateBeforeCall(VerifyRequest verifyRequest, final ApiCallback _callback) throws ApiException {
         return verifyCall(verifyRequest, _callback);
 
     }
 
     /**
      * Verify
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result. You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param verifyRequest  (optional)
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
     public VerifyResult verify(VerifyRequest verifyRequest) throws ApiException {
         ApiResponse<VerifyResult> localVarResp = verifyWithHttpInfo(verifyRequest);
         return localVarResp.getData();
     }
 
     /**
      * Verify
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result. You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param verifyRequest  (optional)
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
     public ApiResponse<VerifyResult> verifyWithHttpInfo(VerifyRequest verifyRequest) throws ApiException {
         okhttp3.Call localVarCall = verifyValidateBeforeCall(verifyRequest, null);
         Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
         return localVarApiClient.execute(localVarCall, localVarReturnType);
     }
 
     /**
      * Verify (asynchronously)
      * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result. You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
      * @param verifyRequest  (optional)
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
     public okhttp3.Call verifyAsync(VerifyRequest verifyRequest, final ApiCallback<VerifyResult> _callback) throws ApiException {
 
         okhttp3.Call localVarCall = verifyValidateBeforeCall(verifyRequest, _callback);
         Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
         localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
         return localVarCall;
     }
 }
 