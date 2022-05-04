package org.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Value("OnePlus")
    private String name;
    @Value("#{990+9.12345}")
    private double price;

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

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
