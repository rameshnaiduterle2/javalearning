package com.java;

public  class User {

    private String name ;
    private int age;
    private long mobileNumber;

    public User(String name, int age, int mobileNumber){
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

//    private void test() {
//        System.out.println("Able to access this method");
//        test2();
//    }

    public static String CORRECT_USER = "Admin";
    public static String CORRECT_PASSWORD = "Admin@123";
    public void login(String userName, String password) {
        if(userName.equals(CORRECT_USER) && password.equals(CORRECT_PASSWORD)){
            System.out.println("Login success");
        }else {
            System.out.println("login failed");
        }
    }

    private  String password;

    private String getPassword() {
        return CORRECT_PASSWORD;
    }
}
