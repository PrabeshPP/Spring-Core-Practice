package org.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciConfig.xml");
        Addition add=(Addition) context.getBean("add");
        add.doSum();
    }
}
