package com.company.behavioral.mediator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class ConcreteColleage1 extends Colleage {

    public ConcreteColleage1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("User1 ha recibido el siguiente mensaje: " + message);
    }
}
