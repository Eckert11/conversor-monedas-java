package com.alura.conversor;

public class Principal {
    public static void main(String[] args) throws Exception {

        ConsultaApi consulta = new ConsultaApi();

        String url = "https://v6.exchangerate-api.com/v6/Tu_API_KEY/pair/USD/ARS";
        String json = consulta.obtenerDatos(url);

        System.out.println(json);
    }
}
