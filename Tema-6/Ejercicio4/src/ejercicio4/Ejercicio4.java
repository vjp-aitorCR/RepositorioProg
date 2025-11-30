/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        System.out.println("--Instancias directas--");
        //Datos
        Perro perro = new Perro("Firulais", 3, 15.3);
        Lobo lobo = new Lobo("Luca", 8, 40);
        Leon leon = new Leon("Simba", 9, 190);
        Gato gato = new Gato("Garfield", 3, 4);
        //Mostrar datos
        mostrarInfo(perro);
        mostrarInfo(lobo);
        mostrarInfo(leon);
        mostrarInfo(gato);

        System.out.println("--Polimorfismo--");
        //Datos
        Animales a1 = new Perro("Golfo", 8, 9.8);
        Animales a2 = new Lobo("Alfa", 5, 35);
        Animales a3 = new Leon("Mufasa", 13, 200);
        Animales a4 = new Gato("Tom", 6, 5.5);
        //Mostrar datos
        mostrarInfo(a1);
        mostrarInfo(a2);
        mostrarInfo(a3);
        mostrarInfo(a4);
    }
    
    public static void mostrarInfo(Animales animal) {
        animal.mostrarDatos();
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
        System.out.println("");

    }
}
