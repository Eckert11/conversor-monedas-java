package com.alura.conversor;

import java.util.Scanner;

public class Menu {

    private static final String API_KEY = "0bb261ce924c904a6637f3b8";

    public static void mostrarMenu() {

        Scanner scanner = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    1) Dólar >> Peso argentino
                    2) Peso argentino >> Dólar
                    3) Dólar >> Real brasileño
                    4) Real brasileño >> Dólar
                    5) Dólar >> Peso colombiano
                    6) Peso colombiano >> Dólar
                    7) Salir
                    
                    Elija una opción válida:
                    """);

            int opcion = scanner.nextInt();

            Moneda origen = null;
            Moneda destino = null;

            switch (opcion) {
                case 1 -> { origen = Moneda.USD; destino = Moneda.ARS; }
                case 2 -> { origen = Moneda.ARS; destino = Moneda.USD; }
                case 3 -> { origen = Moneda.USD; destino = Moneda.BRL; }
                case 4 -> { origen = Moneda.BRL; destino = Moneda.USD; }
                case 5 -> { origen = Moneda.USD; destino = Moneda.COP; }
                case 6 -> { origen = Moneda.COP; destino = Moneda.USD; }
                case 7 -> {
                    System.out.println("Gracias por usar el conversor ");
                    continuar = false;
                    continue;
                }
                default -> {
                    System.out.println("Opción inválida");
                    continue;
                }
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            String url = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY
                    + "/pair/"
                    + origen.getCodigo()
                    + "/"
                    + destino.getCodigo();

            double tasa = consulta.obtenerTasa(url);
            double resultado = Conversor.convertir(monto, tasa);

            System.out.printf(
                    "Resultado: %.2f %s = %.2f %s%n%n",
                    monto, origen.getCodigo(),
                    resultado, destino.getCodigo()
            );
        }
    }
}
