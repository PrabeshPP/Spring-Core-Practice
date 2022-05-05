package org.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student=context.getBean("student",Student.class);
        System.out.println(student);

    }
}
