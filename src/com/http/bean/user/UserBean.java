package com.http.bean.user;

/**
 * Created by smart on 2017/8/3.
 */
public class UserBean {
    private String user_account;
    private String user_password;
    private int user_age;

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String pUser_account) {
        user_account = pUser_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String pUser_password) {
        user_password = pUser_password;
    }

    public int  getUser_age() {
        return user_age;
    }

    public void setUser_age(int pUser_age) {
        user_age = pUser_age;
    }
}