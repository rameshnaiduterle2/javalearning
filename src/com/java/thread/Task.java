package com.java.thread;

public class Task {

    public synchronized void  task1(Task task) {

        System.out.println("task1 executing.");

        task.task2();
    }

    public synchronized void  task2() {

        System.out.println("task2 executing");

    }

}
