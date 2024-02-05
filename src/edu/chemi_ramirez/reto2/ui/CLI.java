package edu.chemi_ramirez.reto2.ui;

class CLI {

    private static final String USUARIO_CORRECTO = "usuario";
    private static final String CONTRASENA_CORRECTA = "contrasena";

    private ControlCajasPapel controlCajasPapel;

    public CLI() {
        this.controlCajasPapel = new ControlCajasPapel();
    }

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese contraseña:");
        String contrasena = scanner.nextLine();

        while (!usuario.equals(USUARIO_CORRECTO) || !contrasena.equals(CONTRASENA_CORRECTA)) {
            System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
            System.out.println("Ingrese usuario:");
            usuario = scanner.nextLine();

            System.out.println("Ingrese contraseña:");
            contrasena = scanner.nextLine();
        }

        controlCajasPapel.mostrarMenu(scanner);
    }
}