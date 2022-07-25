            
package ejercicioarraylist;

import java.util.ArrayList;


public class EjercicioArrayList {

    public static void main(String[] args) {

        ArrayList<String>lista = new ArrayList<>();    // crear lista de tipo arrayList        
        String nombre = "Ferney";
        String apellido = "Berrio";
        String correo = "ejeplo@correo.com";

        lista.add(nombre);
        lista.add(apellido);
        lista.add(correo);
        System.out.println(lista);
        System.out.println("tamaño lista = " + lista.size());
        
        cliente datosCliente = new cliente(0, nombre, correo, 0, 0);
        
        ArrayList<cliente> listaClientes = new ArrayList<cliente>();
        listaClientes = datosCliente.regresarDtaos();
        System.out.println(listaClientes);
        
        for (cliente i: listaClientes) {
            
            System.out.println("datos : " + i);
        }
        
       
        
    }// fin main
    
}//fin clase
