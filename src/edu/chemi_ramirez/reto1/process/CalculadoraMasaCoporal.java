package edu.chemi_ramirez.reto1.process;

/**
 * Esta clase sirve para reliazar calculos de masa corporal inclue los metodos:
 * indice de masa corporal
 * calculo de masa corporal made
 **/
public class CalculadoraMasaCoporal {
    /**
     * este metodo sirve ara calcular el indice de masa corporal de una persona con base a su peso
     * @param estatura del paciente esta en centimetros
     * @param peso del paciente esta en kilogramos
     * @return indice de masa corporal
     * */
    public class CalculadoraMasaCorporal {

        public static double calcularIMC(double peso, double estatura) {
            return peso / (estatura * estatura);
        }

        public static double calcularMasaCorporalMagra(double peso, double estatura, char sexo) {
            if (sexo == 'M' || sexo == 'm') {
                return (1.10 * peso) - (128 * Math.pow(peso, 2) / Math.pow(estatura, 2));
            } else if (sexo == 'F' || sexo == 'f') {
                return (1.07 * peso) - (148 * Math.pow(peso, 2) / Math.pow(estatura, 2));
            } else {
                throw new IllegalArgumentException("Sexo no válido.");
            }
        }

        public static double calcularMetabolismoBasal(double peso, double estatura, int edad, char sexo) {
            if (sexo == 'M' || sexo == 'm') {
                return 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
            } else if (sexo == 'F' || sexo == 'f') {
                return 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
            } else {
                throw new IllegalArgumentException("Sexo no válido.");
            }
        }
    }
