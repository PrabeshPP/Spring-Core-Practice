package org.springcore.autowiring;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp(){

    }

    public Emp(Address address){
        this.address=address;

    }
}
