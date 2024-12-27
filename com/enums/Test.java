package com.enums;

public class Test {
  

    public static void main(String[] args) {
        EnumsTest color = EnumsTest.valueOf("RED");
        System.out.println(color);

        Grade result = Grade.A;
        Grade result2 = Grade.F;

        for (Grade val : Grade.values()) {
            System.out.print(val+ " ");
        }
        System.out.println();
        
        System.out.println(result);
        System.out.println(result2);

        


    }
}
