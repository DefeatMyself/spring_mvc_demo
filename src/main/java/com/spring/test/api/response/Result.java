package com.spring.test.api.response;

import java.io.Serializable;

/**
 * Created by hkw on 2017/5/26.
 */
public class Result implements Serializable {

    private boolean success;
    private String message;
    private int statusCode;
    private Object data;

    public Result() {
    }

    public Result(boolean success, int statusCode) {
        this.success = success;
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
