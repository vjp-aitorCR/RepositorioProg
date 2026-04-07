/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class GestionSedes {
    //Atributos
    private ArrayList<Ciudad> ciudades;
    //Constructores
    public GestionSedes() {
        this.ciudades = new ArrayList<>();
    }
    //Metodo para ejecutar todo
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1: añadirCiudad(); 
                    break;
                case 2: mostrarTodasLasCiudades(); 
                    break;
                case 3: mostrarSedesPorEncimaMedia(); 
                    break;
                case 4: buscarSedePorNombre(); 
                    break;
                case 5: anhadirSedeACiudad(); 
                    break;
                case 6: mostrarSedesOrdenadasPorIngresos();     
                    break;
                case 7: System.out.println("Saliendo del programa..."); 
                    break;
                default: System.out.println("Opcion no valida. Intentalo de nuevo");
            }
            System.out.println();
        } while (opcion != 7);
    }
    //Metodo menu
    public void mostrarMenu(){
        System.out.println("=====GESTION DE SEDES=====");
        System.out.println("1. Anhadir ciudad");
        System.out.println("2. Mostrar todas las ciudades");
        System.out.println("3. Sedes con ingresos > media");
        System.out.println("4. Buscar sede por nombre");
        System.out.println("5. Anhadir sede a ciudad");
        System.out.println("6. Mostrar sedes ordenadas");
        System.out.println("7. Salir");
    }
    //Metodo para añadir ciudad
    private void añadirCiudad(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre ciudad: ");
        String nombreCiudad = entrada.nextLine();
        if (buscarCiudad(nombreCiudad) != null){
            System.out.println("Ciudad ya existente");
            return;
        }
        Ciudad ciudad = new Ciudad(nombreCiudad);
        boolean continuar = true;
        while (continuar){
            System.out.print("Nombre sede: ");
            String nombreSede = entrada.nextLine();
            System.out.print("Ingresos anuales: ");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();//Limpiar buffer
            
            ciudad.añadirSede(new Sede(nombreSede, ingresos));
            
            System.out.print("Otra sede?: ");
            continuar = entrada.nextLine().equalsIgnoreCase("s");
        }
        ciudades.add(ciudad);
        System.out.println("Ciudad anhadida");
    }
    //Metodo para mostrar todas las ciudades
    public void mostrarTodasLasCiudades(){
        if (ciudades.isEmpty()){
            System.out.println("No hay ciudades");
        }
        else{
            for (Ciudad ciudad : ciudades){
                System.out.println(ciudad);
            }
        }
    }
    //Metodo para mostrar sedes por encima de la media
    public void mostrarSedesPorEncimaMedia(){
        if (ciudades.isEmpty()){
            System.out.println("No hay ciudades");
            return;
        }
        System.out.println("---SEDES SOBRE LA MEDIA---");
        for (Ciudad ciudad : ciudades){
            double media = ciudad.getMediaIngresos();
            System.out.println(ciudad.getNombre() + " (Media: " + String.format("%.2f", media) + " euros)");
            boolean haySedes = false;
            for (Sede sede : ciudad.getSedes()){
                if (sede.getIngresosAnuales() > media){
                    System.out.println(sede);
                    haySedes = true;
                }
            }
            if (!haySedes) System.out.println("  Ninguna");
        }
    }
    //Metodo para buscar sedes por nombte
    public void buscarSedePorNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre sede a buscar: ");
        String nombreSede = entrada.nextLine();
        for (Ciudad ciudad : ciudades){
            if (ciudad.existeSede(nombreSede)){
                System.out.println("Encontrada en " + ciudad.getNombre() + ": " + ciudad.buscarSede(nombreSede));
                return;
            }
        }
        System.out.println("No encontrada");
    }
    //Metodo para añadir sede a una ciudad
    public void anhadirSedeACiudad(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre ciudad: ");
        Ciudad ciudad = buscarCiudad(entrada.nextLine());
        if (ciudad == null){
            System.out.println("Ciudad no existe");
            return;
        }
        System.out.print("Nombre nueva sede: ");
        String nombreSede = entrada.nextLine();
        System.out.print("Ingresos: ");
        double ingresos = entrada.nextDouble();
        entrada.nextLine();//Limpiar Buffer
        
        ciudad.añadirSede(new Sede(nombreSede, ingresos));
    }
    //Metodo mostrar sedes ordenadas 
    private void mostrarSedesOrdenadasPorIngresos(){
        ArrayList<Sede> todasLasSedes = new ArrayList<>();
        
        for (Ciudad ciudad : ciudades){
            todasLasSedes.addAll(ciudad.getSedes());
        }
        
        if (todasLasSedes.isEmpty()){
            System.out.println("No hay sedes");
            return;
        }
        
        for (int i = 1; i < todasLasSedes.size(); i++){
            Sede clave = todasLasSedes.get(i);
            int j = i - 1;
            while (j >= 0 && todasLasSedes.get(j).getIngresosAnuales() < clave.getIngresosAnuales()){
                todasLasSedes.set(j + 1, todasLasSedes.get(j));
                j--;
            }
            todasLasSedes.set(j + 1, clave);
        }
        
        System.out.println("---SEDES ORDENADAS---");
        for (int i = 0; i < todasLasSedes.size(); i++){
            Sede s = todasLasSedes.get(i);
            System.out.println((i+1) + ". " + s.getNombre() + " - " + s.getIngresosAnuales() + " euros");
        }
    }
    //Metodo para buscar ciudad
    public Ciudad buscarCiudad(String nombre){
        for (Ciudad ciudad : ciudades){
            if (ciudad.getNombre().equalsIgnoreCase(nombre)){
                return ciudad;
            }
        }
        return null;
    }
}