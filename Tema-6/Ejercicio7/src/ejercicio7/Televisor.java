/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    //Constructor
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    //Getters
    public boolean isEncendido() {
        return encendido;
    }
    public int getCanal() {
        return canal;
    }
    public int getVolumen() {
        return volumen;
    }
    //Setters sin setEncendido porque lo prohibe el enunciado
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    //Mostrar informacion
    public void mostrarInfo(){
        System.out.println("----INFORMACION DEL TELEVISOR----");
        System.out.println("Encendido: " + encendido);
        System.out.println("Canal: " + canal);
        System.out.println("Volumen " + volumen);
    }
    //Metodos de la interfaz
    @Override
    public void encender(){
        if (!encendido){
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        }
    }
    @Override
    public void apagar(){
        if (encendido){
            System.out.println("La TV se apagara en 10s");
            encendido = false;
        }
    }
    @Override
    public void bajarVolumen(){
        if (encendido){
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido){
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void cambiarCanal(float canal){
        if (encendido){
            this.canal = (int) canal;
            System.out.println("Canal cambiado. Canal actual: " + this.canal);
        }
    }
}
