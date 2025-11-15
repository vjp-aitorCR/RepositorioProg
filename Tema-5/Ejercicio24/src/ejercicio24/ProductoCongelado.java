/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Personal
 */
public class ProductoCongelado extends Producto {
    //Atributos
    private String temperaturaRecomendada;
    
    //Constructores
    public ProductoCongelado(String temperaturaRecomendada, String fechaCaducidad, String numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Getters
    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }
    
    //Setters
    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Mostrar informacion completa
    public void mostrarProductoCongelado(){
        super.mostrarProducto();
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada + " grados");
        System.out.println();
    }
}
