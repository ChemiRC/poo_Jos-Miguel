package edu.chemi_ramirez.reto7;

public class process {
}
// Clase Process
public class Process {
    public void run(String inputFilePath, String outputFilePath) {
        // Aquí iría tu lógica de procesamiento
        System.out.println("Procesando archivo de entrada: " + inputFilePath);
        if (outputFilePath != null) {
            System.out.println("Guardando resultados en: " + outputFilePath);
        } else {
            System.out.println("No se proporcionó un archivo de salida.");
        }
        // Simulación de procesamiento
        // Por ejemplo, leer el archivo de entrada, procesarlo y escribir en el archivo de salida
    }
}
