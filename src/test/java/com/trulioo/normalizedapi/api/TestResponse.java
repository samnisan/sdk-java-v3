package com.trulioo.normalizedapi.api;

public class TestResponse<T> {
    private int statusCode;
    private T payload;

    public TestResponse(int statusCode, T payload) {
        this.statusCode = statusCode;
        this.payload = payload;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
