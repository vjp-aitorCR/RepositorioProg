/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Personal
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String continuar;

        do {
            //Añadir los datos
            System.out.println("---REGISTRO DE BECARIOS---");
            System.out.print("Nombre y apellido: ");
            String nombreApellido = entrada.nextLine();
            String sexo;
            do {
                System.out.print("Sexo (H/M): ");
                sexo = entrada.nextLine().toUpperCase();
                if (!sexo.equals("H") && !sexo.equals("M")) {
                    System.out.println("Error: Solo H o M");
                }
            } while (!sexo.equals("H") && !sexo.equals("M"));
            int edad;
            do {
                System.out.print("Edad (20-60): ");
                edad = entrada.nextInt();
                if (edad < 20 || edad > 60) {
                    System.out.println("Error: Edad entre 20 y 60");
                }
            } while (edad < 20 || edad > 60);
            int suspensos;
            do {
                System.out.print("Numero de suspensos (0-4): ");
                suspensos = entrada.nextInt();
                if (suspensos < 0 || suspensos > 4) {
                    System.out.println("Error: Suspensos entre 0 y 4");
                }
            } while (suspensos < 0 || suspensos > 4);
            entrada.nextLine(); //Limpiar buffer
            String residencia;
            do {
                System.out.print("Residencia familiar (SI/NO): ");
                residencia = entrada.nextLine().toUpperCase();
                if (!residencia.equals("SI") && !residencia.equals("NO")) {
                    System.out.println("Error: Solo SI o NO");
                }
            } while (!residencia.equals("SI") && !residencia.equals("NO"));
            System.out.print("Ingresos anuales de la familia: ");
            double ingresos = entrada.nextDouble();
            //Guardar en el fichero 
            try {
                FileWriter fw = new FileWriter("DatosBeca.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.write("Nombre: " + nombreApellido);
                pw.println();
                pw.write("Sexo: " + sexo);
                pw.println();
                pw.write("Edad: " + edad);
                pw.println();
                pw.write("Suspensos: " + suspensos);
                pw.println();
                pw.write("Residencia familiar: " + residencia);
                pw.println();
                pw.write("Ingresos anuales: " + ingresos + " euros");
                pw.println();
                pw.write("----------------------------");
                pw.println();

                pw.close();
                System.out.println("Becario registrado correctamente!");

            } catch (IOException e) {
                System.out.println("Error al guardar: " + e.getMessage());
            }
            //Preguntar si quiere añadir otro becario
            entrada.nextLine(); //Limpiar buffer
            System.out.print("Quieres anhadir otro becario? (S/N): ");
            continuar = entrada.nextLine().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("Programa finalizado!");
    }
}