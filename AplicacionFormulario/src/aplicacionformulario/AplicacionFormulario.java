
package aplicacionformulario;

public class AplicacionFormulario {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*** instanciar formulario inicial *******/
        formularioInicial fi = new formularioInicial(); 
        fi.setVisible(true);    // método para que sea visible
        //fi.setLocation(300, 300);  //posición del lienzo
        fi.setLocationRelativeTo(null);   // calcular coordenadas del centro de mi pantalla
        /*** instanciar menu  *******/
        Menu mn = new Menu(); 
        //mn.setVisible(true);    // método para que sea visible
        //fi.setLocation(300, 300);  //posición del lienzo
        //mn.setLocationRelativeTo(null);   // calcular coordenadas del centro de mi pantalla
       
  
    }// fin main
    
 
       
}// fin clase
