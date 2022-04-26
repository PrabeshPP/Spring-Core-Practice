package org.springcore;

public class Student {
    private int id;
    private String studentName;
    private String address;

    public Student(int id, String studentName, String address) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
