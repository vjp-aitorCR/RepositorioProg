/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */    
public class Sede {
    //Atributos
    private String nombre;
    private double ingresosAnuales;
    //Constructores
    public Sede(String nombre, double ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }
    public Sede() {
        this.nombre = "";
        this.ingresosAnuales = 0;
    }   
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public double getIngresosAnuales() {
        return ingresosAnuales;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    //To String
    @Override
    public String toString() {
        return "Sede: " + nombre + " - Ingresos anuales: " + String.format("%.2f", ingresosAnuales) + " €";
    }
    //Compara sedes por nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sede sede = (Sede) obj;
        return nombre.equalsIgnoreCase(sede.nombre);
    }
    //Hashcode consistente con equals
    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
}
