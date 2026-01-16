/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ventas = new int[12];
        //Vector para almacenar los nombres de los meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Rellenar ventas mensuales");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al reves");
            System.out.println("4. Mostrar suma total de ventas");
            System.out.println("5. Mostrar ventas de meses pares");
            System.out.println("6. Mostrar mes con mas ventas");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    rellenarVentas(ventas);
                    System.out.println("Ventas rellenadas correctamente.");
                    break;

                case 2:
                    mostrarVentas(ventas, meses);
                    break;

                case 3:
                    mostrarVentasReves(ventas, meses);
                    break;

                case 4:
                    System.out.println("Total de ventas: " + sumaVentas(ventas));
                    break;

                case 5:
                    mostrarVentasMesesPares(ventas, meses);
                    break;

                case 6:
                    mostrarMesMayorVenta(ventas, meses);
                    break;

                case 7:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
    }
    // 1. Rellenar vector con ventas aleatorias entre 10 y 100
    public static void rellenarVentas(int[] ventas){
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 91) + 10; //Numeros aleatorios entre 10 y 100
        }
    }
    // 2. Mostrar ventas
    public static void mostrarVentas(int[] ventas, String[] meses){
        System.out.println("Ventas mensuales:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    // 3. Mostrar ventas al revés
    public static void mostrarVentasReves(int[] ventas, String[] meses) {
        System.out.println("Ventas al reves:");
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    // 4. Suma total de ventas
    public static int sumaVentas(int[] ventas) {
        int suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        return suma;
    }
    // 5. Ventas de los meses pares
    public static void mostrarVentasMesesPares(int[] ventas, String[] meses) {
        System.out.println("Ventas de meses pares:");
        for (int i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    // 6. Mes con más ventas
    public static void mostrarMesMayorVenta(int[] ventas, String[] meses) {
        int mayor = ventas[0];
        int posicion = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                posicion = i;
            }
        }
        System.out.println("Mes con mas ventas: " + meses[posicion] +
                " (" + mayor + " ventas)");
    }
}
