/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author nemac
 */
public class EliminarTrabajadorPresidenteJPanel extends javax.swing.JPanel {

    private Principal principal;

    /**
     * Creates new form EliminarTrabajadorPresidenteJPanel
     */
    public EliminarTrabajadorPresidenteJPanel(Principal principal) {
        this.principal = principal;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonEliminarAeronave = new javax.swing.JButton();
        jButtonVolver2 = new javax.swing.JButton();
        jLabelTituloAregarAvion = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        setBackground(new java.awt.Color(144, 202, 249));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        jLabelMatricula.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMatricula.setText("Matricula:");

        jTextFieldMatricula.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldMatricula.setBorder(null);
        jTextFieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jButtonEliminarAeronave.setBackground(new java.awt.Color(144, 202, 249));
        jButtonEliminarAeronave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_delete_black_18dp.png"))); // NOI18N
        jButtonEliminarAeronave.setBorderPainted(false);
        jButtonEliminarAeronave.setContentAreaFilled(false);
        jButtonEliminarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAeronaveActionPerformed(evt);
            }
        });
        jButtonEliminarAeronave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonEliminarAeronaveKeyTyped(evt);
            }
        });

        jButtonVolver2.setBackground(new java.awt.Color(144, 202, 249));
        jButtonVolver2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_chevron_left_black_18dp.png"))); // NOI18N
        jButtonVolver2.setBorder(null);
        jButtonVolver2.setContentAreaFilled(false);
        jButtonVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver2ActionPerformed(evt);
            }
        });

        jLabelTituloAregarAvion.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabelTituloAregarAvion.setText(" Eliminar trabajador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabelMatricula)
                        .addGap(114, 114, 114)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCerrar)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolver2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminarAeronave)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelCerrar))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarAeronave))
                    .addComponent(jButtonVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(principal, "¿Desea salir de la plataforma?", "Salir", dialog);
        if (result == 0) {
            ((Principal) SwingUtilities.getWindowAncestor(this)).dispose();
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jTextFieldMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonEliminarAeronave.doClick();
        }
    }//GEN-LAST:event_jTextFieldMatriculaKeyTyped

    private void jButtonEliminarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAeronaveActionPerformed
        try {
            eliminar();
        } catch (java.lang.NullPointerException e1) {
            JOptionPane.showMessageDialog(this, "El trabajador no existe", "Error al eliminar el trabajador", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
            JOptionPane.showMessageDialog(this, "El trabajador no existe", "Error al eliminar el trabajador", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.lang.NegativeArraySizeException e3) {
            eliminar();
        }
    }//GEN-LAST:event_jButtonEliminarAeronaveActionPerformed

    private void jButtonEliminarAeronaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEliminarAeronaveKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonEliminarAeronave.doClick();
        }
    }//GEN-LAST:event_jButtonEliminarAeronaveKeyTyped

    private void jButtonVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver2ActionPerformed
        principal.volverAGestionTrabajadorPresidente(this);
    }//GEN-LAST:event_jButtonVolver2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarAeronave;
    private javax.swing.JButton jButtonVolver2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelTituloAregarAvion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
public void volver() {
        principal.volverAGestionTrabajadorPresidente(this);
    }

    public void eliminar() {

    }

}
