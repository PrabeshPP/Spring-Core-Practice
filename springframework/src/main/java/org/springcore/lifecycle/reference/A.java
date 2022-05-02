package org.springcore.lifecycle.reference;

public class A {
    private int age;
    private B bObj;

    public A() {
    }

    public A(int age, B bObj) {
        this.age = age;
        this.bObj = bObj;
    }

    public int getAge() {
        return age;
    }

    public B getbObj() {
        return bObj;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setbObj(B bObj) {
        this.bObj = bObj;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                ", bObj=" + bObj +
                '}';
    }
}
