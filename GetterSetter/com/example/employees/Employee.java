package GetterSetter.com.example.employees;

class Employee {

    // private field
    private String name;
    private int age;
    private double salary;

    // default construtor
    Employee() {
    };

    // parameterize constructor
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // package private method to display information

    void displayEmployeeDetails() {
        System.out.println("employes details is" +
                " Name: " + name + " , " +
                " Age : " + age +" , " +
                " Salary : " + salary);
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
