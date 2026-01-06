package com.java.thread;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        //implementing deadlcok

        Task task1 = new Task();
        Task task2 = new Task();

        ThreadA threadA = new ThreadA(task1, task2);
        ThreadB threadB = new ThreadB(task1, task2);

        threadA.start();
        threadB.join();


    }

}
