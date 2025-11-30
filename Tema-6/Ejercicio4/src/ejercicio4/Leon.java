/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Personal
 */
public class Leon extends Felino{
    public Leon(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    @Override
    public void mostrarSonido(){
        System.out.println("Sonido: Rugido");
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Alimentacion: Carnivora");
    }
    @Override
    public void mostrarHabitat(){
        System.out.println("Habitat: Sabana");
    }
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Nombre cientifico: Panthera leo");
    }
}
