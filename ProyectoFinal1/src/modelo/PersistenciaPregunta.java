/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaPregunta {
    
      public static void guardar(Pregunta p)throws Exception{
      //Paso 1 generar el archivo donde se va a guardar
      //nuestro serializado
      ArrayList<Pregunta> preguntas=new ArrayList<>();
      File file=new File("cuestionario.yo"); //SE CREA EL ARCHIVO DENTRO DE LA CARPETA DEL PROYECTO DE NB PROYECTS
      
      if(file.exists())preguntas= leer();
      preguntas.add(p);
      
     //Paso 2 es indicar que lo vamos a generar para escribir en el
      
     FileOutputStream fos=new FileOutputStream(file);
    //Escribir un obejo en el
    
    ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(preguntas);
     oos.close();
    }
    
    public static ArrayList<Pregunta> leer()throws Exception{
        //Para leer primero ponemos el archivo
        File file=new File("cuestionario.yo");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
     ArrayList<Pregunta> preguntas= (ArrayList<Pregunta>) ois.readObject();
     return preguntas;
    }
   
        
}