/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaControlador;

import Modelo.BBDD;
import Modelo.Main;
import Modelo.SingleConexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author galog
 */
public class PantallaLogin extends javax.swing.JFrame {

    /**
     * Creates new form PantallaLogin
     */
    public PantallaLogin() {
        initComponents();
        
        setTitle("Login");
        PantallaLogueado.setTitle("Principal");
        PantallaCreacionUsuario.setTitle("Agregar nuevo usuario");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantallaLogueado = new javax.swing.JDialog();
        textoBienvenida = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        textoUsuarioLogueado = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();
        botonCrearUsuario = new javax.swing.JButton();
        PantallaCreacionUsuario = new javax.swing.JDialog();
        textoInformacionNuevoUsuario = new javax.swing.JLabel();
        textoNuevoUsuario = new javax.swing.JLabel();
        textoNuevaContrasenia = new javax.swing.JLabel();
        textoConfirmarContrasenia = new javax.swing.JLabel();
        campoNuevoUsuario = new javax.swing.JTextField();
        campoNuevaContrasenia = new javax.swing.JTextField();
        campoConfirmarContrasenia = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        textoDatosOpcionales = new javax.swing.JLabel();
        textoNombreOpcional = new javax.swing.JLabel();
        textoApellidoOpcional = new javax.swing.JLabel();
        textoFechaNacimientoOpcional = new javax.swing.JLabel();
        textoCorreoOpcional = new javax.swing.JLabel();
        campoNombreOpcional = new javax.swing.JTextField();
        campoApellidoOpcional = new javax.swing.JTextField();
        campoFechaOpcional = new javax.swing.JTextField();
        campoCorreoOpcional = new javax.swing.JTextField();
        botonVolverUsuario = new javax.swing.JButton();
        botonAgregarUsuario = new javax.swing.JButton();
        textoPrincipal = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        textoPassword = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        botonLogear = new javax.swing.JButton();
        checkboxMostrarPassword = new javax.swing.JCheckBox();
        campoPassword = new javax.swing.JPasswordField();
        botonCerrarPrincipal = new javax.swing.JButton();

        PantallaLogueado.setResizable(false);
        PantallaLogueado.setSize(new java.awt.Dimension(741, 598));

        textoBienvenida.setText("BIENVENID@");

        botonCerrarSesion.setText("Cerrar sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaControlador/usuarioLogueado.jpg"))); // NOI18N

        botonCrearUsuario.setText("Crear nuevo usuario");
        botonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PantallaLogueadoLayout = new javax.swing.GroupLayout(PantallaLogueado.getContentPane());
        PantallaLogueado.getContentPane().setLayout(PantallaLogueadoLayout);
        PantallaLogueadoLayout.setHorizontalGroup(
            PantallaLogueadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                .addGroup(PantallaLogueadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(textoBienvenida))
                    .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(imagenUsuario))
                    .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(PantallaLogueadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCrearUsuario)
                            .addComponent(textoUsuarioLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(botonCerrarSesion)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        PantallaLogueadoLayout.setVerticalGroup(
            PantallaLogueadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLogueadoLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(textoBienvenida)
                .addGap(30, 30, 30)
                .addComponent(imagenUsuario)
                .addGap(55, 55, 55)
                .addComponent(textoUsuarioLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(botonCrearUsuario)
                .addGap(73, 73, 73)
                .addComponent(botonCerrarSesion)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        PantallaCreacionUsuario.setResizable(false);
        PantallaCreacionUsuario.setSize(new java.awt.Dimension(656, 796));

        textoInformacionNuevoUsuario.setText("Por favor, introsuzaca la informacion nueva del usuario:");

        textoNuevoUsuario.setText("Usuario");

        textoNuevaContrasenia.setText("Contrasenia");

        textoConfirmarContrasenia.setText("Confirmar contrasenia");

        campoNuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNuevaContraseniaActionPerformed(evt);
            }
        });

        textoDatosOpcionales.setText("Agregar datos opcionales del usuario");

        textoNombreOpcional.setText("Nombre");

        textoApellidoOpcional.setText("Apellidos");

        textoFechaNacimientoOpcional.setText("Fecha de nacimiento");

        textoCorreoOpcional.setText("Correo electronico");

        campoFechaOpcional.setText("//");

        botonVolverUsuario.setText("Volver");
        botonVolverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverUsuarioActionPerformed(evt);
            }
        });

        botonAgregarUsuario.setText("Agregar");

        javax.swing.GroupLayout PantallaCreacionUsuarioLayout = new javax.swing.GroupLayout(PantallaCreacionUsuario.getContentPane());
        PantallaCreacionUsuario.getContentPane().setLayout(PantallaCreacionUsuarioLayout);
        PantallaCreacionUsuarioLayout.setHorizontalGroup(
            PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoInformacionNuevoUsuario)
                .addGap(132, 132, 132))
            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoConfirmarContrasenia)
                    .addComponent(textoNuevaContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNuevoUsuario)
                    .addComponent(campoNuevaContrasenia)
                    .addComponent(campoConfirmarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(111, 111, 111))
            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(textoDatosOpcionales))
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNombreOpcional)
                            .addComponent(textoApellidoOpcional)
                            .addComponent(textoFechaNacimientoOpcional)
                            .addComponent(textoCorreoOpcional)
                            .addComponent(botonVolverUsuario))
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombreOpcional)
                                    .addComponent(campoApellidoOpcional)
                                    .addComponent(campoFechaOpcional)
                                    .addComponent(campoCorreoOpcional, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaCreacionUsuarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAgregarUsuario)
                                .addGap(59, 59, 59)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PantallaCreacionUsuarioLayout.setVerticalGroup(
            PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(textoInformacionNuevoUsuario)
                .addGap(54, 54, 54)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNuevoUsuario)
                    .addComponent(campoNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNuevaContrasenia)
                    .addComponent(campoNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoConfirmarContrasenia)
                    .addComponent(campoConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(textoDatosOpcionales)
                .addGap(30, 30, 30)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombreOpcional)
                    .addComponent(campoNombreOpcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellidoOpcional)
                    .addComponent(campoApellidoOpcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFechaNacimientoOpcional)
                    .addComponent(campoFechaOpcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCorreoOpcional)
                    .addComponent(campoCorreoOpcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverUsuario)
                    .addComponent(botonAgregarUsuario))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textoPrincipal.setText("Por favor, introduzca sus credenciales para acceder:");

        textoUsuario.setText("Usuario:");

        textoPassword.setText("Password");

        botonLogear.setText("Loguear");
        botonLogear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogearActionPerformed(evt);
            }
        });

        checkboxMostrarPassword.setText("Mostrar");
        checkboxMostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMostrarPasswordActionPerformed(evt);
            }
        });

        botonCerrarPrincipal.setText("Cerrar");
        botonCerrarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoUsuario)
                                    .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoUsuario)
                                    .addComponent(campoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addComponent(checkboxMostrarPassword))
                            .addComponent(botonCerrarPrincipal))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonLogear, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPassword)
                    .addComponent(checkboxMostrarPassword)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLogear)
                    .addComponent(botonCerrarPrincipal))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLogearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogearActionPerformed
        
       if(Main.recorrerUsuarios(campoUsuario.getText(), String.valueOf(campoPassword.getPassword())) == true){
           PantallaLogueado.setVisible(true);
           textoUsuarioLogueado.setText("El usuario " + campoUsuario.getText() + " esta logueado");
       } else {
           JOptionPane.showMessageDialog(rootPane, "Error, no existe el usuario", getTitle(), JOptionPane.WARNING_MESSAGE);
            campoUsuario.setText("");
            campoPassword.setText("");
       }
        
        
        
    }//GEN-LAST:event_botonLogearActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        PantallaLogueado.dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void checkboxMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxMostrarPasswordActionPerformed
        if (checkboxMostrarPassword.isSelected()){
            campoPassword.setEchoChar((char) 0);
        } else {
            campoPassword.setEchoChar(('*'));
        }
    }//GEN-LAST:event_checkboxMostrarPasswordActionPerformed

    private void botonCerrarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarPrincipalActionPerformed
        
        Connection con = SingleConexion.closeConnection();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
    }//GEN-LAST:event_botonCerrarPrincipalActionPerformed

    private void botonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuarioActionPerformed
        PantallaCreacionUsuario.setVisible(true);
    }//GEN-LAST:event_botonCrearUsuarioActionPerformed

    private void campoNuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNuevaContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNuevaContraseniaActionPerformed

    private void botonVolverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverUsuarioActionPerformed
        PantallaCreacionUsuario.dispose();
    }//GEN-LAST:event_botonVolverUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new PantallaLogin().setVisible(true);
                ArrayList <Usuario> usuarios = new ArrayList();
                Connection con = SingleConexion.getConnection();
                BBDD.inicializarBaseDeDatos(con);
                Main.cargarUsuarios(con);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog PantallaCreacionUsuario;
    private javax.swing.JDialog PantallaLogueado;
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton botonAgregarUsuario;
    private javax.swing.JButton botonCerrarPrincipal;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.JButton botonLogear;
    private javax.swing.JButton botonVolverUsuario;
    private javax.swing.JTextField campoApellidoOpcional;
    private javax.swing.JTextField campoConfirmarContrasenia;
    private javax.swing.JTextField campoCorreoOpcional;
    private javax.swing.JTextField campoFechaOpcional;
    private javax.swing.JTextField campoNombreOpcional;
    private javax.swing.JTextField campoNuevaContrasenia;
    private javax.swing.JTextField campoNuevoUsuario;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JCheckBox checkboxMostrarPassword;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JLabel textoApellidoOpcional;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JLabel textoConfirmarContrasenia;
    private javax.swing.JLabel textoCorreoOpcional;
    private javax.swing.JLabel textoDatosOpcionales;
    private javax.swing.JLabel textoFechaNacimientoOpcional;
    private javax.swing.JLabel textoInformacionNuevoUsuario;
    private javax.swing.JLabel textoNombreOpcional;
    private javax.swing.JLabel textoNuevaContrasenia;
    private javax.swing.JLabel textoNuevoUsuario;
    private javax.swing.JLabel textoPassword;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel textoUsuarioLogueado;
    // End of variables declaration//GEN-END:variables
}
