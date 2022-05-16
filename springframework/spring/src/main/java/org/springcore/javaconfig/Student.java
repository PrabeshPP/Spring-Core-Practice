package org.springcore.javaconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("student")
public class Student {


    @Autowired
    @Qualifier("getAbout")
    private About about;



    public Student() {

        this.about = about;
    }

    @Override
    public String toString() {
        return "Student{" +
                "about=" + about.getAbout() +
                '}';
    }
}
