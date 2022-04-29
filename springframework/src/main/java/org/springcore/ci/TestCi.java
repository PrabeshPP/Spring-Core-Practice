package org.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person=(Person) context.getBean("ci1");
        System.out.println(person);
    }
}
