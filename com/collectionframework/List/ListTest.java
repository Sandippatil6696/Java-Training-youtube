package com.collectionframework.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(10);
            list.add(50);
            list.add(69);
            list.add(70);

            for (Integer number : list) {
                System.out.print(number + " ");
            }
            
        }
}
