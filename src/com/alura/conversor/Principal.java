package com.alura.conversor;

public class Principal {
    public static void main(String[] args) throws Exception {

        ConsultaApi consulta = new ConsultaApi();

        String url = "https://v6.exchangerate-api.com/v6/TU_API_KEY/pair/USD/ARS";

        double tasa = consulta.obtenerTasa(url);

        System.out.println("Tasa de conversión: " + tasa);
    }
}
