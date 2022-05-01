package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Company {
    private String name;
    private double revenue;

    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }

    @PostConstruct
    public  void start(){
        System.out.println("Starting point");
    }

    @PreDestroy
    public  void end(){
        System.out.println("End point");
    }
}
