package com.trulioo.normalizedapi.auth;

import okhttp3.OkHttpClient;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import okhttp3.internal.tls.OkHostnameVerifier;
import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.Map;
import java.util.Map.Entry;

public class OAuthOkHttpClient implements HttpClient {
    private OkHttpClient client;

    private boolean verifyingSsl;

    public OAuthOkHttpClient setVerifyingSsl(boolean verifyingSsl) {
        this.verifyingSsl = verifyingSsl;
        applySslSettings();
        return this;
    }

    public OAuthOkHttpClient() {
        this.client = new OkHttpClient();
    }

    public OAuthOkHttpClient(OkHttpClient client) {
        this.client = client;
    }

    @Override
    public <T extends OAuthClientResponse> T execute(OAuthClientRequest request, Map<String, String> headers,
                                                     String requestMethod, Class<T> responseClass)
            throws OAuthSystemException, OAuthProblemException {

        MediaType mediaType = MediaType.parse("application/json");
        Request.Builder requestBuilder = new Request.Builder().url(request.getLocationUri());

        if(headers != null) {
            for (Entry<String, String> entry : headers.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("Content-Type")) {
                    mediaType = MediaType.parse(entry.getValue());
                } else {
                    requestBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
        }

        RequestBody body = request.getBody() != null ? RequestBody.create(request.getBody(), mediaType) : null;
        requestBuilder.method(requestMethod, body);

        try {
            Response response = client.newCall(requestBuilder.build()).execute();
            return OAuthClientResponseFactory.createCustomResponse(
                    response.body().string(),
                    response.body().contentType().toString(),
                    response.code(),
                    response.headers().toMultimap(),
                    responseClass);
        } catch (IOException e) {
            throw new OAuthSystemException(e);
        }
    }

    private void applySslSettings() {
        try {
            TrustManager[] trustManagers;
            HostnameVerifier hostnameVerifier;
            if (!verifyingSsl) {
                trustManagers = new TrustManager[]{
                        new X509TrustManager() {
                            @Override
                            public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                            }

                            @Override
                            public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                            }

                            @Override
                            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                                return new java.security.cert.X509Certificate[]{};
                            }
                        }
                };
                hostnameVerifier = new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                };
            } else {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

                trustManagers = trustManagerFactory.getTrustManagers();
                hostnameVerifier = OkHostnameVerifier.INSTANCE;
            }

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagers, new SecureRandom());
            client = client.newBuilder()
                    .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagers[0])
                    .hostnameVerifier(hostnameVerifier)
                    .build();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void shutdown() {
        // Nothing to do here
    }
}
