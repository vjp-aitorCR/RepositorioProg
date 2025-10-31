/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    //Constantes
    public static final String CAPITALESPANHA = "madrid";
    public static final String DESCUBRIDORAMERICA = "colon";
    //Metodo para la pregunta de la capital 
    public static int PreguntaCapital(Scanner entrada){
        System.out.println("1ª PREGUNTA: Cual es la capital de Espanha?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equals(CAPITALESPANHA)) {
            System.out.println("Muy bien, respuesta correcta.");
            return 1; 
        }
        else{
            System.out.println("No es correcto, la respuesta correcta seria " + CAPITALESPANHA);
            return 0;
        }   
    }
    //Metodo para la pregunta del descubridor
    public static int PreguntaDescubridor(Scanner entrada){
        System.out.println("2ª PREGUNTA: Quien descubrio America?: ");
        String respuesta = entrada.nextLine();
        
        if (respuesta.equals(DESCUBRIDORAMERICA)){
            System.out.println("Muy bien, respuesta correcta.");
            return 1;
        }
        else{
            System.out.println("No es correcto, la respuesta correcta seria " + DESCUBRIDORAMERICA);
            return 0;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("EXAMEN DE CULTURA GENERAL");
        //contador de aciertos
        int aciertos = 0;
        aciertos += PreguntaCapital(entrada);
        System.out.println();
        aciertos += PreguntaDescubridor(entrada);
        //Calculo nota final
        int nota;
        if (aciertos == 2){
            nota = 10;
        } 
        else if (aciertos == 1){
            nota = 5;
        } 
        else{
            nota = 0;
        }
        
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
    
}
