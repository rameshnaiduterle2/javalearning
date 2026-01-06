package com.java;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.add(10, 20);

//        Calculator c = (v1,v2) -> v1+v2;  // Lambda
//        int value = c.calculate(10, 20);
        Calculator.say();;

    }


    public void add(int a , int b) {
        Calculator c = (v1,v2) -> v1+v2;  // Lambda
        int value = c.calculate(10, 20);
        int value1 = c.calculate(20, 40);
        System.out.println(value1);
    }

    public void subtract(int a , int b) {
        Calculator c = (v1,v2) -> v1-v2;
        int value = c.calculate(10, 20);
        System.out.println(value);
    }


    public int method(int a, int b) {
        return a+b;
    }







//    public static void main(String[] args)  {
//        int []arr = {1};
//
////            System.out.println(stringToCharArray(null));
//
//        try {
//            stringToCharArray(null);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
////        System.out.println("Main completed");
//    }
//
//    static int test(int a, int b){
//        return a/b;
//    }
//
//    public static char[] stringToCharArray(String value) throws Exception {
//        if(value == null) {
//            throw new RuntimeException("Please check your value, it should not be a null");
//        }
//        return value.toCharArray();
//    }
}
