package edu.chemi_ramirez.reto4.process;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventas {
    private ArrayList<VentaBoleto> listaVentas = new ArrayList<>();

    public void realizarVenta(Scanner scanner) {
        System.out.println("Ingrese los datos del comprador:");
        System.out.print("Nombre completo del comprador: ");
        String nombreComprador = scanner.nextLine();
        System.out.print("Cantidad de boletos: ");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        ArrayList<String> pasajeros = new ArrayList<>();
        for (int i = 1; i < cantidadBoletos; i++) {
            System.out.print("Nombre completo del pasajero " + i + ": ");
            pasajeros.add(scanner.nextLine());
        }

        listaVentas.add(new VentaBoleto(nombreComprador, cantidadBoletos, pasajeros));
        mostrarDatosVenta();
    }

    public void mostrarDatosVenta() {
        System.out.println("Datos de la lista de ventas:");
        for (int i = 0; i < listaVentas.size(); i++) {
            VentaBoleto venta = listaVentas.get(i);
            System.out.println("Venta " + (i + 1) + ":");
            System.out.println("Comprador: " + venta.getComprador());
            System.out.println("Cantidad de boletos: " + venta.getCantidad());
            System.out.println("Pasajeros:");
            for (String pasajero : venta.getPasajeros()) {
                System.out.println("- " + pasajero);
            }
            System.out.println("Importe total: $" + (venta.getCantidad() * MainProgram.PRECIO_BOLETO));
            System.out.println();
        }
        System.out.println("Total de ventas realizadas: " + listaVentas.size());
    }
}

