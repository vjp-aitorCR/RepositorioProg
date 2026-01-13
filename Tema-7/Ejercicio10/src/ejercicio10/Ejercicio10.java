/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Personal
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    //Metodo para llenar el vector con numeros aleatorios del 1 al 8
    public static void llenarVector(int[] vector){
       for(int i = 0; i < vector.length; i++){
           double aleatorio = Math.floor(Math.random() *8 + 1);
           vector[i] = (int) aleatorio;
       } 
    }
    //Metodo para mostrar el vector
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i] + " ");
        } 
    }
    //Metodo para sustituir los numeros repetidos por 0
    public static void sustituirRepetidosPorCero(int[] vector){
        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector.length; j++){
                if (vector[i] == vector[j]){
                    vector[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10];
        //Llenamos el vector y lo mostramos
        llenarVector(numeros);
        System.out.println("Se han generado los siguientes numeros:");
        mostrarVector(numeros);
        //Sustituir repetidos por 0 y mostrarlo
        sustituirRepetidosPorCero(numeros);
        System.err.println("Sustituimos los elementos repetidos por un 0:");
        mostrarVector(numeros);
    }
    
}
