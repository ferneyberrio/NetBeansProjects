package retos1_ciclo2;

/**
 *
 * @author Ferney
 */
public class Reto1Carrera {

    public static int[] reporte(int[] participantes) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        int arreglo[] = {0, 0, 0};   // crear array y asignar valores
        int tamano = participantes.length;    // tamaño del array
        int menor=100000000;  // menor tiempo
        int mayor=0;  // menor tiempo
        
        arreglo[0] = tamano;   // posicion para numero de participantes

        for (int i : participantes) {
            if (i < menor) {
                menor = i;
                arreglo[1] = i;   // posición para menor tiempo 
            }// fin if
        }// fi for
            
        for (int valor : participantes) {
            if (valor > mayor) {
                mayor = valor;
                arreglo[2] = valor;   // posición para menor tiempo 
            }// fin if    
        

        }// fin for

        return arreglo;
    }// fin método

}// fin clase
