package com.trulioo.normalizedapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import com.trulioo.normalizedapi.api.*;
import com.trulioo.normalizedapi.model.*;

public class SdkJavaV3Sample {
    public static void main(String[] args) throws ApiException {

        String clientID = "ENTER_CLIENT_ID";
        String clientSecret = "ENTER_CLIENT_SECRET";

        ApiClient apiClient = new ApiClient(clientID, clientSecret);

        //ConnectionApi
        ConnectionApi connectionClient = new ConnectionApi(apiClient);

        //sayHello
        String hello = connectionClient.sayHello("sayHello").toString();
        System.out.println(hello);

        //sayHelloAsync
        connectionClient.sayHelloAsync("sayHello", new ApiCallback<Object>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV3Sample.class.getName()).log(Level.SEVERE, null, ae);
            }

            @Override
            public void onSuccess(Object result, int statusCode, Map<String, List<String>> responseHeaders) {
                System.out.println(result);
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });

        //testAuthentication
        String testResult = connectionClient.testAuthentication();
        System.out.println(testResult);

        //testAuthenticationAsync
        connectionClient.testAuthenticationAsync(new ApiCallback<String>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV3Sample.class.getName()).log(Level.SEVERE, null, ae);
            }

            @Override
            public void onSuccess(String t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });


        //VerificationsApi
        VerificationsApi verificationClient = new VerificationsApi(apiClient);

        VerifyRequest request = new VerifyRequest()
                .countryCode("ES")
                .verificationType(VerifyRequest.VerificationTypeEnum.TEST)
                .packageId("d804738c-434f-41ec-970a-30a2b4322046")
                .dataFields(new DataFields()
                        .personInfo(new PersonInfo()
                                .firstGivenName("mock")
                                .firstSurName("mock")
                                .secondSurname("mock"))
                        .location(new Location()
                                .postalCode("28001")
                                .additionalFields(new LocationAdditionalFields()
                                        .address1("Calle de Atocha 27, 2º, 4ª Madrid, España")))
                        .nationalIds(Arrays.asList(new NationalId().number("Z5270010W").type("")))
                        .document(new Document()
                                .documentBackImage("test image back".getBytes())
                                .documentFrontImage("test image front".getBytes())
                                .documentType("DrivingLicence"))
                );

        //verify
        VerifyResult result = verificationClient.verify(request);
        System.out.println(result);

        //verifyAsync
        verificationClient.verifyAsync(request, new ApiCallback<VerifyResult>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV3Sample.class.getName()).log(Level.SEVERE, null, ae);
            }

            @Override
            public void onSuccess(VerifyResult t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });

        // getTransactionRecord
        TransactionRecordResult recordResult = verificationClient.getTransactionRecord("2067ca68-1cd4-400b-16ff-7b4b0ec13b6c");
        System.out.println(recordResult);

        // getTransactionRecordAsync
        verificationClient.getTransactionRecordAsync("2067ca68-1cd4-400b-16ff-7b4b0ec13b6c", new ApiCallback<TransactionRecordResult>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV3Sample.class.getName()).log(Level.SEVERE, null, ae);
            }

            @Override
            public void onSuccess(TransactionRecordResult t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });

        BusinessApi businessClient = new BusinessApi(apiClient);

        //getCountrySubdivisions
        List<CountrySubdivision> countrySubdivisions = businessClient.getCountryJOI();
        System.out.println(countrySubdivisions);

        businessClient.getCountryJOIAsync(new ApiCallback<List<CountrySubdivision>>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV3Sample.class.getName()).log(Level.SEVERE, null, ae);
            }

            @Override
            public void onSuccess(List<CountrySubdivision> t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
