package com.company.behavioral.templatemethod;

/**
 * Created by albertopalomarrobledo on 1/8/19.
 */
public class Visa extends Payment{
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Visa...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Visa...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago a través de los servidores Visa...");
    }
}
