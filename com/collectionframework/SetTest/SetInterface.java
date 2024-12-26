package com.collectionframework.SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {


    /**
     * 
     * @param args
     * set - contains unique element 
     *      - does not maintain an insertion order 
     *      - best for searching algorithm
     */

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("sandip");
        s.add("rahul");
        s.add("kartik");
        s.add("chandu");

        for (String set1 : s) {
            System.out.println(set1);
        }

        System.out.println(s.size());

        if (s.contains("chandu")) {
            System.out.println("present \n");
        }else{
            System.out.println("does not present \n");
        }

        System.out.println(s.isEmpty());
        System.out.println(s.remove("sandip"));

        for (String set1 : s) {
            System.out.println(set1);
        }
        
    }
}
