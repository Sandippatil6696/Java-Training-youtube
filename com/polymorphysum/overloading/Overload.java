package com.polymorphysum.overloading;

public class Overload {


    //    constructot overloading
    Overload(){
        System.out.println("default constructor is called ");
    }

    Overload(String name){
        System.out.println(name);
    
    }
        

    // Method overloading 
    // bychanging number of arguments 
    // & by changing datatype 

    public int add(int a , int b ){
        return a + b ;
    }

    public int add (int a , int b , int c){
        return a + b + c ;
    }

    public String add (String a , String b){
        return a + b ;
    }



    public static void main(String[] args) {
        Overload o = new Overload();

        System.out.println(o.add("sa", "n"));
        System.out.println(o.add(5, 6));
    }


    

}
