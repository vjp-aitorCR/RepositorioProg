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
    int dineroinicial;
    int dinero;
    int billete50;
    int billete20;
    int billete10;
    int billete5;
    int moneda2;
    int moneda1;
  
    
    
    
    
        System.out.println("Por favor, indique una cantidad de dinero:");
        dineroinicial = entrada.nextInt();
        dinero = dineroinicial;
        billete50 = dinero / 50;
        dinero = dinero % 50;
        billete20 = dinero / 20;
        dinero = dinero % 20;
        billete10 = dinero / 10;
        dinero = dinero % 10;
        billete5 = dinero / 5;
        dinero = dinero % 5;
        moneda2 = dinero / 2;
        dinero = dinero % 2;
        moneda1 = dinero / 1;
        dinero = dinero % 1;
        
        System.out.println(dineroinicial + " Euros se descomponen en " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + billete5 + " billetes de 5, " + moneda2 + " monedas de 2 euros y " + moneda1 + " monedas de 1 euro.");
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    }
    
}
