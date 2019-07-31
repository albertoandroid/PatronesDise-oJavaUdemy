package com.company.behavioral.iterator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public interface Iterator {

    boolean hasNext();

    Object next();

    Object currentItem();
}
