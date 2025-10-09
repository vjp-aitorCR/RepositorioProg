/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int xyzw; //Variable para el numero de 4 cifras obtenido
    int x; //Variable para la 1º cifra
    int y; //Variable para la 2º cifra
    int z; //Variable para la 3º cifra
    int w; //Variable para la 4º cifra
   
    
    
        System.out.println("Introduzca un numero de 4 cifras:");
        xyzw = entrada.nextInt();
        //Descomponemos el numero en cifras
        x = xyzw / 1000; //Obtengo la 1º cifra dividiendo el numero entre 1000
        y = (xyzw / 100) % 10; //Obtengo la 2º cifra dividiendo el numero entre 100 y tomando el resto entre 10
        z = (xyzw / 10) % 10; //Obtengo la 3º cifra dividiendo el numero entre10 y tomando el resto entre 10
        w = xyzw % 10; //Obtengi la 4º cifra tomando el resto entre 10
        
        System.out.println("La primera cifra es: " + x);
        System.out.println("La segunda cifra es: " + y);
        System.out.println("La tercera cifra es: " + z);
        System.out.println("La cuarta cifra es: " + w);
        
        
        
        
        
        
        
    }
    
}
