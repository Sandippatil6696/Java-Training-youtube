package com.multiThreading.runnableinterface;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        /* first task  */
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d%s " , i , targetChar);
        }
        System.out.printf("\n%s task completed " + Thread.currentThread().getName(), targetChar);

    }
        private final char targetChar ;

        public PrintTask(char targetChar){
            this.targetChar = targetChar;
        }
    

}
