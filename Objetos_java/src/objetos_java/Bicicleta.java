
package objetos_java;

public class Bicicleta {

    /**
     * ***Atributos**
     */
    public String marca;
    private String color;
    private String tipo = "";
    private double llanta;
    private int velocidades;

    public Bicicleta() {

        this.marca = "nada";
        marca = "xxxxxxxx";
        this.color = "ninguno";
        this.tipo = "";
        this.llanta = 0.0;
        this.velocidades = 0;
    }// fin constructor
    
        public  Bicicleta(int C) {
        this.marca = "aaa";
        this.color = "verde";
        this.tipo = "";
        this.llanta = 0.0;
        this.velocidades = 0;
    }// fin constructor

    /**
     * ****Métodos******
     */
    public String obtenerMarca() {

        return this.marca;
    }// fin método obtener marca

    public String asignarMarca(String M) {
        marca = M ;
        return marca;
    }// fin método obtener marca

    public void setColor(String color) {
        this.color = color;
//        this.marca="otra";
    }

    public String getColor() {
        return color;
    }

}
