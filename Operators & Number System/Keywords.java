
public class Keywords {

    static int age = 5; // static variable 

    int number = 2; // non static variable 

    // non static method 
    void display(){         
        System.out.println(number);
    }
    public static void main(String[] args) {
        System.out.println(age); // static variabele direcly access into static method 

       Keywords k =new Keywords();
       k.display();                // non static methods needs to create a object to access non static method 

       System.out.println(k.number);  // non static variable can not directly access into static context you nedd to create object of class 
       
    }
}
