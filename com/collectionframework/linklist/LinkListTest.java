package com.collectionframework.linklist;

import java.util.LinkedList;

public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(14);
        list.add(18);
        list.add(154);
        list.add(120);
        list.remove(0);
        



        for (Integer list2 : list) {
            System.out.print(list2 + " ");   
        }
    }


}
