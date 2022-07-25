package arraylistejercicios;

import java.util.ArrayList;

public class Usuario {

    private String documento;
    private String nombre;
    private int edad;

    public Usuario(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Usuario() {
    }

    public ArrayList<String> datos(ArrayList<Usuario> listap) {  // brear lista y devuelve string recibe string usuario}

        ArrayList<String> listarta = new ArrayList<>();

        Usuario usu = new Usuario();   // crear objeto usu
        int sum = 0;
        for (int i = 0; i < listap.size(); i++) {
            usu = listap.get(i);
            sum += usu.getEdad();
        }// fin for
        listarta.add(String.valueOf(sum));
        sum=0;
        for (Usuario list : listap) {   // en variable lis se almac lo q se recorre en listap
            sum += list.getEdad();
        }
        listarta.add(String.valueOf(sum));

        return listarta ;
    }// fin método

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
