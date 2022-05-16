package org.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Practice {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        PracticeStudent practiceStudent=context.getBean("practiceStudent",PracticeStudent.class);
        System.out.println(practiceStudent);



    }
}
