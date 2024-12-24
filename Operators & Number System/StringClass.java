public class StringClass {
    public static void main(String[] args) {

        String name = "sandip";
        int marks =50;

        System.out.println("hellow " + name + " your marks are " + marks);
        
        // %s - represent text of string 
        // %d - represnt int,long , short ,byte  number 
        // %f - represent floating point number 
        System.out.printf("hellow %s your marks are %d",name , marks);
        System.out.println();

        // string builder 
        StringBuilder sb = new StringBuilder();
        sb.append("hellow ");
        sb.append(45);
        sb.append(" your value is now ");
        sb.append(60);
        sb.toString(); // not need to apply here tostring method because prilln impliclty apply that method
        System.out.println(sb);


        // stringbuffer
        StringBuffer sbu = new StringBuffer();
        sbu.append("hii rahul , ");
        sbu.append("is your age ");
        sbu.append(45);

        sbu.toString();
        System.out.println(sbu);
    }

}
