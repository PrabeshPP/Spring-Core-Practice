package org.springcore.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        Emp emp;
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionsConfig.xml");
        emp=(Emp) context.getBean("emp1");
        System.out.println(emp.getProps());
    }


}
