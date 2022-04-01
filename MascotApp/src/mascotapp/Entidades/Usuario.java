/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.Entidades;

import java.util.Date;

/**
 *
 * @author SHIRO
 */
public class Usuario {
    //Atributos (Osea las caracteristicas del objeto)
    public String nombre;
    public String apellido;
    public String pais;
    public int dni;
    public Date nacimiento;
    
    //Constructor vacio.
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String pais, int dni, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }
    
    
    
}
