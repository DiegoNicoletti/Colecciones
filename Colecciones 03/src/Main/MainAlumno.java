/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import ServiceAlumnos.ServiceAlumno;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class MainAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiceAlumno sa = new ServiceAlumno();
        String fin = null;
        
        while(!"n".equals(fin)){
            sa.CrearAlumnos();
            System.out.println("Desea crear otro alumno? s/n");
            fin = leer.next();
        }
        sa.MostrarTodo();
        sa.NotaFinal();
    }
    
}
