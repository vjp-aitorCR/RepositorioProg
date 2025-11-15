/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Personal
 */
public class ProductoRefrigerado extends Producto {
    //Atributos
    private String codigoOrganismo;
    
    //Constructores
    public ProductoRefrigerado(String codigoOrganismo, String fechaCaducidad, String numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }
    
    //Getters
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }
    
    //Setters
    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    
    //Mostrar informacion completa
    public void mostrarProductoRefrigerado(){
        super.mostrarProducto();
        System.out.println("Codigo del organismo de supervision: " + codigoOrganismo);
        System.out.println();
    }
}
