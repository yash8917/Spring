package com.spring.ioc;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("calling via airtel sim");
    }

    @Override
    public void data() {
        System.out.println("using data via airtel");
    }
}
