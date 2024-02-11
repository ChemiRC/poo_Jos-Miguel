package edu.chemi_ramirez.reto3;


public class Main {
    public static void main(String[] args) {
        CLI interfaz = new CLI();
        Diccionario diccionario = new Diccionario();

        char opcion;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            switch (opcion) {
                case 'A':
                    diccionario.enlistarPalabras();
                    break;
                case 'B':
                    String palabra = interfaz.leerPalabra();
                    diccionario.buscarPalabra(palabra);
                    break;
                case 'C':
                    diccionario.mostrarDetalle();
                    break;
                case 'S':
                    System.out.println("------Fin del programa v1.1-------");
                    break;
                default:
                    interfaz.mostrarMensaje("Opción inválida. Por favor, elija una opción válida.");
            }
        } while (opcion != 'S');
    }
}