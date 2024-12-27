package com.collectionframework.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class Maptesting {

    public static void main(String[] args) {
        /**
         * map stores value in key value pair 
         * map has unique key but contains dublicates value
         */
        Map<String , Integer> m = new HashMap<>();
        m.put("Sandip", 21);
        m.put("rahul", 28);
        m.put("mayur", 255);
        m.put("kartik", 213);

        System.out.println(m.size());
        System.out.println(m.get("mayur"));
        System.out.println(m.containsKey("Sandip"));
        System.out.println(m.remove("mayur"));

        for (String keySet : m.keySet()) {
            System.out.println(keySet + " "+m.get(keySet));
        }

    }

}
