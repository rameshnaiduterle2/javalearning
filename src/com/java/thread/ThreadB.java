package com.java.thread;

public class ThreadB extends Thread{

    private Task task1;
    private Task task2;

    ThreadB(Task task1 , Task task2) {
        this.task1 = task1;
        this.task2 = task2;
    }


    @Override
    public void run() {
        task2.task1(task1);
    }





}

