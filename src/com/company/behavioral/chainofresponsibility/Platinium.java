package com.company.behavioral.chainofresponsibility;

/**
 * Created by albertopalomarrobledo on 30/7/19.
 */
public class Platinium implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void crediCardRequest(int totalLoan) {
        if(totalLoan > 10000 && totalLoan <=50000){
            System.out.println("Esta solicitud de tarjeta de crédito la maneja la tarjeta Platinium");
        } else {
            next.crediCardRequest(totalLoan);
        }
    }
}
