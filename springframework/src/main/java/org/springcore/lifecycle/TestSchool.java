package org.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSchool {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("schoolLC.xml");
        School school=(School)context.getBean("school");
        System.out.println(school);
    }

}
