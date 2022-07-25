package retos1_ciclo2;

/**
 *
 * @author Ferney
 */
public class Reto1Notas {

    public static double[] reporte(double[] listaNotas) {
        //EN ESTE ESPACIO PONER SU LÓGICA

        /**
         * ***** declaración e instanciar variables ******
         */
        double notas[] = {0.0, 0.0, 0.0};   // creo un array tipo double
        double suma = 0.0, promedio = 0.0;   // variable acomular
        int tamano = listaNotas.length;    // tamaño del array
        double menor = 100000000;  // menor tiempo
        double mayor = 0;  // menor tiempo

        for (double i : listaNotas) {
            suma = suma + i;    // acomular
        }// fin for
        promedio = suma / tamano;   // promedio 

        notas[0] = promedio;    // asigno a la primera posición del arreglo

        for (double j : listaNotas) {
            if (j < menor) {
                menor = j;
                notas[1] = j;   // posición para menor tiempo 
            }// fin if

            if (j > mayor) {
                mayor = j;
                notas[2] = j;   // posición para menor tiempo 
            }// fin if

        }// fi for

        return notas;
    }//fin método

}// fin clase
