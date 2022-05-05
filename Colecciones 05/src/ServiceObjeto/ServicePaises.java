/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceObjeto;

import Objeto.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServicePaises {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Paises> paisSet = new HashSet();
    
    public void AgregarPaises(){
        paisSet.add(new Paises("Brasil"));
        paisSet.add(new Paises("Egipto"));
        paisSet.add(new Paises("Canada"));
        paisSet.add(new Paises("Argentina"));
        paisSet.add(new Paises("Zuecia"));
    }
    
    public void OrdenarAlfabeticamente(){
        ArrayList<Paises> pais = new ArrayList(paisSet);
        System.out.println("Se mostraran los paises Alfabeticamente");
        pais.sort(Paises.alfabetico);
        
        for (Paises qwe : pais) {
            System.out.println(qwe.toString());
        }
    }
    
    public void BorrarPais(){
        ArrayList<Paises> pais = new ArrayList(paisSet);
        System.out.println("Elija un pais el cual borrar.");
        String borrar = leer.next();
        
        for (int i = 0; i < pais.size(); i++) {
            Paises p = pais.get(i);
            if(p.getPaisIngresado().equals(borrar)){
                pais.remove(i);
            }
        }
        
        for (Paises qwe : pais) {
            System.out.println(qwe.toString());
        }
    }
}
