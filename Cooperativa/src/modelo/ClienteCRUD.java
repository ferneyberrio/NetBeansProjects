package modelo;

import java.sql.*;               // me permite importar otras librerias de sql
//import com.mysql.cj.jdbc.PreparedStatementWrapper;
//import com.sun.jdi.connect.spi.Connection;
import controlador.conexion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteCRUD {

    conexion con = new conexion();   // objeto de la clase conexion
    Connection cnn = con.coneccionDB();

    PreparedStatement ps;   // traductor entre java y mysql
    ResultSet rs;  //guarda registros completos y coloco nombre rs

    public int insertar(Cliente cli) {
        //Cliente datos = new Cliente(0, "", "", "");
        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO Cliente VALUES(?,?,?,?,?)");
            ps.setInt(1, cli.getDocumento());    // para la posicion 1 de la BD
            ps.setString(2, cli.getNombre());            // para la posicion 2 de la BD
            ps.setString(3, cli.getApellido());            // para la posicion 3 de la BD
            ps.setString(4, cli.getCorreo());            // para la posicion 4 de la BD
            ps.setString(5, cli.getCelular());            // para la posicion 5 de la BD      
            x = ps.executeUpdate();                              // enviar para insertar datos(retorna int)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en Inseratar : " + e);
        }
        return x;

    }// fin clase

    public int actualizar(Cliente cli) {
        int _x = 0;
        try {
            ps = cnn.prepareStatement("UPDATE Cliente set  nombre=?, apellido=?, correo=?, celular=? where documento=?");
            ps.setString(1, cli.getNombre());            // para la posicion 1 de la BD
            ps.setString(2, cli.getApellido());            // para la posicion 2 de la BD
            ps.setString(3, cli.getCorreo());            // para la posicion 3 de la BD
            ps.setString(4, cli.getCelular());            // para la posicion 4 de la BD      
            ps.setInt(5, cli.getDocumento());    // para la posicion 5 de la BD
            _x = ps.executeUpdate();                              // enviar para insertar datos(retorna int)

        } catch (SQLException e) {
            System.out.println("Error en actualización  :  " + e);
        }
        return _x;
    }// fin método

    public void eliminar(Cliente cli) {

        try {
            ps = cnn.prepareStatement("DELETE FROM CLIENTE where documento=?");
            ps.setInt(1, cli.getDocumento());    // para la posicion 1 de la BD
            ps.executeUpdate();             // enviar para ACTUALIZAR datos(retorna int)

        } catch (SQLException ex) {
            System.out.println("eliminar" + ex);
            //Logger.getLogger(ClienteCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// fin método

    public ArrayList<Cliente> consulta() {

        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("SELECT*FROM Cliente");
            rs = ps.executeQuery();      //hacemos q se vincule la sentencia
            // guardar datos
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); // objeto cliente de tipo Cliente   
                lista.add(cliente);
            }// fin while

        } catch (SQLException ex) {
            System.out.println("consulta" + ex);
        }
        return lista;

    }//fi método y retorna un array list de tipo Cliente

}// fin clase
