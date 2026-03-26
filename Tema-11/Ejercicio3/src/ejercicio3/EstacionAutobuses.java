/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EstacionAutobuses {
    //Atributos
    private Autobus[] aparcamientos = new Autobus[6]; 
    //Constructores
    public EstacionAutobuses() {
    }
    //Getters y Setters
    public Autobus[] getAparcamientos() {
        return aparcamientos;
    }

    public void setAparcamientos(Autobus[] aparcamientos) {
        this.aparcamientos = aparcamientos;
    }
    //To String
    @Override
    public String toString() {
        return "EstacionAutobuses{" + "aparcamientos=" + Arrays.toString(aparcamientos) + '}';
    }
    //Menu
    public void mostrarMenu(){
        System.out.println("---MENU---");
        System.out.println("1. Aparcar autobus");
        System.out.println("2. Mostrar darsenas libres");
        System.out.println("3. Buscar autobus por matricula");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Mostrar autobus con mas conductores");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    //Opcion 1: aparcar autobus
    public void aparcarAutobus(){
        Scanner entrada = new Scanner(System.in);
        int posicion;
        //Bucle hasta encontrar una posicion valida y libre
        do {  
            System.out.print("Introduzca la posición (0-5) donde aparcar: ");
            posicion = entrada.nextInt();
            entrada.nextLine();  //Limpiar el buffer
            if (posicion < 0 || posicion >= 6){
                System.out.println("Posicion invalida. Debe ser entre 0 y 5.");
            } else if (aparcamientos[posicion] != null){
                System.out.println("La darsena " + posicion + " esta ocupada. Elija otra.");
            } else{
                break;
            }
        } while (true);
        System.out.print("Introduzca la matricula del autobus: ");
        String matricula = entrada.nextLine();
        //Creamos el nuevo autobus
        Autobus nuevoAutobus = new Autobus(matricula); 
        System.out.print("Cuantos conductores desea asignar? ");
        int numConductores = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer
        //Bucle para añadir cada conductor
        for (int i = 0; i < numConductores; i++){  
            System.out.println("--- Conductor " + (i + 1) + " ---");
            System.out.print("DNI del conductor: ");
            String dni = entrada.nextLine();
            System.out.print("Nombre del conductor: ");
            String nombre = entrada.nextLine();
            nuevoAutobus.agregarConductor(dni, nombre);
        }
        //Aparcamos el autobus en la posicion
        aparcamientos[posicion] = nuevoAutobus; 
        System.out.println("Autobus aparcado en la darsena " + posicion);
    }
    //Opcion 2: mostrar darsenas libres
    public void mostrarDarsenasLibres(){
        System.out.println("---DARSENAS LIBRES---");
        boolean hayLibres = false;
        for (int i = 0; i < aparcamientos.length; i++){  
            if (aparcamientos[i] == null){  
                System.out.println("Darsena " + i + ": LIBRE");
                hayLibres = true;
            }
        }
        if (!hayLibres) {
            System.out.println("No hay darsenas libres. Todas estan ocupadas.");
        }
    }
    //Opcion 3: buscar autobus por matricula
    public void buscarAutobus(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la matricula del autobus a buscar: ");
        String matricula = entrada.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < aparcamientos.length; i++){ 
            if (aparcamientos[i] != null && aparcamientos[i].getMatricula().equalsIgnoreCase(matricula)){
                System.out.println("---AUTOBUS ENCONTRADO---");
                System.out.println("Posición en la estación: " + i);
                aparcamientos[i].mostrarInformacion();  
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun autobus con matricula: " + matricula);
        }
    }
    
    //Opción 4: buscar conductores
    public void buscarConductor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el DNI del conductor a buscar: ");
        String dni = entrada.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < aparcamientos.length; i++){ 
            if (aparcamientos[i] != null){
                HashMap<String, String> conductores = aparcamientos[i].getConductores();
                if (conductores.containsKey(dni)){
                    System.out.println("---CONDUCTOR ENCONTRADO---");
                    System.out.println("DNI: " + dni);
                    System.out.println("Nombre: " + conductores.get(dni));
                    System.out.println("Esta asignado al autobus con matricula: " + aparcamientos[i].getMatricula());
                    System.out.println("Ubicado en la darsena: " + i);
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun conductor con DNI: " + dni);
        }
    }
    //Opción 5: mostrar autobus con mas conductores
    public void mostrarPosicionMasConductores(){
        int posicionMax = -1;  
        int maxConductores = -1;  
        //Recorremos todos los autobuses
        for (int i = 0; i < aparcamientos.length; i++){  
            if (aparcamientos[i] != null){
                int numConductores = aparcamientos[i].getNumeroConductores();
                if (numConductores > maxConductores){  
                    maxConductores = numConductores;
                    posicionMax = i;
                }
            }
        }
        //Si no hay autobuses
        if (posicionMax == -1){  
            System.out.println("No hay autobuses aparcados en la estacion.");
        } 
        else{
            System.out.println("---AUTOBUS CON MAS CONDUCTORES---");
            System.out.println("Posicion en la estacion: " + posicionMax);
            System.out.println("Numero de conductores: " + maxConductores);
            aparcamientos[posicionMax].mostrarInformacion();
        }
    }
    
    //Método que ejecuta el menu y procesa las opciones
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();//Limpiamos el buffer
            
            switch (opcion){
                case 1:
                    aparcarAutobus();
                    break;
                case 2:
                    mostrarDarsenasLibres();
                    break;
                case 3:
                    buscarAutobus();
                    break;
                case 4:
                    buscarConductor();
                    break;
                case 5:
                    mostrarPosicionMasConductores();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 6);
    }
}