/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String usuario;
        String contrasenha;
        
        System.out.print("Introduce el nombre de usuario: ");
        usuario = entrada.nextLine();
        //Bucle hasta que ponga la contraseña correctamente
        do{
            System.out.print("Introduce la contrasenha: ");
            contrasenha = entrada.nextLine();
            if (!esValida(contrasenha, usuario)) {
                System.out.println("La contrasenha no es valida. Intentalo de nuevo.");
            }

        } while (!esValida(contrasenha, usuario));
        System.out.println("Contrasenha valida.");
    }
    //Metodo para validar el usuario y la contraseña
    public static boolean esValida(String contrasenha, String usuario) {
        //Longitud mínima de 6 caracteres
        if (contrasenha.length() < 6) {
            return false;
        }
        //Al menos dos digitos
        int digitos = 0;
        for (int i = 0; i < contrasenha.length(); i++) {
            if (Character.isDigit(contrasenha.charAt(i))) {
                digitos++;
            }
        }
        if (digitos < 2) {
            return false;
        }
        //El usuario no puede ser parte de la contraseña
        return !contrasenha.contains(usuario);
    }
}









































