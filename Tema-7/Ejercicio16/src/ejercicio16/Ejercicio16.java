/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Vectores de nombres de alumnos y asignaturas
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        //Matriz de notas
        double[][] notas = new double[alumnos.length][asignaturas.length];

        int opcion;
        //Menu de opciones
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Rellenar las notas");
            System.out.println("2. Mostrar las notas");
            System.out.println("3. Alumno con mejor nota media");
            System.out.println("4. Alumno con mas suspensos");
            System.out.println("5. Asignatura mas dificil");
            System.out.println("6. Salir del programa");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                //Rellanar las notas de los alumnos
                case 1:
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.print("Nota de " + asignaturas[j] + ": ");
                            notas[i][j] = entrada.nextDouble();
                        }
                        System.out.println("");
                    }
                    break;
                //Mostrar las notas de los alumnos
                case 2:
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.print(alumnos[i] + ": ");
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.print(asignaturas[j] + "=" + notas[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                //Mostrar el alumno con mejor nota media
                case 3:
                    double mejorMedia = 0;
                    String alumnoMasMedia = "";

                    for (int i = 0; i < alumnos.length; i++) {
                        double suma = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            suma += notas[i][j];
                        }
                        double media = suma / asignaturas.length;

                        if (media > mejorMedia) {
                            mejorMedia = media;
                            alumnoMasMedia = alumnos[i];
                        }
                    }
                    System.out.println("El alumno con mas media es " + alumnoMasMedia + " con media " + mejorMedia);
                    break;
                //Mostrar alumno con mas suspensos
                case 4:
                    int masSuspensos = 0;
                    String alumnoSuspensos = "";

                    for (int i = 0; i < alumnos.length; i++) {
                        int suspensos = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) {
                                suspensos++;
                            }
                        }
                        if (suspensos > masSuspensos) {
                            masSuspensos = suspensos;
                            alumnoSuspensos = alumnos[i];
                        }
                    }
                    System.out.println("El alumno con mas suspensos es " + alumnoSuspensos + " con " + masSuspensos + " suspensos");
                    break;
                //Mostrar asignatura mas dificil
                case 5:
                    double peorMedia = 10;
                    String asignaturaDificil = "";

                    for (int j = 0; j < asignaturas.length; j++) {
                        double suma = 0;
                        for (int i = 0; i < alumnos.length; i++) {
                            suma += notas[i][j];
                        }
                        double media = suma / alumnos.length;

                        if (media < peorMedia) {
                            peorMedia = media;
                            asignaturaDificil = asignaturas[j];
                        }
                    }
                    System.out.println("La asignatura mas dificil es " + asignaturaDificil + " con media de notas de " + peorMedia);
                    break;
             
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 6);

     
    }
}


    
