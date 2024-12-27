package com.collectionframework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        /**
         * list - maintain an insertion order
         *      - contains dublicate element
         *      - list is of dyamic size 
         *      - generics is compile time
         */

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(10);
        list.add(50);
        list.add(69);
        list.add(70);
        list.add(5, 100);

        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println(list.get(2));

        System.out.println(list.size());

        list.remove(0);

        list.set(1, 56);

        // list.clear(); - to clear a list element

        if (list.contains(50)) {
            System.out.println("number is present");
        }else{
            System.out.println("not present");
        }

        System.out.println(list.indexOf(70));

        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
        // swapping two element in list 
        List<Integer> ll = Arrays.asList(21,4,3,56,12,45,7,1);
        System.out.println(ll);
        swapInList(ll, 2, 5);
        System.out.println(ll);

        System.out.println();

        // reverlist 
        List<Integer> ls = Arrays.asList(2,4,13,6,12,5,17,26);
        System.out.println(ls);
        reverseList(ls);
        System.out.println(ls);
    }

    //
    public static void swapInList(List<Integer> l , int x , int y){
        int swap = l.get(x);
        l.set(x, l.get(y));
        l.set(y, swap);

    }

    //reverse list
    public static void reverseList(List<Integer> l){
       for (int i = 0; i < l.size()/2; i++) {
            swapInList(l, i, l.size()-1-i);
       }
    }
}
