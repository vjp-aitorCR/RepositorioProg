/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        double numero;  //Variable para el numero obtenido
        System.out.println("Por favor, introduzca un numero:");
        numero = entrada.nextDouble();
        
        if (numero > 0) {
        System.out.println("El numero introducido es positivo");    
        }
        else {
        System.out.println("El numero introducido es negativo");
        }
            
    }    
}
