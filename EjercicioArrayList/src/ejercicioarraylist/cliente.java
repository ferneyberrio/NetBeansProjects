package ejercicioarraylist;

import java.util.ArrayList;

public class cliente {

    private int documento;
    private String nombre;
    private String correo;
    private int edad = 10;
    private float estatura;

    /*
      constructor
     */
    public cliente(int documento, String nombre, String correo, int edad, float estatura) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.estatura = estatura;

    }//fin constructor
    
    public ArrayList<cliente> regresarDtaos(){
        ArrayList<cliente> listaClientes = new ArrayList<cliente>();
        cliente cli = new cliente(documento, nombre, correo, edad, estatura);
//        System.out.println(cliente);
        System.out.println(listaClientes);
        listaClientes.add(cli);
        System.out.println(cli.edad);
    
        return listaClientes;
    }// fin método

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "cliente{" + "documento=" + documento + ", nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

}//fin clase
