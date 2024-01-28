package edu.chemi_ramirez.reto1.process;
public class Process {

    public static void procesarOpcion(char opcion, CLI cli) {
        switch (opcion) {
            case 'A':
                procesarIMC(cli);
                break;
            case 'B':
                procesarMasaCorporalMagra(cli);
                break;
            case 'C':
                procesarMetabolismoBasal(cli);
                break;
            default:
                cli.mostrarMensaje("Opción no válida. Inténtelo de nuevo.");
                break;
        }
    }

    private static void procesarIMC(CLI cli) {
        double peso = cli.obtenerNumero("Ingrese el peso en kg:");
        double estatura = cli.obtenerNumero("Ingrese la estatura en cm:") / 100.0;

        double imc = CalculadoraMasaCorporal.calcularIMC(peso, estatura);
        cli.mostrarMensaje("Índice de Masa Corporal (IMC): " + imc);

        interpretarIMC(imc, cli);
    }

    private static void interpretarIMC(double imc, CLI cli) {
        cli.mostrarMensaje("Interpretación:");
        if (imc < 18.5) {
            cli.mostrarMensaje("Peso bajo");
        } else if (imc >= 18.5 && imc <= 24.99) {
            cli.mostrarMensaje("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            cli.mostrarMensaje("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.99) {
            cli.mostrarMensaje("Obesidad leve");
        } else if (imc >= 35 && imc <= 39.99) {
            cli.mostrarMensaje("Obesidad media");
        } else {
            cli.mostrarMensaje("Obesidad mórbida");
        }
    }

    private static void procesarMasaCorporalMagra(CLI cli) {
        double peso = cli.obtenerNumero("Ingrese el peso en kg:");
        double estatura = cli.obtenerNumero("Ingrese la estatura en cm:");
        char sexo = cli.obtenerSexo();

        double masaCorporalMagra = CalculadoraMasaCorporal.calcularMasaCorporalMagra(peso, estatura, sexo);
        cli.mostrarMensaje("Masa Corporal Magra: " + masaCorporalMagra + " kg");
    }

    private static void procesarMetabolismoBasal(CLI cli) {
        double peso = cli.obtenerNumero("Ingrese el peso en kg:");
        double estatura = cli.obtenerNumero("Ingrese la estatura en cm:");
        int edad = cli.obtenerEdad();
        char sexo = cli.obtenerSexo();

        double metabolismo
