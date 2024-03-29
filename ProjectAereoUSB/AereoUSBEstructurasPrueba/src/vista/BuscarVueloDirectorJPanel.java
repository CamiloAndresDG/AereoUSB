package vista;

import controlador.NodoCola;
import static java.awt.Frame.ICONIFIED;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelador.Avion;
import modelador.Vuelo;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class BuscarVueloDirectorJPanel extends javax.swing.JPanel {

    private Principal principal;

    public BuscarVueloDirectorJPanel(Principal principal) {
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
        IDBuscado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldBuscado = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTituloAregarAvion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jButtonBuscarAeronave = new javax.swing.JButton();
        jButtonVolver1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 202, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID del vuelo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        IDBuscado.setBackground(new java.awt.Color(144, 202, 249));
        IDBuscado.setBorder(null);
        add(IDBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 230, -1));

        jTextFieldBuscado.setColumns(20);
        jTextFieldBuscado.setRows(5);
        jScrollPane1.setViewportView(jTextFieldBuscado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 460, 100));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 230, 10));

        jLabelTituloAregarAvion.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabelTituloAregarAvion.setText(" Buscar vuelo");
        add(jLabelTituloAregarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 156, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/baseline_expand_more_black_18dp.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

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
        add(jButtonBuscarAeronave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

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
        add(jButtonVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonBuscarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAeronaveActionPerformed
        if (principal.controladorColaVuelo.validarExisteID(IDBuscado.getText())) {
            buscar();
        } else {
            Icon imagenError = new ImageIcon(getClass().getResource("/iconos/baseline_warning_black_36dp.png"));
            JOptionPane.showMessageDialog(this, "El vuelo no existe", "Error al buscar el vuelo", JOptionPane.INFORMATION_MESSAGE, imagenError);
        }
    }//GEN-LAST:event_jButtonBuscarAeronaveActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        volver();
    }//GEN-LAST:event_jButtonVolver1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDBuscado;
    private javax.swing.JButton jButtonBuscarAeronave;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelTituloAregarAvion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextFieldBuscado;
    // End of variables declaration//GEN-END:variables

    private void volver() {
        principal.volverAGestionVuelosDirector(this);
    }

    private void buscar() {
        String buscado = IDBuscado.getText();
        NodoCola encontrado = principal.controladorColaVuelo.darVueloBuscado(buscado);
        String prueba = encontrado.toString();
        jTextFieldBuscado.setText(prueba);
    }

}
