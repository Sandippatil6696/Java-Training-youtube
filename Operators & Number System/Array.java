import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[10];
        marks[0] = 5;

        int number[] = {1,5,6,4,7,8,9};
        System.out.println(marks[0]);

        // print array element
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }

        System.out.println();

        // using while loop 
        int i = 0; 
        while (i < number.length) {
            System.out.print(number[i]+ " ");
            i++;
        }
        System.out.println();
        System.out.println(number.length);

        // seaching array element in array
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to array seaching ");
        int arr1[] = {1, 15,54,26, 3,6 ,69,87,75,69,24};
        System.out.print("please eneter a nmber you want to search : ");
        int num = sc.nextInt();
        boolean result = isFound(arr1, num);
        if (result) {
            System.out.println(num + " is found in array");
            
        }else{
            System.out.println(num + " number is not found in array");
        }

        // String array representation 
        String arr2[] = new String[4];
        arr2[0] = "hellow world";
        System.out.println(arr2[0]);

        String arr3[] = {"first", "Second", "third"};
        System.out.println("length of arr3 is " + arr3.length);


        // 2D array 

        int arr4[][] = new int[3][4] ;
        arr4[0][0]= 2;
        System.out.println(arr4[0][0]);

        int arr5[][] ={{4,6,1,6},{5,3,7,6},{8,5,4,1}};
        printArray(arr5);


        
    }


    // check elemenr present or not in array 

    public static boolean isFound(int arr[] , int num){

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]==num) {
                return true;
            }
        }
        return false;
    }

    // print 2d array 

    public static void printArray(int arr[][]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
