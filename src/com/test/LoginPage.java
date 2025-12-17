package com.test;

public class LoginPage {

    public static String DFAULT_USERNAME = "admin";
    public static String DFAULT_PASSWORD = "admin@123";
    private String userName;

    private String password;


    public boolean login(String userName, String password){
        if(DFAULT_USERNAME.equals(userName) && DFAULT_PASSWORD.equals(password)) {
            return true;
        }else {
            return false;
        }
    }




    public boolean login(String authCode){
        return true;
    }



}
