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
    int xyzw;
    int x;
    int y;
    int z;
    int w;
   
    
    
        System.out.println("Introduzca un numero de 4 cifras:");
        xyzw = entrada.nextInt();
        x = xyzw / 1000;
        y = (xyzw / 100) % 10;
        z = (xyzw / 10) % 10;
        w = xyzw % 10;
        
        System.out.println("La primera cifra es: " + x);
        System.out.println("La segunda cifra es: " + y);
        System.out.println("La tercera cifra es: " + z);
        System.out.println("La cuarta cifra es: " + w);
        
        
        
        
        
        
        
    }
    
}
