package com.Interface;

public class Eagle extends Bird {

    public Eagle(){
        super("eagle");
    }


        @Override
    public void fly() {
        System.out.println("eagle is flying");
    }

}
