package com.Interface;

public abstract class Bird implements Flyable {

    private String breed ;

   

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    } 

    
    
}
