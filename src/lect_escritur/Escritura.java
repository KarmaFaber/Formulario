/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect_escritur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritura {
    String contenidoArchivo;
    File archivo;
    
    public Escritura(String ca,File a)
    {
        this.contenidoArchivo=ca;
        this.archivo=a;
    }
    
    public void escribir()
    {
        FileWriter salida;
        try {
            salida = new FileWriter(this.archivo,false);
            salida.write(contenidoArchivo);
            /*
                for (int i=0;i<contenidoArchivo.length();i++)
                {
                    salida.write(contenidoArchivo.charAt(i));
                }
            */
            salida.close();
        } catch (IOException ex) {
            System.out.println("Verifique la ruta del fichero");
        }
        
    }
    
    
}
