package com.company.structural.decorator;

/**
 * Created by albertopalomarrobledo on 3/8/19.
 */
public class InternationalPaymentDecorator extends CreditDecorator {

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment(){
        System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }
}
