package com.company.creational.abstractfactory;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card create(String type) {
        if("VISA".equals(type)){
            return new Visa();
        }else if ("MASTERCARD".equals(type)){
            return new MasterCard();
        }
        return null;
    }
}
