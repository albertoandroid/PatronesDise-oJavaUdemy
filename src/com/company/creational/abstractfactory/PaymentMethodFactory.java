package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        } else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
