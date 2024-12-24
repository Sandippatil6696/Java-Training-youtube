package com.polymorphysum.overriding;

public class TestOverride {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        a.sound();
        c.sound();
        d.sound();

        // Animal a = new Cat();
        // a.sound(); // returns cat method 
    }
}
