package com.spring.test.api.request;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hkw on 2017/4/11.
 */
public class DefaultBaseRequest implements IBaseRequest {

    String userId;
    String version;

    public void parse(HttpServletRequest request) {
        userId = request.getParameter("userId");
        version = request.getParameter("version");
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
