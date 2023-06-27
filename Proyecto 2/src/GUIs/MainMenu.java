/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

/**
 *
 * @author Anabella Jaua
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        registroClientes = new javax.swing.JButton();
        buscarReservacion = new javax.swing.JButton();
        checkIn = new javax.swing.JButton();
        historialHab = new javax.swing.JButton();
        checkOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroClientes.setBackground(new java.awt.Color(204, 102, 0));
        registroClientes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        registroClientes.setForeground(new java.awt.Color(255, 255, 255));
        registroClientes.setText("Registro de Clientes");
        registroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroClientesActionPerformed(evt);
            }
        });
        getContentPane().add(registroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 210, 30));

        buscarReservacion.setBackground(new java.awt.Color(204, 102, 0));
        buscarReservacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buscarReservacion.setForeground(new java.awt.Color(255, 255, 255));
        buscarReservacion.setText("Buscar Reservacion");
        buscarReservacion.setMaximumSize(new java.awt.Dimension(134, 23));
        buscarReservacion.setMinimumSize(new java.awt.Dimension(134, 23));
        buscarReservacion.setPreferredSize(new java.awt.Dimension(134, 23));
        buscarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservacionActionPerformed(evt);
            }
        });
        getContentPane().add(buscarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 210, 30));

        checkIn.setBackground(new java.awt.Color(204, 102, 0));
        checkIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        checkIn.setForeground(new java.awt.Color(255, 255, 255));
        checkIn.setText("Check-In");
        getContentPane().add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 210, 30));

        historialHab.setBackground(new java.awt.Color(204, 102, 0));
        historialHab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        historialHab.setForeground(new java.awt.Color(255, 255, 255));
        historialHab.setText("Historial de Habitacion");
        historialHab.setMaximumSize(new java.awt.Dimension(134, 23));
        historialHab.setPreferredSize(new java.awt.Dimension(134, 23));
        getContentPane().add(historialHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 210, 30));

        checkOut.setBackground(new java.awt.Color(204, 102, 0));
        checkOut.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        checkOut.setForeground(new java.awt.Color(255, 255, 255));
        checkOut.setText("Check-Out");
        getContentPane().add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Images/OASIS (1145 × 770 px).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroClientesActionPerformed
        registroClientes registro = new registroClientes();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
    }//GEN-LAST:event_registroClientesActionPerformed

    private void buscarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservacionActionPerformed
        buscarReserva buscar = new buscarReserva();
        buscar.setVisible(true);
        buscar.setLocationRelativeTo(null);
    }//GEN-LAST:event_buscarReservacionActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarReservacion;
    private javax.swing.JButton checkIn;
    private javax.swing.JButton checkOut;
    private javax.swing.JButton historialHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registroClientes;
    // End of variables declaration//GEN-END:variables
}
