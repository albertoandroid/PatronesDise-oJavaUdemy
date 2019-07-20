package com.company.creational.prototype;

/**
 * Created by albertopalomarrobledo on 20/7/19.
 */
public interface PrototypeCard extends Cloneable {

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;
}
