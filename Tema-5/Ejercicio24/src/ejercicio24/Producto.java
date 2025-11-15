/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Personal
 */
public class Producto {
    //Atributos
    private String fechaCaducidad;
    private String numeroLote;
    
    //Constructores
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    //Getters
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }
    
    //Setters
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    //Mostrar informacion producto
    public void mostrarProducto(){
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Numero de lote: " + numeroLote);
    }
    
}
