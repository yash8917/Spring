package com.spring.ioc;

public class Mobile {
    public static void main(String[] args) {
        Airtel airtel = new Airtel();
        airtel.calling();
        airtel.data();
    }
}
