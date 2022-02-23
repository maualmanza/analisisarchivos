package hola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class AnalisisArchivos {

    public static void main(String[] args) {
        System.out.println("analizador de archivos del mau");
        String nombreArchivo = "mau_1.txt";
        File archivo;
        FileReader fr;
        BufferedReader br;

        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int numEntero;
            int numLinea = 1;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {// si esta vacia la linea  entra de lo contrario se queda fuera del if
                    //System.out.println("la linea esta vacia");
                    numEntero = Character.getNumericValue(linea.charAt(0));//este obtiene el numero entero del primer caracter de una linea del archivo
                    if (Character.isLetter(linea.charAt(0))) {//el primer caracter es letra
                        System.out.println("en la  linea " + numLinea + " el caracter --" + linea.charAt(0) + " --no se puede convertir a entero-- " + linea + " --");

                    } else {
                        //resultadoDivision = numEntero / 2;
                        if (numEntero == 0) {
                            System.out.println("en la linea " + numLinea + " el primer caracter es par -- " + linea + "--");
                        } else {
                            if (numEntero % 2 == 0) {
                                //return true;
                                System.out.println("en la linea " + numLinea + " el primer caracter es par -- " + linea + "--");
                            } else {
                                //return false;
                                System.out.println(" en la linea " + numLinea + " el primer caracter es impar--" + linea + "--");
                            }

                            // System.out.println(Character.getNumericValue(linea.charAt(0)));
                        }

                    }
                    numLinea++;

                } else {
                    System.out.println(" en la linea " + numLinea + " esta vacia--" + linea + "--");
                    numLinea++;
                }
            }
            br.close();
            fr.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hubo un error leyendo el archivo" + e);
        }
       
        
    }
}
