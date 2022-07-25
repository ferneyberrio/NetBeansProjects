/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos_java;

/**
 *
 * @author Ferney
 */
public class Objetos_java {

    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta MTB = new Bicicleta();// crear e instancia objeto
        Bicicleta Ruta = new Bicicleta();// crear e instancia objeto
        Bicicleta eBike = new Bicicleta();// crear e instancia objeto
        MTB.asignarMarca(new Bicicleta().getColor());
        eBike.setColor("cmbike");
        eBike.asignarMarca("scott");
        System.out.println("marca bicicleta : " + eBike.obtenerMarca());
        System.out.println("marca bicicleta : " + MTB.obtenerMarca());
        System.out.println("marca bicicleta : " + new Bicicleta().getColor());
    }// fin main

}// fin clase
