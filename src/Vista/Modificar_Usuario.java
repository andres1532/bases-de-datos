/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlUsuario;
import Modelo.Imagen;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhonny Londoño G
 */
public class Modificar_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Usuario
     */
    public Modificar_Usuario() {
               
        initComponents();
        
        int x  = jPanel1.getWidth();
        int y = jPanel1.getHeight();
        
        String archivo = "/img/fondo_2.jpg";
        
        Imagen img =  new Imagen(x, y, archivo);
        
        jPanel1.add(img);
        jPanel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Midusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Musuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mcontraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Mnombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Mnombre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Mapellido1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Mapellido2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Mtelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Mcorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Mestatura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Mpeso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Medad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Modificar_Usuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Regresar al Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consultar y Modificar los datos del Usuario");

        jLabel2.setText("IdUsuario *");

        jButton1.setText("Buscar ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario *");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Nombre 1");

        jLabel6.setText("Nombre 2");

        jLabel7.setText("Apellido 1");

        jLabel8.setText("Apellido 2");

        jLabel9.setText("Telefono");

        jLabel10.setText("Correo");

        jLabel11.setText("Estatura");

        jLabel12.setText("Peso");

        jLabel13.setText("Edad");

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Modificar_Usuario.setText("Modificar Usuario");
        Modificar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Modificar_Usuario)
                        .addGap(59, 59, 59)
                        .addComponent(jButton2)
                        .addGap(90, 90, 90)
                        .addComponent(jButton3)
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Midusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Musuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Mnombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(Mnombre1)
                                        .addComponent(Mapellido1)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(30, 30, 30)
                                        .addComponent(Mestatura))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(29, 29, 29)
                                        .addComponent(Mtelefono))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(38, 38, 38)
                                        .addComponent(Mcorreo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(48, 48, 48)
                                        .addComponent(Mpeso))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(48, 48, 48)
                                .addComponent(Medad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Midusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Musuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(Mtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(Mcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Mnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Mestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Mnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Mpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Mapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Medad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Mapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(Modificar_Usuario))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {

            String IdUsuario;

            ControlUsuario objcu = new ControlUsuario();
            IdUsuario = Midusuario.getText();

            Usuario obju = objcu.buscarUsuario(IdUsuario);

            Musuario.setText(obju.getUsuario());
            Mcontraseña.setText(obju.getContrasenia());
            Mnombre1.setText(obju.getNombre1());
            Mnombre2.setText(obju.getNombre2());
            Mapellido1.setText(obju.getApellido1());
            Mapellido2.setText(obju.getApellido2());
            Mtelefono.setText(obju.getTelefono());
            Mcorreo.setText(obju.getCorreo());
            Mestatura.setText(Double.toString(obju.getEstatura()));
            Mpeso.setText(Double.toString(obju.getPeso()));
            Medad.setText(Integer.toString(obju.getEdad()));

            Musuario.setEnabled(true);
            Mcontraseña.setEnabled(true);
            Mnombre1.setEnabled(true);
            Mnombre2.setEnabled(true);
            Mapellido1.setEnabled(true);
            Mapellido2.setEnabled(true);
            Mtelefono.setEnabled(true);
            Mcorreo.setEnabled(true);

        } catch (Exception e) {
            System.out.println("error + e");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Modificar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_UsuarioActionPerformed
       
        String IdUsuario;
        String Usuario;
        String Contrasenia;
        String Nombre1;
        String Nombre2;
        String Apellido1;
        String Apellido2;
        String telefono;
        String Correo;
        double Estatura;
        double Peso;
        int Edad;

        IdUsuario = Midusuario.getText();
        Usuario = Musuario.getText();
        Contrasenia=Mcontraseña.getText();
        Nombre1=Mnombre1.getText();
        Nombre2=Mnombre2.getText();
        Apellido1=Mapellido1.getText();
        Apellido2=Mapellido2.getText();
        telefono = Mtelefono.getText();
        Correo= Mcorreo.getText();
       Estatura = Double.parseDouble(Mestatura.getText());
       Peso = Double.parseDouble(Mcorreo.getText());
       Edad = Integer.parseInt(Medad.getText());
        
        
        
        if (!Midusuario.getText().equals("")) {
           IdUsuario = Midusuario.getText();
        }
        
        if (!Musuario.getText().equals("")) {
           Usuario = Musuario.getText();
        }
        
          if (!Mcontraseña.getText().equals("")) {
           Contrasenia = Mcontraseña.getText();
        }
          if (!Mnombre1.getText().equals("")) {
          Nombre1 = Mnombre1.getText();
        }
          if (!Mnombre2.getText().equals("")) {
           Nombre2 = Mnombre2.getText();
        }
           if (!Mapellido1.getText().equals("")) {
           Apellido1 = Mapellido1.getText();
        }
            if (!Mapellido2.getText().equals("")) {
           Apellido2 = Mapellido2.getText();
        }
             if (!Mtelefono.getText().equals("")) {
           telefono = Mtelefono.getText();
        }
              if (!Mcorreo.getText().equals("")) {
           Correo = Mcorreo.getText();
        }
                 
          
        ControlUsuario objm= new ControlUsuario();
     Usuario objh= new Usuario(IdUsuario, Usuario, Contrasenia, Nombre1, Nombre2, Apellido1, Apellido2, telefono, Correo, Estatura, Peso, Edad);
      
            try {
                boolean ch =objm.insertarUsuario(objh);
                if(ch){
                    System.out.println("se modifico el usuario");
                }
                else{
                    System.out.println("No se modifico el usuario");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Modificar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
    }//GEN-LAST:event_Modificar_UsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String IdUsuario;
        String Usuario;
        String Contrasenia;
        String Nombre1;
        String Nombre2;
        String Apellido1;
        String Apellido2;
        String telefono;
        String Correo;
        double Estatura;
        double Peso;
        int Edad;

        IdUsuario = Midusuario.getText();
        Usuario = Musuario.getText();
        Contrasenia=Mcontraseña.getText();
        Nombre1=Mnombre1.getText();
        Nombre2=Mnombre2.getText();
        Apellido1=Mapellido1.getText();
        Apellido2=Mapellido2.getText();
        telefono = Mtelefono.getText();
        Correo= Mcorreo.getText();
       Estatura = Double.parseDouble(Mestatura.getText());
       Peso = Double.parseDouble(Mcorreo.getText());
       Edad = Integer.parseInt(Medad.getText());
       
       ControlUsuario obje=new ControlUsuario();
       Usuario objh= new Usuario(IdUsuario, Usuario, Contrasenia, Nombre1, Nombre2, Apellido1, Apellido2, telefono, Correo, Estatura, Peso, Edad);
       
       boolean ch =obje.eliminarUsuario(objh);
       if(ch){
           System.out.println("se borro el usuario");
       }
       else{
           System.out.println("No se borro el usuario");
       }
       Midusuario.setText("");
        Musuario.setText("");
        Mnombre1.setText("");
        Mnombre2.setText("");
        Mcontraseña.setText("");
        Mpeso.setText("");
        Mapellido1.setText("");
        Mapellido2.setText("");
        Mtelefono.setText("");
        Mcorreo.setText("");
        Mestatura.setText("");
        Medad.setText("");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Insertar_Usuario obj = new Insertar_Usuario();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main obj = new Main();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Mapellido1;
    private javax.swing.JTextField Mapellido2;
    private javax.swing.JTextField Mcontraseña;
    private javax.swing.JTextField Mcorreo;
    private javax.swing.JTextField Medad;
    private javax.swing.JTextField Mestatura;
    private javax.swing.JTextField Midusuario;
    private javax.swing.JTextField Mnombre1;
    private javax.swing.JTextField Mnombre2;
    private javax.swing.JButton Modificar_Usuario;
    private javax.swing.JTextField Mpeso;
    private javax.swing.JTextField Mtelefono;
    private javax.swing.JTextField Musuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
