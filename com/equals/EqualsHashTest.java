package com.equals;

public class EqualsHashTest {
    public static void main(String[] args) {
        Person p = new Person("sandip", 20, 001);
        Person p1 = new Person("sandip", 20, 001);

        if (p.equals(p1)) {
            System.out.println("equals");
        }
        else{
            System.out.println("not equal");
        }

        if (p==p1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
