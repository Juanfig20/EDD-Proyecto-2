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
public class UsersMenu extends javax.swing.JFrame {
    
    private static Master master;
    
    /**
    * Descripción: Este constructor crea la ventana UsersMenu y almacena los datos del objeto master con el que fue creada.
    * @author Andrés
    * @version 23/11/2023
    * Nombres y tipos de parámetros: Un objeto tipo Master llamado master que almacena la información de la base de datos.
    */
    public UsersMenu(Master master) {
        initComponents();
        setMaster(master);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
    * Descripción: Este setter almacena dentro del objeto de tipo UsersMenu el objeto de tipo Master.
    * @author Andrés
    * @version 23/11/2023
    * Nombre y tipo de parámetro: Un objeto de clase Master llamado master que contiene la información de la base de datos.
    */
    public static void setMaster(Master master) {
        UsersMenu.master = master;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wallpaper = new javax.swing.JPanel();
        deleteUser = new javax.swing.JButton();
        Wallpaper_icon = new javax.swing.JLabel();
        addUser1 = new javax.swing.JButton();
        visualizeUsers = new javax.swing.JButton();
        uploadCSV = new javax.swing.JButton();
        back = new javax.swing.JButton();
        createDocument = new javax.swing.JButton();
        printDocument = new javax.swing.JButton();
        deleteDocument = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wallpaper.setBackground(new java.awt.Color(255, 255, 255));
        Wallpaper.setMaximumSize(new java.awt.Dimension(642, 400));
        Wallpaper.setMinimumSize(new java.awt.Dimension(642, 400));
        Wallpaper.setPreferredSize(new java.awt.Dimension(642, 400));
        Wallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteUser.setBackground(new java.awt.Color(204, 204, 204));
        deleteUser.setForeground(new java.awt.Color(0, 0, 0));
        deleteUser.setText("Eliminar Usuario");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        Wallpaper.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 50));

        Wallpaper_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Users.png"))); // NOI18N
        Wallpaper.add(Wallpaper_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 360));

        addUser1.setBackground(new java.awt.Color(204, 204, 204));
        addUser1.setForeground(new java.awt.Color(0, 0, 0));
        addUser1.setText("Agregar Usuario");
        addUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUser1ActionPerformed(evt);
            }
        });
        Wallpaper.add(addUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 50));

        visualizeUsers.setBackground(new java.awt.Color(204, 204, 204));
        visualizeUsers.setForeground(new java.awt.Color(0, 0, 0));
        visualizeUsers.setText("Ver Usuarios Registrados");
        visualizeUsers.setToolTipText("");
        visualizeUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizeUsersActionPerformed(evt);
            }
        });
        Wallpaper.add(visualizeUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 50));

        uploadCSV.setBackground(new java.awt.Color(204, 204, 204));
        uploadCSV.setForeground(new java.awt.Color(0, 0, 0));
        uploadCSV.setText("Cargar Archivo CSV");
        uploadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadCSVActionPerformed(evt);
            }
        });
        Wallpaper.add(uploadCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 50));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Wallpaper.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        createDocument.setBackground(new java.awt.Color(204, 204, 204));
        createDocument.setForeground(new java.awt.Color(0, 0, 0));
        createDocument.setText("Crear un Documento");
        createDocument.setToolTipText("");
        createDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocumentActionPerformed(evt);
            }
        });
        Wallpaper.add(createDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 50));

        printDocument.setBackground(new java.awt.Color(204, 204, 204));
        printDocument.setForeground(new java.awt.Color(0, 0, 0));
        printDocument.setText("Enviar Documento a Impresora");
        printDocument.setToolTipText("");
        printDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDocumentActionPerformed(evt);
            }
        });
        Wallpaper.add(printDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, 50));

        deleteDocument.setBackground(new java.awt.Color(204, 204, 204));
        deleteDocument.setForeground(new java.awt.Color(0, 0, 0));
        deleteDocument.setText("Eliminar un Documento");
        deleteDocument.setToolTipText("");
        deleteDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocumentActionPerformed(evt);
            }
        });
        Wallpaper.add(deleteDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 50));

        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizeUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizeUsersActionPerformed
        JOptionPane.showMessageDialog(null, master.UsersString(), "Usuarios Registrados", HEIGHT);
    }//GEN-LAST:event_visualizeUsersActionPerformed

    private void deleteDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocumentActionPerformed
        master.DeleteDocument();
    }//GEN-LAST:event_deleteDocumentActionPerformed

    private void addUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUser1ActionPerformed
        master.NewUser();
    }//GEN-LAST:event_addUser1ActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        master.DeleteUser();
    }//GEN-LAST:event_deleteUserActionPerformed

    private void createDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocumentActionPerformed
        master.NewDocument();
    }//GEN-LAST:event_createDocumentActionPerformed

    /**
    * Descripción: Este método da la instrucción al botón "Regresar" de abrir de regreso una ventana WelcomeMenu
    * al cerrar la ventana UsersMenu actual.
    * @author Andrés
    * @version 21/11/2023
    */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        WelcomeMenu welcomeMenu = new WelcomeMenu(master);
    }//GEN-LAST:event_backActionPerformed

    private void uploadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadCSVActionPerformed
        UsersMenu.master.LoadUsers();
    }//GEN-LAST:event_uploadCSVActionPerformed

    private void printDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDocumentActionPerformed
        master.AddDocument_Printer();
    }//GEN-LAST:event_printDocumentActionPerformed

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
            java.util.logging.Logger.getLogger(UsersMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersMenu(master).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Wallpaper;
    private javax.swing.JLabel Wallpaper_icon;
    private javax.swing.JButton addUser1;
    private javax.swing.JButton back;
    private javax.swing.JButton createDocument;
    private javax.swing.JButton deleteDocument;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton printDocument;
    private javax.swing.JButton uploadCSV;
    private javax.swing.JButton visualizeUsers;
    // End of variables declaration//GEN-END:variables
}
