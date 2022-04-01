/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceAlumnos;

import Alumnos.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceAlumno {
    private Scanner leer;
    private ArrayList<Alumnos> alumno;
    
    public ServiceAlumno(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumno = new ArrayList<>();
    }
    
    public void CrearAlumnos(){
        System.out.println("Nombre");
        String nombreIn = leer.next();
        String fin=null;
        
        System.out.println("Nota 1");
        int notaIn1 = leer.nextInt();
        System.out.println("Nota 2");
        int notaIn2 = leer.nextInt();
        System.out.println("Nota 3");
        int notaIn3 = leer.nextInt();
        
        alumno.add(new Alumnos(nombreIn, notaIn1, notaIn2, notaIn3));
    }
    
    public void MostrarTodo(){
        System.out.println("Todos los alumnos, y sus notas son:");
        for (Alumnos alumnos : alumno) {
            System.out.println(alumnos.toString());
        }
    }
    
    public void NotaFinal(){
        
    }
}
