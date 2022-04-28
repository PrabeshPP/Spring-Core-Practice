package org.springcorecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
    }

    public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }
}
