package mascotapp.Entidades;

/**
 *
 * @author SHIRO
 */
public class Mascota {
    //Atributos (Osea las caracteristicas del objeto)
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String raza;
    private int edad;
    private boolean cola;
    
    private int energia;
    
    //Constructor son los Metodos, esto es el comportamiento del objeto.
    public Mascota(){
        energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, String raza, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
        this.energia = 1000;
    }
    
    //Hay que hacer un SET para poder cambiar un atributo privado.
    public void setNombre(String nombre){
        if(nombre.length()>0){
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    //Esto es un Getter. Es una funcion que entra a la clase y retorna el valor que pedimos.
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
    
    /**
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        //  energia = energia - energiaRestar;
        //Esta es otra manera de poner la operacion anterior
        energia -= energiaRestar;
        
        return energia;
    }

    //Esto siguiente nos muestra el nombre del atributo con su respectivo valor.
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }

    
}
