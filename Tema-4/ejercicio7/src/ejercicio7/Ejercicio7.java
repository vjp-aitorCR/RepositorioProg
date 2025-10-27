/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7 {

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

        comparacion(numero1, numero2, numero3, numero4);
    }
    
     public static void comparacion(int a, int b, int c, int d){
        int e;

        //ComparO el numero 1 con todo los otros
        if (a > b) { e = a; a = b; b = e; 
        }
        if (a > c) { e = a; a = c; c = e; 
        }
        if (a > d) { e = a; a = d; d = e; 
        }
        //Comparo el numero 2 con los dos restantes  
        if (b > c) { e = b; b = c; c = e; 
        }
        if (b > d) { e = b; b = d; d = e; 
        }

        //Comparo el numero 3 y el 4 entre si
        if (c > d) { e = c; c = d; d = e; 
        }

        
        System.out.println("El orden de los numeros introducidos es el " + a + " - " + b + " - " + c + " - " + d);
    
    }
}
