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
        double menor = 5.0d;
        double mayor = 0.0d;
        double miNota = 0.0d;
        String miEstud = "";
        String estMayorNota = "";
        String estMenorNota = "";
        int cont = 0;

        /* Obtener datos */
        do {
            Estudiante note = new Estudiante();    // crear objeto tipo Estudiante
            note = grupo.get(cont);                // almacenar primera posición del arrays grupo

            miNota = note.getNota();              // almacenar la nota del array actual
            miEstud = note.getNombreCompleto();   // almacenar el nombre del array actual

            if (miNota <= menor) {               // si nota actual es menor al menor
                menor = miNota;                  // actualizar menor
                estMenorNota = miEstud;          // actualizar nombre
            }// fin if
            if (miNota > mayor) {
                mayor = miNota;
                estMayorNota = miEstud;
            }// fin if 
            suma += note.getNota();     // sumar la nota del estudiante i

            cont++;
        } while (cont < grupo.size());

        promedio = suma / grupo.size();

        notas[0] = promedio;
        notas[1] = estMenorNota;
        notas[2] = menor;
        notas[3] = estMayorNota;
        notas[4] = mayor;

        return notas;

    }// fin método

}// fin clase
