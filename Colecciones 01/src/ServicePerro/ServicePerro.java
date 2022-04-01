/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePerro;

import Perro.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServicePerro {

    private ArrayList<Perro> Raza; //Creo la lista.
    private Scanner leer;   //Creo el Scanner para utilizar en toda la clase.

    public ServicePerro() {
        this.Raza = new ArrayList<>(); //Creo el espacio en memoria de la lista.
        this.leer = new Scanner(System.in).useDelimiter("\n");
        // Cuando se invoca la clase, habilita el flujo de datos.

    }

    public void CrearRaza() {
        
        System.out.println("Ingrese raza:");
        String razaIngresada = leer.next();

        Raza.add(new Perro(razaIngresada));
    }

    public void imprimirTodos() {
        System.out.println("Todas las razas ingresadas son.");
        for (Perro CadaRaza : Raza) {
            System.out.println(CadaRaza.toString());
        }
    }
    
    public void EliminarRaza(){
        System.out.println("Que raza quiere eliminar?");
        String BorrarEste = leer.next();
        
        for (int i = 0; i < Raza.size(); i++) {
            
            Perro p = Raza.get(i);
            if(p.getRaza().equals(BorrarEste)){
                Raza.remove(i);
            }
        }
    }
}
