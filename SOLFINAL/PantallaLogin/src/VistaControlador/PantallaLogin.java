
package VistaControlador;

import Modelo.BBDD;
import Modelo.OperativasBBDD;
import Modelo.SingleConexion;
import Modelo.Usuario;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.TrayIcon;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author galog
 */
public class PantallaLogin extends javax.swing.JFrame {
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public PantallaLogin() {
        initComponents();
        
        setTitle("Login");
        PantallaLogueado.setTitle("Principal");
        PantallaCreacionUsuario.setTitle("Agregar nuevo usuario");
        Calendario.setVisible(false);

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
        botonFecha = new javax.swing.JButton();
        Calendario = new com.toedter.calendar.JCalendar();
        textoPrincipal = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        textoPassword = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        botonLogear = new javax.swing.JButton();
        checkboxMostrarPassword = new javax.swing.JCheckBox();
        campoPassword = new javax.swing.JPasswordField();
        botonCerrarPrincipal = new javax.swing.JButton();
        botonCambiarPassword = new javax.swing.JButton();

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
        PantallaCreacionUsuario.setSize(new java.awt.Dimension(1019, 796));

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

        campoFechaOpcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaOpcionalActionPerformed(evt);
            }
        });

        botonVolverUsuario.setText("Volver");
        botonVolverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverUsuarioActionPerformed(evt);
            }
        });

        botonAgregarUsuario.setText("Agregar");
        botonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarUsuarioActionPerformed(evt);
            }
        });

        botonFecha.setText("Fecha");
        botonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaActionPerformed(evt);
            }
        });

        Calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CalendarioPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout PantallaCreacionUsuarioLayout = new javax.swing.GroupLayout(PantallaCreacionUsuario.getContentPane());
        PantallaCreacionUsuario.getContentPane().setLayout(PantallaCreacionUsuarioLayout);
        PantallaCreacionUsuarioLayout.setHorizontalGroup(
            PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoConfirmarContrasenia)
                            .addComponent(textoNuevaContrasenia))
                        .addGap(39, 39, 39)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(textoDatosOpcionales))
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(textoInformacionNuevoUsuario)))))
                .addContainerGap(381, Short.MAX_VALUE))
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
                        .addGap(59, 59, 59)))
                .addComponent(botonFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        PantallaCreacionUsuarioLayout.setVerticalGroup(
            PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(textoInformacionNuevoUsuario)
                .addGap(63, 63, 63)
                .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PantallaCreacionUsuarioLayout.createSequentialGroup()
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNuevoUsuario)
                            .addComponent(campoNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNuevaContrasenia)
                            .addComponent(campoNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(PantallaCreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoConfirmarContrasenia)
                            .addComponent(campoConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
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
                            .addComponent(campoFechaOpcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFecha)))
                    .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        botonCambiarPassword.setText("Cambiar Password");
        botonCambiarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(32, 32, 32))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonCerrarPrincipal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(botonLogear, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxMostrarPassword)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonCambiarPassword)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
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
                    .addComponent(botonCerrarPrincipal)
                    .addComponent(botonCambiarPassword))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLogearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogearActionPerformed
        
        String nombre = campoUsuario.getText();
        String password = String.valueOf(campoPassword.getPassword());

        Connection con = SingleConexion.getConnection();

        boolean loginExitoso = OperativasBBDD.iniciarUsuario(nombre, password, con);

        if (loginExitoso) {
            PantallaLogueado.setVisible(true);

            textoUsuarioLogueado.setText("El usuario " + campoUsuario.getText() + " esta logueado");

        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Intentelo de nuevo.");

        }

        campoUsuario.setText("");
        campoPassword.setText("");


    }//GEN-LAST:event_botonLogearActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        PantallaLogueado.dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void checkboxMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxMostrarPasswordActionPerformed
        if (checkboxMostrarPassword.isSelected()) {
            campoPassword.setEchoChar((char) 0);
        } else {
            campoPassword.setEchoChar(('*'));
        }
    }//GEN-LAST:event_checkboxMostrarPasswordActionPerformed

    private void botonCerrarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarPrincipalActionPerformed

        SingleConexion.closeConnection();
        System.exit(0);


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

    private void botonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarUsuarioActionPerformed
        Connection con = SingleConexion.getConnection();
        OperativasBBDD.cargarUsuarios(con);
        if (!campoNuevaContrasenia.getText().equals(campoConfirmarContrasenia.getText())) {

            campoNuevaContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            campoConfirmarContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(rootPane, "Error, los password no coindiden", "Error de password", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear una variable para almacenar los nombres de los campos vacíos
        String camposVacios = "";
        String camposMalFormados = "";

// Validación para el ID de Usuario: debe ser numérico y no vacío
//        if (campoIdUsuario.getText().isEmpty()) {
//            camposVacios += "ID de Usuario\n";
//            campoIdUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
//        } else if (!campoIdUsuario.getText().matches("\\d+")) { // Solo entra aquí si no está vacío
//            camposMalFormados += "ID de Usuario (debe ser numérico)\n";
//            campoIdUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
//        }
//        
//        int comprobarId = 0;
//        comprobarId = Integer.valueOf(campoIdUsuario.getText());
//        
//        if(OperativasBBDD.leerUsuarios(comprobarId, con) == true){
//            
//            JOptionPane.showMessageDialog(rootPane, "Error id ya existente:", "Error de id", JOptionPane.WARNING_MESSAGE);
//            campoIdUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
//            return;
//        }
        
        
        

// Validación para el Nuevo Usuario: debe estar lleno y no contener dígitos
        if (campoNuevoUsuario.getText().isEmpty()) {
            camposVacios += "Nuevo Usuario\n";
            campoNuevoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        } else if (campoNuevoUsuario.getText().matches(".*\\d.*")) { // Solo entra aquí si no está vacío
            camposMalFormados += "Nuevo Usuario (no debe contener números)\n";
            campoNuevoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        }

// Validación para el Apellido Opcional: debe estar lleno y no contener dígitos
        if (campoApellidoOpcional.getText().isEmpty()) {
            camposVacios += "Apellido Opcional\n";
            campoApellidoOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        } else if (campoApellidoOpcional.getText().matches(".*\\d.*")) { // Solo entra aquí si no está vacío
            camposMalFormados += "Apellido Opcional (no debe contener números)\n";
            campoApellidoOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        }

// Validación para el Nombre Opcional: debe estar lleno y no contener dígitos
        if (campoNombreOpcional.getText().isEmpty()) {
            camposVacios += "Nombre Opcional\n";
            campoNombreOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        } else if (campoNombreOpcional.getText().matches(".*\\d.*")) { // Solo entra aquí si no está vacío
            camposMalFormados += "Nombre Opcional (no debe contener números)\n";
            campoNombreOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
        }

// Validación para la Fecha Opcional: debe estar lleno y contener solo números
        if (campoFechaOpcional.getText().isEmpty()) {
            camposVacios += "Fecha Opcional\n";
            campoFechaOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            camposMalFormados += "Fecha Opcional\n"; // Si está vacío, se considera mal formado también
        } 
        
//        else if (!campoFechaOpcional.getText().matches("\\d+")) { // Solo entra aquí si no está vacío
//            camposMalFormados += "Fecha Opcional (debe contener solo números)\n";
//            campoFechaOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
//        }

// Validación para el Correo Opcional: debe estar lleno y tener formato válido
        if (campoCorreoOpcional.getText().isEmpty()) {
            camposVacios += "Correo Opcional\n";
            campoCorreoOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            camposMalFormados += "Correo Opcional\n"; // Si está vacío, se considera mal formado también
        } else if (!campoCorreoOpcional.getText().contains("@") || !campoCorreoOpcional.getText().contains(".")) {
            campoCorreoOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(rootPane, "Error, el correo es inválido:", "Error de correo", JOptionPane.WARNING_MESSAGE);
            campoCorreoOpcional.setText("@");
        }

// Validación para Confirmar Contraseña: debe estar lleno
        if (campoConfirmarContrasenia.getText().isEmpty()) {
            camposVacios += "Confirmar Contraseña\n";
            campoConfirmarContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            camposMalFormados += "Confirmar Contraseña\n"; // Si está vacío, se considera mal formado también
        }

// Validación para Nueva Contraseña: debe estar lleno
        if (campoNuevaContrasenia.getText().isEmpty()) {
            camposVacios += "Nueva Contraseña\n";
            campoNuevaContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
            camposMalFormados += "Nueva Contraseña\n"; // Si está vacío, se considera mal formado también
        }

// Manejo de campos vacíos
        if (!camposVacios.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Error, los siguientes campos están vacíos:\n" + camposVacios, "Error de campos vacíos", JOptionPane.WARNING_MESSAGE);
            
            campoNuevoUsuario.setText("");
            campoNuevaContrasenia.setText("");
            campoConfirmarContrasenia.setText("");
            campoNombreOpcional.setText("");
            campoApellidoOpcional.setText("");
            campoFechaOpcional.setText("");
            campoCorreoOpcional.setText("@");
            return;
        }

// Manejo de campos mal formados
        if (!camposMalFormados.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Error, los siguientes campos están mal formados:\n" + camposMalFormados, "Error de campos mal formados", JOptionPane.WARNING_MESSAGE);
            
            campoNuevoUsuario.setText("");
            campoNuevaContrasenia.setText("");
            campoConfirmarContrasenia.setText("");
            campoNombreOpcional.setText("");
            campoApellidoOpcional.setText("");
            campoFechaOpcional.setText("");
            campoCorreoOpcional.setText("@");
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Usuario creado correctamente", "exito", JOptionPane.INFORMATION_MESSAGE);
        OperativasBBDD.crearUsuario( campoNuevoUsuario.getText(), campoApellidoOpcional.getText(), campoFechaOpcional.getText(), campoCorreoOpcional.getText(), campoNuevaContrasenia.getText(), con);
        OperativasBBDD.cargarUsuarios(con);


    }//GEN-LAST:event_botonAgregarUsuarioActionPerformed

    private void botonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaActionPerformed
        
        Calendario.setVisible(true);
        
    }//GEN-LAST:event_botonFechaActionPerformed

    private void botonCambiarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPasswordActionPerformed
        
        Connection con = SingleConexion.getConnection();
        
        String nombre = campoUsuario.getText();
        String password = String.valueOf(campoPassword.getPassword());
        
        if(OperativasBBDD.modificarUsuario(nombre, password, con) == true){
            JOptionPane.showMessageDialog(rootPane, "Usuario " + campoUsuario.getText() + " modificado correctamente", "exito", JOptionPane.INFORMATION_MESSAGE);
            campoPassword.setText("");
        }
        
        if(OperativasBBDD.modificarUsuario(nombre, password, con) == false){
            JOptionPane.showMessageDialog(rootPane, "Usuario " + campoUsuario.getText() + " no existe", "exito", JOptionPane.INFORMATION_MESSAGE);
            campoPassword.setText("");
            campoUsuario.setText("");
        }
        
        OperativasBBDD.cargarUsuarios(con);
    }//GEN-LAST:event_botonCambiarPasswordActionPerformed

    private void campoFechaOpcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaOpcionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaOpcionalActionPerformed

    private void CalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CalendarioPropertyChange
        
        
        
        
            SimpleDateFormat ff = new SimpleDateFormat("MM/dd/yyyy");
            campoFechaOpcional.setText(ff.format(Calendario.getCalendar().getTime()));
        
        
        
    }//GEN-LAST:event_CalendarioPropertyChange

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
        
        Connection con = SingleConexion.getConnection();
        BBDD.inicializarBaseDeDatos(con);
        OperativasBBDD.cargarUsuarios(con);

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Calendario;
    private javax.swing.JDialog PantallaCreacionUsuario;
    private javax.swing.JDialog PantallaLogueado;
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton botonAgregarUsuario;
    private javax.swing.JButton botonCambiarPassword;
    private javax.swing.JButton botonCerrarPrincipal;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.JButton botonFecha;
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
