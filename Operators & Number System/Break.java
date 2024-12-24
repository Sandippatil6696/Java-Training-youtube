public class Break {

    public static void main(String[] args) {
        
        // break keyword used to exit from loop at particular condition 
        for (int i = 0; i < 50 ; i++) {
            if (i==25) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // continue keyword used to skip iteration at particular condition 
        for (int i = 0; i < 10; i++) {
            if (i==2) {
                continue;
            }
            System.out.print(i+ " ");
        }
    }

}
