/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

import com.mycompany.modelo.Alergia;
import com.mycompany.modelo.Medicamento;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author irene
 */
public class GestorAlergias {

    static String RUTA_ALERGIAS = "src\\main\\alergias";
    static Scanner sc = new Scanner(System.in);
    static File carpeta = new File(RUTA_ALERGIAS);
    static File[] ficheros = carpeta.listFiles((dir, nombre) -> nombre.endsWith(".dat"));

    public static void verAlergias() {
        if (ficheros.length == 0) {
            System.out.println("Aún no existen alergias registradas");
            return;
        }
        Set<Alergia> alergias = new TreeSet<>();
        for (File f : ficheros) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                Alergia alergia = (Alergia) ois.readObject();
                alergias.add(alergia);
            } catch (IOException e) {
                System.out.println("Error de lectura");
            } catch (ClassNotFoundException e) {
                System.out.println("No se encontró la clase");
            }
        }

        System.out.println("\n== LISTADO DE ALERGIAS ==");
        for (Alergia a : alergias) {
            a.toString();
        }
    }

    public static void nuevaAlergia() { //Clase Validator !!!
        try {
            System.out.print("Nombre de la alergia:"); //espacios blanco
            String nombreAlergia = sc.nextLine();
            System.out.print("Nombre del medicamento:");
            String nombreMedicamento = sc.nextLine();
            System.out.print("Principio activo:");
            String principioActivo = sc.nextLine();
            int dosisMaxima;
            do {
                System.out.print("Dosis máxima:");
                dosisMaxima = sc.nextInt();
                sc.nextLine();
                if (dosisMaxima <= 0) {
                    System.out.println("La dosis debe ser mayor a cero");
                }
            } while (dosisMaxima <= 0);

            Long id = calcularSiguienteId();
            Medicamento medicamento = new Medicamento(id, nombreMedicamento, principioActivo, dosisMaxima);
            Alergia alergia = new Alergia(id, nombreAlergia, medicamento);

            guardarAlergia(alergia);
            System.out.println("Alergia creada correctamente");

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Dato inválido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

    private static Long calcularSiguienteId() throws IOException {
        Long maxId = 0l;
        if (ficheros != null) {
            for (File fichero : ficheros) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                    Alergia a = (Alergia) ois.readObject();
                    if (a.getId() > maxId) {
                        maxId = a.getId();
                    }
                } catch (ClassNotFoundException e) {
                    System.out.println("Error");
                }
            }
        }
        return maxId + 1;
    }
    
    private static void guardarAlergia(Alergia alergia) throws IOException {
        String nombreFichero = alergia.getId() + ".dat";
        File fichero = new File(RUTA_ALERGIAS, nombreFichero);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(alergia);
        }
    }
    
    
    /* CU3C Editar alergia
       Modificar menú según rol
    */

}
