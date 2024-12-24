package com.variablearguments;

public class VarArgs {

    public static void main(String[] args) {
       
        /**
         * by variable arguments you dont need to method overlaod 
         */

        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,78));
        System.out.println(sum(4,5,6,8,9,45));
    }

    // public static int Sum(int arr[]) {
    // int sum = 0;
    // for (int a : arr) {
    // sum += a;
    // }
    // return sum;
    // }


    // int.. arr - variable arguments passing in array 
    public static int sum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;

    }

}
