
package arraylistejercicios;

import java.util.ArrayList;

public class ArrayListEjercicios {


    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("123", "ferney", 33));
        lista.add(new Usuario("456", "Antonio", 18));
        
        Usuario usuario = new Usuario();   // crear objeto usu
        System.out.println(usuario.datos(lista)); 
        
       
        
    }
    
}
