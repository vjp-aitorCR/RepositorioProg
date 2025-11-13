/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Personal
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--Calculo del sueldo de los empleados--");
        
        //Solicitar datos
        Empleado emp1 = Empleado.crearEmpleado();
        Empleado emp2 = Empleado.crearEmpleado();
        
        //Mostrar resultados
        System.out.println("--Resultados--");
        emp1.mostrarEmpleado();
        System.out.println();
        emp2.mostrarEmpleado();
    }
    
}
