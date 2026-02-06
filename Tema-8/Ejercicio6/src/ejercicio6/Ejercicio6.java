/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
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
        
        System.out.print("Cuantos empleados desea introducir? ");
        int numEmpleados = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        //Array de empleados
        Empleado[] empleados = new Empleado[numEmpleados];
        //Bucle para introducir los datos
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("- EMPLEADO " + (i + 1) + " -");

            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();

            System.out.print("Cuantas horas trabajo este mes? ");
            int horas = entrada.nextInt();

            System.out.print("Cual es su tarifa por hora de trabajo? ");
            double tarifa = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer
            //Creamos el objeto empleado y lo guardamos en el array
            empleados[i] = new Empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON EXITO");
        }

        System.out.println("SUELDO BRUTO DE LOS EMPLEADOS");
        for (Empleado e : empleados) {
            e.mostrarInformacion();
        }
    }
}
