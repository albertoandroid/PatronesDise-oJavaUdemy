package com.company.behavioral.state;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class Sound implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Ring...Ring...");

    }
}
