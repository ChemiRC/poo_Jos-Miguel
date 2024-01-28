package edu.chemi_ramirez.reto1;

import edu.chemi_ramirez.reto1.ui.CLI;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CLI cli = new CLI(scanner);

        char opcion;
        do {
            cli.mostrarMenu();
            opcion = cli.obtenerOpcion();

            if (opcion != 'D') {
                Process.procesarOpcion(opcion, cli);
            }

        } while (opcion != 'D');

        cli.mostrarMensaje("Programa finalizado.");
        cli.cerrarScanner();
    }
}
