package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a Débito";
    }
}
