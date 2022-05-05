/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.pkg05;

import ServiceObjeto.ServicePaises;

/**
 *
 * @author SHIRO
 */
public class Colecciones05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicePaises sp = new ServicePaises();
        
        sp.AgregarPaises();
        
        sp.OrdenarAlfabeticamente();
        System.out.println("");
        
        sp.BorrarPais();
    }
    
}
