package com.test;

public class Facebook {

    public static void main(String[] args) {

        LoginPage  loginPage = new SocialLoginPage();

        User user = new User();
        user.setName("Venkata sai");
        user.setAge(25);
        user.setMobileNumber(12345690);
        user.setGender("Male");
        user.setUsername("admin");
        user.setPassword("admin@123");

        User user1 = new User();
        user1.setName("Venkata sai");
        user1.setAge(25);
        user1.setMobileNumber(12345690);
        user1.setGender("Male");
        user1.setUsername("admin");
        user1.setPassword("admin@123");

        boolean logicSuccess = loginPage.login(user.getUsername(), user.getPassword());
        if(logicSuccess) {
            //Object to String.
            String objectString = user.toString();
            System.out.println("Welcome " + user.getName());

            System.out.println( user1.equals(user));

        }else {
            System.out.println("Invalid Password, try again");
        }
    }
}
