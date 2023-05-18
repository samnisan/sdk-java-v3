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
import org.junit.runner.RunWith;
import org.junit.Test;


import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * API tests for BusinessApi
 */
@Disabled
@RunWith(DataProviderRunner.class)
public class BusinessApiTest {

    private final BusinessApi api = new BusinessApi(new ApiClient("CLIENT_ID", "CLIENT_SECRET",null)
            /*.setVerifyingSsl(false)
            .setBasePath("ENV_URL")*/);

    private TestResponse searchAsyncResponse;
    private TestResponse verifyBusinessAsyncResponse;
    private TestResponse<List<BusinessRegistrationNumber>> getBusinessRegistrationNumbersResponse;
    private TestResponse<List<CountrySubdivision>> getCountryJOIResponse;


    /**
     * DATA PROVIDERS; MUST FILL THESE IN FOR INTEGRATION TEST
     **/
    @DataProvider
    public static Object[][] searchDataProvider() {
        BusinessSearchRequest request = new BusinessSearchRequest()
                .packageId("")
                .countryCode("")
                .timeout(100)
                .business(new BusinessSearchRequestBusinessSearchModel()
                        .businessName("")
                        .jurisdictionOfIncorporation("")
                        .website("")
                        .location(new Location()));
        return new Object[][]{
                {request}
        };
    }

    @DataProvider
    public static Object[][] verifyBusinessDataProvider() {
        BusinessVerifyRequest request = new BusinessVerifyRequest()
                .verboseMode(true)
                .packageId("")
                .verificationType(BusinessVerifyRequest.VerificationTypeEnum.DEMO)
                .countryCode("")
                .businessDataFields(new BusinessDataFields()
                        .businessName("")
                        .tradestyleName("")
                        .taxIDNumber("")
                        .businessRegistrationNumber("")
                        .shareholderListDocument(true)
                        .financialInformationDocument(true)
                        .dunsNumber("")
                        .entities(true)
                        .jurisdictionOfIncorporation("")
                        );
        return new Object[][]{
                {request}
        };
    }

    @DataProvider
    public static Object[][] getBusinessRegistrationsDataProvider() {
        return new Object[][]{
                {"CA", "ON"},
                {"CA", null},
                {null, null},
                {" ", ""},
                {"", "BC"},
                {null, "BC"}
        };
    };

    @DataProvider
    public static Object[][] getBusinessRegistrationNumberRequestModels() {
        BusinessRegistrationNumberMask mask = new BusinessRegistrationNumberMask()
                .mask("Mask")
                .ignoreWhitespace(true)
                .ignoreSpecialCharacter(true)
                .prependZeroes(true)
                .overwriteRepeating(true);

        BusinessRegistrationNumber businessRegistrationNumber = new BusinessRegistrationNumber()
                .name("Name")
                .description("Description")
                .country("Country")
                .jurisdiction("Jurisdiction")
                .supported(true)
                .type("Type")
                .masks(Arrays.asList(mask, mask));

        return new Object[][] {
                {businessRegistrationNumber, mask}
        };
    }

    @DataProvider
    public static Object[][] getCountryJOIProvider() {
        return new Object[][] {
                {"CA"},
                {""},
                {null}
        };
    }

    /** TESTING CONTAINERS (LOGIC) **/

    /**
     * Search
     *
     * Calling this method will perform a business search.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("searchDataProvider")
    public void businessSearchTest(BusinessSearchRequest request) throws ApiException {
        BusinessSearchResponse response = api.businessSearch(request);
        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("searchDataProvider")
    public void searchAsyncTest(BusinessSearchRequest request) throws ApiException, InterruptedException {
//        BusinessApi businessApi = api.getBusinessApi();
        final CountDownLatch latch = new CountDownLatch(1);
        api.businessSearchAsync(request, new ApiCallback<BusinessSearchResponse>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(BusinessSearchResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
                searchAsyncResponse = new TestResponse(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        });

        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(200, searchAsyncResponse.getStatusCode());
        Assert.assertNotNull(searchAsyncResponse.getPayload());
    }

    /**
     * Verify
     *
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get additional address information in the result.  You can query configuration to get what fields are available to you in each each country. It is also possible to get sample requests from the customer portal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("verifyBusinessDataProvider")
    public void businessVerifyTest(BusinessVerifyRequest request) throws ApiException {
        VerifyResult response = api.businessVerify(request);
        Assert.assertNotNull(response);
    }

    @Test
    @UseDataProvider("verifyBusinessDataProvider")
    public void businessVerifyAsyncTest(BusinessVerifyRequest request) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.businessVerifyAsync(request, new ApiCallback<VerifyResult>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(VerifyResult result, int statusCode, Map<String, List<String>> responseHeaders) {
                verifyBusinessAsyncResponse = new TestResponse(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        });

        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(200, verifyBusinessAsyncResponse.getStatusCode());
        Assert.assertNotNull(verifyBusinessAsyncResponse.getPayload());
    }

    /**
     * GetBusinessRegistrationNumbers
     *
     * Gets the currently configured business registration numbers for optionally supplied country and jurisdiction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBusinessRegistrationNumbersTest() throws ApiException {
        List<BusinessRegistrationNumber> response = api.getBusinessRegistrationNumbers();
        Assert.assertNotNull(response);
    }

    @Test
    public void getBusinessRegistrationNumbersAsyncTest() throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getBusinessRegistrationNumbersAsync(new ApiCallback<List<BusinessRegistrationNumber>>() {

            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

            }

            @Override
            public void onSuccess(List<BusinessRegistrationNumber> result, int statusCode, Map<String, List<String>> responseHeaders) {
                getBusinessRegistrationNumbersResponse = new TestResponse<>(statusCode, result);
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
        Assert.assertEquals(200, getBusinessRegistrationNumbersResponse.getStatusCode());
        Assert.assertNotNull(getBusinessRegistrationNumbersResponse.getPayload());
    }

    /**
     * getBusinessRegistrationNumbersWithParameters
     *
     * Gets the currently configured business registration numbers for country and an optionally supplied jurisdiction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("getBusinessRegistrationsDataProvider")
    public void getBusinessRegistrationNumbersWithParametersTest(String countryCode, String jurisdictionCode) throws ApiException {
        try {
            List<BusinessRegistrationNumber> response = api.getBusinessRegistrationNumbersWithParameters(countryCode, jurisdictionCode);
            Assert.assertNotNull(response);
        } catch (ApiException e) {
            Assert.assertTrue(e.getMessage().equals("The parameter 'countryCode' is required in order to use the parameter 'jurisdictionCode' when calling getBusinessRegistrationNumbers(Async)"));
        }
    }

    @Test
    @UseDataProvider("getBusinessRegistrationsDataProvider")
    public void getBusinessRegistrationNumbersWithParametersAsyncTest(String countryCode, String jurisdictionCode) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);

        try {
            api.getBusinessRegistrationNumbersWithParametersAsync(countryCode, jurisdictionCode, new ApiCallback<List<BusinessRegistrationNumber>>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

                }

                @Override
                public void onSuccess(List<BusinessRegistrationNumber> result, int statusCode, Map<String, List<String>> responseHeaders) {
                    getBusinessRegistrationNumbersResponse = new TestResponse<>(statusCode, result);
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
            Assert.assertEquals(200, getBusinessRegistrationNumbersResponse.getStatusCode());
            Assert.assertNotNull(getBusinessRegistrationNumbersResponse.getPayload());

        } catch (ApiException e) {
            Assert.assertTrue(e.getMessage().equals("The parameter 'countryCode' is required in order to use the parameter 'jurisdictionCode' when calling getBusinessRegistrationNumbers(Async)"));
        }
    }

    @Test
    @UseDataProvider("getBusinessRegistrationNumberRequestModels")
    public void BusinessRegistrationNumberRequestModelsTest(BusinessRegistrationNumber businessRegistrationNumber, BusinessRegistrationNumberMask mask) {
        // Assert Model Definition
        Assert.assertEquals("Name", businessRegistrationNumber.getName());
        Assert.assertEquals("Description", businessRegistrationNumber.getDescription());
        Assert.assertEquals("Country", businessRegistrationNumber.getCountry());
        Assert.assertEquals("Jurisdiction", businessRegistrationNumber.getJurisdiction());
        Assert.assertEquals("Type", businessRegistrationNumber.getType());
        Assert.assertEquals(2, businessRegistrationNumber.getMasks().size());
        Assert.assertTrue(businessRegistrationNumber.getSupported());

        Assert.assertEquals("Mask", mask.getMask());
        Assert.assertTrue(mask.getIgnoreWhitespace());
        Assert.assertTrue(mask.getIgnoreSpecialCharacter());
        Assert.assertTrue(mask.getPrependZeroes());
        Assert.assertTrue(mask.getOverwriteRepeating());

        // Update
        businessRegistrationNumber.setName("Updated_Name");
        businessRegistrationNumber.setDescription("Updated_Description");
        businessRegistrationNumber.setCountry("Updated_Country");
        businessRegistrationNumber.setJurisdiction("Updated_Jurisdiction");
        businessRegistrationNumber.setType("Updated_Type");

        mask.setMask("Updated_Mask");
        mask.setIgnoreWhitespace(false);
        mask.setIgnoreSpecialCharacter(false);
        mask.setPrependZeroes(false);
        mask.setOverwriteRepeating(false);

        // Assert Model Update
        Assert.assertEquals("Updated_Name", businessRegistrationNumber.getName());
        Assert.assertEquals("Updated_Description", businessRegistrationNumber.getDescription());
        Assert.assertEquals("Updated_Country", businessRegistrationNumber.getCountry());
        Assert.assertEquals("Updated_Jurisdiction", businessRegistrationNumber.getJurisdiction());
        Assert.assertEquals("Updated_Type", businessRegistrationNumber.getType());
        Assert.assertEquals(2, businessRegistrationNumber.getMasks().size());

        Assert.assertEquals("Updated_Mask", mask.getMask());
        Assert.assertFalse(mask.getIgnoreWhitespace());
        Assert.assertFalse(mask.getIgnoreSpecialCharacter());
        Assert.assertFalse(mask.getPrependZeroes());
        Assert.assertFalse(mask.getOverwriteRepeating());
    }

    /**
     * GetCountryJOI
     *
     * Gets all jurisdictions of incorporation for all countries if no country is supplied. Gets the jurisdictions of incorporation for a country, if country is supplied.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountryJOITest() throws ApiException {
        List<CountrySubdivision> response = api.getCountryJOI();
        Assert.assertNotNull(response);
    }

    @Test
    public void getCountryJOITestAsync() throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        api.getCountryJOIAsync(new ApiCallback<List<CountrySubdivision>>() {

            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

            }

            @Override
            public void onSuccess(List<CountrySubdivision> result, int statusCode, Map<String, List<String>> responseHeaders) {
                getCountryJOIResponse = new TestResponse<>(statusCode, result);
                latch.countDown();
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

            }

        });
        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(200, getCountryJOIResponse.getStatusCode());
        Assert.assertNotNull(getCountryJOIResponse.getPayload());
    }

    /**
     * getCountryJOIWithCountryCode
     *
     * Gets the jurisdictions of incorporation for a country.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @UseDataProvider("getCountryJOIProvider")
    public void getCountryJOIWithCountryCodeTest(String countryCode) {
        List<CountrySubdivision> response = null;
        try {
            response = api.getCountryJOIWithCountryCode(countryCode);
            Assert.assertNotNull(response);
        } catch (ApiException e) {
            Assert.assertTrue(e.getMessage().equals("Missing the required parameter 'countryCode' when calling getCountryJOIWithCountryCode(Async)"));
        }

    }

    @Test
    @UseDataProvider("getCountryJOIProvider")
    public void getCountryJOIWithCountryCodeAsync(String countryCode) throws ApiException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        try {
            api.getCountryJOIWithCountryCodeAsync(countryCode, new ApiCallback<List<CountrySubdivision>>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

                }

                @Override
                public void onSuccess(List<CountrySubdivision> result, int statusCode, Map<String, List<String>> responseHeaders) {
                    getCountryJOIResponse = new TestResponse<>(statusCode, result);
                    latch.countDown();
                }

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

                }

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

                }

            });
            latch.await(10, TimeUnit.SECONDS);
            Assert.assertEquals(200, getCountryJOIResponse.getStatusCode());
            Assert.assertNotNull(getCountryJOIResponse.getPayload());
        } catch (ApiException e) {
            Assert.assertTrue(e.getMessage().equals("Missing the required parameter 'countryCode' when calling getCountryJOIWithCountryCode(Async)"));
        }
    }
   
}
