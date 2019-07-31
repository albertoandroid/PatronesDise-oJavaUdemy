package com.company.behavioral.observer;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class Semaforo {
    public String status;

    public Semaforo(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
