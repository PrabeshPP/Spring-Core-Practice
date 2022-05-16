package org.springcore.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spelConfig.xml");
        Mobile mobile=context.getBean("mobile",Mobile.class);
        System.out.println(mobile);
    }

}
