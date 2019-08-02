package com.company.behavioral.visitor;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public class OfertaGasolina implements OfertaElement {
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaGasolina(this);
    }
}
