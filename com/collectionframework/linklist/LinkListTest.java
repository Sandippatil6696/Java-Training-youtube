package com.collectionframework.linklist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        List<String> s = Arrays.asList("lion", "Zebra" , "beer");

        list.add(12);
        list.add(14);
        list.add(18);
        list.add(154);
        list.add(120);
        list.remove(0);
        



        for (Integer list2 : list) {
            System.out.print(list2 + " ");   
        }
        System.out.println();

        sortInDescending(s);
        System.out.println(s);

    }

    public static void sortInDescending(List<String> str){

        System.out.println(str);
        // Collections.sort(str);
        // Collections.reverse(str);

        Collections.sort(str, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                if (o1.equals(o2)) {
                    return 0 ;
                }else if (o1.charAt(0) < o2.charAt(0))  {
                    return 1 ;
                }else{
                    return -1 ;
                }

            };
        });
    }
}
