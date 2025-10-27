/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero(); // Llamamos al método que pide un número al usuario
        mostrarMultiplosDeTres(numero); // Llamamos al método que muestra los múltiplos de 3 hasta ese número
    }

    // Metodo para pedir un numero al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            num = entrada.nextInt();
            if (!esMayorQueCero(num)) {
                System.out.println("Error: El numero debe ser mayor que 0. Intentalo de nuevo.");
            }
        } while (!esMayorQueCero(num));
        return num;
    }

    // Metodo para comprobar que el numero es mayor que 0
    public static boolean esMayorQueCero(int n) {
        return n > 0;
    }

    // Método para mostrar los multiplos de 3 y contarlos
    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;
        int i;
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");

        for (i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("Total de multiplos de 3 encontrados entre 1 y " + numero + " es: " + contador);
    }
}