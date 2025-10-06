/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int nota;
        System.out.println("Introduzca tu nota:");
        nota = entrada.nextInt();
        
  if (nota >= 0 && nota <= 4) {
    System.out.println("Suspenso");
} 
  else if (nota >= 5 && nota <= 6) {
    System.out.println("Bien");
} 
  else if (nota >= 7 && nota <= 8) {
    System.out.println("Notable");
} 
  else if (nota >= 9 && nota <= 10) {
    System.out.println("Sobresaliente");
} 
  else {
    System.out.println("Nota no válida");
}
}
}
