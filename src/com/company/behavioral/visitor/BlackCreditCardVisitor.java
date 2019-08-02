package com.company.behavioral.visitor;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public class BlackCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 10 en gasolina por tener tu tarjeta black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 25 en gasolina por tener tu tarjeta black");
    }
}
