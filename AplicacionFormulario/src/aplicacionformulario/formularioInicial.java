package aplicacionformulario;

import javax.swing.JOptionPane;

public class formularioInicial extends javax.swing.JFrame {

    public formularioInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTxUsuario = new javax.swing.JTextField();
        jPswClaveUser = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jComboBoxPaises = new javax.swing.JComboBox<>();
        jComboBoxCiudades = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Bienvenido");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(170, 20, 100, 22);

        jTxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxUsuario);
        jTxUsuario.setBounds(170, 120, 64, 22);

        jPswClaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPswClaveUserActionPerformed(evt);
            }
        });
        getContentPane().add(jPswClaveUser);
        jPswClaveUser.setBounds(170, 160, 64, 22);

        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionformulario/java_15498.png"))); // NOI18N
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(120, 110, 32, 32);

        jButtonIngresar.setText("INGRESAR");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar);
        jButtonIngresar.setBounds(160, 230, 84, 22);

        jComboBoxPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jComboBoxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaisesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPaises);
        jComboBoxPaises.setBounds(40, 50, 110, 22);

        jComboBoxCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudadesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCiudades);
        jComboBoxCiudades.setBounds(40, 80, 110, 22);

        jButtonSalir.setBackground(new java.awt.Color(255, 0, 51));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir);
        jButtonSalir.setBounds(330, 40, 72, 22);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionformulario/Login.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 440, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarMsm(String msm) {
        JOptionPane.showMessageDialog(null, msm);
    }// fin método

    private void jPswClaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPswClaveUserActionPerformed

    }//GEN-LAST:event_jPswClaveUserActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        String usuario = jTxUsuario.getText();           // capturar lo que esta en el textfield usuario
        String clave = new String(jPswClaveUser.getPassword());  // capturar password
        String msmUsuario = "";
        if (usuario.equals("Ferney")) { // valida usuario
            msmUsuario = msmUsuario + " ! Usuario Correcto ¡"  ;
            if (clave.equals("1234")) {// validar clave
                msmUsuario = msmUsuario + " !Clave Correcta ¡ \n  Bienvenido";
                
            }//fin if
            else {// else
                msmUsuario = msmUsuario + " !Clave Incorrecta ¡ ";
            }//fin else
        }// fin if
        else {//inicio else
            msmUsuario = " ! Usuario Incorrecto ¡¡¡ ";
        }//fin else
        mostrarMsm(msmUsuario);
        
        //dispose();       // cerrar ventana previa
        cargar();

    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jTxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxUsuarioActionPerformed

    }//GEN-LAST:event_jTxUsuarioActionPerformed

    private void jComboBoxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaisesActionPerformed
       Object selec = jComboBoxPaises.getSelectedItem();
       jComboBoxCiudades.removeAllItems();
        if( selec == "Colombia" ){
       jComboBoxCiudades.addItem("Bogota");
       jComboBoxCiudades.addItem("Medellín");
       jComboBoxCiudades.addItem("Cali");
       }// fin if 
        else if(selec == "Argentina" ){
        jComboBoxCiudades.addItem("Buenos Aires");
        jComboBoxCiudades.addItem("Rosario");
        }//fin else if 
    }//GEN-LAST:event_jComboBoxPaisesActionPerformed

    private void jComboBoxCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudadesActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();   // cerrar ventana
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public void cargar(){
        jComboBoxPaises.removeAll();
        jComboBoxPaises.addItem("Colombia");
        jComboBoxPaises.addItem("Ecuador");
        jComboBoxPaises.addItem("Argentina");
    }// fin método
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxCiudades;
    private javax.swing.JComboBox<String> jComboBoxPaises;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPswClaveUser;
    private javax.swing.JTextField jTxUsuario;
    // End of variables declaration//GEN-END:variables
}
