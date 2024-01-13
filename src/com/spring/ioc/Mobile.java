package com.spring.ioc;

public class Mobile {
    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        airtel.data();
//        airtel.calling();
//
//        Vodaphone vodaphone = new Vodaphone();
//        vodaphone.calling();
//        vodaphone.data();

        Sim sim= new Airtel();
        sim.calling();
        sim.data();
    }
}
