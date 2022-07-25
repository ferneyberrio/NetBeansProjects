/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos_java;

import java.util.Scanner;

/**
 *
 * @author Ferney
 */
import java.util.Scanner;
public class Ciclos_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /******* Ciclo While***/
        Scanner captura = new Scanner(System.in);   //creo objeto para solicitar a usuario
        String clave = "0000";
        String mi_clave = "0000" ;
        int x = 3;
        String msm = "Supero el nuemro de intentos permitidos :  ";
        while(x > 0){
            //System.out.println(x);   // imprimir valor de variable
            x--;            // decrementar variable
            System.out.println("ingrese contraseña ");   // imprimir 
            mi_clave = captura.next();    // capturamos ingreso del usuario
            
            System.out.println("la clave ingresada fue :  " + mi_clave );   // imprimir 
            
            if ( mi_clave.equals(clave) ){
                System.out.println("la clave ingresada es  ! correcta ¡  \n");   // imprimir 
                msm = "ingreso correcto";
                break;
            }// fin if clave 
            else{
            System.out.println("la clave ingresada es INCORRECTA  \n" );   // imprimir    
            System.out.println(" Intentos restantes :  " + x );   // imprimir 
            }// fin else
            
        }// fin while        
    System.out.println( msm );   // imprimir 
        
    }// fin public static void
    
}// fin public class 
