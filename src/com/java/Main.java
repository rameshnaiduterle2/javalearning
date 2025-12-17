package com.java;

public class Main {

    public static void main(String[] args)  {
        int []arr = {1};

//            System.out.println(stringToCharArray(null));

        try {
            stringToCharArray(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        System.out.println("Main completed");
    }

    static int test(int a, int b){
        return a/b;
    }

    public static char[] stringToCharArray(String value) throws Exception {
        if(value == null) {
            throw new RuntimeException("Please check your value, it should not be a null");
        }
        return value.toCharArray();
    }
}
