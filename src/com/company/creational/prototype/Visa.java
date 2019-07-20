package com.company.creational.prototype;

/**
 * Created by albertopalomarrobledo on 20/7/19.
 */
public class Visa implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta Visa");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta visa...");
        return (Visa) super.clone();
    }
}
