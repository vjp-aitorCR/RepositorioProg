/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author Personal
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombreFichero = "";
        
        do {
            System.out.println("---MENU---");
            System.out.println("1. Volcar numeros pares a fichero");
            System.out.println("2. Mostrar contenido del fichero");
            System.out.println("3. Salir");
            System.out.print("Elige opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpiar buffer
            
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Nombre del fichero: ");
                        nombreFichero = entrada.nextLine();
                        
                        //Crear array con los 100 primeros números pares
                        int[] pares = new int[100];
                        for (int i = 0; i < 100; i++) {
                            pares[i] = (i + 1) * 2; 
                        }
                        //Guardar en el fichero
                        FileWriter fw = new FileWriter(nombreFichero);
                        PrintWriter pw = new PrintWriter(fw);
                        for (int i = 0; i < pares.length; i++) {
                            pw.write("Numero " + (i + 1) + ": " + pares[i]);
                            pw.println();
                        }
                        pw.close();
                        System.out.println("Fichero " + nombreFichero + " creado con los 100 numeros pares!");
                        
                    } catch (IOException e) {
                        System.out.println("Error al crear el fichero: " + e.getMessage());
                    }
                    break;
                    
                case 2:
                    //Leer el fichero
                    if (nombreFichero.isEmpty()) {
                        System.out.println("Primero debes crear el fichero (opcion 1)");
                    } else {
                        try {
                            FileReader fr = new FileReader(nombreFichero);
                            BufferedReader br = new BufferedReader(fr);
                            String linea;
                            
                            System.out.println("---CONTENIDO DEL FICHERO---");
                            while ((linea = br.readLine()) != null) {
                                System.out.println(linea);
                            }
                            
                            br.close();
                            
                        } catch (FileNotFoundException e) {
                            System.out.println("No se encuentra el fichero: " + nombreFichero);
                        } catch (IOException e) {
                            System.out.println("Error al leer el fichero: " + e.getMessage());
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
    }
}