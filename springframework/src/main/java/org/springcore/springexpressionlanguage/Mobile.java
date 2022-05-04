package org.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Value("OnePlus")
    private String name;
    @Value("#{990+9.12345}")
    private double price;

    //invoking static method using spring expression language
    @Value("#{T(org.springcore.Student).mulFive(3)}")
    private long square;

    @Value("#{T(Math).PI}")
    private double pi;

    @Value("#{new java.lang.String('One plus 7')}")
    private String model;

    @Value("#{'b'>'a'}")
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getSquare() {
        return square;
    }

    public void setSquare(long square) {
        this.square = square;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(long pi) {
        this.pi = pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", square=" + square +
                ", pi=" + pi +
                ", model='" + model + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
