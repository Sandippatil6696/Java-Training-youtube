
package GetterSetter.com.example.employees;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee("rahul", 25, 30000.00);

        e.setName("sandip");
        e.setAge(30);
        e.setSalary(45000.0);

        e1.displayEmployeeDetails();

        // you can get details by get methods also
        System.out.println("employee details is " +
                " Name :" + e.getName() +" , "+
                " Age : " + e.getAge() +" , "+
                " Salary: " + e.getSalary());

    }

}
