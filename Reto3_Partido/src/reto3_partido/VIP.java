package reto3_partido;
import java.util.Random;

public class VIP extends Asistente {

    private boolean[] pantallas = new boolean[]{false, false, false};
    private String credencialesPrevia = "";

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    public void generarCredencialesPrevia() {
       if(credencialesPrevia.isEmpty()){ 
            Random numero = new Random();
            int y = numero.nextInt(100000);
            String credencial = String.valueOf(y);
            credencialesPrevia = credencial;
       }// fin if
    }//fin método generar credenciales

    public void asignarPantalla(int pantalla) {
        if (pantalla >=1 && pantalla <=3 ) {
            pantallas[pantalla-1] = !pantallas[pantalla-1];           
        }// fin if

    }// fin método asignar pantalla

    /**
     * ******* getter y setter ***********
     */
    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

}// fin clase
