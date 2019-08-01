package com.company.behavioral.strategy;

/**
 * Created by albertopalomarrobledo on 1/8/19.
 */
public class LowerStrategyTestFormatter implements StragetyTextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Texto en Minusculas: " + text.toLowerCase());
    }
}
