package com.spring.test.api.response;

/**
 * Created by hkw on 2017/4/11.
 */
public class DefaultBaseResponse implements IBaseResponse {

    private int statusCode;
    private String message;
    private Object data;

    public IBaseResponse response(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
