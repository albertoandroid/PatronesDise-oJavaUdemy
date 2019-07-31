package com.company.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Semaforo semaforo) {
        for(Observer o: observers){
            o.update(semaforo);
        }
    }
}
