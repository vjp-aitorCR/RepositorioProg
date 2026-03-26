/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;
import java.util.ArrayList;
/**
 *
 * @author Personal
 */
public class Empresa {
    //Atributos
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;
    // Constructores
    public Empresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }
    public Empresa(){
        this.nombreEmpresa = "";
        this.empleados = new ArrayList<>();
    }
    //Getters y Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    //To string
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados + '}';
    }
    //Metodo para añadir empleados
    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }
}