package Lesson4.problem2;

public class Address {

    //a. Address has four fields (data members): street, city, state and zip(all of type String)

    private String street;
    private String state;
    private String city;
    private String zip;

    //For Address class place only one constructor to initialize all the fields.

    public Address(String street, String state, String city, String zip) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.zip = zip;

    }
    //Place appropriate getters and setters in each class.


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        String output = "\n street : "+ street +  " \n city : " + city +  " \n state: "+ state + "\n zip :" + zip;

        return output;
    }
}
