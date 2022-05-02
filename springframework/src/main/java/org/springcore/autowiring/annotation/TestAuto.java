package org.springcore.autowiring.annotation;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Emp emp= context.getBean("emp1", Emp.class);
        System.out.println(emp);
        context.registerShutdownHook();

    }
}
