package Lesson4.problem2;

public class Employee {
//Employee has five fields: first name (String), last name (String), salary
// (double), home address and work address (both of type Address).

    private String firstName ;
    private String lastName ;
    private double salary ;
    private Address home ;
    private Address work ;

    /*Place constructors in each class to initialize all the fields with default
constructor, parameterized constructor(three argument) without address and
parameterized constructor(5 arguments) for Employee class.*/

    public Employee() {
        this.firstName = null;
        this.lastName =  null;
        this.salary = 0.0 ;
        this.home = null;
        this.work= null;


    }
    public Employee(String firstName ,String lastName , double salary) {
        this.firstName =firstName ;
        this.lastName = lastName ;
        this.salary = salary ;

    }
    public Employee(String firstName ,String lastName , double salary ,Address home ,Address work){
        this.firstName =firstName ;
        this.lastName = lastName ;
        this.salary = salary ;
        this.home = home ;
        this.work = work ;
    }

    //Place appropriate getters and setters in each class.


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public Address getWork() {
        return work;
    }

    public void setWork(Address work) {
        this.work = work;
    }

    @Override
    public String toString() {
        String allInfo = "First Name : " + firstName + "\nLast Name  : " + lastName + " \nSalary : " + salary +
                "\n Home address is    " + home + "\n \n work address is " + work;

        return allInfo;
    }
}
