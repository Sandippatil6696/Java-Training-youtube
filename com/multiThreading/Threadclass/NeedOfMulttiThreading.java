package com.multiThreading.Threadclass;

public class NeedOfMulttiThreading {
    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nfirst task started");
        t1.start();
        System.out.println("\nSecond task started");
        t2.start();
        System.out.println("\nThird task started");
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to execute the task is " + (endTime - starTime));

    }

}
