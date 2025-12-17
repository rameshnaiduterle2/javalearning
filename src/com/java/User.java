package com.java;

public  class User {

    private String name ;
    private int age;
    private long mobileNumber;
    private final int maxLength;



    public User(int maxLength){
       this.maxLength = maxLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if( name.length() <= maxLength){
            this.name = name;
        }

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

    public void test() throws Exception {
       throw new Exception("sasd");

    }

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
