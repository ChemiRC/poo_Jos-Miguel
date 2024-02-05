package edu.chemi_ramirez.reto2.process;

class ControlCajasPapel {

    private int totalVentas = 0;
    private int totalCompras = 0;
    private double ingresosVentas = 0.0;
    private double egresosCompras = 0.0;
    private double montoEnCaja = 0.0;

    public void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Comprar cajas de papel");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir del programa");
            System.out.println("Seleccione una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    comprarCajas(scanner);
                    break;
                case 2:
                    venderCajas(scanner);
                    break;
                case 3:
                    mostrarReporte();
                    break;
                case 4:
                    salirDelPrograma(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

        mostrarResumen();
    }

    private void comprarCajas(Scanner scanner) {
        System.out.println("\nIngrese el número de cajas a comprar:");
        int cantidadCompras = scanner.nextInt();

        System.out.println("Ingrese el costo de las cajas a comprar:");
        double costoCompras = scanner.nextDouble();

        double monto = cantidadCompras * costoCompras;
        egresosCompras += monto;
        montoEnCaja -= monto;

        totalCompras++;
        System.out.printf("La compra realizada por %d cajas al costo %.2f es igual a %.2f%n", cantidadCompras, costoCompras, monto);
    }

    private void venderCajas(Scanner scanner) {
        System.out.println("\nIngrese el número de cajas a vender:");
        int cantidadVentas = scanner.nextInt();

        System.out.println("Ingrese el precio de las cajas a vender:");
        double precioVentas = scanner.nextDouble();

        double monto = cantidadVentas * precioVentas;
        ingresosVentas += monto;
        montoEnCaja += monto;

        totalVentas++;
        System.out.printf("La venta realizada por %d cajas al precio de %.2f es igual a %.2f%n", cantidadVentas, precioVentas, monto);
    }

    private void mostrarReporte() {
        System.out.println("\nReporte:");
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoEnCaja);
    }

    private void salirDelPrograma(Scanner scanner) {
        scanner.close();
    }

    private void mostrarResumen() {
        System.out.println("\nResumen:");
        System.out.println("Cantidad total de operaciones realizadas: " + (totalVentas + totalCompras));
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoEnCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("¡Gracias por utilizar el programa! Hasta luego.");
    }
}
