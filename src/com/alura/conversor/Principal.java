package com.alura.conversor;

public class Principal {
    public static void main(String[] args) throws Exception {

        ConsultaApi consulta = new ConsultaApi();

        String url = "https://v6.exchangerate-api.com/v6/59fa7a2e741505c6ef59a159/pair/USD/ARS";
        String json = consulta.obtenerDatos(url);

        System.out.println(json);
    }
}
