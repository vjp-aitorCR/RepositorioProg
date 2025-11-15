/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Personal
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear productos
        ProductoFresco pf = new ProductoFresco("05-04-2025", "Portugal", "02-05-2025", "F214");
        ProductoRefrigerado pr = new ProductoRefrigerado("ORG-0054", "25-08-2025", "L542");
        ProductoCongelado pc = new ProductoCongelado("-18", "25-12-2027", "H254");
        
        //Mostrar informacion
        System.out.println("--Producto Fresco--");
        pf.mostrarProductoFresco();
        
        System.out.println("--Producto Refrigerado--");
        pr.mostrarProductoRefrigerado();
        
        System.out.println("--Producto Congelado--");
        pc.mostrarProductoCongelado();
        
        
        
    }
    
}
