/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class Donacion {
    //Atributos
    private String nombre;
    private double cantidad;
    //Constructores
    public Donacion(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public Donacion() {
        this.nombre = "";
        this.cantidad = 0;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    //To String
    @Override
    public String toString() {
        return "Donacion: " + "Nombre:" + nombre + " - Cantidad: " + cantidad + " euros";
    }

}
