package org.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTemp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standConfig.xml");
        Temp temp=(Temp) context.getBean("temp");
        System.out.println(temp.getFriends().getClass().getName());

    }
}
