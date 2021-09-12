/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelador.Vuelo;

/**
 *
 * @author Toshiba
 */
public class ModificarVueloDirectorJPanel extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form ModificarVueloPresidenteJPanel
     */
    public ModificarVueloDirectorJPanel(Principal principal) {
        this.principal=principal;
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

        jSeparator4 = new javax.swing.JSeparator();
        jTextField1IDVuelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2FechaSalida = new javax.swing.JTextField();
        jTextField3FechaLlegada = new javax.swing.JTextField();
        jTextField4HOraSalida = new javax.swing.JTextField();
        jTextField5HoraLlegada = new javax.swing.JTextField();
        jTextField6CiudadOrigen = new javax.swing.JTextField();
        jTextField7CiudadLlegada = new javax.swing.JTextField();
        jTextField8NumeroPasajeros = new javax.swing.JTextField();
        jTextField9EstadoVuelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabelTituloAregarAvion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jButtonBuscarAeronave = new javax.swing.JButton();
        jButtonVolver1 = new javax.swing.JButton();
        jButtonModificarAeronave = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(144, 202, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1IDVuelo.setBackground(new java.awt.Color(144, 202, 249));
        jTextField1IDVuelo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField1IDVuelo.setBorder(null);
        add(jTextField1IDVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 100, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID vuelo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField2FechaSalida.setBackground(new java.awt.Color(144, 202, 249));
        jTextField2FechaSalida.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField2FechaSalida.setBorder(null);
        add(jTextField2FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 250, -1));

        jTextField3FechaLlegada.setBackground(new java.awt.Color(144, 202, 249));
        jTextField3FechaLlegada.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField3FechaLlegada.setBorder(null);
        add(jTextField3FechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, -1));

        jTextField4HOraSalida.setBackground(new java.awt.Color(144, 202, 249));
        jTextField4HOraSalida.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField4HOraSalida.setBorder(null);
        add(jTextField4HOraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 250, -1));

        jTextField5HoraLlegada.setBackground(new java.awt.Color(144, 202, 249));
        jTextField5HoraLlegada.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField5HoraLlegada.setBorder(null);
        add(jTextField5HoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 250, -1));

        jTextField6CiudadOrigen.setBackground(new java.awt.Color(144, 202, 249));
        jTextField6CiudadOrigen.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField6CiudadOrigen.setBorder(null);
        add(jTextField6CiudadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 250, -1));

        jTextField7CiudadLlegada.setBackground(new java.awt.Color(144, 202, 249));
        jTextField7CiudadLlegada.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField7CiudadLlegada.setBorder(null);
        add(jTextField7CiudadLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 250, -1));

        jTextField8NumeroPasajeros.setBackground(new java.awt.Color(144, 202, 249));
        jTextField8NumeroPasajeros.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField8NumeroPasajeros.setBorder(null);
        add(jTextField8NumeroPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 250, -1));

        jTextField9EstadoVuelo.setBackground(new java.awt.Color(144, 202, 249));
        jTextField9EstadoVuelo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField9EstadoVuelo.setBorder(null);
        add(jTextField9EstadoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha salida");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha llegada");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Hora salida");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hora llegada");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ciudad origen");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ciudad llegada");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Numero de pasajeros");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estado de vuelo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 120, 240, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 250, 10));

        jLabelTituloAregarAvion.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabelTituloAregarAvion.setText("Modificar vuelos");
        add(jLabelTituloAregarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jButtonBuscarAeronave.setBackground(new java.awt.Color(144, 202, 249));
        jButtonBuscarAeronave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_search_black_24dp.png"))); // NOI18N
        jButtonBuscarAeronave.setBorder(null);
        jButtonBuscarAeronave.setBorderPainted(false);
        jButtonBuscarAeronave.setContentAreaFilled(false);
        jButtonBuscarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAeronaveActionPerformed(evt);
            }
        });
        add(jButtonBuscarAeronave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jButtonVolver1.setBackground(new java.awt.Color(144, 202, 249));
        jButtonVolver1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_chevron_left_black_18dp.png"))); // NOI18N
        jButtonVolver1.setBorder(null);
        jButtonVolver1.setContentAreaFilled(false);
        jButtonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver1ActionPerformed(evt);
            }
        });
        add(jButtonVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, 30));

        jButtonModificarAeronave.setBackground(new java.awt.Color(0, 102, 0));
        jButtonModificarAeronave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_build_black_18dp.png"))); // NOI18N
        jButtonModificarAeronave.setBorderPainted(false);
        jButtonModificarAeronave.setContentAreaFilled(false);
        jButtonModificarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAeronaveActionPerformed(evt);
            }
        });
        jButtonModificarAeronave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonModificarAeronaveKeyTyped(evt);
            }
        });
        add(jButtonModificarAeronave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 50, 50));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 250, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 250, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 250, 10));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 250, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 250, 10));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 250, 10));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 250, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(principal, "¿Desea salir de la plataforma?", "Salir", dialog);
        if (result == 0) {
            ((Principal) SwingUtilities.getWindowAncestor(this)).dispose();
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonBuscarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAeronaveActionPerformed
        /*try {
            buscarParaModificar();
        } catch (java.lang.NullPointerException e1) {
            JOptionPane.showMessageDialog(this, "El avion no existe", "Busqueda", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_jButtonBuscarAeronaveActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
volver();
    }//GEN-LAST:event_jButtonVolver1ActionPerformed

    private void jButtonModificarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAeronaveActionPerformed
        borrar();
        agregar();
    }//GEN-LAST:event_jButtonModificarAeronaveActionPerformed

    private void jButtonModificarAeronaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonModificarAeronaveKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonModificarAeronave.doClick();
        }
    }//GEN-LAST:event_jButtonModificarAeronaveKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAeronave;
    private javax.swing.JButton jButtonModificarAeronave;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelTituloAregarAvion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1IDVuelo;
    private javax.swing.JTextField jTextField2FechaSalida;
    private javax.swing.JTextField jTextField3FechaLlegada;
    private javax.swing.JTextField jTextField4HOraSalida;
    private javax.swing.JTextField jTextField5HoraLlegada;
    private javax.swing.JTextField jTextField6CiudadOrigen;
    private javax.swing.JTextField jTextField7CiudadLlegada;
    private javax.swing.JTextField jTextField8NumeroPasajeros;
    private javax.swing.JTextField jTextField9EstadoVuelo;
    // End of variables declaration//GEN-END:variables

    private void volver(){
    
        principal.volverAGestionVuelosDirector(this);
        
    }
    
 private void borrar() {
        String id = jTextField1IDVuelo.getText();
        principal.controladorColaVuelo.eliminarPorDato(id);
    }

    private void agregar() {
        try {
            String idVuelo = jTextField1IDVuelo.getText();
            String fechaIda = jTextField2FechaSalida.getText();
            String fechaRegreso = jTextField3FechaLlegada.getText();
            String horaIda = jTextField4HOraSalida.getText();
            String horaRegreso = jTextField5HoraLlegada.getText();
            String ciudadIda = jTextField6CiudadOrigen.getText();
            String ciudadRegreso = jTextField7CiudadLlegada.getText();
            String numeroPasajerosString = jTextField8NumeroPasajeros.getText();
            int cantDePasajeros = Integer.parseInt(numeroPasajerosString);
            String estado = jTextField9EstadoVuelo.getText();
            Vuelo actual = new Vuelo(idVuelo, fechaIda, fechaRegreso, horaIda, horaRegreso, ciudadIda, ciudadRegreso, cantDePasajeros, estado);
            if (principal.controladorColaVuelo.validarExiste(actual)) {
                Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
                JOptionPane.showMessageDialog(this, "El vuelo ya existe", "Error al agregar el nuevo vuelo", JOptionPane.INFORMATION_MESSAGE,imagenError);
            } else {
                principal.controladorColaVuelo.agregarVuelo(actual);
                System.out.println(actual);
                System.out.println(principal.controladorColaVuelo.tamanioCola());
            }

        } catch (java.lang.NumberFormatException e2) {
            Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "Tiene un campo donde el valor no es valido o esta vacio", "Error al agregar el nuevo vuelo", JOptionPane.INFORMATION_MESSAGE, imagenError);

        }
    }
}
