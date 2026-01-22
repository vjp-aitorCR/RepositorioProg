/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author Personal
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10];

        llenarVector(numeros);

        mostrarVector(numeros);
        ordenarVector(numeros);
        mostrarVector(numeros);
        
    }
    //Metodo para crear el llenar el vector con numeros de 0 a 9
    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }
    //Metodo que muestra el vector
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    //Metodo que ordena el vector de mayor a menor
    public static void ordenarVector(int[] vector) {
        int auxiliar;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] < vector[j + 1]) {
                    auxiliar = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = auxiliar;
                }
            }
        }
    }
}

    

