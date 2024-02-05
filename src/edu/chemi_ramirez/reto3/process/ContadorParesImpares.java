package edu.chemi_ramirez.reto3.process;

public class ContadorParesImpares {
}
import java.util.Random;
import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int filas, columnas;
        do {
            System.out.print("Ingrese el número de filas: ");
            filas = scanner.nextInt();
            System.out.print("Ingrese el número de columnas: ");
            columnas = scanner.nextInt();

            if (filas != columnas) {
                System.out.println("Debe ingresar valores iguales para filas y columnas. Intente nuevamente.");
            }
        } while (filas != columnas);

        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con valores aleatorios del 1 al 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        // Contar pares e impares por filas
        System.out.println("Conteo de números pares e impares por filas:");
        for (int i = 0; i < filas; i++) {
            int pares = 0, impares = 0;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("- Pares: " + pares + ", Impares: " + impares);
        }

        // Contar pares e impares por columnas
        System.out.println("Conteo de números pares e impares por columnas:");
        for (int j = 0; j < columnas; j++) {
            int pares = 0, impares = 0;
            for (int i = 0; i < filas; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Columna " + j + " - Pares: " + pares + ", Impares: " + impares);
        }

        // Calcular la suma de todos los números en la matriz
        int sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("La suma total de todos los números en la matriz es: " + sumaTotal);
    }
}
