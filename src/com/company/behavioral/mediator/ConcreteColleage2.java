package com.company.behavioral.mediator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class ConcreteColleage2 extends Colleage {

    public ConcreteColleage2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("User2 ha recibido el siguiente mensaje: " + message);
    }
}
