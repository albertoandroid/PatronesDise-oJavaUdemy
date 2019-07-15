package com.company.creational.factorymethod;

/**
 * Created by albertopalomarrobledo on 15/7/19.
 */
public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
