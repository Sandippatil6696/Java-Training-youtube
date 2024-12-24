package com.exceptionhandling;

public class TestCustom {
    public static void main(String[] args) {

        CustomException e = new CustomException();
        e.setTemperature(55);
        
        double temp =  e.getTemperature();

        if ( temp > 50) {
           String result = e.getMessage();
           System.out.println(result);
        }
    }

}
