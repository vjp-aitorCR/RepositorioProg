/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Personal
 */
public class Direccion {
    //Atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //Constructores
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //Getters
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    //Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //Mostrar direccion
    public void mostrarDireccion(){
        System.out.println("  Calle: " + calle);
        System.out.println("  Numero: " + numero);
        System.out.println("  Piso: " + piso);
        System.out.println("  Ciudad: " + ciudad);
        
    }
    
          
    
}
