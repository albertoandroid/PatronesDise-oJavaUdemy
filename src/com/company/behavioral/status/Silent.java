package com.company.behavioral.status;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Silencio...Pantalla Iluminada...");
    }
}
