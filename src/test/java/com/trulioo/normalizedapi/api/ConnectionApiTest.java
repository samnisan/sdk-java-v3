package com.trulioo.normalizedapi.api;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


/**
 * API tests for ConnectionApi
 */
@Disabled
@RunWith(DataProviderRunner.class)
public class ConnectionApiTest {

    private final String clientID = "CLIENT_ID";
    private final String clientSecret = "CLIENT_SECRET";

    private int sayHelloAsyncStatusCode;
    private int authenticateAsyncStatusCode;
    private String sayHelloAsyncResult;
    private String authenticateAsyncResult;

    private final ConnectionApi api = new ConnectionApi(new ApiClient(clientID, clientSecret,null)
            /*.setVerifyingSsl(false)
            .setBasePath("https://localhost:7212")*/);


    /** TESTING CONTAINERS (LOGIC) **/

    /**
     * SayHello
     *
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.  Applied a maximum length for the name parameter of 100 via a route constraint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sayHelloTest() throws ApiException {
        String name = "someName";
        String expectedResponse = "Hello someName";
        Object response = api.sayHello(name);

        Assertions.assertTrue(expectedResponse.equals(response));
    }

    /**
     * This method enables you to check if your system can connect to our system asynchronously. You can even use a web browser to verify a connection to our system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sayHelloAsyncTest() throws ApiException, InterruptedException {
        String name = "someName";
        String expectedResponse = "Hello someName";
        final CountDownLatch latch = new CountDownLatch(1);
        api.sayHelloAsync(name, new ApiCallback<Object>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(Object result, int statusCode, Map<String, List<String>> responseHeaders) {
                sayHelloAsyncStatusCode = statusCode;
                sayHelloAsyncResult = (String)result;
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
        System.out.println(sayHelloAsyncResult);
        Assert.assertTrue(expectedResponse.equals(sayHelloAsyncResult));
        Assert.assertEquals(200, sayHelloAsyncStatusCode);
    }

    /**
     * TestAuthentication
     *
     * This method enables you to check if your credentials are valid. You will need to provide a valid token to ensure a successful response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testAuthenticationTest() throws ApiException {
        String expectedResponse = "Hello " + clientID;
        String response = api.testAuthentication();

        Assert.assertTrue(response.equals(expectedResponse));
    }

    /**
     * This method enables you to check if your credentials are valid asynchronously. You will need to provide a valid token to ensure a successful response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testAuthenticationAsyncTest() throws ApiException, InterruptedException {
        String expectedResponse = "Hello " + clientID;
        final CountDownLatch latch = new CountDownLatch(1);

        api.testAuthenticationAsync(new ApiCallback<String>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(String result, int statusCode, Map<String, List<String>> responseHeaders) {
                authenticateAsyncStatusCode = statusCode;
                authenticateAsyncResult = result;
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
        Assert.assertTrue(expectedResponse.equals(authenticateAsyncResult));
        Assert.assertEquals(200, authenticateAsyncStatusCode);
    }

}
