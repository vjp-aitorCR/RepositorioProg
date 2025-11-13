/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Alumno {
    //Atributos
    private String nombre;
    private int nota;
    
    //Constructores
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        if(nota < 0 && nota > 10){
            System.out.println("Error, la nota debe estar entre 0 y 10");
            this.nota = -1;
        }
        else{
            this.nota = nota;   
    }
    }
    
    //Metodo para nombre de la nota
    public String getCalificacion(){
        if (nota >= 0 && nota <= 4){
            return "Suspenso";
        } 
        else if (nota >= 5 && nota <= 6){
            return "Bien";
        } 
        else if (nota >= 7 && nota <= 8){
            return "Notable";
        } 
        else if (nota >= 9 && nota <= 10){
            return "Sobresaliente";
        } 
        else{
            return "Nota no valida";
        }
    }
    
    //Mostrar alumno
    public void mostrarAlumno(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificacion: " + getCalificacion());
    }
    //Metodo para pedir la informacion
    public static Alumno crearAlumno(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del alumno:");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce la nota del alumno:");
        int nota = entrada.nextInt();
        
        return new Alumno(nombre, nota);
    }
        
        
        
    }
    

