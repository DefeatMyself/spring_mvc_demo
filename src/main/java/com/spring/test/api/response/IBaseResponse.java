package com.spring.test.api.response;

/**
 * Created by hkw on 2017/4/11.
 */
public interface IBaseResponse {

    IBaseResponse response(int statusCode, String message);

}
