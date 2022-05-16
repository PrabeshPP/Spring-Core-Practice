package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coder implements InitializingBean, DisposableBean {
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Coder initialized");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Coder destroyed");

    }
}
