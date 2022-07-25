package reto3_partido;

public class Preferencial extends Asistente {

    private boolean participaSorteo = false; // Indica si el comprador de un tiquete preferencial está participando en el sorteo

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    /**
     * *******
     * Se cambia el atributo participaSorteo. Aprovechando el getter y el setter
     * de este. Si participaSorteo es igual a true lo cambia a false, y si
     * participaSorteo es igual a false lo cambia a true.
     ************
     */
    public void participarSorteo() {
        participaSorteo = !participaSorteo; // cambia estado de la variable
    }// fin método

    /**
     * ******* getter y setter ***********
     */
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }

}// fin clase
