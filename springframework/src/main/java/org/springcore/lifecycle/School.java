package org.springcore.lifecycle;

public class School {
    private  String name;
    private String address;
    private  double toalStudent;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getToalStudent() {
        return toalStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setToalStudent(double toalStudent) {
        this.toalStudent = toalStudent;
    }

    public void School(){

    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", toalStudent=" + toalStudent +
                '}';
    }
}
