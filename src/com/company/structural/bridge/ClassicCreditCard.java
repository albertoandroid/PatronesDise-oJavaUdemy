package com.company.structural.bridge;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public class ClassicCreditCard extends CreditCard {

    public ClassicCreditCard(ICreditCard tarjeta){
        super(tarjeta);
    }

    @Override
    public void realizarPago() {
        tarjeta.realizarPago();
    }
}
