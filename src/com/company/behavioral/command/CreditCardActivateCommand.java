package com.company.behavioral.command;

import com.company.creational.abstractfactory.Credit;

/**
 * Created by albertopalomarrobledo on 30/7/19.
 */
public class CreditCardActivateCommand implements Command{

    CreditCard creditCard;
    public CreditCardActivateCommand(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activate();
        creditCard.sendSMSToCustomerActivate();
    }
}
