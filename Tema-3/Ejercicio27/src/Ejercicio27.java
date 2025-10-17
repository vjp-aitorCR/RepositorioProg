/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1; 
        double num2; 
        int opcion=0; 
        
        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextDouble();
            
        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextDouble();

        do {
            // Mostrar menú
            System.out.println("===== MENU =====");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opcion: ");

            try {
                opcion = entrada.nextInt();
            } catch (ArithmeticException e) {
                entrada.next(); // Limpiar el buffer
                continue;
            }
            
            switch (opcion) {  //Estructura condicional de opciones
                case 1:
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicacion: " + (num1 * num2));
                    break;
                case 4:
                    try {
                        if (num2 == 0) { //Un numero entre cero no se puede dividir
                            throw new ArithmeticException("No se puede dividir entre cero.");
                        }
                        System.out.println("Resultado de la division: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 5);
        
    }
}


