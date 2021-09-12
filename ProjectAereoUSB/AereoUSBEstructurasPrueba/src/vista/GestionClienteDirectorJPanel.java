/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPilaAvion;
import static java.awt.Frame.ICONIFIED;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Toshiba
 */
public class GestionClienteDirectorJPanel extends javax.swing.JPanel {

    private Principal principal;
    private ControladorPilaAvion controladorPilaAvion;

    /**
     * Creates new form GestionAeronavesPresidente
     */
    public GestionClienteDirectorJPanel(Principal principal) {
        this.controladorPilaAvion = new ControladorPilaAvion();
        this.principal = principal;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jButtonAgregarAeronave1 = new javax.swing.JButton();
        jButtonBuscarAeronave1 = new javax.swing.JButton();
        jButtonModificarAeronave1 = new javax.swing.JButton();
        jButtonEliminarAeroanve1 = new javax.swing.JButton();
        jButtonActualizar1 = new javax.swing.JButton();
        jButtonVolver1 = new javax.swing.JButton();

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Volver");

        setBackground(new java.awt.Color(144, 202, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 540, 140));

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ISOLOGO USB (4).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jButtonAgregarAeronave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_control_point_black_24dp.png"))); // NOI18N
        jButtonAgregarAeronave1.setBorderPainted(false);
        jButtonAgregarAeronave1.setContentAreaFilled(false);
        jButtonAgregarAeronave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAeronave1ActionPerformed(evt);
            }
        });
        add(jButtonAgregarAeronave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jButtonBuscarAeronave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_search_black_24dp.png"))); // NOI18N
        jButtonBuscarAeronave1.setBorderPainted(false);
        jButtonBuscarAeronave1.setContentAreaFilled(false);
        jButtonBuscarAeronave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAeronave1ActionPerformed(evt);
            }
        });
        add(jButtonBuscarAeronave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));

        jButtonModificarAeronave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_build_black_24dp.png"))); // NOI18N
        jButtonModificarAeronave1.setBorderPainted(false);
        jButtonModificarAeronave1.setContentAreaFilled(false);
        jButtonModificarAeronave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAeronave1ActionPerformed(evt);
            }
        });
        add(jButtonModificarAeronave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jButtonEliminarAeroanve1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_delete_black_24dp.png"))); // NOI18N
        jButtonEliminarAeroanve1.setBorderPainted(false);
        jButtonEliminarAeroanve1.setContentAreaFilled(false);
        jButtonEliminarAeroanve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAeroanve1ActionPerformed(evt);
            }
        });
        add(jButtonEliminarAeroanve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jButtonActualizar1.setBackground(new java.awt.Color(153, 0, 0));
        jButtonActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_autorenew_black_18dp.png"))); // NOI18N
        jButtonActualizar1.setBorder(null);
        jButtonActualizar1.setBorderPainted(false);
        jButtonActualizar1.setContentAreaFilled(false);
        jButtonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar1ActionPerformed(evt);
            }
        });
        add(jButtonActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, 40));

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
        add(jButtonVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(principal, "¿Desea salir de la plataforma?", "Salir", dialog);
        if (result == 0) {
            ((Principal) SwingUtilities.getWindowAncestor(this)).dispose();
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonAgregarAeronave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAeronave1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButtonAgregarAeronave1ActionPerformed

    private void jButtonBuscarAeronave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAeronave1ActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonBuscarAeronave1ActionPerformed

    private void jButtonModificarAeronave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAeronave1ActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarAeronave1ActionPerformed

    private void jButtonEliminarAeroanve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAeroanve1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButtonEliminarAeroanve1ActionPerformed

    private void jButtonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar1ActionPerformed
        jTextArea1.append(principal.listaCircularCliente.mostrarLista());
    }//GEN-LAST:event_jButtonActualizar1ActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        principal.volverADirector(this);
    }//GEN-LAST:event_jButtonVolver1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonActualizar1;
    private javax.swing.JButton jButtonAgregarAeronave1;
    private javax.swing.JButton jButtonBuscarAeronave1;
    private javax.swing.JButton jButtonEliminarAeroanve1;
    private javax.swing.JButton jButtonModificarAeronave1;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public void agregar() {
        principal.irAAgregarClienteDirector(this);
    }

    private void buscar() {
        principal.irABuscarClienteDirector(this);
    }

    private void modificar() {
        principal.irAModificarClienteDirector(this);
    }

    private void eliminar() {
        principal.irAEliminarClienteDirector(this);
    }

}
