package controlador;

import java.sql.*;               // me permite importar otras librerias de sql
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class conexion {

    Connection cnn;    // creo variable llamda cnn de tipo connection

    public Connection coneccionDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {    // varible ex de tipo Exception
            System.out.println(ex);    // muestro el error almacenado en ex
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/cooperativa2", "root", "root");
            JOptionPane.showMessageDialog(null, "Conexion OK");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return cnn;   // retornar la conexión
        
    }// fin método
    
    public static void main(String[]arg){
       
    conexion con = new conexion();   // creo objeto de tipo conexion
    con.coneccionDB();
    }// fin método main

}// fin clase
