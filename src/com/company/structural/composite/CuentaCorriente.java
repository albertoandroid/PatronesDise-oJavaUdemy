package com.company.structural.composite;

/**
 * Created by albertopalomarrobledo on 3/8/19.
 */
public class CuentaCorriente implements CuentaComponent {

    private Double amount;
    private String name;

    public CuentaCorriente(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cuenta Corriente: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
