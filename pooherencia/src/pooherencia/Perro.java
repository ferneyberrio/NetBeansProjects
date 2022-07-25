
package pooherencia;


public class Perro extends Animal{
 /***** palabra resrvada stends indica que hereda *********/
    private String raza;
    private String tipopelo;
    private String genero;

    public Perro(String raza, String tipopelo, String genero, String especie, String tipoalimentacion, int edad) {
        super(especie, tipoalimentacion, edad);
        this.raza = raza;
        this.tipopelo = tipopelo;
        this.genero = genero;
    }// fin constructor
    

    @Override   // sobre escribir método
    public void comer(){
        super.comer();
    System.out.println("Tres veces al día");
    }    

    


}// fin clase
