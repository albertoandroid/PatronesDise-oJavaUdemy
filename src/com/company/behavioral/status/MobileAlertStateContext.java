package com.company.behavioral.status;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class MobileAlertStateContext {

    private MobileAlertState currentState;

    public MobileAlertStateContext(){
        currentState = new Sound();
    }

    public void setState(MobileAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert(this);
    }
}
