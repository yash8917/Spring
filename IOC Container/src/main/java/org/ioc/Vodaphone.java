package org.ioc;

public class Vodaphone implements Sim{
    public void calling() {
        System.out.println("calling via Vodaphone");
    }


    public void data() {
        System.out.println("Using data via Vodaphone");
    }
}
