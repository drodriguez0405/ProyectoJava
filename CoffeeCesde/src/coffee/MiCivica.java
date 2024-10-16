package coffee;

import java.util.Scanner;

public class MiCivica {

    static String username;
    static String password;
    static boolean isUserCreated = false;
    static String tipoTarjeta;
    static double saldo = 0.0;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("seleccione 1. para crear un usuario " +
                    "\nseleccione 2. para iniciar sesion " +
                    "\nseleccione 3. para tipo de tarjeta " +
                    "\nseleccione 4. para ingresar saldo " +
                    "\nseleccione 5. para ver datos del usuario " +
                    "\nseleccione 0. para salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    seleccionarTipoTarjeta();
                    break;
                case 4:
                    ingresarSaldo();
                    break;
                case 5:
                    verDatosUsuario();
                    break;
                case 0:
                    System.out.println("saliendo del programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("seleccione una opcion valida");
            }
        }
    }
    public static String crearUsuario() {
        System.out.println("crear usuario");
        System.out.print("ingrese nombre de usuario: ");
        username = sc.next();
        System.out.print("ingrese contraseña: ");
        password = sc.next();
        isUserCreated = true;
        System.out.println("usuario " + username + " creado exitosamente.");
        return username;
    }

    public static String iniciarSesion() {
        if (!isUserCreated) {
            System.out.println("no hay ningun usuario creado. cree un usuario primero.");
            return null;
        }

        System.out.println("iniciar sesion");
        System.out.print("ingrese nombre de usuario: ");
        String loginUsername = sc.next();
        System.out.print("ingrese contraseña: ");
        String loginPassword = sc.next();

        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("sesion iniciada como " + loginUsername);
            System.out.println("bienvenido");
        } else {
            System.out.println("nombre de usuario o contraseña incorrectos.");
        }
        return loginUsername;
    }

    public static String seleccionarTipoTarjeta() {
        if (!isUserCreated) {
            System.out.println("no hay ningun usuario creado. cree un usuario primero.");
        }

        System.out.println("seleccione el tipo de tarjeta:");
        System.out.println("1. tarjeta de transporte");
        System.out.println("2. tarjeta de estudiante");
        System.out.print("ingrese su opcion: ");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                tipoTarjeta = "tarjeta de transporte";
                System.out.println("tipo de tarjeta seleccionada: " + tipoTarjeta);
                break;
            case 2:
                tipoTarjeta = "tarjeta de estudiante";
                System.out.println("tipo de tarjeta seleccionada: " + tipoTarjeta);
                break;
            default:
                System.out.println("opcion invalida. seleccione una opcion valida.");
        }
        return tipoTarjeta;
    }
    public static Double ingresarSaldo() {
        if (!isUserCreated) {
            System.out.println("no hay ningun usuario creado. cree un usuario primero.");
        }

        System.out.print("ingrese el monto a añadir al saldo: ");
        double monto = sc.nextDouble();
        if (monto > 0) {
            saldo += monto;
            System.out.println("saldo actualizado: " + saldo);
        } else {
            System.out.println("el monto debe ser mayor que cero.");
        }
        return saldo;
    }

    public static String verDatosUsuario() {
        if (!isUserCreated) {
            System.out.println("no hay ningun usuario creado.");
        } else {
            System.out.println("datos del usuario: " +
                    "\nnombre de usuario: " + username +
                    "\ncontraseña del usuario: " + password +
                    "\ntipo de tarjeta: " + (tipoTarjeta != null ? tipoTarjeta : "no seleccionado") +
                    "\nsaldo: " + saldo);
        }
        return "";
    }
    }
