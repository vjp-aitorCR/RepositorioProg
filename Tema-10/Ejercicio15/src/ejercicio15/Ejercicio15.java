/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner entrada = new Scanner(System.in);
        //Lista de empresas
        ArrayList<Empresa> empresas = new ArrayList<>();

        int opcion;

        do{
            System.out.println("Pulse 1 para introducir empresas y sus empleados.");
            System.out.println("Pulse 2 para mostrar empresas y sus empleados.");
            System.out.println("Pulse 3 para mostrar empleados con letra A.");
            System.out.println("Pulse 4 para mostrar empleados ordenados por sueldo.");
            System.out.println("Pulse 5 para salir.");
            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpiar Buffer

            switch (opcion) {
                case 1:
                    introducirEmpresas(empresas);
                    break;
                case 2:
                    mostrarEmpresas(empresas);
                    break;
                case 3:
                    empleadosConA(empresas);
                    break;
                case 4:
                    empleadosOrdenados(empresas);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);

    }
    //Caso 1: Introducir empresas y empleados
    public static void introducirEmpresas(ArrayList<Empresa> empresas){
        Scanner entrada = new Scanner(System.in);
        String continuarEmpresa;
        do{
            System.out.println("Nombre de la empresa:");
            String nombreEmpresa = entrada.nextLine();
            Empresa empresa = new Empresa(nombreEmpresa);
            String continuarEmpleado;
            int contador = 1;
            do{

                System.out.println("Nombre del empleado " + contador + ":");
                String nombre = entrada.nextLine();
                System.out.println("Sueldo del empleado " + contador + ":");
                int sueldo = entrada.nextInt();
                entrada.nextLine(); //Limpiar Bugger

                Empleado e = new Empleado(nombre, sueldo);
                empresa.addEmpleado(e);

                contador++;

                System.out.println("Desea anhadir mas empleados? (Si/No)");
                continuarEmpleado = entrada.nextLine();

            } while (continuarEmpleado.equalsIgnoreCase("Si"));

            empresas.add(empresa);

            System.out.println("Desea anhadir mas empresas? (Si/No)");
            continuarEmpresa = entrada.nextLine();

        } while (continuarEmpresa.equalsIgnoreCase("Si"));
    }
    //Caso 2: Mostrar empresas y empleados
    public static void mostrarEmpresas(ArrayList<Empresa> empresas){
        for (Empresa emp : empresas){
            System.out.println("Empresa: " + emp.getNombreEmpresa());
            int i = 1;
            for (Empleado e : emp.getEmpleados()){
                System.out.println("Empleado " + i + ": " + e.getNombreEmpleado());
                System.out.println("Sueldo:" + e.getSueldo());
                i++;
            }
        }
    }
    //Caso 3: Empleados con letra A
    public static void empleadosConA(ArrayList<Empresa> empresas){
        for (Empresa emp : empresas){
            for (Empleado e : emp.getEmpleados()){
                if (e.getNombreEmpleado().toUpperCase().contains("A")){
                    System.out.print(e.getNombreEmpleado() + " - ");
                }
            }
        }
        System.out.println("");
    }
    //Caso 4: Empleados ordenados por sueldo
    public static void empleadosOrdenados(ArrayList<Empresa> empresas){
        ArrayList<Empleado> todos = new ArrayList<>();
        //Guardamos todos los empleados en una sola lista
        for (Empresa emp : empresas){
            todos.addAll(emp.getEmpleados());
        }
        //Ordenar por sueldo descendente
        for (int i = 0; i < todos.size(); i++){
            for (int j = i + 1; j < todos.size(); j++){
                if (todos.get(i).getSueldo() < todos.get(j).getSueldo()){
                    //Intercambiar
                    Empleado temp = todos.get(i);
                    todos.set(i, todos.get(j));
                    todos.set(j, temp);
                }
            }
        }
        //Mostrar
        for (Empleado e : todos){
            System.out.println(e.getNombreEmpleado() + " - " + e.getSueldo());
        }
    }
}