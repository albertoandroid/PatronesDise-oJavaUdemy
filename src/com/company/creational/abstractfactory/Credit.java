package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class Credit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a Crédito";
    }
}
