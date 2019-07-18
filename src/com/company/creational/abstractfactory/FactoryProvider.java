package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        }else if("PaymentMethod".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
