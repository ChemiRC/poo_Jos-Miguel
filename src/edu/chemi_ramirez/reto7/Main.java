package edu.chemi_ramirez.reto7;

public class Main {
}
// Clase Main
public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI(args);

        String inputFilePath = cli.getOption("input");
        String outputFilePath = cli.getOption("output");

        if (inputFilePath == null) {
            System.out.println("Error: Debe proporcionar la ruta de entrada con -input");
            return;
        }

        // Aquí podrías llamar a tu clase de proceso con los argumentos adecuados
        Process process = new Process();
        process.run(inputFilePath, outputFilePath);
    }
}
