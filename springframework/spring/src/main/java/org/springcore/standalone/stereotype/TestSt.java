package org.springcore.standalone.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSt {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereoConfig.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person.hashCode());
        Person person1=context.getBean("person",Person.class);
        System.out.println(person1.hashCode());


    }
}
