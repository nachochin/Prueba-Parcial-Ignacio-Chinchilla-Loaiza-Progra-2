/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ServicioUsuario servicio = new ServicioUsuario();
        try {
            servicio.verificarArchivo();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Bienvenido al Examen de Ignacio");
                String nombre, correo;
                System.out.println("Ingrese su nombre:");
                nombre = sc.nextLine();
                System.out.println("Ingrese su correo:");
                correo = sc.nextLine();
                Usuarios usuario = new Usuarios(nombre, correo);
                servicio.guardarUsuario(usuario);

                System.out.println("Usuario guardado correctamente.");

                System.out.println("Lista de usuarios guardados:");
                servicio.leerUsuarios();
            }

        }catch (IOException e) {
            System.out.println("Error de estado del archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}