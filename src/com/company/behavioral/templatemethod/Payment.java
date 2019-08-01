package com.company.behavioral.templatemethod;

/**
 * Created by albertopalomarrobledo on 1/8/19.
 */
public abstract class Payment {

    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    public final void makePayment(){
        initialize();
        startPayment();
        endPayment();
    }
}
