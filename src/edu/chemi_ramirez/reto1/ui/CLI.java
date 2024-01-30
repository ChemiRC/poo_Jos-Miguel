package edu.chemi_ramirez.reto1.ui;

import edu.chemi_ramirez.reto1.process.CalculadoraMasaCoporal;

import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");
        System.out.println("D. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public char obtenerOpcion() {
        return scanner.next().charAt(0);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public double obtenerNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public char obtenerSexo() {
        System.out.println("Ingrese el sexo del paciente (M/F):");
        return scanner.next().charAt(0);
    }

    public int obtenerEdad() {
        System.out.println("Ingrese la edad del paciente:");
        return scanner.nextInt();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
