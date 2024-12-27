package com.collectionframework.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        
        /**
         * que maintin FIFO 
         * 
         */
        Queue<Integer> que =  new LinkedList<>();
        
        /* Inserts the specified element into this queue*/
        que.add(55);
        que.offer(56);
        que.offer(67);

     for (Integer q : que) {
        System.out.print(q+ " ");
     }

     /*Retrieves, but does not remove, the head of this queue,  */
     System.out.println(que.element());
     System.out.println(que.peek());

     /* remove first added element */
     //System.out.println(que.remove());

     /*retrieves and removes the head of this queue */
     System.out.println(que.poll());
     
     for (Integer q : que) {
        System.out.print(q+ " ");
     }


    }

}
