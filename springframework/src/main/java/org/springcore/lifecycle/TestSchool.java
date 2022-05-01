package org.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSchool {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("schoolLC.xml");
        School school=(School)context.getBean("school");
        System.out.println(school);
        context.registerShutdownHook();
    }

}
