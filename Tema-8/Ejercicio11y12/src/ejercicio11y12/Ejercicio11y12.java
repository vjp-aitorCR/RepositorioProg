/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Ejercicio11y12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        Mueble m1 = new Mueble(); 
        Mueble m2 = new Mueble(150, "Mesa de comedor"); 

        //Cambiar descripcion usando setters
        m1.setDescripcion("Silla de oficina");
        m1.setPrecio(80);
        //Mostrar informacion de los muebles
        m1.mostrarInfo();
        m2.mostrarInfo();
        //Crear vector de muebles
        Mueble[] muebles = new Mueble[4];

        int opcion;

        do {
            System.out.println("--MENU--");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    //Rellenar todos los muebles
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("MUEBLE " + (i + 1));

                        System.out.print("Precio: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();//Limpiar el buffer

                        System.out.print("Descripcion: ");
                        String descripcion = entrada.nextLine();

                        muebles[i] = new Mueble(precio, descripcion);
                    }
                    break;

                case 2:
                    //Mostrar todos los muebles
                    System.out.println("--LISTA DE MUEBLES--");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    //Mostrar muebles por precio
                    System.out.print("Introduce el precio maximo: ");
                    double precioMax = entrada.nextDouble();

                    System.out.println("MUEBLES CON PRECIO IGUAL O MENOR A " + precioMax);
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4);
    }
}
