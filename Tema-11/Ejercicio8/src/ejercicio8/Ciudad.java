/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author alumno
 */
public class Ciudad {
    //Atributos
    private String nombre;
    private Set<Sede> sedes;
    //Constructores
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<>();
    }
    public Ciudad() {
        this.nombre = "";
        this.sedes = new HashSet<>();
    }    
    //Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    
    public String getNombre() { 
        return nombre; 
    }
    
    public Set<Sede> getSedes() { 
        return sedes; 
    }
    //Añade una sede a la ciudad
    public void añadirSede(Sede sede){
        if (sedes.add(sede)){
            System.out.println("Sede anhadida a " + nombre);
        } 
        else{
            System.out.println("La sede ya existe en " + nombre);
        }
    }
    //Buscamos si existe una sede por nombre 
    public boolean existeSede(String nombreSede){
        for (Sede sede : sedes){
            if (sede.getNombre().equalsIgnoreCase(nombreSede)){
                return true;
            }
        }
        return false;
    }
    
    //Busca y devuelve una sede
    public Sede buscarSede(String nombreSede){
        for (Sede sede : sedes){
            if (sede.getNombre().equalsIgnoreCase(nombreSede)){
                return sede;
            }
        }
        return null;
    }
    
    //Calcula la media de ingresos de la ciudad
    public double getMediaIngresos(){
        if (sedes.isEmpty()) return 0;
        double total = 0;
        for (Sede sede : sedes){
            total += sede.getIngresosAnuales();
        }
        return total / sedes.size();
    }
    //To String
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
    
}