package edu.chemi_ramirez.reto6.ui;

public class interfaz {
}
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NominaEmpresa nomina = new NominaEmpresa();

        System.out.print("Ingrese el número de empleados a capturar: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado #" + (i + 1));
            Empleado empleado = capturarDatosEmpleado();
            nomina.AgregarEmpleado(empleado);
        }

        System.out.println("\nReporte de Nómina:");
        System.out.println("Total de la Nómina: $" + nomina.CalcularTotalNomina());
        System.out.println("Total a pagar por sueldo normal: $" + nomina.CalcularTotalSueldoNormal());
        System.out.println("Total a pagar por horas extras: $" + nomina.CalcularTotalSueldoExtra());
        System.out.println("Total de horas laboradas en la empresa: " + nomina.CalcularTotalHorasLaboradas() + " horas");
        System.out.println("Total de personas que tienen horas extras: " + nomina.TotalPersonasConHorasExtras());
        System.out.println("Total de personas que no tienen horas extras: " + nomina.TotalPersonasSinHorasExtras());
    }

    private static Empleado capturarDatosEmpleado() {
        System.out.print("Nombre completo del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Horas extras trabajadas: ");
        int horasExtras = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaStr);
        System.out.println("Seleccione la categoría del empleado:");
        Categoria categoria = capturarDatosCategoria();
        return new Empleado(nombre, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
    }

    private static Categoria capturarDatosCategoria() {
        System.out.println("1. Empleado de Ventas");
        System.out.println("2. Administrador");
        System.out.println("3. Gerente");
        System.out.print("Seleccione la opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                return new Categoria("Empleado de Ventas", "VEN", 100.00, 50.00);
            case 2:
                return new Categoria("Administrador", "ADM", 180.00, 100.00);
            case 3:
                return new Categoria("Gerente", "GER", 250.00, 150.00);
            default:
                System.out.println("Opción no válida. Seleccionando Empleado de Ventas por defecto.");
                return new Categoria("Empleado de Ventas", "VEN", 100.00, 50.00);
        }
    }

    private static Date parseFecha(String fechaStr) {
        try {
            return new Date(fechaStr);
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha. Utilizando la fecha actual.");
            return new Date(); // Fecha actual
        }
    }
}
