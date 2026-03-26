/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;
import java.util.Arrays;

/**
 *
 * @author Personal
 */
public class Alumno {
    //Atributos
    private String nombre;
    private Asignatura[] asignaturas;
    //Constructores
    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    public Alumno() {
        this.nombre = "";
        this.asignaturas = asignaturas;
    }   
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    //To string
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + Arrays.toString(asignaturas) + '}';
    }
    
    //Calcular la media
    public float media() {
        float suma = 0;

        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }

        return suma / asignaturas.length;
    }
}