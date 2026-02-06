/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Personal
 */
public class Empleado {
    //Atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    //Constructores
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    //To string
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + '}';
    }
    //Metodo para calcular el sueldo
    public double calcularSueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } 
        else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }
    //Metodo para mostrar la informacion
    public void mostrarInformacion() {
        System.out.println(nombre + " trabajo " + horasTrabajadas + " horas, cobra " + tarifaHora + " euros la hora por lo que le corresponde un sueldo de " + calcularSueldoBruto() + " euros."
        );
    }
}
