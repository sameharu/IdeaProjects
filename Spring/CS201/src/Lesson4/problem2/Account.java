package Lesson4.problem2;

import java.util.Random;

public class Account {
    /*Create an Account class with account id(int), owner name(String), balance(double),
Address (can reuse the Address class created from Problem 2) and a static constant
field INTEREST_RATE = 0.03. Perform the following.*/

    static double INTEREST_RATE = 0.03;

    private int id;
    private String ownerName;
    private double balance;
    private Address address;

    public Account(String ownerName, double balance) {

        this.ownerName = ownerName;
        this.balance = balance;
        this.id = generateId();
    }

    public Account(String ownerName, double balance, Address address) {

        this.ownerName = ownerName;
        this.balance = balance;
        this.address = address;
        this.id = generateId();

    }
    //. Inside the above two constructors call generateId() private method
    //which returns the random integer in the range of 1000 to 9999.

    private int generateId() {
        int min = 1000;
        int max = 10000;
        Random ran = new Random();
        int range = ran.nextInt((max - min + 1) + min);

        return range;
    }

    //Getters for all the fields.

    public static double getInterestRate() {
        return INTEREST_RATE;
    }

    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public Address getAddress() {
        return address;
    }
    //Only setters for Address fields

    public void setAddress(Address address) {
        this.address = address;
    }


    /* Add the amount to the existing balance if amount is greater than zero,
    //otherwise print message on the console unable to do the transaction
    */

    public void deposit(double amount) {
        if (amount > 0)
            balance = balance + amount;
        else
            System.out.println("unable to do the transaction");

    }
/* deduct the amount from the balance, if the amount is positive and not
greater than the balance. Make sure the input amount is not negative.
*/

    public void withdraw(double amount) {
        if (balance > amount && amount > 0) {
            balance = balance - amount;

        }

//Return balance multiplied by INTEREST_RATE

    }

    private double calcInterest() {
        double interest = balance * INTEREST_RATE;

        return interest;
    }

    /*
    Method add the calculated interest into the existing balance
    */
    public void addInterest() {

        balance = balance + calcInterest() ;

    }
    //override the toString() method to display the current status of Account with
    //id, owner name, balance and Address.

    @Override
    public String toString(){
        String allInfo = "Account ID : " + generateId() + "\nOwner name  : " + ownerName + "\nbalance : $" + balance +
                "\n Home address is  " + address  ;

        return allInfo ;

    }
}
