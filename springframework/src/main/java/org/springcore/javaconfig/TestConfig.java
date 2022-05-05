package org.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("stConfig.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        context.close();
    }
}
