package com.java;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void sound() {
        System.out.println("Roar");
    }
}
