package de.pantopix.demo;



import org.springframework.stereotype.Component;


public class Customer {

    private String name;
    private Address address;

    public Customer(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
