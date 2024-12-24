import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {

    //    int arr1[]=  inputArray();

    //    System.out.println("sum of array element is " + sumOfArray(arr1));
    //    System.out.println("avg of array element is " + avgOfArray(arr1));
        
        // no of occurance 
        int arr2[] = {2,6,1,8,7,4,1};
        int n = 4 ;
        System.out.println("given number occuers "+ noOfOccurance(arr2, n)+ " times");

        // max and min in array 

        System.out.println("maximum in array element is " + maxInArray(arr2));
        System.out.println("mininum in array element is " + minInArray(arr2));

        int arr3[]= {4,5,19,12,16};
        int arr4[]={15,12,11,10};
        System.out.println(sortedIncrease(arr3));
        System.out.println(sortedDecrease(arr4));

        System.out.println("delete array element ");
        int num1 =12;
        int arr5[] = deleteArrayElement(arr4, num1);
        displayArray(arr5);
System.out.println();
        // reverse an array
        reverseArray(arr4);
        displayArray(arr4);

        
    }

    // print array function 

    public static void displayArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    // insert into array 

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array element :");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("eneter the array element");
        for (int i = 0; i < arr.length; i++) {  

            arr[i]= sc.nextInt();
        }

        return arr;

    }

    // sum and avg of array element 

    public static int sumOfArray(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum ;

    }

    // avg of an array element 
    public static int avgOfArray(int arr[]){
        int avg = 0 ;

        for (int i = 0; i < arr.length; i++) {
            avg = sumOfArray(arr)/arr.length;
        }

        return avg ;

    }

    // number of occurance 

    public static int noOfOccurance(int arr[], int num){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==num) {
                count++;
            }
            
        }
       return count ; 
    }

    // maximum in array 
    
    public static int maxInArray(int arr[]){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }      
        }
        return max ; 

    }

    public static int minInArray(int arr[]){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;

    }

    // check array is sorted or not 

    public static boolean sortedIncrease(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
            
        }

        return true;
    }

    public static boolean sortedDecrease(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >  arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    // delete an array element and store in new array 

    public static int[] deleteArrayElement(int arr[] , int num ){

        int size = arr.length-noOfOccurance(arr, num);
        int newArr[] = new int[size];

        int i =0 , j=0; 

        while (i < arr.length) {
            if (arr[i]!= num) {
                newArr[j]= arr[i];
                j++;
            }
            i++;
        }
        

        return arr;
    }

    // reverse an array

    public static void reverseArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length-1- i];
            arr[arr.length-1-i] = temp;;
            
        }

    }


}
