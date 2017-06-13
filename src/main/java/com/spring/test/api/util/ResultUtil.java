package com.spring.test.api.util;

import com.spring.test.api.response.DefaultBaseResponse;
import com.spring.test.api.response.IBaseResponse;
import com.spring.test.api.response.Result;

/**
 * Created by hkw on 2017/5/26.
 */
public class ResultUtil {

    public static Result convertResult(IBaseResponse iBaseResponse) {
        DefaultBaseResponse response = (DefaultBaseResponse)iBaseResponse;
        Result result = new Result();
        result.setMessage(response.getMessage());
        result.setStatusCode(response.getStatusCode());
        result.setData(response.getData());
        return result;
    }

}
