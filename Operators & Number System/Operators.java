public class Operators {
    public static void main(String[] args) {

        //leap year condition 
        // divisible by 400 or (divisible by 4 && not divisible by 100)
        
        // biwise operator 

        int a = 7 ; 
        int b = 6 ;

        
        int result = a & b ;   // comparing biary number of a ns b using & feature
        System.out.println(result);

        int result1 = a | b ;
        System.out.println(result1);

        // xor - 00 = 0 , 11= 0 , 10 =1 ,01 = 1 
        int result3 = a ^ b ;
        System.out.println(result3); 

        //  compliment or not operator 
        int result4 = ~a ;
        System.out.println(result4);

        //  left shift operatr
        // a * 2^b
        int result5 = a << 2 ;
        System.out.println(result5);


        // right shift operator 
        //  a / 2^b ;
        int result6 = a >> 1 ; 
        System.out.println(result6);

        // odd even number using bitwise operator 
        // 0th bit is 0 for even , and 1 for odd like 0 - 0000 , 1 -0001
        int number = 3 ;
        if ((number & 1) == 1) {
            System.out.println("given number is odd");
        }
        else {
            System.out.println("number is even");
        }

        // ternary operator 

        int x = 5;
        int y = 8 ;

        // ternary operator 
        int  result12 = x > y ? x : y ;
        System.out.println(result12 +  " is greter number ");

        // return absolute value 
        int z = -54;
        int r = z >= 0 ? z:-z;
        System.out.println(r);


    }
}
