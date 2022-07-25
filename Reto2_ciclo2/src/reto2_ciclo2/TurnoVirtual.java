
package reto2_ciclo2;
/**
 *
 * @author Ferney
 */

public class TurnoVirtual {
    // atributos
    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual = true ;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1 ;

    /***** creación contructor *********/
    public TurnoVirtual( ) {
     this.estadoTurnoVirtual = true ;
     this.turnoEnAtencion = 0;
     this.cantidadTurnosAtendidos = 1 ;
    }// fin constructor
        
    public TurnoVirtual(String[] turnos ) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length] ;  //

        for (int i = 0; i < turnos.length; i++) {  // rellenar con espacio en blanco
            turnosPerdidos[i] = " ";               // asignar espacio
        }// fin for
        
    }// fin constructor
    
    /******** Métodos *********/
    
    public void atenderProximoTurno(){
    if(estadoTurnoVirtual){
        turnoEnAtencion++;    // incrementar contador
        cantidadTurnosAtendidos ++;  // incrementar contador
    }// fin if
    }// fin atenderProximoTurno()
    
    /*
    public void agregarTurnoPerdido(){
    
    }// fin agregarTurnoPerdido
    */
    
    public void cambiarEstadoTurno(){
        estadoTurnoVirtual = !estadoTurnoVirtual;    // cambiar estado
    }// fin cambiarEstadoTurno
    
    /**** setter and getters ******/
    public String[] getTurnos() {    
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }// fin if
        }// fin for
    } // fin método 


    
  
   
}// fin clase TurnoVirtual
