public class Constructor {

    // constructor uesd to initialised to provide a default values to instance variables
    // constuctor call at the time of object creation


    String carName ;  // this are instance variable 
    String color ;
    int maxSpeed ;
    int avg ;

    // // default constructor 
    // Constructor(){
    //     System.out.println("default constuctor");
    // }


    // default constructor 
    Constructor(){
        carName ="Swift";
        color = "black";
        maxSpeed = 100;
        
    }


    // parameterized constructor 

    Constructor(String carName , String color , int maxSpeed, int avg ){
        this.carName= carName;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.avg = avg;
    }


    // constructor chaining 

   
  

    public static void main(String[] args) {

        Constructor c = new Constructor();

        // passing default values 
       System.out.println(c.carName + " " + c.color + " " + c.avg + " " + c.maxSpeed);

       Constructor c1 = new Constructor("thar", null, 100, 20);
       System.out.println(c1.carName +" "+ c1.color +" "+ c1.avg+" "+ c1.maxSpeed);
        
    }

}
