/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Personal
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---Registro de alumnos---");
        
        //Crear alumnos
        Alumno alumno1 = Alumno.crearAlumno();
        Alumno alumno2 = Alumno.crearAlumno();
        Alumno alumno3 = Alumno.crearAlumno();
        
        //Mostrar
        System.out.println("---Resultados---");
        alumno1.mostrarAlumno();
        System.out.println();
        alumno2.mostrarAlumno();
        System.out.println();
        alumno3.mostrarAlumno();
        
    }
    
}
