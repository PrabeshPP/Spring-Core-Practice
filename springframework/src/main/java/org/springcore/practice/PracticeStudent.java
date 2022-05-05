package org.springcore.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("practiceStudent")
public class PracticeStudent {
    @Value("Prabesh Bista")
    private  String name;
    @Value("20")
    private int age;

    @Override
    public String toString() {
        return "PracticeStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
