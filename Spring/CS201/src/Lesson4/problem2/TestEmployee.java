package Lesson4.problem2;

public class TestEmployee {

    public static void main(String[] args) {
        //Write a main method which creates two instances of each class and output
        //some information to the console.

       //using default  constructors
        Employee e1 = new Employee() ;
        e1.setFirstName("Adam");
        e1.setLastName("Smith");
        e1.setSalary(7000);
        e1.setHome(new Address("1000 N 4th st " ,"Iowa" , "Fairfield" , "52557"));
        e1.setWork(new Address("1216 Burlington ave","FairField","Iowa", "52556"));
        System.out.println(e1);

        System.out.println("\n");

        Employee e2 = new Employee("Erko" ,"saba" , 100000) ;
        String fn = e2.getFirstName() ;
        String ln = e2.getLastName() ;
        double wage = e2.getSalary() ;
        System.out.println("Using the 3 parameters \n " + "First name : " + fn + "\nLast name : "+ ln + "\nwage :" + wage);




        Employee e3 = new Employee("John","Menase",15000) ;

        e3.setHome(new Address("1020 E grand ave" , "Arizona" ,"Tucson" , "85720"));
        e3.setWork(new Address("200 w stone ave" , "Arizona" ,"Tucson" , "85700"));

        System.out.println("\n" + e3);

    }
}
