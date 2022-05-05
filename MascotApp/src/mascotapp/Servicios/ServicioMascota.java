package mascotapp.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.Entidades.Mascota;

/**
 *
 * @author SHIRO
 */
public class ServicioMascota {

    //lo que sigue despues de in sirve para escribir con espacios sin que de errores.
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList<>();
    }

    public Mascota CrearMascota() {

        System.out.println("Introducir nombre.");
        String nombre = leer.next();

        System.out.println("Introducir apodo.");
        String apodo = leer.next();

        System.out.println("Introducir tipo.");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);
    }

    public void AgregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void MostrarMascotas() {
        System.out.println("Las mascotas actuales de la Lista Mascotas son:");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }

    /**
     * Crea mascotas, todos fer chiquitos beagle.
     * 
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     * 
     */
    public void FabricaChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));

        }
    }

    /**
     * Crea mascotas pidiendo datos por teclado
     * 
     * @param cantidad
     * 
     */
    public void FabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = CrearMascota();

            AgregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());
        }
    }

////    TO DO añadir try and catch
//    public void ActualizarMascota(int index){
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//    }
    public void ActualizarMascota(int index) {

        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("------Actualizar------");
            Mascota m = CrearMascota();

            mascotas.set(index, m);
        }else{
            System.out.println("Fallo al actualizar. El indice es erroneo.");
        }
    }

    public void EliminarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        }else{
            System.out.println("Fallo al eliminar. El indice es erroneo.");
        }
        
    }
}
