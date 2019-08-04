package com.company.structural.proxy;

/**
 * Created by albertopalomarrobledo on 4/8/19.
 */
public class AccessToInternet implements Internet {

    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Conectando a: " + url);
    }
}
