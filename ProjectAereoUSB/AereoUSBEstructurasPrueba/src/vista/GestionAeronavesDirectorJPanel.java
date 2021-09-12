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
public class GestionAeronavesDirectorJPanel extends javax.swing.JPanel {

    private Principal principal;
    private ControladorPilaAvion controladorPilaAvion;

    /**
     * Creates new form GestionAeronavesPresidente
     */
    public GestionAeronavesDirectorJPanel(Principal principal) {
        this.controladorPilaAvion = new ControladorPilaAvion();
        this.principal = principal;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButtonBuscarAeronave = new javax.swing.JButton();
        jButtonModificarAeronave = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonVolver1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Volver");

        setBackground(new java.awt.Color(144, 202, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_search_black_24dp.png"))); // NOI18N
        jButtonBuscarAeronave.setBorderPainted(false);
        jButtonBuscarAeronave.setContentAreaFilled(false);
        jButtonBuscarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAeronaveActionPerformed(evt);
            }
        });
        add(jButtonBuscarAeronave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, -1));

        jButtonModificarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_build_black_24dp.png"))); // NOI18N
        jButtonModificarAeronave.setBorderPainted(false);
        jButtonModificarAeronave.setContentAreaFilled(false);
        jButtonModificarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAeronaveActionPerformed(evt);
            }
        });
        add(jButtonModificarAeronave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jButtonActualizar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_autorenew_black_18dp.png"))); // NOI18N
        jButtonActualizar.setBorder(null);
        jButtonActualizar.setBorderPainted(false);
        jButtonActualizar.setContentAreaFilled(false);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 350, 550, 135));

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

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ISOLOGO USB (4).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAeronaveActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonBuscarAeronaveActionPerformed

    private void jButtonModificarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAeronaveActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarAeronaveActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String[] aviones = principal.controladorPilaAvion.darAviones();
        jList1.setListData((String[]) aviones);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        principal.volverADirector(this);
    }//GEN-LAST:event_jButtonVolver1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscarAeronave;
    private javax.swing.JButton jButtonModificarAeronave;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void buscar() {
        principal.irABuscarAeronaveDirector(this);
    }

    private void modificar() {
        principal.irAModificarAeronaveDirector(this);
    }

}
