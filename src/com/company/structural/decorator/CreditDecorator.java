package com.company.structural.decorator;

/**
 * Created by albertopalomarrobledo on 3/8/19.
 */
public class CreditDecorator implements Credit {

    protected Credit decoratedCredit;
    public CreditDecorator(Credit decoratedCredit){
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
    }
}
