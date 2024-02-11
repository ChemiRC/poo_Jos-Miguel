package edu.chemi_ramirez.reto3.process;

public class DIccionario {
}
class Diccionario {
    private String[] palabras;
    private String[] significados;

    public Diccionario() {
        palabras = new String[]{"Letra", "Programación", "Computadora", "Libro", "Casa", "Perro", "Gato", "Feliz", "Triste", "Cielo"};
        significados = new String[]{"Signo escrito que, solo o unido a otros, representa un sonido", "Conjunto de instrucciones que especifican una operación a realizar por una computadora", "Dispositivo electrónico capaz de procesar datos y realizar operaciones sobre ellos", "Conjunto de hojas de papel u otro material unidas juntas por uno de sus lados", "Edificación para habitar", "Animal doméstico de la familia de los cánidos", "Animal doméstico de la familia de los felinos", "Emoción de alegría", "Emoción de tristeza", "Esfera celeste aparente sobre la cual se disponen los astros"};
    }

    public void enlistarPalabras() {
        System.out.println("Contenido del diccionario:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    public void buscarPalabra(String palabra) {
        int indice = -1;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println((indice + 1) + ". " + palabras[indice]);
            System.out.println("Significado: " + significados[indice]);
        } else {
            System.out.println("La palabra no existe en el diccionario.");
        }
    }

    public void mostrarDetalle() {
        System.out.println("Cantidad de palabras en el diccionario: " + palabras.length);
        System.out.println("Lista de palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ". " + palabras[i] + ", cantidad caracteres: " + palabras[i].length() + ", cantidad caracteres significado: " + significados[i].length() + ".");
        }
    }
}