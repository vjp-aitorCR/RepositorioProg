/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;   //Variable para contar los numeros impares
        int i;
        
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son: ");
        
        
        for (i = 21; i <= 160; i += 2) {    //Empezamos en el 21 porque el 20 es par 
            System.out.print(i + " - ");
            contador++; //Incrementamos el contador en 1 por cada numero impreso
        }

        System.out.println("La cantidad de numeros impares impresos ha sido: " + contador);
    }
}


