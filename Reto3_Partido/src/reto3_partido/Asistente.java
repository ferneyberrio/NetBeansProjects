package reto3_partido;
import java.util.Random;

public class Asistente {

    /**
     * *** palabra resrvada stends indica que hereda ********
     */
    protected String idTiquete;   //Es el número de identificación del tiquete.
    protected String nombreCompleto;//Es el nombre del cliente que compró el tiquete.
    protected String direccionResidencia;//Es la dirección de residencia del cliente
    protected String credenciales = ""; // Es un número en formato String que servirá de credencial para ingresar a la transmisión

    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

//    public Asistente(String idTiquete, String nombreCompleto, String ireccionResidencia ){
//       idTiquete ="";
//       nombreCompleto="";
//       ireccionResidencia="";
//    }//fin constructor
    /**
     * ***
     * Genera de manera aleatoria un número entero menor a 100000 (no puede
     * generarse ninguno otro después de generar el primero) y lo convierte en
     * un String que será la credencial de acceso a la transmisión, guardando el
     * resultado en el atributo credenciales.
     ****
     */
    public void generarCredenciales() {
        if (credenciales.isEmpty()) {
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }// fin if
        }// fin método generarCredenciales

    }// fin clase


