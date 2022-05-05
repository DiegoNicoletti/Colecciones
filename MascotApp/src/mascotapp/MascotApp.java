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
        
        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.FabricaMascota(2);
        servMasc.MostrarMascotas();

    }
    
}
