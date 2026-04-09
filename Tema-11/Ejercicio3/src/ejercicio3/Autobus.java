/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.HashMap;

public class Autobus {
    //Atributos
    private String matricula;
    private HashMap<String, String> conductores;
    //Constructores
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    //Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    public void agregarConductor(String dni, String nombre) {
        conductores.put(dni, nombre);
    }
    
    public int getNumeroConductores() {
        return conductores.size();
    }
    //Mostrar Informacion
    public void mostrarInformacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Conductores asignados:");
        if (conductores.isEmpty()) {
            System.out.println("  Ningun conductor asignado");
        } else {
            for (HashMap.Entry<String, String> entry : conductores.entrySet()) {
                System.out.println("  DNI: " + entry.getKey() + " - Nombre: " + entry.getValue());
            }
        }
    }
}