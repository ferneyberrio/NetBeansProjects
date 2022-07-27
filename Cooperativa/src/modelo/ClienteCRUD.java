
package modelo;

import java.sql.*;               // me permite importar otras librerias de sql
import com.mysql.cj.jdbc.PreparedStatementWrapper;
//import com.sun.jdi.connect.spi.Connection;
import controlador.conexion;
import javax.swing.JOptionPane;


public class ClienteCRUD {
 
    conexion con = new conexion();   // objeto de la clase conexion
    Connection cnn = con.coneccionDB();
    
    PreparedStatement ps;   // traductor entre java y mysql
    
    public void insertar(Cliente cli){
    //Cliente datos = new Cliente(0, "", "", "");
        try {
            ps = cnn.prepareStatement("INSERT INTO Cliente VALUES()"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   
    
    }// fin clase
    
}// fin clase
