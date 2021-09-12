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
import modelador.Avion;

/**
 *
 * @author Toshiba
 */
public class BuscarAeronaveDirectorJPanel extends javax.swing.JPanel {

    private Principal principal;

    /**
     * Creates new form BuscarAeronavePresidente
     */
    public BuscarAeronaveDirectorJPanel(Principal principal) {
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

        jButtonBuscarAeronave = new javax.swing.JButton();
        jTextFieldBuscado = new javax.swing.JTextField();
        jLabelTituloAregarAvion = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonVolver1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(144, 202, 249));

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

        jTextFieldBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscadoActionPerformed(evt);
            }
        });

        jLabelTituloAregarAvion.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabelTituloAregarAvion.setText(" Buscar avion");

        jLabelMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMatricula.setText("Matricula:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldMatricula.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldMatricula.setBorder(null);
        jTextFieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyTyped(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_close_black_18dp.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButtonBuscarAeronave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolver1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabelCerrar)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonBuscarAeronave)
                .addGap(11, 11, 11)
                .addComponent(jTextFieldBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAeronaveActionPerformed
        try {
            buscar();
        } catch (java.lang.NullPointerException e1) {
            Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "La aeronave no existe", "Error al buscar la aeronave", JOptionPane.INFORMATION_MESSAGE,imagenError);
        }
    }//GEN-LAST:event_jButtonBuscarAeronaveActionPerformed

    private void jTextFieldBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscadoActionPerformed

    private void jTextFieldMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonBuscarAeronave.doClick();
        }
    }//GEN-LAST:event_jTextFieldMatriculaKeyTyped

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        principal.volverAGestionAeronaveDirector(this);
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
    private javax.swing.JButton jButtonBuscarAeronave;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelTituloAregarAvion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBuscado;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables

    private void buscar() {
        String matricula = jTextFieldMatricula.getText();
        Avion Actual = principal.controladorPilaAvion.buscarPorMatricula(matricula);
        llenar(Actual);
    }

    private void llenar(Avion Actual) {
        Avion actual = Actual;
        String prueba = actual.toString();
        jTextFieldBuscado.setText(prueba);
    }
}
