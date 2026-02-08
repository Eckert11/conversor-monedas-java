package com.alura.conversor;

public class Principal {

    private static final String API_KEY = "TU_API_KEY";

    public static void main(String[] args) {

        ConsultaApi consulta = new ConsultaApi();

        Moneda origen = Menu.elegirMoneda("Seleccione la moneda de origen:");
        Moneda destino = Menu.elegirMoneda("Seleccione la moneda de destino:");

        String url = "https://v6.exchangerate-api.com/v6/"
                + API_KEY
                + "/pair/"
                + origen.getCodigo()
                + "/"
                + destino.getCodigo();

        double tasa = consulta.obtenerTasa(url);

        System.out.println("Tasa de conversión: " + tasa);
    }
}
