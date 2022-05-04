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

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", square=" + square +
                '}';
    }
}
