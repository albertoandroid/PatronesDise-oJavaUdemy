package com.company;

import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;

public class Main {

    public static void main(String[] args) {
	    probarFactoryMethod();
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
