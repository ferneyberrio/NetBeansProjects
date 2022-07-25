
package pooherencia;

public class PooHerencia {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro pe = new Perro("Bulldog", "corto", "macho", "canino", "Omnivoro", 15);  // instanciamos pe
        pe.comer();
        Animal an = new Animal("", "", 0);
        an.comer();
    }// fin main
    
}//fin clase
