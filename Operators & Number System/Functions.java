public class Functions {
    public static void main(String[] args) {
        table(2);
        System.out.println();
        sumOdd(10);
        oddSumNum(10);
        factorial(4);
        sumOfDigit(154);
        reverseNumber(156);

        System.out.println(numberOfDigit(1255));
        System.out.println(power(2, 3));
        System.out.println(isamstrongnumber(153));
    }

    // table of number
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            int val = i * num;
            System.out.print(val + " ");
        }
    }

    // to check number is odd
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else
            return true;

    }

    // sum odd numbers in range
    public static void sumOdd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    // oddsum

    public static void oddSumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("sum of oodd numbers till " + num + " is " + sum);
    }

    // factorial
    public static void factorial(int num) {
        long fact = 1;
        if (num < 2) {
            fact = 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of given number " + num + " is  " + fact);
    }

    // sum of digits of integer

    public static void sumOfDigit(int num) {

        int sum = 0;
        int copyNum = num;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }

        System.out.println("sum of digit of integer " + copyNum + " is " + sum);

    }

    // reverse number 
    public static void reverseNumber(int num){
        int Reversenum = 0 ;
        while (num > 0) {
            
            int lastDigit = num%10;

            Reversenum = Reversenum * 10 + lastDigit;

            num =num /10;

            
        }
        System.out.println("reverse number is " + Reversenum);
       

    }

    // amstrong number 

    public static boolean isamstrongnumber(int num){
            int originalNum = num ;
            int finalNumber = 0;

            int noOfDigit = numberOfDigit(num);

            while (num > 0) {
                int lastDigit = num%10;
                finalNumber = finalNumber + power(lastDigit, noOfDigit);
                num = num/10;
            }



            return originalNum == finalNumber;
        }

    // power function 

    public static int power(int num , int pow){
        int i = 1 ;
        int result = num;
        while (i < pow ) {

            result = result * num;
            i++;
            
        }

        return result;
    }


    // find number of digit of integer
    public static int numberOfDigit(int num){

        int digit = 0 ;

        while (num > 0) {
            digit++;
            num =num/10;
            
        }
        return digit;
    }

}
