import java.util.Scanner;

public class Switch {


    public static void oldSwitch(int day){

        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
        
            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thusday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("invalid numbers");
            break;
        }

    }

    public static void newSwitch(int day){

        String result = switch(day){
        
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thusday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "invalid number ";

        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a day : ");
        int day = sc.nextInt();

        oldSwitch(day);
        newSwitch(day);

        

    }

}
