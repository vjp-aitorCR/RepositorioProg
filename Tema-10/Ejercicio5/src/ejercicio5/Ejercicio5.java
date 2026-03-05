/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();

        rellenarLista(lista);
        mostrarLista(lista, "Lista original:");

        int posMayorPar = buscarMayorPar(lista);
        int posMenorImpar = buscarMenorImpar(lista);

        if (posMayorPar == -1 || posMenorImpar == -1){
            System.out.println("No se puede realizar el intercambio (faltan pares o impares).");
        } 
        else{
            System.out.println("Mayor par: " + lista.get(posMayorPar));
            System.out.println("Menor impar: " + lista.get(posMenorImpar));

            intercambiar(lista, posMayorPar, posMenorImpar);
            mostrarLista(lista, "Lista modificada:");
        }
    }

    //Metodo para rellenar la lista
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Introduce numeros enteros (negativo para terminar):");

        do {
            num = entrada.nextInt();
            if (num >= 0) {
                lista.add(num);
            }
        } while (num >= 0);
    }

    //Metodo para mostrar la lista
    public static void mostrarLista(ArrayList<Integer> lista, String mensaje){
        System.out.println(mensaje + " " + lista);
    }

    //Devuelve la posición del numero par que es mayor
    public static int buscarMayorPar(ArrayList<Integer> lista){
        int pos = -1;
        int mayorPar = Integer.MIN_VALUE;

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i) % 2 == 0 && lista.get(i) > mayorPar){
                mayorPar = lista.get(i);
                pos = i;
            }
        }
        return pos;
    }

    //Devuelve la posicion del numero impar que es menor
    public static int buscarMenorImpar(ArrayList<Integer> lista){
        int pos = -1;
        int menorImpar = Integer.MAX_VALUE;

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i) % 2 != 0 && lista.get(i) < menorImpar) {
                menorImpar = lista.get(i);
                pos = i;
            }
        }
        return pos;
    }

    //Metodo para intercambiar dos posiciones
    public static void intercambiar(ArrayList<Integer> lista, int i, int j){
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }
}