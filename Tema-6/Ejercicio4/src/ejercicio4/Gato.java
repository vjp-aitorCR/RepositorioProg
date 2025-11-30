/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Personal
 */
public class Gato extends Felino{
    public Gato(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    @Override
    public void mostrarSonido(){
        System.out.println("Sonido: Maullido");
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Alimentacion: Ratones");
    }
    @Override
    public void mostrarHabitat(){
        System.out.println("Habitat: Domestico");
    }
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Nombre cientifico: Felis silvestris catus");
    }
}
