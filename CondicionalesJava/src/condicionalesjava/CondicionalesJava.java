/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalesjava;

import java.util.Scanner;

/**
 *
 * @author Ferney
 */
public class CondicionalesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner captura = new Scanner(System.in);   //creo objeto para solicitar a usuario
//        int edad;
//        System.out.println("Ingrese su edad : ");    // salida por pantalla
//        edad = captura.nextInt();    // capturamos ingreso del usuario
//        System.out.println("Su edad es : " + edad + " años");
//        if (edad < 18){
//            System.out.println("Usted es Mayor de edad");
//            }// fin if edad
//        else{
//            System.out.println("Usted es menor de edad");   
//            }// fin else edad


    /*****************   ejercicio parqueadero     **************************/ 
    
        Scanner captura = new Scanner(System.in);   //creo objeto para solicitar a usuario
        /* declaración de variables */
        int horas, minutos;
        int vlr_hora = 1500;   //Valor de la hora
        
        System.out.println("Ingrese Horas de parqueo : ");    // salida por pantalla
        horas = captura.nextInt();    // capturamos ingreso del usuario
        
        System.out.println("Ingrese minutos de parqueo : ");    // salida por pantalla
        minutos = captura.nextInt();    // capturamos ingreso del usuario
        
        System.out.println("El tiempo de parqueo Fue : " + horas + " Horas y " + minutos + " Minutos");
        
        if (minutos > 0){   // preguta fraccion por minuto
            horas = horas + 1;  // cobra una hora
            }// fin if minutos

        int pago = vlr_hora * horas;      // calcular cobro
        System.out.println("Usted debe pagar : " + pago + " $ " );        
            
    } //fin public static void
    
}// fin public class
