 package reto1_ciclo2;

/**
 *
 * @author Ferney
 */ 
//import java.util.*;

 
public class Reto1_Ciclo2 {
    private int[] participantes = new int[] {26, 17, 23, 16, 24, 21, 18, 25, 22, 20, 19} ;
    
    private int num_personas = 0, firstPuesto = 0, lastPuesto = 0;     // datos requeridos
    
//    int[] resultados = new int[3];   // declaración array
//    int[] resultados = new int[]{0,0,0};   // declaración e instanciación de array
//    public int[] resultados = new int[]{num_personas, firstPuesto, lastPuesto};   // declaración e instanciación de array
//     int[] resp = new int[3] ;
//    resp = new reporte(participantes)   ; //llamr método   
    
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] resultados ;         // declaración arreglo
//        resultados = new int[3];       // instanciar
//    int[] participantes = new int[] {26, 17, 23, 16, 24, 21, 18, 25, 22, 20, 19} ;
//    int[] participantes = new int[] {1801, 1806, 2094, 2075, 2044, 1634, 1735, 1616, 1998, 2109, 2078, 2141, 1851, 2171, 1846, 2167, 1967, 2036 } ;    
//    int[] participantes = new int[] {1785, 1712, 1680, 1615, 1777, 1726, 1675, 1705, 1607, 1635, 1745, 1731, 1760, 1799, 1679, 1718, 1664, 1778} ;
//    int[] participantes = new int[] {1764, 1933, 1970, 1734, 2117, 2140, 1657, 1962, 1963} ;


        
    } // fin public static void main 
    
    public int[] reporte(int[] participantes){
        
//    int num_personas = 0, firstPuesto = 0, lastPuesto = 0;     // datos requeridos 
    
    this.num_personas = participantes.length ;   // obtener numero de participantes

    for( int i : participantes ){
        
        if( i > lastPuesto  ){
        lastPuesto =   i;  
        }//fin if
       
        if( i < firstPuesto  ){
        firstPuesto =   i;  
        }//fin if
        
    }// fin for
    
    
    int[] resultados = { num_personas, firstPuesto, lastPuesto};
//        return resultados ;
        
    
    return resultados ;
    }// fin public reporte
    
} // fin public class Reto1_Ciclo2
