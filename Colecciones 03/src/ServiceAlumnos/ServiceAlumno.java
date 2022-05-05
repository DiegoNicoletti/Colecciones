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
        Alumnos a1 = new Alumnos();
        System.out.println("Nombre Alumno");
        a1.setNombre(leer.next());
        System.out.println("Nota 1");
        a1.setNota1(leer.nextInt());
        System.out.println("Nota 2");
        a1.setNota2(leer.nextInt());
        System.out.println("Nota 3");
        a1.setNota3(leer.nextInt());
        
        alumno.add(a1);
        
    }
    
    public void MostrarTodo(){
        System.out.println("Todos los alumnos, y sus notas son:");
        for (Alumnos qwe : alumno) {
            System.out.println(qwe.toString());
        }
    }
    
    public void NotaFinal(){
        System.out.println("La nota final de que estudiante quiere calcular?");
        String nombreAlumno = leer.next();
        
        for (Alumnos qwe : alumno) {
            if(qwe.getNombre().equalsIgnoreCase(nombreAlumno)){
                System.out.println("La nota final de "+nombreAlumno+" es "+qwe.notaFinal());
            }
        }
    }
    
}
