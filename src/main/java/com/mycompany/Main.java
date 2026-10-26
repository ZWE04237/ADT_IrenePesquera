package com.mycompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.entidades.Cirujano;
import com.mycompany.entidades.Enfermeria;
import com.mycompany.entidades.Especialidades;
import com.mycompany.entidades.Secretariado;
import com.mycompany.entidades.SesionUsuario;
import com.mycompany.entidades.SesionUsuario.TipoUsuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC06
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static String RUTA_CREDENCIALES = "src\\main\\resources\\credenciales.txt";
    static String RUTA_PROPIEDADES = "src\\main\\resources\\application.txt";
    static SesionUsuario sesion;
    static int opcion = -1;

    public static void main(String[] args) {
        do {
            if (sesion == null) {
                menuInvitado();
                opcion = seleccionarOpcion();

                switch (opcion) {

                    case 0 -> {
                        System.out.println("FIN DEL PROGRAMA");
                    }

                    case 1 -> {
                        String usuario;
                        do {
                            System.out.println("Usuario:");
                            usuario = sc.next();
                        } while (usuario.contains(" "));
                        String contrasenia;
                        do {
                            System.out.println("Contraseña:");
                            contrasenia = sc.next();
                        } while (usuario.contains(" "));
                        if (!usuario.isEmpty() && !contrasenia.isEmpty()) {
                            login(usuario, contrasenia);
                        } else {
                            System.out.println("Rellene ambos campos");
                        }
                    }

                    default -> {
                        System.out.println("Introduzca un número válido");
                    }
                }
            } else {

                menuUsuario();
                seleccionarOpcion();
                switch (opcion) {
                    case 1 -> {
                        logout();
                    }
                    case 0 -> {
                        System.out.println("FIN DEL PROGRAMA");
                    }
                }
            }

        } while (opcion != 0);
    }

    // -------------------------------
    public static void menuInvitado() {
        System.out.println("== MENÚ ==");
        System.out.println("1. Login");
        System.out.println("0. Salir");
    }

    public static void menuUsuario() {
        System.out.println("== MENÚ ==");
        System.out.println("1. Logout");
        System.out.println("0. Salir");
    }

    public static void menuEspecialidades() {
        System.out.println("1. Odontología");
        System.out.println("2. Fisioterapia");
        System.out.println("3. Ginecología");
        System.out.println("4. Cirujía plástica");
        System.out.println("5. Digestivo");
        System.out.println("6. Cirujía pediátrica");
        System.out.println("7. Radiología");
        System.out.println("8. Geriatría");
        System.out.println("0. Finalizar");
        System.out.println("Introduzca las especialidades");
    }

    public static int seleccionarOpcion() {
        try {
            System.out.println("Introduzca una opción");
            opcion = sc.nextInt();
            sc.nextLine();
            return opcion;
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1; // --> muestra default
        }
    }

    public static SesionUsuario login(String usuario, String contrasenia) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_CREDENCIALES))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|", -1);
                String usuarioLeido = datos[0];
                String contraseniaLeida = datos[1];
                String nombre = datos[2];
                TipoUsuario rol = TipoUsuario.valueOf(datos[3].toUpperCase());
                if (usuarioLeido.equals(usuario) && contraseniaLeida.equals(contrasenia)) {
                    System.out.println("Bienvenid@, " + nombre);
                    try {
                        return sesion = new SesionUsuario(usuario, nombre, rol);
                    } catch (IllegalArgumentException e) {
                        System.out.println("El rol no está registrado");
                    }
                } else {
                    System.out.println("Usuario o contraseña incorrecta");
                }

            }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
        return null;
    }

    public static void logout() {
        sesion = null;
    }

    public static void registrarEmpleado() {
        try {

            String username;
            do {
                System.out.println("Nombre de usuario:");
                username = sc.next();
                if (username.contains(" ")) {
                    System.out.println("El nombre de usuario no puede contener espacios en blanco");
                }
            } while (username.contains(" "));

            String contrasenia;
            String contraseniaRepe;
            do {
                System.out.println("Contraseña:");
                contrasenia = sc.next();
                System.out.println("Repetir contraseña:");
                contraseniaRepe = sc.next();
                if (contrasenia.contains(" ")) {
                    System.out.println("La contraseña no acepta espacios en blanco");
                }
            } while (!contrasenia.equals(contraseniaRepe) || !contrasenia.contains(" "));

            System.out.println("Nombre real:");
            String nombre = sc.next();

            System.out.println("Apellidos:");
            String apellidos = sc.nextLine();

            String nombreCompleto = nombre + " " + apellidos;

            System.out.println("Teléfono:");
            String telefono = sc.next();

            String email;
            do {
                System.out.println("Email:");
                email = sc.next();
                if (!validarEmail(email)) {
                    System.out.println("El email es incorrecto");
                }
            } while (!validarEmail(email));

            String nifnie;
            do {
                System.out.println("DNI/NIE:");
                nifnie = sc.next();
                if (!validarNifNie(nifnie)) {
                    System.out.println("El documento es incorrecto");
                }
            } while (!validarNifNie(nifnie));

            System.out.println("Dirección:");
            String direccion = sc.nextLine();

            System.out.println("Seleccione el rol:");
            int input = sc.nextInt();
            sc.next();
            do {
                System.out.println("1. ENFERMERÍA");
                System.out.println("2. SECRETARIADO");
                System.out.println("3. CIRUJANO");
            } while (input < 1 || input > 3);
            TipoUsuario rol;
            switch (input) {
                case 1 -> {
                    rol = TipoUsuario.ENFERMERIA;
                    String categoria;
                    do {
                        System.out.println("Introduzca la categoría (A/B/C)");
                        categoria = sc.next().toUpperCase();
                        if (!categoria.matches("[ABC]")) {
                            System.out.println("Categoría inválida. Escoja  A, B o C");
                        }
                    } while (!categoria.matches("[ABC]"));
                    Enfermeria enfermeria = new Enfermeria(categoria.charAt(0), nombre, apellidos, telefono, email, nifnie, direccion);
                    escribirCredenciales(username, contrasenia, nombreCompleto, rol);
                    // Luego borrar new y guardar bbdd
                }
                case 2 -> {
                    rol = TipoUsuario.SECRETARIADO;
                    int aniosExperiencia;
                    do {
                        System.out.println("Años de experiencia:");
                        aniosExperiencia = sc.nextInt();
                        sc.next();
                    } while (aniosExperiencia < 0);
                    Secretariado secretariado = new Secretariado(aniosExperiencia, nombre, apellidos, telefono, email, nifnie, direccion);
                    escribirCredenciales(username, contrasenia, nombreCompleto, rol);
                }
                case 3 -> {
                    rol = TipoUsuario.CIRUJANO;
                    ArrayList<Especialidades> especialidades = new ArrayList();
                    int inputCir = -1;
                    do {
                        menuEspecialidades();
                        inputCir = sc.nextInt();
                        sc.next();
                        switch (inputCir) {
                            case 1 -> {
                                especialidades.add(Especialidades.ODONTOLOGIA);
                            }
                            case 2 -> {
                                especialidades.add(Especialidades.FISIOTERAPIA);
                            }
                            case 3 -> {
                                especialidades.add(Especialidades.GINECOLOGIA);
                            }
                            case 4 -> {
                                especialidades.add(Especialidades.CIRUJIA_PLASTICA);
                            }
                            case 5 -> {
                                especialidades.add(Especialidades.DIGESTIVO);
                            }
                            case 6 -> {
                                especialidades.add(Especialidades.CIRUJIA_PEDIATRICA);
                            }
                            case 7 -> {
                                especialidades.add(Especialidades.RADIOLOGIA);
                            }
                            case 8 -> {
                                especialidades.add(Especialidades.GERIATRIA);
                            }
                        }
                        if (especialidades.isEmpty()) {
                            System.out.println("Debe seleccionar al menos una especialidad");
                        }
                    } while (inputCir != 0 || especialidades.isEmpty());
                    Cirujano cirujano = new Cirujano(especialidades, nombre, apellidos, telefono, email, nifnie, direccion);
                    escribirCredenciales(username, contrasenia, nombreCompleto, rol);
                }
                default -> {
                    System.out.println("Error");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Introduzca valores válidos");
        }
    }

    private static final String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
    private static final String REGEX_NIF = "^\\d{8}[A-Z]$";
    private static final String REGEX_NIE = "^[XYZ]\\d{7}[A-Z]$";

    public static boolean validarNifNie(String doc) {
        if (doc == null) {
            return false;
        }
        doc = doc.toUpperCase().trim();

        if (doc.matches(REGEX_NIF)) {
            return letraNif(doc.substring(0, 8)) == doc.charAt(8);
        } else if (doc.matches(REGEX_NIE)) {
            String nie;

            if (doc.substring(0, 1).equals("X")) {
                nie = "0";
            } else if (doc.substring(0, 1).equals("Y")) {
                nie = "1";
            } else {
                nie = "2";
            }
            return letraNif(nie + doc.substring(1, 8)) == doc.charAt(8);
        }
        return false;

    }

    private static char letraNif(String numero) {
        return LETRAS_NIF.charAt(Integer.parseInt(numero) % 23);
    }

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public static boolean validarEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_REGEX);
    }

    public static void escribirCredenciales(String username, String contrasenia, String nombreCompleto, TipoUsuario rol) {
        try {
            Files.writeString(Paths.get(RUTA_CREDENCIALES), username + "|" + contrasenia + "|" + nombreCompleto + "|" + rol.name().toLowerCase());
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

}
