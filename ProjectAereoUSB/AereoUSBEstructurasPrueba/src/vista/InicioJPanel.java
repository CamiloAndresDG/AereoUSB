/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Camilo y Roberth
 */
public class InicioJPanel extends javax.swing.JPanel {

    private Principal principal;

    /**
     * Creates new form IntentoInicioSeccion
     */
    public InicioJPanel(Principal principal) {
        this.principal = principal;
        initComponents();
    }

    public void abrirNavegador() {
        try {
            Desktop.getDesktop().browse(URI.create("https://www.usbbog.edu.co/"));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(principal, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIngreso = new javax.swing.JPanel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelImagenTituloUsuario = new javax.swing.JLabel();
        jButtonInicioSeccion = new javax.swing.JButton();
        JTextFieldUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JTextContrasena = new javax.swing.JPasswordField();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jLabelImagenContraseña = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelInternet = new javax.swing.JLabel();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelImagenIcono = new javax.swing.JLabel();
        jLabelNombreOlvidar = new javax.swing.JLabel();
        jLabelIDOlvidar = new javax.swing.JLabel();
        jLabelCorreoOlvidar = new javax.swing.JLabel();
        jLabelApelidoOlvidar = new javax.swing.JLabel();
        JTextFieldCorreoOlvidar = new javax.swing.JTextField();
        JTextFieldNombreOlvidar = new javax.swing.JTextField();
        JTextFieldApellidoOlvidar = new javax.swing.JTextField();
        JTextFieldIDOlvidar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabelHechoPor = new javax.swing.JLabel();
        jLabelNombrePresentacion = new javax.swing.JLabel();
        jLabelNombrePresentacion2 = new javax.swing.JLabel();
        jLabelIngenieriaDeSistemas = new javax.swing.JLabel();
        jLabelEstructuraDeDatos = new javax.swing.JLabel();
        jLabelBogota = new javax.swing.JLabel();
        jLabelAereoUSB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIngreso.setBackground(new java.awt.Color(144, 202, 249));
        jPanelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContraseña.setText("Contraseña:");
        jPanelIngreso.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setText("Usuario:");
        jPanelIngreso.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelImagenTituloUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_perm_identity_black_48dp.png"))); // NOI18N
        jPanelIngreso.add(jLabelImagenTituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, 80));

        jButtonInicioSeccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_lock_open_black_24dp.png"))); // NOI18N
        jButtonInicioSeccion.setBorder(null);
        jButtonInicioSeccion.setBorderPainted(false);
        jButtonInicioSeccion.setContentAreaFilled(false);
        jButtonInicioSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioSeccionActionPerformed(evt);
            }
        });
        jPanelIngreso.add(jButtonInicioSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 60, 50));

        JTextFieldUsuario.setBackground(new java.awt.Color(144, 202, 249));
        JTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTextFieldUsuario.setText("Ingrese el usuario");
        JTextFieldUsuario.setBorder(null);
        JTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldUsuarioActionPerformed(evt);
            }
        });
        JTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldUsuarioKeyPressed(evt);
            }
        });
        jPanelIngreso.add(JTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanelIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 10));

        JTextContrasena.setBackground(new java.awt.Color(144, 202, 249));
        JTextContrasena.setText("JTextContrasena");
        JTextContrasena.setBorder(null);
        JTextContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextContrasenaKeyPressed(evt);
            }
        });
        jPanelIngreso.add(JTextContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 160, 30));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_perm_identity_black_18dp.png"))); // NOI18N
        jPanelIngreso.add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabelImagenContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_vpn_key_black_18dp.png"))); // NOI18N
        jPanelIngreso.add(jLabelImagenContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_reorder_black_18dp.png"))); // NOI18N
        jLabelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });
        jPanelIngreso.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabelInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_public_black_24dp.png"))); // NOI18N
        jLabelInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInternetMouseClicked(evt);
            }
        });
        jPanelIngreso.add(jLabelInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, -1, -1));

        jLabelCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-calculadora-filled-25.png"))); // NOI18N
        jLabelCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalculadoraMouseClicked(evt);
            }
        });
        jPanelIngreso.add(jLabelCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("He olvidado la contraseña");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanelIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        add(jPanelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 480));

        jPanel1.setBackground(new java.awt.Color(187, 222, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jLabelMinimizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelMinimizarKeyPressed(evt);
            }
        });
        jPanel1.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 40));

        jLabelImagenIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/isologoUSB.png"))); // NOI18N
        jLabelImagenIcono.setText(" ");
        jPanel1.add(jLabelImagenIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, 190));

        jLabelNombreOlvidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombreOlvidar.setText("Nombre:");
        jPanel1.add(jLabelNombreOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 150, 90, 20));

        jLabelIDOlvidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIDOlvidar.setText("ID:");
        jPanel1.add(jLabelIDOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 240, 70, 20));

        jLabelCorreoOlvidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCorreoOlvidar.setText("Correo:");
        jPanel1.add(jLabelCorreoOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 280, 70, 20));

        jLabelApelidoOlvidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApelidoOlvidar.setText("Apellido:");
        jPanel1.add(jLabelApelidoOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 200, 70, 20));

        JTextFieldCorreoOlvidar.setBackground(new java.awt.Color(187, 222, 251));
        JTextFieldCorreoOlvidar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTextFieldCorreoOlvidar.setText("Ingrese el correo");
        JTextFieldCorreoOlvidar.setBorder(null);
        JTextFieldCorreoOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCorreoOlvidarActionPerformed(evt);
            }
        });
        JTextFieldCorreoOlvidar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldCorreoOlvidarKeyPressed(evt);
            }
        });
        jPanel1.add(JTextFieldCorreoOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 270, 190, 40));

        JTextFieldNombreOlvidar.setBackground(new java.awt.Color(187, 222, 251));
        JTextFieldNombreOlvidar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTextFieldNombreOlvidar.setText("Ingrese el nombre");
        JTextFieldNombreOlvidar.setBorder(null);
        JTextFieldNombreOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNombreOlvidarActionPerformed(evt);
            }
        });
        JTextFieldNombreOlvidar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldNombreOlvidarKeyPressed(evt);
            }
        });
        jPanel1.add(JTextFieldNombreOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 140, 190, 40));

        JTextFieldApellidoOlvidar.setBackground(new java.awt.Color(187, 222, 251));
        JTextFieldApellidoOlvidar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTextFieldApellidoOlvidar.setText("Ingrese el apellido");
        JTextFieldApellidoOlvidar.setBorder(null);
        JTextFieldApellidoOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldApellidoOlvidarActionPerformed(evt);
            }
        });
        JTextFieldApellidoOlvidar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldApellidoOlvidarKeyPressed(evt);
            }
        });
        jPanel1.add(JTextFieldApellidoOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 190, 190, 40));

        JTextFieldIDOlvidar.setBackground(new java.awt.Color(187, 222, 251));
        JTextFieldIDOlvidar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTextFieldIDOlvidar.setText("Ingrese el ID");
        JTextFieldIDOlvidar.setBorder(null);
        JTextFieldIDOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldIDOlvidarActionPerformed(evt);
            }
        });
        JTextFieldIDOlvidar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldIDOlvidarKeyPressed(evt);
            }
        });
        jPanel1.add(JTextFieldIDOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 230, 190, 40));

        jButton2.setBackground(new java.awt.Color(187, 222, 251));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_send_black_18dp.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 360, -1, -1));

        jLabelHechoPor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHechoPor.setText("Hecho por");
        jPanel1.add(jLabelHechoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabelNombrePresentacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombrePresentacion.setText(" Camilo Andrés Díaz Gómez");
        jPanel1.add(jLabelNombrePresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, -1));

        jLabelNombrePresentacion2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombrePresentacion2.setText("Juan Esteban Contreras Díaz");
        jPanel1.add(jLabelNombrePresentacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabelIngenieriaDeSistemas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelIngenieriaDeSistemas.setText("     Ingeniería de Sistemas");
        jPanel1.add(jLabelIngenieriaDeSistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, -1));

        jLabelEstructuraDeDatos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstructuraDeDatos.setText("   Estructuras de datos");
        jPanel1.add(jLabelEstructuraDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 130, -1));

        jLabelBogota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBogota.setText("   Bogotá D.C 2019");
        jPanel1.add(jLabelBogota, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabelAereoUSB.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabelAereoUSB.setText("AereoUSB");
        jPanel1.add(jLabelAereoUSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -200, 210, 80));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 340, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldUsuarioActionPerformed

    private void jButtonInicioSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioSeccionActionPerformed
        if (("1".equals(JTextFieldUsuario.getText())) && ("1".equals(JTextContrasena.getText()))) {
            presidente();
        } else if (("2".equals(JTextFieldUsuario.getText())) && ("2".equals(JTextContrasena.getText()))) {
            director();
        } else {
            Icon imagenTriste = new ImageIcon(getClass().getResource("/iconos/baseline_mood_bad_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "El usuario o la contraseña no existen. Intentelo de nuevo o envienos un correo", "Error en el inicio de seccion", JOptionPane.INFORMATION_MESSAGE, imagenTriste);
        }
    }//GEN-LAST:event_jButtonInicioSeccionActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(principal, "¿Desea salir de la plataforma?", "Salir", dialog);
        if (result == 0) {
            ((Principal) SwingUtilities.getWindowAncestor(this)).dispose();
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelMinimizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelMinimizarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMinimizarKeyPressed

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        //    ---->
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jLabelInternet);
        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, jLabelCalculadora);
        //    <----  
        AnimationClass internetV = new AnimationClass();
        internetV.jLabelXLeft(10, -40, 10, 5, jLabelInternet);
        AnimationClass calculadoraV = new AnimationClass();
        calculadoraV.jLabelXLeft(10, -40, 10, 5, jLabelCalculadora);
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInternetMouseClicked
        abrirNavegador();
    }//GEN-LAST:event_jLabelInternetMouseClicked

    private void jLabelCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculadoraMouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(principal, e);
        }
    }//GEN-LAST:event_jLabelCalculadoraMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        moverALaDerecha();
        moverAAbajo();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void JTextFieldCorreoOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCorreoOlvidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldCorreoOlvidarActionPerformed

    private void JTextFieldNombreOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombreOlvidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombreOlvidarActionPerformed

    private void JTextFieldApellidoOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldApellidoOlvidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldApellidoOlvidarActionPerformed

    private void JTextFieldIDOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldIDOlvidarActionPerformed

    }//GEN-LAST:event_JTextFieldIDOlvidarActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (validar()) {
            moverALaIzquierda();
            moverArriba();
            Icon imagenFeliz = new ImageIcon(getClass().getResource("/iconos/baseline_mood_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "El correo se envio correctamente", "Error al enviar la solicitud", JOptionPane.INFORMATION_MESSAGE, imagenFeliz);
        } else {
            Icon imagenTriste = new ImageIcon(getClass().getResource("/iconos/baseline_mood_bad_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "Al correo le faltan valores", "Error al enviar la solicitud", JOptionPane.INFORMATION_MESSAGE, imagenTriste);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void JTextFieldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldUsuarioKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextFieldUsuarioKeyPressed

    private void JTextContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextContrasenaKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextContrasenaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTextFieldCorreoOlvidarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldCorreoOlvidarKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextFieldCorreoOlvidarKeyPressed

    private void JTextFieldNombreOlvidarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreOlvidarKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextFieldNombreOlvidarKeyPressed

    private void JTextFieldApellidoOlvidarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldApellidoOlvidarKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextFieldApellidoOlvidarKeyPressed

    private void JTextFieldIDOlvidarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldIDOlvidarKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonInicioSeccion.doClick();
        }
    }//GEN-LAST:event_JTextFieldIDOlvidarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JTextContrasena;
    private javax.swing.JTextField JTextFieldApellidoOlvidar;
    private javax.swing.JTextField JTextFieldCorreoOlvidar;
    private javax.swing.JTextField JTextFieldIDOlvidar;
    private javax.swing.JTextField JTextFieldNombreOlvidar;
    private javax.swing.JTextField JTextFieldUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonInicioSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAereoUSB;
    private javax.swing.JLabel jLabelApelidoOlvidar;
    private javax.swing.JLabel jLabelBogota;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorreoOlvidar;
    private javax.swing.JLabel jLabelEstructuraDeDatos;
    private javax.swing.JLabel jLabelHechoPor;
    private javax.swing.JLabel jLabelIDOlvidar;
    private javax.swing.JLabel jLabelImagenContraseña;
    private javax.swing.JLabel jLabelImagenIcono;
    private javax.swing.JLabel jLabelImagenTituloUsuario;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JLabel jLabelIngenieriaDeSistemas;
    private javax.swing.JLabel jLabelInternet;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelNombreOlvidar;
    private javax.swing.JLabel jLabelNombrePresentacion;
    private javax.swing.JLabel jLabelNombrePresentacion2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void presidente() {
        principal.irAPresidente(this);
    }

    private void director() {
        principal.irADirector(this);
    }

    private boolean validar() {
        boolean hayArroba = false;
        String correoOlvidado = JTextFieldCorreoOlvidar.getText();
        for (int i = 0; i < correoOlvidado.length(); i++) {
            char arrobaYPunto = correoOlvidado.charAt(i);
            if (arrobaYPunto == '@' || arrobaYPunto == '.') {
                hayArroba = true;
                return hayArroba;
            } else {
                hayArroba = false;
                return false;
            }
        }
        return hayArroba;
    }

    private void volverAValoresPredeterminados() {
        JTextFieldNombreOlvidar.setText("Ingrese el nombre");
        JTextFieldApellidoOlvidar.setText("Ingrese el apellido");
        JTextFieldIDOlvidar.setText("Ingrese el ID");
        JTextFieldCorreoOlvidar.setText("Ingrese el correo");
    }

    private void enviarCorreo() {
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "pruebauniversidadusb@gmail.com";
            String contraRemitente = "pruebausb";
            String correoReceptor = "pruebauniversidadusb@gmail.com";
            String asunto = "Solicitud restablecimiento de contraseña";
            String mensaje = "Los datos son: " + "Nombre y apellidos: " + JTextFieldNombreOlvidar.getText() + " " + JTextFieldApellidoOlvidar.getText() + "---ID: " + JTextFieldIDOlvidar.getText() + "---Correo: " + JTextFieldCorreoOlvidar.getText();

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje);

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, contraRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            AnimationClass panelImagen = new AnimationClass();

        } catch (AddressException ex) {
            Logger.getLogger(InicioJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "El correo electronico no se ha enviado", "Error al enviar el correo", JOptionPane.INFORMATION_MESSAGE);

        } catch (MessagingException ex) {
            Logger.getLogger(InicioJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "El correo electronico no se ha enviado", "Error al enviar el correo", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void moverALaIzquierda() {

//  <----  
        AnimationClass panelImagen = new AnimationClass();
        panelImagen.jLabelXLeft(400, 90, 10, 5, jLabelImagenIcono);
        //
        AnimationClass panelHecho = new AnimationClass();
        panelHecho.jLabelXLeft(400, 140, 10, 5, jLabelHechoPor);
        AnimationClass panelNombre1 = new AnimationClass();
        panelNombre1.jLabelXLeft(400, 90, 10, 5, jLabelNombrePresentacion);
        AnimationClass panelNombre2 = new AnimationClass();
        panelNombre2.jLabelXLeft(400, 90, 10, 5, jLabelNombrePresentacion2);
        AnimationClass jLabelIng = new AnimationClass();
        jLabelIng.jLabelXLeft(400, 90, 10, 5, jLabelIngenieriaDeSistemas);
        AnimationClass jLabelEstructura = new AnimationClass();
        jLabelEstructura.jLabelXLeft(400, 100, 10, 5, jLabelEstructuraDeDatos);
        AnimationClass panelBogota = new AnimationClass();
        panelBogota.jLabelXLeft(400, 110, 10, 5, jLabelBogota);
        //
        AnimationClass jLabelNombre = new AnimationClass();
        jLabelNombre.jLabelXLeft(30, -150, 10, 5, jLabelNombreOlvidar);
        AnimationClass jLabelApellido = new AnimationClass();
        jLabelApellido.jLabelXLeft(30, -150, 10, 5, jLabelApelidoOlvidar);
        AnimationClass jLabelID = new AnimationClass();
        jLabelID.jLabelXLeft(30, -150, 10, 5, jLabelIDOlvidar);
        AnimationClass jLabelCorreo = new AnimationClass();
        jLabelCorreo.jLabelXLeft(30, -150, 10, 5, jLabelCorreoOlvidar);

        //
        AnimationClass jTextNombre = new AnimationClass();
        jTextNombre.jTextFieldXLeft(120, -150, 10, 5, JTextFieldNombreOlvidar);
        AnimationClass jTextApellido = new AnimationClass();
        jTextApellido.jTextFieldXLeft(120, -150, 10, 5, JTextFieldApellidoOlvidar);
        AnimationClass jTextID = new AnimationClass();
        jTextID.jTextFieldXLeft(120, -150, 10, 5, JTextFieldIDOlvidar);
        AnimationClass jTextCorreo = new AnimationClass();
        jTextCorreo.jTextFieldXLeft(120, -150, 10, 5, JTextFieldCorreoOlvidar);

        //
        AnimationClass jButton = new AnimationClass();
        jButton.jButtonXLeft(200, -150, 10, 5, jButton2);
        enviarCorreo();
        volverAValoresPredeterminados();
    }

    private void moverALaDerecha() {
//    ---->
        AnimationClass panelImagen = new AnimationClass();
        panelImagen.jLabelXRight(90, 400, 10, 5, jLabelImagenIcono);
        //
        AnimationClass panelHecho = new AnimationClass();
        panelHecho.jLabelXRight(140, 400, 10, 5, jLabelHechoPor);
        AnimationClass panelNombre1 = new AnimationClass();
        panelNombre1.jLabelXRight(90, 400, 10, 5, jLabelNombrePresentacion);
        AnimationClass panelNombre2 = new AnimationClass();
        panelNombre2.jLabelXRight(90, 400, 10, 5, jLabelNombrePresentacion2);
        AnimationClass jLabelIng = new AnimationClass();
        jLabelIng.jLabelXRight(90, 400, 10, 5, jLabelIngenieriaDeSistemas);
        AnimationClass jLabelEstructura = new AnimationClass();
        jLabelEstructura.jLabelXRight(100, 400, 10, 5, jLabelEstructuraDeDatos);
        AnimationClass panelBogota = new AnimationClass();
        panelBogota.jLabelXRight(110, 400, 10, 5, jLabelBogota);
        //
        panelImagen.jLabelXRight(90, 400, 10, 5, jLabelImagenIcono);
        AnimationClass jLabelNombre = new AnimationClass();
        jLabelNombre.jLabelXRight(-150, 30, 10, 5, jLabelNombreOlvidar);
        AnimationClass jLabelApellido = new AnimationClass();
        jLabelApellido.jLabelXRight(-150, 30, 10, 5, jLabelApelidoOlvidar);
        AnimationClass jLabelID = new AnimationClass();
        jLabelID.jLabelXRight(-150, 30, 10, 5, jLabelIDOlvidar);
        AnimationClass jLabelCorreo = new AnimationClass();
        jLabelCorreo.jLabelXRight(-150, 30, 10, 5, jLabelCorreoOlvidar);

        //
        AnimationClass jTextNombre = new AnimationClass();
        jTextNombre.jTextFieldXRight(-150, 120, 10, 5, JTextFieldNombreOlvidar);
        AnimationClass jTextApellido = new AnimationClass();
        jTextApellido.jTextFieldXRight(-150, 120, 10, 5, JTextFieldApellidoOlvidar);
        AnimationClass jTextID = new AnimationClass();
        jTextID.jTextFieldXRight(-150, 120, 10, 5, JTextFieldIDOlvidar);
        AnimationClass jTextCorreo = new AnimationClass();
        jTextCorreo.jTextFieldXRight(-150, 120, 10, 5, JTextFieldCorreoOlvidar);

        //
        AnimationClass jButton = new AnimationClass();
        jButton.jButtonXRight(-150, 200, 10, 5, jButton2);
    }

    private void moverAAbajo() {
        AnimationClass jLabelAereo = new AnimationClass();
        jLabelAereo.jLabelYDown(-200, 40, 10, 5, jLabelAereoUSB);
    }

    private void moverArriba() {
        AnimationClass jLabelAereo = new AnimationClass();
        jLabelAereo.jLabelYUp(40, -200, 10, 5, jLabelAereoUSB);
    }
}
