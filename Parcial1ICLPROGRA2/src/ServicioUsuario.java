/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
import java.io.File;
import java.io.IOException;

public class ServicioUsuario {

    private UsuarioDAOArchivo dao;
    public ServicioUsuario() {
        this.dao = new UsuarioDAOArchivo();
    } public void verificarArchivo() throws IOException {
        File archivo = new File("archivo.txt");
        if (!archivo.exists()) {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo no pudo ser creado.");
            }
        } else {
            System.out.println("El archivo ya existe.");
        }
    }
    public void guardarUsuario(Usuarios usuario) throws IOException {
        dao.guardarUsuario(usuario);
    }

    public void leerUsuarios() throws IOException {
        dao.leerUsuarios(); 
    }
}