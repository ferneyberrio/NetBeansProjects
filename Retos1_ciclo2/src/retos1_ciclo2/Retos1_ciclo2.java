
package retos1_ciclo2;

/**
 *
 * @author Ferney
 */


public class Retos1_ciclo2 {

    
    public static int[] reporte(int[] participantes){
        //EN ESTE ESPACIO PONER SU LÓGICA
    /*   para variante carrera*/
        int num_personas = 0, firstPuesto = 10000, lastPuesto = 0;     // datos requeridos
        int resultados[] = {num_personas, firstPuesto, lastPuesto};   // declaración e instanciación de array

        num_personas = participantes.length ;   // obtener numero de participantes
        
        for( int i : participantes ){
            if( i > lastPuesto  ){
            lastPuesto =   i;  
            }//fin if

            if( i < firstPuesto  ){
            firstPuesto =   i;  
            }//fin if

        }// fin for
    
    
        resultados = new int[] { num_personas, firstPuesto, lastPuesto};
        return resultados ;
        
    }// fin metodo
    
    
    
    
    /*   para variante notas*/
    public static  double[] reporte(double[] listaNotas){
        //EN ESTE ESPACIO PONER SU LÓGICA

        double num_personas = 0.0, firstPuesto = 5.0, lastPuesto = 0.0;     // datos requeridos
        double resultados[] = {num_personas, firstPuesto, lastPuesto};   // declaración e instanciación de array
        double suma = 0.0;    // sumar elementos del arreglo

        num_personas = listaNotas.length ;   // obtener numero de participantes
        
        
        
        for( int i=0; i < num_personas; i++ ){
            if( listaNotas[i] > lastPuesto  ){
            lastPuesto =   listaNotas[i];            
            }//fin if

            if( listaNotas[i] < firstPuesto  ){
            firstPuesto =   listaNotas[i];  
            }//fin if
            
            suma += listaNotas[i];    // suma cada elemento

        }// fin for
        double promedio = suma/num_personas;
    
    
        resultados = new double[] { promedio, firstPuesto, lastPuesto};
        return resultados ;
        
    }// fin metodo
    
    
    
    
    
    
}// fin public class Retos1_ciclo2
