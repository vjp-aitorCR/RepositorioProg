/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Personal
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Direcciones
        Direccion dir1 = new Direccion("Calle de Velazquez", 18, 4, "Plasencia");
        Direccion dir2 = new Direccion("Calle Bravo Murillo", 24, 2, "Plasencia");
        
        //Empleados
        Empleado emp1 = new Empleado("Felipe Dominguez", 2100, dir1);
        Empleado emp2 = new Empleado("Jose Suarez", 1800, dir2);
        
        //Mostrar
        System.out.println("Empleado 1:");
        emp1.mostrarEmpleado();
        
        System.out.println();
        
        System.out.println("Empleado 2:");
        emp2.mostrarEmpleado();
        
    }
    
}
