package com.java;

public class Main {



    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        //value  =16 - by default
        //(cur*2)+2 = 34
       // 34*2 + 2 = 70

        String[] array = {"a","b", "abc", "cde" , "fgh"};
        for (int i = 0; i < array.length; i++) {
           stringBuilder.append(array[i]);
        }
        System.out.println(stringBuilder);


    }
}
