package org.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("refConfig.xml");
        A objA=(A)context.getBean("dependA");
        System.out.println(objA);

    }
}
