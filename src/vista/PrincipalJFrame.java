package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Milena Quesada
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    DefaultTableModel dtm;

    public PrincipalJFrame() {
        initComponents();
        dtm = (DefaultTableModel) jTableTabla.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDirectorio = new javax.swing.JLabel();
        jLabelExtension = new javax.swing.JLabel();
        jTextFieldDirectorio = new javax.swing.JTextField();
        jTextFieldExtension = new javax.swing.JTextField();
        jButtonDirectorio = new javax.swing.JButton();
        jButtonExtension = new javax.swing.JButton();
        jLabelInformacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jButtonLimpCampos = new javax.swing.JButton();
        jButtonLimpTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Explorador básico");

        jLabelDirectorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDirectorio.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDirectorio.setText("Indique Directorio");

        jLabelExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelExtension.setForeground(new java.awt.Color(0, 0, 255));
        jLabelExtension.setText("Indique extension");

        jButtonDirectorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/lupa.png"))); // NOI18N
        jButtonDirectorio.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDirectorioActionPerformed(evt);
            }
        });

        jButtonExtension.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/lupa.png"))); // NOI18N
        jButtonExtension.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonExtension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtensionActionPerformed(evt);
            }
        });

        jLabelInformacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInformacion.setForeground(new java.awt.Color(255, 0, 0));

        jTableTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Tamaño", "F/D"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTabla);

        jButtonLimpCampos.setText("Limpiar campos");
        jButtonLimpCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpCamposActionPerformed(evt);
            }
        });

        jButtonLimpTabla.setText("Limpiar tabla");
        jButtonLimpTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabelDirectorio)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonLimpCampos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelExtension)
                                        .addGap(16, 16, 16)
                                        .addComponent(jTextFieldExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButtonLimpTabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDirectorio)
                            .addComponent(jTextFieldDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelExtension))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpCampos)
                .addGap(14, 14, 14)
                .addComponent(jLabelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpTabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*SUBFUNCIONES AUXILIARES-------------------------------------------------*/
    private String obtenerExtension(String nombreFichero) {
        String tipoFichero = "";
        int aux = nombreFichero.lastIndexOf(".");//Devuelve -1 si no hay punto
        if (aux != -1) {
            tipoFichero = nombreFichero.substring(aux);
        }
        return tipoFichero;
    }

    private String obtenerTamanio(File file) {
        long tamanio = 0;
        try {
            tamanio = Files.size(file.toPath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(tamanio);
    }

    private String obtenerD_F(File file) {
        String directoryOrFile = "";

        if (file.isDirectory()) {
            directoryOrFile = "Es un directorio";
        } else {
            directoryOrFile = "Es un archivo";
        }
        return directoryOrFile;
    }

    private String[] agregarRowATabla(File file) {
        String nomFichero = file.getName();
        String extensionFichero = obtenerExtension(nomFichero);
        String tamanioFichero = obtenerTamanio(file);
        String directoryOrFile = obtenerD_F(file);

        return new String[]{nomFichero, extensionFichero, tamanioFichero, directoryOrFile};
    }

    private void jButtonDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDirectorioActionPerformed
        jLabelInformacion.setText("");

        File ficheroPrincipal = new File(jTextFieldDirectorio.getText());

        File[] subficherosEncontrados = null;

        if (ficheroPrincipal.isFile()) {
            subficherosEncontrados = new File[]{ficheroPrincipal};
            jLabelInformacion.setText("Archivo válido encontrado");
        } else {
            if (ficheroPrincipal.isDirectory()) {
                subficherosEncontrados = ficheroPrincipal.listFiles();
                jLabelInformacion.setText("Directorio válido encontrado");
            }
        }

        if (subficherosEncontrados == null) {
            jLabelInformacion.setText("La ruta indicada no es válida.");
        } else {
            if (subficherosEncontrados.length == 0) {
                jLabelInformacion.setText("El directorio existe pero está vacío.");
            } else {
                for (File f : subficherosEncontrados) {
                    dtm.addRow(agregarRowATabla(f));
                }
            }
        }

    }//GEN-LAST:event_jButtonDirectorioActionPerformed

    private void jButtonExtensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtensionActionPerformed
        String extension = jTextFieldExtension.getText().toLowerCase();

        for (int i = jTableTabla.getRowCount() - 1; i >= 0; i--) {

            String celda = (String) jTableTabla.getValueAt(i, 1);
            celda = celda.toLowerCase();
            
            if (!celda.equals(extension) && !celda.equals("." + extension)) {
                dtm.removeRow(i);
            }
        }
    }//GEN-LAST:event_jButtonExtensionActionPerformed

    private void jButtonLimpCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpCamposActionPerformed
        jTextFieldDirectorio.setText("");
        jTextFieldExtension.setText("");
    }//GEN-LAST:event_jButtonLimpCamposActionPerformed

    private void jButtonLimpTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpTablaActionPerformed
        for (int i = jTableTabla.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }//GEN-LAST:event_jButtonLimpTablaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDirectorio;
    private javax.swing.JButton jButtonExtension;
    private javax.swing.JButton jButtonLimpCampos;
    private javax.swing.JButton jButtonLimpTabla;
    private javax.swing.JLabel jLabelDirectorio;
    private javax.swing.JLabel jLabelExtension;
    private javax.swing.JLabel jLabelInformacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabla;
    private javax.swing.JTextField jTextFieldDirectorio;
    private javax.swing.JTextField jTextFieldExtension;
    // End of variables declaration//GEN-END:variables
}
