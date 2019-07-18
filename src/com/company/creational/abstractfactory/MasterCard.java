package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 MAST CARD";
    }
}
