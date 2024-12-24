package com.inheritance;

public class TwoWheeler extends Vehicle{
    
    TwoWheeler(){
        noOfTyres = 2;
    }

    public void balance (){
        System.out.println("i am balancing on two wheels");
    }
}
