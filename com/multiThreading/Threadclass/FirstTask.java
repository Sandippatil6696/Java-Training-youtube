package com.multiThreading.Threadclass;

public class FirstTask extends Thread{

    @Override
    public void run() {
        /* first task  */
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d* " , i);
        }
        System.out.println("\n* task completed " + Thread.currentThread().getName());
    
    }
}
