package com.company.structural.facade;

/**
 * Created by albertopalomarrobledo on 3/8/19.
 */
public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Black tiene un Crédito de 1.000.000");
    }
}
