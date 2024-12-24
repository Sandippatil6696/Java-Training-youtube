public class ToStringMethod {
    int noOfWheels ;
    String color ;
    int maxspeed ;
    int noOfSeats ;

    ToStringMethod(int noOfWheels ,String color ,int maxspeed,int noOfSeats){

        this.noOfWheels = noOfWheels;
        this.color = color ;
        this.maxspeed = maxspeed;
        this.noOfSeats = noOfSeats;
    }

    


    @Override
    public String toString() {
        return "ToStringMethod [noOfWheels=" + noOfWheels + ", color=" + color + ", maxspeed=" + maxspeed
                + ", noOfSeats=" + noOfSeats + "]";
    }




    // tostring mrthod reperesents a string representation of an object
    public static void main(String[] args) {
        ToStringMethod m = new ToStringMethod(4, "black", 50, 05);

        // System.out.println(m.toString()); 
        // not need to apply m.tostring() method to object
        // it is imlicitly applied in print statement 

        System.out.println(m);
    }
}
