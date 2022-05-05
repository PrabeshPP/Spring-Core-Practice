package org.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.springcore.javaconfig")
public class JavaConfig {
    //using a bean annotation method
    @Bean()
    public About getAbout(){
        return new About();
    }
    @Bean(name = "student")
    public Student getStudent(){
        Student student=new Student();
        return student;
    }
}
