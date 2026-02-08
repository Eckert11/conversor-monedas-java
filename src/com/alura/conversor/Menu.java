package com.alura.conversor;

import java.util.Scanner;

public class Menu {

    public static Moneda elegirMoneda(String mensaje) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(mensaje);
        System.out.println("Monedas disponibles:");

        for (Moneda moneda : Moneda.values()) {
            System.out.println(moneda.getCodigo() + " - " + moneda.getNombre());
        }

        System.out.print("Ingrese el código de la moneda: ");
        String opcion = scanner.nextLine().toUpperCase();

        return Moneda.valueOf(opcion);
    }

    public static double ingresarMonto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a convertir: ");
        return scanner.nextDouble();
    }

}
