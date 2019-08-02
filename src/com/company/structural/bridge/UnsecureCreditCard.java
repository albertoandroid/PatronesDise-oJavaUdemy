package com.company.structural.bridge;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public class UnsecureCreditCard implements ICreditCard {

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado SIN SEGURIDAD");
    }
}
