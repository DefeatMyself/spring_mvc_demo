package com.spring.test.api.entity;

/**
 * Created by hkw on 2017/5/26.
 */
public class Admin {

    private int id;
    private String name;
    private String password;
    private int cloopenId;
    private String cloopenToken;
    private String userIp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCloopenId() {
        return cloopenId;
    }

    public void setCloopenId(int cloopenId) {
        this.cloopenId = cloopenId;
    }

    public String getCloopenToken() {
        return cloopenToken;
    }

    public void setCloopenToken(String cloopenToken) {
        this.cloopenToken = cloopenToken;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }
}
