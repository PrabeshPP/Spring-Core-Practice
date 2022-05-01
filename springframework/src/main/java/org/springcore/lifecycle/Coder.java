package org.springcore.lifecycle;

public class Coder {
    private String name;
    private String favouriteLanguage;

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public Coder() {
    }

    @Override
    public String  toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", favouriteLanguage='" + favouriteLanguage + '\'' +
                '}';
    }
}
