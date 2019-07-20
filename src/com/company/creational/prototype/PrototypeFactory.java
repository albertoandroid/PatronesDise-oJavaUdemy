package com.company.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.company.creational.prototype.PrototypeFactory.CartType.AMEX;
import static com.company.creational.prototype.PrototypeFactory.CartType.VISA;

/**
 * Created by albertopalomarrobledo on 20/7/19.
 */
public class PrototypeFactory {

    public static class CartType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException{
        return prototypes.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con numero 0000");
        prototypes.put(VISA, visa);

        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con numero 0000");
        prototypes.put(AMEX, amex);
    }
}
