/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Comparator;

/**
 *
 * @author SHIRO
 */
public class Paises {
    public String PaisIngresado;

    public Paises(String PaisIngresado) {
        this.PaisIngresado = PaisIngresado;
    }

    public Paises() {
    }

    public String getPaisIngresado() {
        return PaisIngresado;
    }

    public void setPaisIngresado(String PaisIngresado) {
        this.PaisIngresado = PaisIngresado;
    }
    
    public static Comparator<Paises> alfabetico = new Comparator<Paises>(){
        @Override
            public int compare(Paises t, Paises t1) {
                return t.getPaisIngresado().compareTo(t1.getPaisIngresado());
            }
    };
            
            
    public String toString() {
        return "Paises{" + "PaisIngresado=" + PaisIngresado + '}';
    }
    
    
}
