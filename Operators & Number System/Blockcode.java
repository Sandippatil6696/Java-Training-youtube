public class Blockcode {

    static int speed ; 

    // static block called at the time of class laoding 
    // static block runs once at he time of class loading 

    static{
        speed = 50;
        System.out.println("static blok called at the time of class loading");
    }

    // initialization block  - calls at every object creation  

    {
        speed++;
        System.out.println("initialisation block called");
    }

    Blockcode(){
        System.out.println("default constructor is called");
    }
    public static void main(String[] args) {
        Blockcode b = new Blockcode();
        Blockcode b1= new Blockcode();
        
    }
}
