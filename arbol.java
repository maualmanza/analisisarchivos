package analisisarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.util.Map.entry;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class arbol {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args, String stock) {

        String nombreArchivo = "mau_1.txt";
        File archivo;
        FileReader fr;
        BufferedReader br;
        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        TreeMap<Integer,String>MapaOrdenado=new TreeMap<Integer,String>();
        
        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            String[] parts;
            while ((linea = br.readLine()) != null) {//leer las lineas del archivo
                //System.out.println(linea);
                parts = linea.split(" ");
                System.out.println("cadena1" + parts[0]);  // 123
                System.out.println("cadena2" + parts[1]);

                nombreMap.put( Integer.parseInt(parts[0]), parts[1]);
                MapaOrdenado=(TreeMap<Integer, String>)nombreMap;
                MapaOrdenado.entrySet().stream().sorted((Comparator<? super Map.Entry<Integer, String>>) Map.entry(parts[0], parts[1]));
                MapaOrdenado.putAll(nombreMap);
                for (Integer key:MapaOrdenado.keySet()); {
                    Object key = null;
                stock=MapaOrdenado.get(key);
                System.out.println(key + " ->" + MapaOrdenado.get(key));
            }
                            
//                nombreMap.put(6, "juan");
//                nombreMap.put(5, "pedro");
//                nombreMap.put(1400, "carmen");
//                nombreMap.put(2000000, "mau");
//                nombreMap.put(40, "armando");
//                nombreMap.put(486, "luis");
//                nombreMap.put(3000, "pepe");
//                nombreMap.put(4500, "nelson");

            }
            Iterator<Integer> it = nombreMap.keySet().iterator();
            while (it.hasNext()) {
                Integer key = it.next();
                System.out.println(key + " ->" + nombreMap.get(key));
           
            
       
             }
            // TODO :quitar
          
            
          
            ; // 65432
            br.close();
            fr.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "hubo un error leyendo el archivo" + e);
        }
    }
}
