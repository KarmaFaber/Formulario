/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect_escritur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {
    String contenidoArchivo;
    File archivo;
    public Lectura(File a)
    {
        this.archivo=a;
    }
    
    public String leer() 
    {
        FileReader entrada;
        contenidoArchivo="";
        try {
            entrada = new FileReader(this.archivo);
            int caracter = entrada.read();
            char c = (char) caracter;
            while(caracter!=-1)
            {
                contenidoArchivo = contenidoArchivo+c;
                caracter = entrada.read();
                c = (char) caracter;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No ha sido posible leer el archivo");
        }
        catch (IOException ex2){
             System.out.println("error al leer");
        }
        return contenidoArchivo;
    }
}
