package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class Visa implements Card {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 VISA";
    }
}
