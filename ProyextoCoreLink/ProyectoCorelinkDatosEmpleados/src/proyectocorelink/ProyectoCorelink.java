package proyectocorelink;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ProyectoCorelink {

    public static void main(String[] args) {
        int contador = 0;
        try {
            FileReader fr = new FileReader("datos_empleados.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("empleados_zona_cero.txt");
            PrintWriter pw = new PrintWriter(fw);
            String linea = br.readLine();
            if (linea != null) {
                pw.println(linea);
            }
            while (linea != null) {
                linea = br.readLine();
                if (linea != null) {
                    if (linea.toLowerCase().contains(";zona cero;")) {
                        pw.println(linea);
                        contador++;
                    }
                }
            }
            br.close();
            pw.close();
            System.out.println("Numero de empleados en Zona Cero: " + contador);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}