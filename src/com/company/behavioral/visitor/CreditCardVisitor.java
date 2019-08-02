package com.company.behavioral.visitor;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public interface CreditCardVisitor {
    void ofertaGasolina(OfertaGasolina ofertaGasolina);
    void ofertaVuelos(OfertaVuelos ofertaVuelos);
}
