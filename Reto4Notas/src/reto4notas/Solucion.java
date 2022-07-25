package reto4notas;

import java.util.ArrayList;

public class Solucion {

    //ESTA CLASE NO TIENE MAIN
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA
//        ArrayList<Estudiante> notas = new ArrayList<>();     // crear Array de tipo Estudiante
//        ArrayList<Object> notas = new ArrayList<Object>();     // crear Array de tipo object
  

        Object[] notas = {0.0d, "", 0.0d, "", 0.0d};    // array tipo Object
        
        /*declarar variables*/
        double suma = 0.0d;
        double promedio = 0.0d;
        double menor = 1000000.0;
        double mayor = 0.0;
        double miNota = 0.0d;
        String miEstud = "";
        String estMayorNota = "";
        String estMenorNota = "";
        
        /* Obtener datos */
        for (Estudiante i : grupo) {   // por cada i del tipo Estudiante
            miNota = i.getNota();
            miEstud = i.getNombreCompleto();

            suma += i.getNota();     // sumar la nota del estudiante i

            if (miNota < menor) {
                menor = miNota;
                estMenorNota = miEstud;
            }// fin if

            if (miNota > mayor) {
                mayor = miNota;
                estMayorNota = miEstud;
            }// fin if        
        }// fin for
        promedio = suma / grupo.size();

        notas[0] = promedio;
        notas[1] = estMenorNota;
        notas[2] = menor;
        notas[3] = estMayorNota;
        notas[4] = mayor;

        return notas;

    }// fin método


}// fin clase
