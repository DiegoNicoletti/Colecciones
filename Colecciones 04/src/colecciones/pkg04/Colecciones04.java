/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.pkg04;

import ServicePelicula.ServicePelicula;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Colecciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicePelicula sp = new ServicePelicula();

        sp.AgregarPeliculas();
            System.out.println("");
        
        sp.MostrarTodo();
            System.out.println("");
        
        sp.CompararHoras();
            System.out.println("");
        
        sp.OrdenarMenorAMayor();
            System.out.println("");
        
        sp.OrdenarMayorAMenor();
            System.out.println("");
        
        sp.TituloAlfabetico();
         System.out.println("");
         
        sp.DirectorAlfabetico();
    }
    
}
