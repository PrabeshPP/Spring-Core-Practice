package org.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
        System.out.println("inside constructor");
        this.address=address;

    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Initializing.....");
    }

    @PreDestroy
    public  void end(){
        System.out.println("Disposing....");
    }
}
