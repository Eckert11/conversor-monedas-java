package com.alura.conversor;

public enum Moneda {
    ARS("Peso argentino"),
    BOB("Boliviano boliviano"),
    BRL("Real brasileño"),
    CLP("Peso chileno"),
    COP("Peso colombiano"),
    USD("Dólar estadounidense");

    private final String nombre;

    Moneda(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.name();
    }

    public String getNombre() {
        return nombre;
    }
}
