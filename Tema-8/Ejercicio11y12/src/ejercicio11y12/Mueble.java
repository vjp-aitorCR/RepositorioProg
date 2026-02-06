/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11y12;

/**
 *
 * @author Personal
 */
public class Mueble {
    //Atributos
    private double precio;
    private String descripcion;
    //Constructores 
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    //Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //To String
    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    //Metodo para mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Descripcion: " + descripcion + " | Precio: " + precio + " euros");
    }
}
