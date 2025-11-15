/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Personal
 */
public class ProductoFresco extends Producto {
    //Atributos
    private String fechaEnvasado;
    private String paisOrigen;
    
    //Constructores
    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, String numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    //Getters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    //Setters
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //Mostrar informacion completa
    public void mostrarProductoFresco(){
        super.mostrarProducto();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
        System.out.println();
    }
    
}
