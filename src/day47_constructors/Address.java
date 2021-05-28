package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";
    // constructor
    public Address() {
        System.out.println("Address constructor");
        street = "125 washington blvd";
        city = "unknown city";
        state = "unknown state";
        zipCode = "unknown zipcode";
    }
    //Second constructor, overloaded constructor-> provide short cut to initialize variable
    // in the same statement : ex: Address ad = new Address("123 java st", "Boston", "MA", "12345");
    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        this.city = city;
        this.state= state;
        this.zipCode = zipCode;

    }

    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


