package com.collectionframework.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollectionsclass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1  = Arrays.asList(1,5,6,7,1,2,5,8,7,1,2,3,98,7,1,2);

        list.add(55);
        list.add(98);
        list.add(97);
        list.add(-101);

        for (Integer list2 : list) {
            System.out.print(list2 + " ");
        }
        System.out.println(); 

        // sort
        Collections.sort(list);
        for (Integer list2 : list) {
            System.out.print(list2 + " ");
        }
        System.out.println();

        // reverse
        Collections.reverse(list);
        for (Integer list2 : list) {
            System.out.print(list2 + " ");
        }

        System.out.println();
        System.out.println(Collections.binarySearch(list ,97));

      
        // frequency of element 
        System.out.println(Collections.frequency(list1, 1));

    }

   
    
    

    

}
