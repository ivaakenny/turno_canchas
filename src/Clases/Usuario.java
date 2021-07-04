/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author ivana
 */
public class Usuario {
    
    //atributo
    public String nombre;
    public String usuario;
    public String Apellido;
    public String Clave;
    public Date Nacimiento; // VER COMO PONER FECHAS
    public String descripcion;

    public Usuario() {
    
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", Apellido=" + Apellido + ", Clave=" + Clave + ", Nacimiento=" + Nacimiento + ", descripcion=" + descripcion;
    }
    
    
    
    
}
