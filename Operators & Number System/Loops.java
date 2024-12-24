public class Loops {
    public static void main(String[] args) {
        
        // while loop
        int num =1;
        while (num <=10) {
            System.out.print(num+" ");
            num++;
            
        }
        System.out.println();

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ " ");
        }

        System.out.println();
        // do while loop
        int num2 = 1 ;
        do {
            System.out.print(num2 + " ");
            num2++;
        } while (num2 <= 10);


        System.out.println();
        // for each loop 
        String arr[] = {"ram" , "sham" , "sandip" , " om", "jay"};

        for (String name : arr) {
            System.out.print(name + " ");
        }
    }


   


}
