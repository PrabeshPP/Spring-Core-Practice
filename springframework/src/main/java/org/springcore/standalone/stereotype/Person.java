package org.springcore.standalone.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

//Scope component should always be used with the component annotation
//By default the Scope is Singleton
//We can provide prototype/session/request
@Scope("prototype")
public class Person {
    @Value("Owl")
    private String name;
    @Value("20")
    private int age;

    @Value("#{address}")
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
