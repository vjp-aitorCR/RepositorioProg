/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author Personal
 */
public class Asignatura {
    //Atributos
    private String nombre;
    private float nota;
    //Constructores
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    //To String
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}