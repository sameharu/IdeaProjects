package Lesson4.problem2;

public class TestAccount {
    public static void main(String[] args) {
        //Write a TestAccount class and create two Account objects and make use of
        //all the methods.

        Account a1 = new Account("Smith" , 7000 ) ;
        a1.addInterest();
        a1.deposit(4000);
        a1.setAddress(new Address("1000 e tucson" ,"Arizona" , "Tucson" ,"85711"));
        a1.withdraw(10000);
        System.out.println(a1);

        System.out.println("\n");

        Account a2 = new Account("john" ,1000) ;
        a2.setAddress(new Address("1020 N 4th st" ,"Iowa" ,"Fairfield" ,"52700"));
        a2.addInterest();
        a2.deposit(1000);
        a2.withdraw(500);


        System.out.println(a2);





    }
}
