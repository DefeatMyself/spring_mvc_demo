package com.spring.test.api.service;

import com.alibaba.druid.util.StringUtils;
import com.spring.test.api.dao.AdminDao;
import com.spring.test.api.entity.Admin;
import com.spring.test.api.request.IBaseRequest;
import com.spring.test.api.request.LoginByPasswordRequest;
import com.spring.test.api.response.DefaultBaseResponse;
import com.spring.test.api.response.IBaseResponse;
import com.spring.test.api.response.LoginByPasswordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hkw on 2017/5/25.
 */
@Service
public class LoginByPasswordService implements IBaseService {

    @Autowired
    private AdminDao adminDao;

    public IBaseRequest getRequest() {
        return new LoginByPasswordRequest();
    }

    public IBaseResponse serve(IBaseRequest request) {
        LoginByPasswordRequest loginByPasswordRequest = (LoginByPasswordRequest) request;
        LoginByPasswordResponse response = new LoginByPasswordResponse();
        if (StringUtils.isEmpty(loginByPasswordRequest.getUserName())
                && StringUtils.isEmpty(loginByPasswordRequest.getPassword())){
            return new DefaultBaseResponse().response(0,"userName or password is empty!!");
        }
        Admin admin = new Admin();
        admin.setName(loginByPasswordRequest.getUserName());
        response.setData(adminDao.queryAdmin(admin));
        return response.response(1,"login success !");
    }
}
