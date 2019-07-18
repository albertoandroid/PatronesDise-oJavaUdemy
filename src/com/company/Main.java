package com.company;

import com.company.creational.abstractfactory.AbstractFactory;
import com.company.creational.abstractfactory.Card;
import com.company.creational.abstractfactory.FactoryProvider;
import com.company.creational.abstractfactory.PaymentMethod;
import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;

public class Main {

    public static void main(String[] args) {
	    //probarFactoryMethod();
        probarAbstractFactory();
    }

    private static void probarAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

        System.out.println("Un tarjeta de tipo: " + tarjeta.getCardType() + " con el metodo de pago: " + paymentMethod.doPayment());
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
