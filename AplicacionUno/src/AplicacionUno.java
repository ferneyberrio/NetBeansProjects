/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ferney
 */

import java.util.Scanner;      // librería para preguntar a usuario
//import java.util.*;      // importa todo lo que tenga la clase Util

public class AplicacionUno {
    
    public static void main(String[] args){
//      definir variables
        float num1 = 10f , num2=20.5f;    
        String nombre = "Ferney";
        float suma = (num1 + num2);
//      imprimir        
        System.out.println("la suma es = " + suma );
        System.out.println(nombre.length());

//      pregumtar a usuario    
        Scanner captura = new Scanner(System.in);
        int n1,n2,r;   // defino variables
        System.out.println("digite un numeroentero : ");         
        n1 = captura.nextInt();    // capturar por pantalla el dato del usuario
        
        System.out.println("digite un numeroentero : ");         
        n2 = captura.nextInt();    // capturar por pantalla el dato del usuario
        
        r = n1 + n2;
        System.out.println("El resultado de  "+ n1 + " + " + n2 + " es igual a = "+ r); 
        
//      para otro tipo de variables
        System.out.println("INGRESE SU NOMBRE");    
        nombre = captura.next();
        System.out.println("su nombre es : " + nombre); 
        
    } //public static void main
    
}// fin public class AplicacionUno
