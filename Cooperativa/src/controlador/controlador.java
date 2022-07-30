package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteCRUD;
import vista.FormularioDB;

public class controlador {

    FormularioDB fr;   // instancias formulario con el nombre fr 
    // hacer CRUD
    Cliente cli;
    ClienteCRUD ccrud = new ClienteCRUD();
    ArrayList<Cliente> lista = new ArrayList<>();

    public controlador(FormularioDB fr) {
        this.fr = fr;
    }// fin constructor

    public void insertarControlador() {
        int documento;
        String nombre, apellido, correo, celular;
        documento = Integer.parseInt(fr.getjTextFieldDocu().getText());   // atrapar lo que tiene el textfile
        nombre = fr.getjTextFieldNombre().getText();
        apellido = fr.getjTextFieldApellido().getText();
        correo = fr.getjTextFieldCorreo().getText();
        celular = fr.getjTextField5().getText();

        // enviar datos a cliente
        cli = new Cliente(documento, nombre, correo, celular);
        int x = ccrud.insertar(cli);

        if (x == 1) {
            JOptionPane.showMessageDialog(null, "Datos guardados EXITOSAMENTE");
        }// fin if
        else {
            JOptionPane.showMessageDialog(null, "Datos ERROR");
        }

    }// fin método

    public void actualizarControl() {
        int documento;
        String nombre, apellido, correo, celular;
        documento = Integer.parseInt(fr.getjTextFieldDocu().getText());   // atrapar lo que tiene el textfile
        nombre = fr.getjTextFieldNombre().getText();
        apellido = fr.getjTextFieldApellido().getText();
        correo = fr.getjTextFieldCorreo().getText();
        celular = fr.getjTextField5().getText();
        cli = new Cliente(documento, nombre, correo, celular);
        ccrud.actualizar(cli);

        if (ccrud.actualizar(cli) == 1) {
            JOptionPane.showMessageDialog(null, "Datos Actualizados EXITOSAMENTE");
        }// fin if
        else {
            JOptionPane.showMessageDialog(null, "Datos NO actualizados");
        }
    }// fin metodo

    public void consltarControlador() {
        DefaultTableModel tabla = new DefaultTableModel();    // metodo para agregar a tabla
        tabla.addColumn("documento");
        tabla.addColumn("nombre");
        tabla.addColumn("apellido");
        tabla.addColumn("correo");
        tabla.addColumn("celular");
        
        fr.getjTable1().setModel(tabla);   // agrega colunas a la tabla
        String arr[] = new String[5];
        //traer datos de la consulta
        lista = ccrud.consulta();
        for (Cliente i : lista) {
            arr[0] = String.valueOf( i.getDocumento()) ;
            arr[1] = i.getNombre();
            arr[2] = i.getApellido();
            arr[3] = i.getCorreo();
            arr[4] = i.getCelular();
            tabla.addRow(arr);
        }// fin for

    }// fin método
    
    public void listar(){
    int lis = fr.getjTable1().getSelectedRow();
    if( lis > 0 ){
    fr.getjTextFieldDocu().setText(fr.getjTable1().getValueAt(lis, 0).toString());
    fr.getjTextFieldNombre().setText(fr.getjTable1().getValueAt(lis, 1).toString());
    
    fr.getjTextFieldCorreo().setText(fr.getjTable1().getValueAt(lis, 3).toString());
    fr.getjTextField5().setText(fr.getjTable1().getValueAt(lis, 4).toString());
    fr.getjTextFieldApellido().setText(fr.getjTable1().getValueAt(lis, 2).toString());
    }//fin if
    }//fin metodo

    public void eliminarControlador(){
    int documento;
    documento = Integer.parseInt(fr.getjTextFieldDocu().getText());
    ccrud.eliminar(cli);
    }// finmétodo eliminar
    
    
}// fin clase
