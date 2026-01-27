package com.java;

@FunctionalInterface
public interface Calculator {

     int calculate(int a, int b) ;


     public  static void say() {
          System.out.println("it is a static method");
     }

     default void defaultMethod() {
          System.out.println("it is a default method");
     }

}

