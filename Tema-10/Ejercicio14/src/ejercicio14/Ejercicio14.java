/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.ArrayList;
import java.util.Scanner;
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
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>(); //Creamos la lista


        int opcion;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Introducir alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Asignatura mas dificil");
            System.out.println("5. Salir");
            System.out.println("Introduzca una opcion:");
            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpiar buffer
            
        switch (opcion) {
            case 1:
                introducirAlumno(alumnos);
                break;

                case 2:
                    mostrarAlumnos(alumnos);
                    break;

                case 3:
                    mejorAlumno(alumnos);
                    break;

                case 4:
                    asignaturaMasDificil(alumnos);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 5);
    }

    //Caso 1: Introducir un alumno con sus 3 asignaturas
    public static void introducirAlumno(ArrayList<Alumno> alumnos){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre del alumno:");
        String nombre = entrada.nextLine();
        //Cteamos el array con el nombre de las asignaturas
        Asignatura[] asignaturas = new Asignatura[3];
        String[] nombres = {"Lengua", "Mates", "Fisica"};
        //Rellenamos los alumnos
        for (int i = 0; i < 3; i++){
            System.out.println("Nota de " + nombres[i] + ":");
            float nota = entrada.nextFloat();
            //Creamos el objeto asignaturas
            asignaturas[i] = new Asignatura(nombres[i], nota);
        }
        //Creamos el objeto alumno y lo añadimos
        Alumno alumno = new Alumno(nombre, asignaturas);
        alumnos.add(alumno);
    }
    //Caso 2: Mostrar todos los alumnos y sus notas
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos){
        //Recorremos los alumnos
        for (Alumno a : alumnos){
            System.out.println("Alumno: " + a.getNombre());
            //Recorremos sus asignaturas
            for (Asignatura as : a.getAsignaturas()){
                System.out.println(as.getNombre() + ": " + as.getNota());
            }
            System.out.println("");
        }
    }
    //Caso 3: Mostrar el alumno con mejor media
    public static void mejorAlumno(ArrayList<Alumno> alumnos){
        Alumno mejor = null;
        float mejorMedia = -1;
        //Recorremos los alumnos
        for (Alumno a : alumnos){
            //Si su media es mayor que la actual, lo guardamos
            if (a.media() > mejorMedia){
                mejorMedia = a.media();
                mejor = a;
            }
        }
        //Mostramos la mejor media
        if (mejor != null){
            System.out.println("El alumno " + mejor.getNombre() + " tiene la mejor media con una nota de: " + mejorMedia);
        }
    }

    //Caso 4: Calcular la asignatura con mas suspensos
    public static void asignaturaMasDificil(ArrayList<Alumno> alumnos){
        int suspensosLengua = 0;
        int suspensosMates = 0;
        int suspensosFisica = 0;
        //Recorremos los alumnos
        for (Alumno a : alumnos){
            Asignatura[] as = a.getAsignaturas();
            //Contamos suspensos 
            if (as[0].getNota() < 5) suspensosLengua++;
            if (as[1].getNota() < 5) suspensosMates++;
            if (as[2].getNota() < 5) suspensosFisica++;
        }
        //Comprobamos cual tiene mas suspensos
        int max = suspensosLengua;
        String dificil = "Lengua";
        if (suspensosMates > max){
            max = suspensosMates;
            dificil = "Mates";
        }
        if (suspensosFisica > max){
            dificil = "Fisica";
        }
        //Mostramos el resultado
        System.out.println("Asignatura mas dificil: " + dificil);
    }
}