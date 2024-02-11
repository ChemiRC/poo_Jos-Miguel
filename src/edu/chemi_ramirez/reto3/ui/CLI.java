package edu.chemi_ramirez.reto3.ui;

public class CLI {
}
import java.util.Scanner;

class CLI {
    private Scanner scanner;

    public CLI() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("-------Diccionario--------");
        System.out.println("A. Listar palabras del diccionario");
        System.out.println("B. Buscar la palabra en el diccionario");
        System.out.println("C. Detalle del diccionario");
        System.out.println("S. Finalizar programa");
        System.out.print("Elegir opción: ");
    }

    public char leerOpcion() {
        return scanner.next().charAt(0);
    }

    public String leerPalabra() {
        System.out.print("Palabra a mostrar significado: ");
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
