package com.company.structural.bridge;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public abstract class CreditCard {

    protected ICreditCard tarjeta;

    protected CreditCard(ICreditCard tarjeta){
        this.tarjeta = tarjeta;
    }

    public abstract void realizarPago();
}
