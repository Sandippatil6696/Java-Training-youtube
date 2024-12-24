package com.exceptionhandling;

public class ThrowTest {

    /**
     * 
     * @param throw  - used to throw exlicitly exception
     * @param throw  - keyword throw only single excetion at time
     * @param throw  - keyword used in method body
     * 
     * @param throws - keyword used to declare exception
     * @param throws - throws keyword declare multiple exception at time
     * @param throws - throws keyword used with method signature
     * 
     * @throws IllegalArgumentException
     * 
     */

    public void PrintName(String name) throws IllegalArgumentException {
        if (name.contains("-")) {
            throw new IllegalArgumentException("name contains - please provide correct name ");

        }
        System.out.println(name);

    }

    public static void main(String[] args) {
        ThrowTest t = new ThrowTest();
        t.PrintName("san-dip");
    }
}
