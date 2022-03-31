package com.huarui.bean;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 22:31
 * @description ：
 */
public class User {
    private String phoneNumber;
    private String password;
    private String userRole;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
