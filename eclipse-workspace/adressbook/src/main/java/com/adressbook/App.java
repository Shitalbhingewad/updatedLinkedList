package com.adressbook;

class Contact { // Contact class is used to create Contact
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String emailId;

    Contact(String firstName, String lastName, String address, String city, String state, String zip,
            String phoneNumber, String emailId) { // constructor assigns default contact
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

public class App {
  
    public static void main(String[] args) {

        Contact info = new Contact("Shital", "Bhingewad", "baner", "Pune", "Maharashtra", "411045", "7767926899",
                "shitalbhingewad853@gmail.com");
        
        System.out.println("Welcome to Address Book Program");
        System.out.println(info.getFirstName());
        System.out.println(info.getLastName());
        System.out.println(info.getAddress());
        System.out.println(info.getCity());
       System.out.println(info.getState());
       System.out.println(info.getZip());
       System.out.println(info.getPhoneNumber());
      System.out.println(info.getEmailId());
     
    }
}