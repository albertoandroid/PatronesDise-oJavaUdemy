package com.company.behavioral.visitor;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public class OfertaVuelos implements OfertaElement {
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
}
