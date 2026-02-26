/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Usuarios {
    
    private String nombre, correo;
    public Usuarios(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;  // Corrige el parámetro y asignación
    }


    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}//fin clase Usuarios