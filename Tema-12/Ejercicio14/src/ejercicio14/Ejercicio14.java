/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Personal
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            String nombre = "";
            String sexo = "";
            int edad = 0;
            int suspensos = 0;
            String residencia = "";
            double ingresos = 0;

            System.out.println("----SOLICITANTES CON BECA----");

            while ((linea = br.readLine()) != null) {
                //Leer los datos de cada becario
                if (linea.startsWith("Nombre: ")) {
                    nombre = linea.substring(8);
                } else if (linea.startsWith("Sexo: ")) {
                    sexo = linea.substring(6);
                } else if (linea.startsWith("Edad: ")) {
                    edad = Integer.parseInt(linea.substring(6));
                } else if (linea.startsWith("Suspensos: ")) {
                    suspensos = Integer.parseInt(linea.substring(11));
                } else if (linea.startsWith("Residencia familiar: ")) {
                    residencia = linea.substring(21);
                } else if (linea.startsWith("Ingresos anuales: ")) {
                    //Extraer el número
                    ingresos = Double.parseDouble(linea.substring(18));
                } else if (linea.equals("----------------------------")) {
                    // Calcular beca para este becario
                    double beca = calcularBeca(edad, suspensos, residencia, ingresos);

                    if (beca > 0) {
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Cuantía total: " + beca + " euros");
                        System.out.println("----------------------------");
                    }
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra el archivo 'DatosBeca.txt'");
            System.out.println("Primero debes registrar becarios con el programa anterior.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de los datos: " + e.getMessage());
        }
    }

    //Metodo para calcular la beca
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {
        double beca = 1500.0;
        //Regla: Si hay 2 suspensos o más, no hay beca
        if (suspensos >= 2) {
            return 0;
        }
        //Complemento por ingresos 
        if (ingresos <= 12000) {
            beca += 500;
        }
        //Gratificación por edad 
        if (edad < 23) {
            beca += 200;
        }
        //Gratificación por suspensos
        if (suspensos == 0) {
            beca += 500;
        } else if (suspensos == 1) {
            beca += 200;
        }
        //Gratificación por residencia
        if (residencia.equals("NO")) {
            beca += 1000;
        }

        return beca;
    }
}
