package com.spring.test.api.request;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hkw on 2017/4/9.
 */
public interface IBaseRequest {

    void parse(HttpServletRequest request);

}
