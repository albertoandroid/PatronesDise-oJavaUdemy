package com.company.creational.factorymethod;

/**
 * Created by albertopalomarrobledo on 15/7/19.
 */
public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
