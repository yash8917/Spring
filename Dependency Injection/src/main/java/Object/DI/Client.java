package Object.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("bean_second.xml");
        System.out.println("Math cheat class is loaded.");
        Student stu = context.getBean("Student" , Student.class);
        stu.ceating();
    }
}
