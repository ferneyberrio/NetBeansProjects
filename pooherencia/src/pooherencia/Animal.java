package pooherencia;

public class Animal {

    protected String especie;
    protected String tipoalimentacion;
    protected int edad;

    public Animal(String especie, String tipoalimentacion, int edad) {
        this.especie = especie;
        this.tipoalimentacion = tipoalimentacion;
        this.edad = edad;
    }// fin constructor

    public void comer() {
        System.out.println("se alimenta");
    }// fin método

    /**
     * ******geter*************
     */
    public String getEspecie() {
        return especie;
    }

    public String getTipoalimentacion() {
        return tipoalimentacion;
    }

    public int getEdad() {
        return edad;
    }

}// fin clase
