/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13y14;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Ejercicio13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Crear objetos Alumno
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno("Pepe", 20, 6.5);
        //Cambiar descripcion usando setters
        a1.setNombre("Maria");
        a1.setEdad(19);
        a1.setNotaMedia(8);
        a1.mostrarInfo();
        a2.mostrarInfo();
        //Vector de 5 alumnos
        Alumno[] alumnos = new Alumno[5];

        int opcion;

        do {
            System.out.println("--MENU--");
            System.out.println("1. Rellenar un alumno");
            System.out.println("2. Mostrar vector de alumnos");
            System.out.println("3. Mostrar alumnos con nota media superior a una dada");
            System.out.println("4. Mostrar cuantos alumnos estan suspensos");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();//Limpiamos el buffer

            switch (opcion) {

                case 1:
                    //Rellenar un alumno en una posicion concreta
                    int pos;
                    boolean posicionValida;

                    do {
                        System.out.print("Introduce la posicion (0 a 4): ");
                        pos = entrada.nextInt();
                        entrada.nextLine();//Limpiamos el buffer

                        posicionValida = (pos >= 0 && pos < alumnos.length && alumnos[pos] == null);

                        if (!posicionValida) {
                            System.out.println("Posicion incorrecta o ya ocupada.");
                        }
                    } while (!posicionValida);

                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Edad: ");
                    int edad = entrada.nextInt();
                    

                    System.out.print("Nota media: ");
                    double nota = entrada.nextDouble();

                    alumnos[pos] = new Alumno(nombre, edad, nota);
                    System.out.println("Alumno introducido correctamente");
                    break;

                case 2:
                    //Mostrar alumnos del vector
                    System.out.println("--LISTA DE ALUMNOS--");
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null) {
                            alumnos[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    //Mostrar alumnos con nota superior a una dada
                    System.out.print("Introduce la nota minima: ");
                    double notaMin = entrada.nextDouble();

                    System.out.println("ALUMNOS CON NOTA SUPERIOR A " + notaMin);
                    for (Alumno a : alumnos) {
                        if (a != null && a.getNotaMedia() > notaMin) {
                            a.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    //Contar alumnos suspensos
                    int suspensos = 0;
                    for (Alumno a : alumnos) {
                        if (a != null && a.getNotaMedia() < 5) {
                            suspensos++;
                        }
                    }
                    System.out.println("Hay " + suspensos + " alumnos suspensos");
                    break;

                case 5:
                    //Buscar alumno por nombre
                    System.out.print("Introduce el nombre del alumno: ");
                    String nombreBuscado = entrada.nextLine();
                    boolean encontrado = false;

                    for (Alumno a : alumnos) {
                        if (a != null && a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("El alumno esta matriculado");
                    } else {
                        System.out.println("El alumno no esta matriculado");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no valida");
            }

        } while (opcion != 6);
    }
}