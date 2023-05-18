package com.trulioo.normalizedapi.api;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import java.io.File;

import com.trulioo.normalizedapi.model.*;
import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * API tests for VerificationsApi
 */
@Disabled
public class VerificationsApiTest {

    private final VerificationsApi api = new VerificationsApi(new ApiClient("ENTER CLIENT ID", "ENTER CLIENT SECRET",null)
            /*.setVerifyingSsl(false)
            .setBasePath("BASE URL FOR TESTING ENVIRONMENT")*/);

    private TestResponse documentDownloadAsyncResponse;
    private TestResponse getTransactionRecordAsyncResponse;
    private TestResponse getTransactionStatusAsyncResponse;
    private TestResponse verifyDocumentAsyncResponse;
    private TestResponse verifyIdentityAsyncResponse;
    private TestResponse getPartialResultsResponse;

    /**
     * DATA PROVIDERS; MUST FILL THESE IN FOR INTEGRATION TEST
     **/

    @DataProvider
    public static Object[][] verifyDocumentDataProvider() throws IOException {
        byte[] documentFrontImage = extractBytesOfImage("PUT DEFINITE PATH OF THE IMAGE");
        byte[] documentBackImage = extractBytesOfImage("PUT DEFINITE PATH OF THE IMAGE");
        byte[] liveImage = extractBytesOfImage("PUT DEFINITE PATH OF THE IMAGE");

        VerifyRequest request = new VerifyRequest()
                .verificationType(VerifyRequest.VerificationTypeEnum.DEMO)
                .packageId("")
                .cleansedAddress(false)
                .countryCode("IT")
                .consentForDataSources(new ArrayList<String>())
                .dataFields(new DataFields()
                        .personInfo(new PersonInfo()
                                .firstGivenName("")
                                .middleName("")
                                .firstSurName(""))
                        .document(new Document()
                                .documentFrontImage(documentFrontImage)
                                .documentBackImage(documentBackImage)
                                .livePhoto(liveImage)
                                .documentType(""))
                );
        return new Object[][]{
                {request}
        };
    }

    @DataProvider
    public static Object[][] verifyIdentityDataProvider() {
            VerifyRequest request = new VerifyRequest()
                    .verificationType(VerifyRequest.VerificationTypeEnum.DEMO)
                    .packageId("")
                    .cleansedAddress(false)
                    .countryCode("")
                    .consentForDataSources(new ArrayList<String>())
                    .dataFields(new DataFields()
                            .personInfo(new PersonInfo()
                                    .firstGivenName("")
                                    .middleName("")
                                    .firstSurName(""))
                            .document(new Document()
                                .documentType(""))
                );
        return new Object[][]{
                {request}
        };
    }

    @DataProvider
    public static Object[][] getTransactionRecordDataProvider() {
        return new Object[][]{
                {""}
        };
    }

    @DataProvider
    public static Object[][] getTransactionStatusDataProvider() {
        return new Object[][]{
                {""}
        };
    }

    @DataProvider
    public static Object[][] documentDownloadsDataProvider() {
        return new Object[][]{
                {"", ""}
        };
    }

    @DataProvider
    public static Object[][] partialResultsDataProvider() {
        return new Object[][] {
                {""}
        };
    }

    /** TESTING CONTAINERS (LOGIC) **/

    /**
     * DocumentDownload
     *
     * Download Document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("documentDownloadsDataProvider")
    public void getDocumentDownloadTest(String transactionRecordID, String fieldName) throws ApiException {
        File response = api.getDocumentDownload(transactionRecordID, fieldName);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("documentDownloadsDataProvider")
    public void getDocumentDownloadAsyncTest(String transactionRecordID, String fieldName) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getDocumentDownloadAsync(transactionRecordID, fieldName, new ApiCallback<File>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(File result, int statusCode, Map<String, List<String>> responseHeaders) {
                documentDownloadAsyncResponse = new TestResponse(statusCode, result);
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
        Assert.assertEquals(200, documentDownloadAsyncResponse.getStatusCode());
        Assert.assertNotNull(documentDownloadAsyncResponse.getPayload());
    }

    /**
     * PartialResult
     *
     * This method is used to retrieve the partial result of an asynchronous transaction.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("partialResultsDataProvider")
    public void getPartialResultTest(String transactionID) throws ApiException {
        VerifyResultPartial partialResults = api.getPartialResult(transactionID);

        Assert.assertNotNull(partialResults);
    }

    @Test
    @UseDataProvider("partialResultsDataProvider")
    public void getPartialResultAsyncTest(String transactionID) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getPartialResultAsync(transactionID, new ApiCallback<VerifyResultPartial>() {

            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

            }

            @Override
            public void onSuccess(VerifyResultPartial result, int statusCode,
                                  Map<String, List<String>> responseHeaders) {
                getPartialResultsResponse = new TestResponse<VerifyResultPartial>(statusCode, result);
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
        Assert.assertEquals(200, getPartialResultsResponse.getStatusCode());
        Assert.assertNotNull(getPartialResultsResponse.getPayload());
    }

    /**
     * GetTransactionRecord
     *
     * This endpoint will provide the final results once the transaction completes. The response will have match signals per Name and Address fields and notify if the individual is verified. It may take a few minutes for the transaction to complete.Once the results are available, the callback status updates to “Success”. The Transaction Record ID (TRID) will be sent to the callback URL provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("getTransactionRecordDataProvider")
    public void getTransactionRecordTest(String transactionRecordID) throws ApiException {
        TransactionRecordResult response = api.getTransactionRecord(transactionRecordID);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("getTransactionRecordDataProvider")
    public void getTransactionRecordAsyncTest(String transactionRecordID) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getTransactionRecordAsync(transactionRecordID, new ApiCallback<TransactionRecordResult>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(TransactionRecordResult result, int statusCode, Map<String, List<String>> responseHeaders) {
                getTransactionRecordAsyncResponse = new TestResponse(statusCode, result);
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
        Assert.assertEquals(200, getTransactionRecordAsyncResponse.getStatusCode());
        Assert.assertNotNull(getTransactionRecordAsyncResponse.getPayload());
    }

    /**
     * GetTransactionStatus
     *
     * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("getTransactionStatusDataProvider")
    public void getTransactionStatusTest(String transactionID) throws ApiException {
        TransactionStatus response = api.getTransactionStatus(transactionID);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("getTransactionStatusDataProvider")
    public void getTransactionStatusAsyncTest(String transactionID) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getTransactionStatusAsync(transactionID, new ApiCallback<TransactionStatus>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(TransactionStatus result, int statusCode, Map<String, List<String>> responseHeaders) {
                getTransactionStatusAsyncResponse = new TestResponse(statusCode, result);
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
        Assert.assertEquals(200, getTransactionStatusAsyncResponse.getStatusCode());
        Assert.assertNotNull(getTransactionStatusAsyncResponse.getPayload());
    }

    /**
     * Verify
     *
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress
     *  flag to get additional address information in the result. You can query configuration to get what fields are available
     *  to you in each each country. It is also possible to get sample requests from the customer portal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("verifyDocumentDataProvider")
    public void verifyDocumentTest(VerifyRequest request) throws ApiException {
        VerifyResult response = api.verify(request);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("verifyDocumentDataProvider")
    public void verifyDocumentAsyncTest(VerifyRequest request) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.verifyAsync(request, new ApiCallback<VerifyResult>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(VerifyResult result, int statusCode, Map<String, List<String>> responseHeaders) {
                verifyDocumentAsyncResponse = new TestResponse(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        });

        latch.await(60, TimeUnit.SECONDS);
        Assert.assertEquals(200, verifyDocumentAsyncResponse.getStatusCode());
        Assert.assertNotNull(verifyDocumentAsyncResponse.getPayload());
    }

    @Test
    @UseDataProvider("verifyIdentityDataProvider")
    public void verifyIdentityTest(VerifyRequest request) throws ApiException {
        VerifyResult response = api.verify(request);

        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("verifyIdentityDataProvider")
    public void verifyIdentityAsyncTest(VerifyRequest request) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.verifyAsync(request, new ApiCallback<VerifyResult>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(VerifyResult result, int statusCode, Map<String, List<String>> responseHeaders) {
                verifyIdentityAsyncResponse = new TestResponse(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        });

        latch.await(60, TimeUnit.SECONDS);
        Assert.assertEquals(200, verifyDocumentAsyncResponse.getStatusCode());
        Assert.assertNotNull(verifyIdentityAsyncResponse.getPayload());
    }


    /**
     * Utility Functions
     **/

    private static byte[] extractBytesOfImage(String ImagePath) throws IOException {
        return Files.readAllBytes(new File(ImagePath).toPath());
    }

}
