/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9Tema3 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        System.out.print("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero:");
        numero2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero:");
        numero3 = entrada.nextInt();

        System.out.print("Por ultimo, introduzca un cuarto numero:");
        numero4 = entrada.nextInt();

       
        int x; // variable para intercambiar

        //ComparO el numero 1 con todo los otros
        if (numero1 > numero2) { x = numero1; numero1 = numero2; numero2 = x; 
        }
        if (numero1 > numero3) { x = numero1; numero1 = numero3; numero3 = x; 
        }
        if (numero1 > numero4) { x = numero1; numero1 = numero4; numero4 = x; 
        }
        //Comparo el numero 2 con los dos restantes  
        if (numero2 > numero3) { x = numero2; numero2 = numero3; numero3 = x; 
        }
        if (numero2 > numero4) { x = numero2; numero2 = numero4; numero4 = x; 
        }

        //Comparo el numero 3 y el 4 entre si
        if (numero3 > numero4) { x = numero3; numero3 = numero4; numero4 = x; 
        }

        
        System.out.println("El orden de los numeros introducidos es el " + numero1 + " - " + numero2 + " - " + numero3 + " - " + numero4);
    
    }
}