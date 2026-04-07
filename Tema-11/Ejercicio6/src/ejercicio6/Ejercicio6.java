/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la campania: ");
        String nombreCampania = entrada.nextLine();
        Campania campania = new Campania(nombreCampania);
        int opcion;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();//Limpiar buffer
            switch (opcion) {
                case 1:
                    anadirDonacion(campania);
                    break;
                case 2:
                    campania.mostrarDonaciones();
                    break;
                case 3:
                    buscarPorNombre(campania);
                    break;
                case 4:
                    campania.mostrarNumeroDonaciones();
                    break;
                case 5:
                    campania.mostrarTotalRecaudado();
                    break;
                case 6:
                    campania.mostrarOrdenadas();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
            System.out.println();
        } while (opcion != 7);
    }
    public static void mostrarMenu() {
        System.out.println("----MENU DE GESTION DE DONACIONES----");
        System.out.println("1. Anhadir donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Mostrar donaciones por nombre de donante");
        System.out.println("4. Mostrar numero de donaciones");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir");
        System.out.println("Introduce una opcion:");
    }
    public static void anadirDonacion(Campania campania){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Cantidad donada (Euros): ");
        double cantidad = entrada.nextDouble();
        entrada.nextLine();//Limpiar buffer
        
        Donacion donacion = new Donacion(nombre, cantidad);
        campania.anhadirDonacion(donacion);
        System.out.println("Donacion anhadida correctamente!");
    }
    public static void buscarPorNombre(Campania campania){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del donante a buscar: ");
        String nombre = entrada.nextLine();
        campania.mostrarDonacionesPorNombre(nombre);
    }
}
