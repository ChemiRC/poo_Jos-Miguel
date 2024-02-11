package edu.chemi_ramirez.reto4;

public class MainProgram {
    private static Ventas ventas = new Ventas();
    private static final double PRECIO_BOLETO = 1250.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        do {
            mostrarMenu();
            opcion = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer del scanner
            switch (opcion) {
                case 'A':
                    ventas.realizarVenta(scanner);
                    break;
                case 'B':
                    ventas.mostrarDatosVenta();
                    break;
                case 'S':
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 'S');
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        System.out.println("S. Finalizar programa");
        System.out.print("Seleccione una opción: ");
    }
}
