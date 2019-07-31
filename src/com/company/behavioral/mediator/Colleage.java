package com.company.behavioral.mediator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public abstract class Colleage {
    protected Mediator mediator;

    public Colleage(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
