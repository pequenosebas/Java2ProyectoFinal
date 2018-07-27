/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author T-101
 */
public class ProbarOrdenamientos {
    public static void main(String[] args) {
        //UN ARREGLO QUE NO ACEPTA DUPLICADOS
        Set<Integer> enteros =new LinkedHashSet<>();
        
        /*enteros.add(2);
        enteros.add(3);
        enteros.add(2);
        
        System.out.println(enteros.size());
        
        for(Integer i:enteros){
            System.out.println(i);
        }
        
        System.out.println("Aleatorios");
        Random r=new Random();
        int numero=r.nextInt(4);
        System.out.println("aleatorio "+numero);*/
        
        
        while (enteros.size()<4){
            Random r= new Random();
            int valor=r.nextInt(4);   //RESPUESTA
            enteros.add(valor);
         }
        
        System.out.println(enteros.size());
        //Checamos
        for(Integer i:enteros){
            System.out.println(i);
        }
        
}
        
    
    
}
