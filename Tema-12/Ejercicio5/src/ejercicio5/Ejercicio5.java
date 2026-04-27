/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("---MENU---");
            System.out.println("1. Anhadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("Elige opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpiar buffer
            
            switch (opcion){
                //Añadir contactos al fichero
                case 1:
                    try{
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Edad: ");
                        String edad = entrada.nextLine();
                        System.out.print("Telefono: ");
                        String telefono = entrada.nextLine();
                        
                        FileWriter fw = new FileWriter("agenda.txt", true);
                        PrintWriter pw = new PrintWriter(fw);
                        pw.write(nombre + " - " + edad + " anhos - " + telefono);
                        pw.println();
                        pw.close();
                        System.out.println("Contacto guardado!");
                    } catch (IOException e) {
                        System.out.println("Error al guardar: " + e.getMessage());
                    }
                    break;
                    
                case 2:
                    //Leer el fichero y mostrarlo en consola
                    try {
                        FileReader fr = new FileReader("agenda.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String linea;
                        System.out.println("---CONTACTOS---");
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                        br.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("No hay contactos aún. El archivo no existe.");
                    } catch (IOException e) {
                        System.out.println("Error al leer: " + e.getMessage());
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