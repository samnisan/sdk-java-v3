package com.trulioo.normalizedapi.api;

import com.google.gson.reflect.TypeToken;
import com.trulioo.normalizedapi.*;
import com.trulioo.normalizedapi.model.NormalizedDatasourceGroupsWithCountry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigurationApi(ApiClient apiClient) {
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
     * Build call for getAllDatasources
     *
     * @param packageID Package ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
     * <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
     * <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAllDatasourcesCall(String packageID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[]{};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/configuration/alldatasources/{packageID}"
                .replace("{" + "packageID" + "}", localVarApiClient.escapeString(packageID.toString()));

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

        String[] localVarAuthNames = new String[]{};
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllDatasourcesValidateBeforeCall(String packageID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'packageID' is set
        if (packageID == null || packageID.trim().isEmpty()) {
            throw new ApiException("Missing the required parameter 'packageID' when calling getAllDatasources(Async)");
        }

        return getAllDatasourcesCall(packageID, _callback);

    }

    /**
     * Get All Datasources by Country
     * Gets all datasource groups configured for your product.
     *
     * @param packageID Package ID (required)
     * @return List&lt;NormalizedDatasourceGroupsWithCountry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
     * <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
     * <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public List<NormalizedDatasourceGroupsWithCountry> getAllDatasources(String packageID) throws ApiException {
        ApiResponse<List<NormalizedDatasourceGroupsWithCountry>> localVarResp = getAllDatasourcesWithHttpInfo(packageID);
        return localVarResp.getData();
    }

    /**
     * Get All Datasources by Country
     * Gets all datasource groups configured for your product.
     *
     * @param packageID Package ID (required)
     * @return ApiResponse&lt;List&lt;NormalizedDatasourceGroupsWithCountry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
     * <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
     * <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<NormalizedDatasourceGroupsWithCountry>> getAllDatasourcesWithHttpInfo(String packageID) throws ApiException {
        okhttp3.Call localVarCall = getAllDatasourcesValidateBeforeCall(packageID, null);
        Type localVarReturnType = new TypeToken<List<NormalizedDatasourceGroupsWithCountry>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get All Datasources by Country (asynchronously)
     * Gets all datasource groups configured for your product.
     *
     * @param packageID Package ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 400 </td><td> Your request could not be processed, there should be more details in the response. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The token you provided is not valid or you are using an account that is not enabled. </td><td>  -  </td></tr>
     * <tr><td> 408 </td><td> The request took longer to process than we waited. </td><td>  -  </td></tr>
     * <tr><td> 415 </td><td> You asked for a media type that we do not support. You should request application/json in the Content-Type header. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An error happened on the server without a specific message. </td><td>  -  </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAllDatasourcesAsync(String packageID, final ApiCallback<List<NormalizedDatasourceGroupsWithCountry>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllDatasourcesValidateBeforeCall(packageID, _callback);
        Type localVarReturnType = new TypeToken<List<NormalizedDatasourceGroupsWithCountry>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}