package org.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student kel = context.getBean("student" , Student.class);
        kel.displayName();
//        another student
//        Student ethane = context.getBean("ethane", Student.class);
//        ethane.displayName();
    }
}
