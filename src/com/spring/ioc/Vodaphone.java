package com.spring.ioc;

public class Vodaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("calling via Vodaphone");
    }

    @Override
    public void data() {
        System.out.println("Using data via Vodaphone");
    }
}
