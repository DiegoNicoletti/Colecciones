/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePelicula;

import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServicePelicula {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peli = new ArrayList<>();
    
    public void AgregarPeliculas(){
        peli.add(new Pelicula(" B   ", "    C ", 4));
        peli.add(new Pelicula(" C ", "    B ", 3));
        peli.add(new Pelicula(" E   ", "    A   ", 5));
        peli.add(new Pelicula(" A ", "    E   ", 1));
        peli.add(new Pelicula(" D    ", "    D    ", 2));
    }
    
    public void MostrarTodo(){
        System.out.println("Todas Las Peliculas:");
        for (Pelicula qwe : peli) {
            System.out.println(qwe.toString());
        }
    }
    
    public void CompararHoras(){
        System.out.println("Se mostraran las peliculas con duracion mayor a 1hora");   
        for (Pelicula qwe : peli) {          
            if(!"".equals(qwe.UnaHora())){
                System.out.println(qwe.toString());
            }else{
                
            }
        }
    }
    
    public void OrdenarMenorAMayor(){
        System.out.println("Ordenadas de Menor a Mayor:");
        peli.sort(Pelicula.MenorAMayor);
        
        for (Pelicula qwe : peli) {
            System.out.println(qwe.toString());
        } 
    }
    
    public void OrdenarMayorAMenor(){
        System.out.println("Ordenadas de Mayor a Menor:");
        peli.sort(Pelicula.MayorAMenor);
        
        for (Pelicula qwe : peli) {
            System.out.println(qwe.toString());
        } 
    }
    
    public void TituloAlfabetico(){
        System.out.println("Ordenado los titulos alfabeticamente.");
        peli.sort(Pelicula.TituloAlfabetico);
        
        for (Pelicula qwe : peli) {
            System.out.println(qwe.toString());
        }
    }
    
    public void DirectorAlfabetico(){
        System.out.println("Ordenado los Directores Alfabeticamente.");
        peli.sort(Pelicula.DirectorAlfabetico);
        
        for (Pelicula qwe : peli) {
            System.out.println(qwe.toString());
        }
    }
}
