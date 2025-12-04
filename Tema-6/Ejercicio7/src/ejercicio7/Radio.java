/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    //Contructores
    public Radio(){
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }
    //Getters
    public boolean isEncendido() {
        return encendido;
    }

    public float getEmisora() {
        return emisora;
    }

    public int getVolumen() {
        return volumen;
    }
    //Setters sin setEncendido por prohibicion del enunciado
    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    //Mostrar informacion
    public void mostrarInfo(){
        System.out.println("----INFORMACION RADIO----");
        System.out.println("Encendido: " + encendido);
        System.out.println("Emisora: " + emisora);
        System.out.println("Volumen: " + volumen);
    }
    //Metodos de la interfaz
    @Override
    public void encender(){
        if (!encendido){
            encendido = true;
            System.out.println("Radio encendida");
        }
    }
    @Override
    public void apagar(){
        if (encendido){
            System.out.println("Radio apagada");
            encendido = false;
        }
    }
    @Override
    public void bajarVolumen(){
        if (encendido){
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido){
            volumen += 5    ;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void cambiarCanal(float emisora){
        if (encendido){
            this.emisora = emisora;
            System.out.println("Emisora actual: " + this.emisora);
        }
    }
}
