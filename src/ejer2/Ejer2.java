/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dismaelectric
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner key = new Scanner(System.in);
        System.out.println("Seleccione una opción");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        opcion = key.nextInt();
        Menu(opcion);
    }
    
    public static int Aleatorio(){
        
        int num = (int)(Math.random()*3);
           System.out.println(num);
           return num;
         }
    public static void Ahorcado(){
       ArrayList<String> a = new ArrayList<>();
       a.add(0,"Universidad");
       a.add(1,"Objeto");
       a.add(2,"Radio");
       int Aleatorio = Aleatorio();
       Scanner p = new Scanner(System.in);
       String palabra=a.get(Aleatorio);
      for(int i=0; i<=10; i++){
          System.out.println("Intentos:"+""+i);
          System.out.println("Ingrese una letra");
         
          
          for(int j=0; i<palabra.length(); j++){
              if(true){
                  
              }
             
    }
 }
    }

    private static void Menu(int opc) {
        switch(opc){
            case 1: 
                Ahorcado();
                break;
            case 2:
                break;
         }
     } 
}

 
 

            
