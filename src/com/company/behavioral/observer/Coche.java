package com.company.behavioral.observer;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class Coche implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("Semaforo Rojo para Coche: -> Coche NO puede pasar");
        }else{
            System.out.println("Semaforo Verde para Coche: -> Coche SI puede pasar");
        }
    }
}
