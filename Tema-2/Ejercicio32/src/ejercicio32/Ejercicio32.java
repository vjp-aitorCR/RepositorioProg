/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);   
    int dineroinicial; //Variable para el dinero inicial
    int dinero; //Variable del dinero para calculos
    int billete50; //Variable para los billetes de 50
    int billete20; //Variable para los billetes de 20
    int billete10; //Variable para los billetes de 10
    int billete5; //Variable para los billetes de 5
    int moneda2; //Variable para las monedas de 2
    int moneda1; //Variable para las monedas de 1
  
    
    
    
    
        System.out.println("Por favor, indique una cantidad de dinero:");
        dineroinicial = entrada.nextInt();
        dinero = dineroinicial; //Guardamos la variable dinero inicial en otro para hacer calculos
        billete50 = dinero / 50; //Calculamos cuantos billetes de 50 hay 
        dinero = dinero % 50; //Guardamos el resto despues de calcular los billetes de 50
        billete20 = dinero / 20; //Calculamos cuantos billetes de 20
        dinero = dinero % 20; //Actualizamos el resto despues de calcular los billetes de 20
        billete10 = dinero / 10; //Calculamos cuantos billetes de 10 hay
        dinero = dinero % 10; //Actualizamos el resto despues de calcular los billetes de 10
        billete5 = dinero / 5; //Calculamos cuantos billetes de 5 hay
        dinero = dinero % 5; //Actualizamos el resto despues de calcular los billetes de 5
        moneda2 = dinero / 2; //Calculamos cuantas monedas de 2 hay
        dinero = dinero % 2; //Actualizamos el resto despues de calcular las monedas de 2
        moneda1 = dinero / 1; //Calculamos cuantas monedas de 1 hay 
        dinero = dinero % 1; //Actualizamos el resto despues de calcular las monedas de 1
        
        System.out.println(dineroinicial + " Euros se descomponen en " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + billete5 + " billetes de 5, " + moneda2 + " monedas de 2 euros y " + moneda1 + " monedas de 1 euro.");
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    }
    
}
