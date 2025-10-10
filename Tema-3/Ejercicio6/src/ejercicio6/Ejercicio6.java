/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int nota;   //Variable para la nota obtenida
        System.out.println("Introduzca tu nota:");
        nota = entrada.nextInt();
        
    if (nota >= 0 && nota <= 4) { 
    //Para nota entre 0 y 4
    System.out.println("Suspenso");
} 
    else if (nota >= 5 && nota <= 6) {
    //Para nota entre 5 y 6
    System.out.println("Bien");
} 
    else if (nota >= 7 && nota <= 8) {
    //Para nota entre 7 y 8
    System.out.println("Notable");
} 
    else if (nota >= 9 && nota <= 10) {
    //Para nota entre 9 y 10
    System.out.println("Sobresaliente");
} 
    else {
    //Para nota menor a 0 o mayor a 10
    System.out.println("Nota no válida");
}
}
}