package edu.chemi_ramirez.reto1.ui;

import edu.chemi_ramirez.reto1.process.CalculadoraMasaCoporal;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println(" ****************************************" );
        System.out.println( "Elige una opción de la calculadora" );
        System.out.println( "1, calculo de masa corporal" );
        System.out.println( "2, calculo de masa corporal magra" );
        System.out.println( "3, calculo de metabolismo basal" );
        System.out.println( "4, salir" );
        System.out.println( "*****************************************");
        );
public static void launchApp(){
    Scanner scanner = new Scanner(System.in);

    showMenu();
    int opcion = scanner.nextInt();

    switch opcion = scanner.nextInt()
            case 1:
                double imc = CalculadoraMasaCoporal.calcularIndiceMasaCorporal()
                        String estado = clasificarIndiceMasaCorporal(imc)
                System.out.println("tu indice de masa corporal %f por lo que se considera " +
                        "que estas en un estado de %s ");
                        break;
            case 2:
                break;

        }

    }
}
