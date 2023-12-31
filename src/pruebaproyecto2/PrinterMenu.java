/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class PrinterMenu extends javax.swing.JFrame {

    private static Master master;

    /**
    * Descripción: Este constructor crea la ventana PrinterMenu y almacena los datos del objeto master con el que fue creada.
    * @author Andrés
    * @version 23/11/2023
    * Nombres y tipos de parámetros: Un objeto tipo Master llamado master que almacena la información de la base de datos.
    */
    public PrinterMenu(Master master) {
        initComponents();
        setMaster(master);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
    * Descripción: Este setter almacena dentro del objeto de tipo PrinterMenu el objeto de tipo Master.
    * @author Andrés
    * @version 23/11/2023
    * Nombre y tipo de parámetro: Un objeto de clase Master llamado master que contiene la información de la base de datos.
    */
    public static void setMaster(Master master) {
        PrinterMenu.master = master;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visualizePrinterLine = new javax.swing.JButton();
        deleteDocumentFromPrinter = new javax.swing.JButton();
        printFromLine = new javax.swing.JButton();
        visualizePrinterTree = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visualizePrinterLine.setBackground(new java.awt.Color(204, 204, 204));
        visualizePrinterLine.setForeground(new java.awt.Color(0, 0, 0));
        visualizePrinterLine.setText("Ver Cola de Impresión");
        visualizePrinterLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizePrinterLineActionPerformed(evt);
            }
        });
        jPanel1.add(visualizePrinterLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 220, 70));

        deleteDocumentFromPrinter.setBackground(new java.awt.Color(204, 204, 204));
        deleteDocumentFromPrinter.setForeground(new java.awt.Color(0, 0, 0));
        deleteDocumentFromPrinter.setText("Eliminar Documento de la Cola");
        deleteDocumentFromPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocumentFromPrinterActionPerformed(evt);
            }
        });
        jPanel1.add(deleteDocumentFromPrinter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 220, 70));

        printFromLine.setBackground(new java.awt.Color(204, 204, 204));
        printFromLine.setForeground(new java.awt.Color(0, 0, 0));
        printFromLine.setText("Liberar Impresora");
        printFromLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFromLineActionPerformed(evt);
            }
        });
        jPanel1.add(printFromLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 220, 70));

        visualizePrinterTree.setBackground(new java.awt.Color(204, 204, 204));
        visualizePrinterTree.setForeground(new java.awt.Color(0, 0, 0));
        visualizePrinterTree.setText("Ver Árbol de Impresión");
        visualizePrinterTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizePrinterTreeActionPerformed(evt);
            }
        });
        jPanel1.add(visualizePrinterTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 220, 70));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Printer.jpg"))); // NOI18N
        Wallpaper.setText("jLabel1");
        jPanel1.add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Descripción: Este método da la instrucción al botón "Regresar" de abrir de regreso una ventana WelcomeMenu
    * al cerrar la ventana UsersMenu actual.
    * @author Andrés
    * @version 21/11/2023
    */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new WelcomeMenu(master);
    }//GEN-LAST:event_backActionPerformed

    private void printFromLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFromLineActionPerformed
        master.Desencolar();
    }//GEN-LAST:event_printFromLineActionPerformed

    private void visualizePrinterLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizePrinterLineActionPerformed
        master.ShowArray();
    }//GEN-LAST:event_visualizePrinterLineActionPerformed

    private void visualizePrinterTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizePrinterTreeActionPerformed
//        this.setVisible(false);
//        new MonticuloBinario_Grafico(master);
          JOptionPane.showMessageDialog(null, "¡ERROR al mostrar el arbol!");
    }//GEN-LAST:event_visualizePrinterTreeActionPerformed

    private void deleteDocumentFromPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocumentFromPrinterActionPerformed
        master.borrarDocumentodeCola();
    }//GEN-LAST:event_deleteDocumentFromPrinterActionPerformed

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
            java.util.logging.Logger.getLogger(PrinterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrinterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrinterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrinterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinterMenu(master).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteDocumentFromPrinter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printFromLine;
    private javax.swing.JButton visualizePrinterLine;
    private javax.swing.JButton visualizePrinterTree;
    // End of variables declaration//GEN-END:variables
}
