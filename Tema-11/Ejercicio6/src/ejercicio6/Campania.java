/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class Campania {
    //Atributos
    private String nombre;
    private Donacion[] donaciones;
    private int numDonaciones;
    private static final int CAPACIDAD_INICIAL = 10;
    //Constructores
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new Donacion[CAPACIDAD_INICIAL];
        this.numDonaciones = 0;
    }
    public Campania() {
        this.nombre = "";
        this.donaciones = new Donacion[CAPACIDAD_INICIAL];
        this.numDonaciones = 0;
    }
    //Getters y Setters
    public int getNumDonaciones() {
        return numDonaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public Donacion[] getDonaciones() {
        return donaciones;
    }
    public void setNumDonaciones(int numDonaciones) {
        this.numDonaciones = numDonaciones;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDonaciones(Donacion[] donaciones) {
        this.donaciones = donaciones;
    }
    //To String
    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones + ", numDonaciones=" + numDonaciones + '}';
    }
    //Metodo para añadir donación de manera ordenada
    public void anhadirDonacion(Donacion donacion){
        //Buscar la posición donde insertar
        int posicion = 0;
        while (posicion < numDonaciones && donaciones[posicion].getCantidad() > donacion.getCantidad()){
            posicion++;
        }
        //Desplazar elementos hacia la derecha
        for (int i = numDonaciones; i > posicion; i--){
            donaciones[i] = donaciones[i - 1];
        }
        //Insertar la nueva donación
        donaciones[posicion] = donacion;
        numDonaciones++;
    }
    //Mostrar todas las donaciones
    public void mostrarDonaciones(){
        if (numDonaciones == 0) {
            System.out.println("No hay donaciones registradas.");
        } 
        else{
            System.out.println("---DONACIONES DE LA CAMPANIA: " + nombre + "---");
            for (int i = 0; i < numDonaciones; i++){
                System.out.println((i + 1) + ". " + donaciones[i]);
            }
        }
    }
    //Mostrar donaciones por nombre de donante
    public void mostrarDonacionesPorNombre(String nombreBuscado){
        boolean encontrado = false;
        System.out.println("---DONACIONES DE " + nombreBuscado + "---");
        for (int i = 0; i < numDonaciones; i++){
            if (donaciones[i].getNombre().equalsIgnoreCase(nombreBuscado)){
                System.out.println(donaciones[i]);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron donaciones de " + nombreBuscado);
        }
    }
    //Mostrar nUmero de donaciones
    public void mostrarNumeroDonaciones(){
        System.out.println("Numero total de donaciones: " + numDonaciones);
    }
    //Mostrar total dinero recaudado
    public void mostrarTotalRecaudado(){
        double total = 0;
        for (int i = 0; i < numDonaciones; i++) {
            total += donaciones[i].getCantidad();
        }
        System.out.printf("Total dinero recaudado: %.2f euros", total);
    }
    //Las donaciones ya están ordenadas al insertarlas, pero mostramos el estado actual
    public void mostrarOrdenadas(){
        System.out.println("---DONACIONES ORDENADAS---");
        mostrarDonaciones();
    }
}

