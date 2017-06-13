package com.spring.test.api.service;


import com.spring.test.api.request.IBaseRequest;
import com.spring.test.api.response.IBaseResponse;

/**
 * Created by hkw on 2017/4/11.
 */
public interface IBaseService {

    IBaseRequest getRequest();

    IBaseResponse serve(IBaseRequest request);

}
