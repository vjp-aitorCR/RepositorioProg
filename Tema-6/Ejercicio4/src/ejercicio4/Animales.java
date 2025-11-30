/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Personal
 */
public abstract class Animales {
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    //Constructores
    public Animales(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Metodos abstractos implementados por las subclases
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();
    //Metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " anhos");
        System.out.println("Peso: " + getPeso() + " kg");
    }
}
