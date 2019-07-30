package com.company.behavioral.command;

/**
 * Created by albertopalomarrobledo on 30/7/19.
 */
public class CreditCardInvoker {

    private Command command;
    public CreditCardInvoker(){}

    public void setCommand(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
