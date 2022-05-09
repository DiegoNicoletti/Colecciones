/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author SHIRO
 */
public class Tienda {
    public Integer precio;
    public String producto;

    public Tienda() {
    }

    public Tienda(Integer precio, String producto) {
        this.precio = precio;
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tienda{" + "precio=" + precio + ", producto=" + producto + '}';
    }
    
    
}
