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
    public static double calcularIndiceMasaCorporal(double imc) {
        String value = " ";
        if(imc<18) {
            value = "desnutrición";
        }else if(imc<=24.99)
            value = "normal";
        return value;


        }
    }

}
