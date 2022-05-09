/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceObjeto;

import Objeto.Tienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, Tienda> NuevoProducto = new HashMap<>();

    public void CargarProducto() {
        System.out.println("Cuantos productos va a agregar?");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Producto:");
            String Producto = leer.next();
            System.out.println("Precio:");
            Integer Precio = leer.nextInt();

            NuevoProducto.put(Precio, new Tienda(Precio, Producto));
        }
    }
}
