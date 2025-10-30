/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    //Programa para generar letra aleatoria
    public static char generaletraaleatoria(){
        return (char) (Math.random() * (122 - 97 + 1) + 97);
    }
    //Programa para leer la letra del usuario
    public static char leerletrausuario(Scanner entrada){
        System.out.println("Introduce una letra:");
        return entrada.nextLine().charAt(0);
    }
    //Programa del juego
    public static void juego(){
        Scanner entrada = new Scanner(System.in);
        char letraaleatoria = generaletraaleatoria();
        char intento;
        int intentos = 0;
        
        System.out.println("ADIVINA LA LETRA");
        
        do{
            intento = leerletrausuario(entrada);
            intentos++;
            
            if (intento < letraaleatoria){
                System.out.println("La letra esta por detras en el abecedario.");
            }
            else if (intento > letraaleatoria){
                System.out.println("La letra esta por delante en el abecedario");
            }
            else{
                System.out.println("BIEN La letra era '" + letraaleatoria + "'.");
                System.out.println("Has tardado " + intentos + " intentos en adivinarlo.");
            }
        }
        while (intento != letraaleatoria);
    }  
    public static void main(String[] args) {
        // TODO code application logic here
        juego();
    }
    
}
