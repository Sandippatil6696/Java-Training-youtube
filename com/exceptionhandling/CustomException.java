package com.exceptionhandling;

public class CustomException extends Exception{

    private double temperature ;

    CustomException(double temperature){
        this.temperature = temperature;
    }

    CustomException(){
    }
    

    @Override
    public String getMessage() {
        return "temperature you entered is very high";
    }



    public double getTemperature() {
        return temperature;
    }



    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }



}
