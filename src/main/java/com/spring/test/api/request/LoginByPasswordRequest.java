package com.spring.test.api.request;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hkw on 2017/5/25.
 */
public class LoginByPasswordRequest extends DefaultBaseRequest {

    private String userName;
    private String password;

    @Override
    public void parse(HttpServletRequest request) {
        super.parse(request);
        userName = request.getParameter("userName");
        password = request.getParameter("password");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
