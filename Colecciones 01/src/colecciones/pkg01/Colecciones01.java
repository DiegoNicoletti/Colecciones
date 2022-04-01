
////Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
package colecciones.pkg01;

import ServicePerro.ServicePerro;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Colecciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicePerro sp = new ServicePerro();
        String fin=null;
        
        while(!"s".equals(fin)){
         sp.CrearRaza();
            System.out.println("Quiere salir? s/n");
            fin = leer.next();
        }
        
        sp.imprimirTodos();
        
        sp.EliminarRaza();
        
        sp.imprimirTodos();
    }
    
}
