public class MathExample {
    public static void main(String[] args) {
        
        System.out.println(Math.abs(-89)); //give positive number 
        System.out.println(Math.ceil(99.6));  //rounds up
        System.out.println(Math.floor(99.8)); // round down 
        System.out.println(Math.round(45.24)); // round to nearest integer

        System.out.println(Math.max(15, 54));
        System.out.println(Math.min(54, 47));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.random());

        // generate random number 
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            
            int result =(int)Math.round(Math.random()*100) ;
            System.out.println(result);


        }


    }
}
