
/******  para enlazar con la base de datos en mysql  *********/

package modelo;

public class Cliente {
    private int documento;    // nombre libre, tipo igual a la base de datos 
    private String nombre;    // nombre libre, tipo igual a la base de datos 
    private String apellido;
    private String correo;
    private String celular;

    public Cliente(int documento, String nombre, String correo, String celular) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
}// fin clase
