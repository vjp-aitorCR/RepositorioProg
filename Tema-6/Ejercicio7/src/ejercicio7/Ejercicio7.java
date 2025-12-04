/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Televisor
        //Crear objeto Televisor
        Televisor tv = new Televisor();
        //Encender la TV
        tv.encender();
        //Mostrar información
        tv.mostrarInfo();
        //Subir volumen 3 veces
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        //Mostrar volumen actual
        System.out.println("Volumen actual TV: " + tv.getVolumen());
        //Cambiar canal
        tv.cambiarCanal(3);
        //Bajar volumen 
        tv.bajarVolumen();
        //Apagar la TV
        tv.apagar();
        //Mostrar información de nuevo
        tv.mostrarInfo();
        System.out.println("");
        //Radio
        //Crear objeto Radio
        Radio radio = new Radio();
        //Encender la radio
        radio.encender();
        //Mostrar información
        radio.mostrarInfo();
        //Subirvolumen 3 veces
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        //Mostrar volumen actual
        System.out.println("Volumen actual Radio: " + radio.getVolumen());
        //Cambiar emisora
        radio.cambiarCanal(105.5f);
        //Bajar volumen 
        radio.bajarVolumen();
        //Apagar radio
        radio.apagar();
        //Mostrar información de nuevo
        radio.mostrarInfo();
    }
}
    
