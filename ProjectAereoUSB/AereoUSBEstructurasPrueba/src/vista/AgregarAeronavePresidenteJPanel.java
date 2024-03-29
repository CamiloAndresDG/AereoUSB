/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelador.Avion;
import controlador.ControladorPilaAvion;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Toshiba
 */
public class AgregarAeronavePresidenteJPanel extends javax.swing.JPanel {

    public static final String AGREGAR = "Agregar";
    public static final String ELIMINAR = "Eliminar";
    public static final String NUEVO = "Nuevo";
    public static final String BUSCAR = "Buscar";

    private Principal principal;
    public ControladorPilaAvion controladorPilaAvion;

    /**
     * Creates new form AgregarAeronavePresidente
     */
    public AgregarAeronavePresidenteJPanel(Principal principal) {
        //logica = new ControladorPilaAvion();
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

        jButtonVolver = new javax.swing.JButton();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelCantidadAsientos = new javax.swing.JLabel();
        jLabelCostoMantenimiento = new javax.swing.JLabel();
        jLabelCostohangar = new javax.swing.JLabel();
        jLabelCantidadEquipajeSoporado = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldCantidadEquipaje = new javax.swing.JTextField();
        jTextFieldCostoHangar = new javax.swing.JTextField();
        jTextFieldCostomantenmiento = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jButtonAgregarNuevoAvion = new javax.swing.JButton();
        jButtonVolver1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextFieldCantidadAsientos = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelTituloAregarAvion = new javax.swing.JLabel();

        jButtonVolver.setBackground(new java.awt.Color(153, 0, 0));
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(144, 202, 249));

        jLabelMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMatricula.setText("Matricula:");

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMarca.setText("Marca:");

        jLabelModelo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelModelo.setText("Modelo:");

        jLabelCantidadAsientos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidadAsientos.setText("Cantidad de asientos:");

        jLabelCostoMantenimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCostoMantenimiento.setText("Costo de mantenimiento:");

        jLabelCostohangar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCostohangar.setText("Costo del hangar:");

        jLabelCantidadEquipajeSoporado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidadEquipajeSoporado.setText("Cantidad de equipaje soportado:");

        jTextFieldMatricula.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldMatricula.setBorder(null);
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        jTextFieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyTyped(evt);
            }
        });

        jTextFieldCantidadEquipaje.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldCantidadEquipaje.setBorder(null);
        jTextFieldCantidadEquipaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadEquipajeKeyTyped(evt);
            }
        });

        jTextFieldCostoHangar.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldCostoHangar.setBorder(null);
        jTextFieldCostoHangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostoHangarActionPerformed(evt);
            }
        });
        jTextFieldCostoHangar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCostoHangarKeyTyped(evt);
            }
        });

        jTextFieldCostomantenmiento.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldCostomantenmiento.setBorder(null);
        jTextFieldCostomantenmiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCostomantenmientoKeyTyped(evt);
            }
        });

        jTextFieldMarca.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldMarca.setBorder(null);
        jTextFieldMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMarcaKeyTyped(evt);
            }
        });

        jTextFieldModelo.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldModelo.setBorder(null);
        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        jTextFieldModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldModeloKeyTyped(evt);
            }
        });

        jButtonAgregarNuevoAvion.setBackground(new java.awt.Color(144, 202, 249));
        jButtonAgregarNuevoAvion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarNuevoAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_control_point_black_18dp.png"))); // NOI18N
        jButtonAgregarNuevoAvion.setBorderPainted(false);
        jButtonAgregarNuevoAvion.setContentAreaFilled(false);
        jButtonAgregarNuevoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNuevoAvionActionPerformed(evt);
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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldCantidadAsientos.setBackground(new java.awt.Color(144, 202, 249));
        jTextFieldCantidadAsientos.setBorder(null);
        jTextFieldCantidadAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadAsientosActionPerformed(evt);
            }
        });
        jTextFieldCantidadAsientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadAsientosKeyTyped(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

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

        jLabelTituloAregarAvion.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabelTituloAregarAvion.setText("Agregar avion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jLabelCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMatricula)
                            .addComponent(jLabelMarca))
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelModelo)
                        .addGap(176, 176, 176)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCantidadAsientos)
                        .addGap(99, 99, 99)
                        .addComponent(jTextFieldCantidadAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCantidadEquipajeSoporado)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldCantidadEquipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCostoMantenimiento)
                        .addGap(78, 78, 78)
                        .addComponent(jTextFieldCostomantenmiento, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCostohangar)
                        .addGap(122, 122, 122)
                        .addComponent(jTextFieldCostoHangar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonVolver1)
                        .addGap(353, 353, 353)
                        .addComponent(jButtonAgregarNuevoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelTituloAregarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabelCerrar))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelMatricula)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCantidadAsientos)
                    .addComponent(jTextFieldCantidadAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCantidadEquipajeSoporado)
                    .addComponent(jTextFieldCantidadEquipaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCostoMantenimiento)
                    .addComponent(jTextFieldCostomantenmiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCostohangar)
                    .addComponent(jTextFieldCostoHangar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAgregarNuevoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarNuevoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNuevoAvionActionPerformed
        agregar();
    }//GEN-LAST:event_jButtonAgregarNuevoAvionActionPerformed

    private void jTextFieldCantidadAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadAsientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadAsientosActionPerformed

    private void jTextFieldMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldMatriculaKeyTyped

    private void jTextFieldCostoHangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostoHangarActionPerformed

    }//GEN-LAST:event_jTextFieldCostoHangarActionPerformed

    private void jTextFieldMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMarcaKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldMarcaKeyTyped

    private void jTextFieldModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldModeloKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldModeloKeyTyped

    private void jTextFieldCantidadAsientosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadAsientosKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldCantidadAsientosKeyTyped

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jTextFieldCantidadEquipajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadEquipajeKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldCantidadEquipajeKeyTyped

    private void jTextFieldCostomantenmientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostomantenmientoKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldCostomantenmientoKeyTyped

    private void jTextFieldCostoHangarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostoHangarKeyTyped
        char teclaPresionada = evt.getKeyChar();
        if (teclaPresionada == KeyEvent.VK_ENTER) {
            jButtonAgregarNuevoAvion.doClick();
        }
    }//GEN-LAST:event_jTextFieldCostoHangarKeyTyped

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        principal.volverAInicio(this);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        principal.volverAGestionAeronavePresidente(this);
    }//GEN-LAST:event_jButtonVolver1ActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(principal, "¿Desea salir de la plataforma?", "Salir", dialog);
        if (result == 0) {
            ((Principal) SwingUtilities.getWindowAncestor(this)).dispose();
        }

    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarNuevoAvion;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantidadAsientos;
    private javax.swing.JLabel jLabelCantidadEquipajeSoporado;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCostoMantenimiento;
    private javax.swing.JLabel jLabelCostohangar;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelTituloAregarAvion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFieldCantidadAsientos;
    private javax.swing.JTextField jTextFieldCantidadEquipaje;
    private javax.swing.JTextField jTextFieldCostoHangar;
    private javax.swing.JTextField jTextFieldCostomantenmiento;
    private javax.swing.JTextField jTextFieldMarca;
    public javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables

    public void agregar() {
        try {
            String nMatricula = jTextFieldMatricula.getText();
            String marca = jTextFieldMarca.getText();
            String modelo = jTextFieldModelo.getText();
            String cantidadAsientosString = jTextFieldCantidadAsientos.getText();
            int numeroAsientos = Integer.parseInt(cantidadAsientosString);
            String cantidadEquipajeString = jTextFieldCantidadEquipaje.getText();
            double cantidadEquipajeSoportado = Double.parseDouble(cantidadEquipajeString);
            String costoMantenimientoString = jTextFieldCostomantenmiento.getText();
            double costoMantenimiento = Double.parseDouble(costoMantenimientoString);
            String costoHangarString = jTextFieldCostoHangar.getText();
            double costoHangar = Double.parseDouble(costoHangarString);
            Avion actual = new Avion(nMatricula, marca, modelo, numeroAsientos, cantidadEquipajeSoportado, costoMantenimiento, costoHangar);
            System.out.println(actual);
            boolean valor = principal.controladorPilaAvion.pushAvion(actual);
            System.out.println("cuantos" + principal.controladorPilaAvion.TotalAviones());
            if (valor == false) {
                Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
                JOptionPane.showMessageDialog(this, "La aeronave ya existe", "Error al agregar la  nueva aeronave", JOptionPane.INFORMATION_MESSAGE,imagenError);
            } else if (valor == true) {
                principal.controladorPilaAvion.pushAvion(actual);
                principal.volverAGestionAeronavePresidente(this);
            }
        } catch (java.lang.NumberFormatException e2) {
            Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "Tiene un campo donde el valor no es valido o esta vacio", "Error al agregar la  nueva aeronave", JOptionPane.INFORMATION_MESSAGE, imagenError);
        }
    }

    public void actualizarListaAviones() {
        String[] aviones = principal.controladorPilaAvion.darAviones();
    }

    public void nuevo() {
        this.jTextFieldMarca.setText("");
        this.jTextFieldModelo.setText("");
        this.jTextFieldCantidadAsientos.setText("");
        this.jTextFieldCantidadEquipaje.setText("");
        this.jTextFieldCostomantenmiento.setText("");
        this.jTextFieldCostoHangar.setText("");
    }

}
