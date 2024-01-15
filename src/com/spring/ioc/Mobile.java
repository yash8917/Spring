package com.spring.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        airtel.data();
//        airtel.calling();
//
//        Vodaphone vodaphone = new Vodaphone();
//        vodaphone.calling();
//        vodaphone.data();

//        Sim sim= new Airtel();
//        sim.calling();
//        sim.data();

//        using IOC Container
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");
        Sim sim = applicationContext.getBean("Sim" , Sim.class);
        sim.calling();
        sim.data();
    }
}
