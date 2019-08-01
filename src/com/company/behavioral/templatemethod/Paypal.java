package com.company.behavioral.templatemethod;

import com.company.creational.abstractfactory.PaymentMethod;

/**
 * Created by albertopalomarrobledo on 1/8/19.
 */
public class Paypal extends Payment{

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago a través de los servidores Paypal...");
    }
}
