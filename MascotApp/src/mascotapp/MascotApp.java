package mascotapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mascotapp.Servicios.ServicioMascota;

/**
 *
 * @author SHIRO
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nombres = {"pepe", "pepe"};
                
        List <String> nombreList = new ArrayList(Arrays.asList(nombres));
        
        List <String> nombreList2 = new ArrayList(Arrays.asList(nombres));
        
        nombreList2.addAll(0, nombreList);
        
//        ServicioMascota servMasc = new ServicioMascota();
//        
//        servMasc.FabricaMascota(1);
//        
//        servMasc.MostrarMascotas();
//        
//        servMasc.ActualizarMascota(0);
//        
//        servMasc.MostrarMascotas();
//        
//        servMasc.EliminarMascota(3);
//        
//        servMasc.MostrarMascotas();
    }
    
}
