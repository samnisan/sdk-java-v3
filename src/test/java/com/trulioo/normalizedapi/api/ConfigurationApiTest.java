package com.trulioo.normalizedapi.api;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.model.*;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * API tests for ConfigurationApi
 */
@Disabled
@RunWith(DataProviderRunner.class)
public class ConfigurationApiTest {

    private final ConfigurationApi api = new ConfigurationApi(new ApiClient("CLIENT_ID", "CLIENT_SECRET",null)
            /*.setVerifyingSsl(false)
            .setBasePath("")*/);

    private TestResponse<List<NormalizedDatasourceGroupsWithCountry>> getAllDatasourcesResponse;

    /**
     * DATA PROVIDERS; MUST FILL THESE IN FOR INTEGRATION TEST
     **/
    @DataProvider
    public static Object[][] getAllDatasourcesDataProvider() {
        String packageID = "input_package_id";
        return new Object[][]{
                {packageID}
        };
    }

     /** TESTING CONTAINERS (LOGIC) **/
    /**
     * This method retrieves all the countries that are available.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("getAllDatasourcesDataProvider")
    public void v3ConfigurationAlldatasourcesPackageIDGetTest(String packageID) throws ApiException {
        String packageId = packageID;
        List<NormalizedDatasourceGroupsWithCountry> response = api.getAllDatasources(packageId);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("getAllDatasourcesDataProvider")
    public void getAllDatasourcesAsyncTest(String packageID) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getAllDatasourcesAsync(packageID, new ApiCallback<List<NormalizedDatasourceGroupsWithCountry>>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(List<NormalizedDatasourceGroupsWithCountry> result, int statusCode, Map<String, List<String>> responseHeaders) {
                getAllDatasourcesResponse = new TestResponse<>(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        });
        latch.await(1, TimeUnit.SECONDS);
        Assert.assertEquals(200, getAllDatasourcesResponse.getStatusCode());
        Assert.assertNotNull(getAllDatasourcesResponse.getPayload());
    }

}
