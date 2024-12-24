package com.wrapper;

public class WrapperClassTest {

    /**
     * wrapper class
     * autoboxing - automatic conversion of primitive datatype to wrapper class
     * object
     * unboxing - automatic conversion from wrapper class object to primitive
     * datatype
     *
     *
     */
    public static void main(String[] args) {
        // autoboxing
        Integer a = Integer.valueOf(55);
        Integer b = 55;
        System.out.println(b.byteValue());

        // unboxing
        int c = b;

    }

}
