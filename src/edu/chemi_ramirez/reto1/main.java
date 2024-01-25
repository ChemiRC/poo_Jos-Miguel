package edu.chemi_ramirez.reto1;

import edu.chemi_ramirez.reto1.ui.CLI;

public class main {
    public static void main(String[] args) {
        try {
            CLI.launchApp();
        }catch(Exception e ){
            System.out.println("error inesperado");
        }
    }
}
