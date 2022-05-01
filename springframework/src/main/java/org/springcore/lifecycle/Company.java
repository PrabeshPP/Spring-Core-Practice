package org.springcore.lifecycle;

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
}
