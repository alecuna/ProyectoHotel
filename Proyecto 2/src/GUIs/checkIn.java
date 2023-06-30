/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import FuncionesVarias.Funciones;
import Functions.Habitacion;
import Hashtable.Client;
import javax.swing.JOptionPane;
import static proyecto.pkg2.Main.reservas;
import static proyecto.pkg2.Main.rooms;

/**
 * Interfaz grafica (JFrame) que permite que los clientes con reservacion realicen Check-In al hotel
 */
public class checkIn extends javax.swing.JFrame {

    /**
     * Creates new form checkIn
     */
    public checkIn() {
        initComponents();
    }
    
    //Atributos de la clase 
    private Client cliente;
    private int hab;
    
    
    Funciones use = new Funciones();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 249, 182));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Images/hotel-bell.png"))); // NOI18N
        jLabel1.setText(" Check In");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel4.setText("Ingrese su numero de cedula para que se le asigne una habitacion");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Recuerde que debe tener reservacion!");

        aceptar.setBackground(new java.awt.Color(249, 249, 182));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Images/checks.png"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        datos.setEditable(false);
        datos.setBackground(new java.awt.Color(255, 255, 209));
        datos.setColumns(20);
        datos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        datos.setRows(5);
        jScrollPane1.setViewportView(datos);

        title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("Recibo de");

        ingresar.setText("Ingresar al Hotel");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aceptar))
                            .addComponent(title)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(exit)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(aceptar)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingresar)
                        .addGap(18, 18, 18)
                        .addComponent(cancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que muestra los datos del check-in del cliente cuando ingresa su cedula
     * @param evt 
     */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

        try{
            String cedulaStr = cedula.getText().trim();
            cedulaStr = cedulaStr.replace(".", "");
            int ci = Integer.parseInt(cedulaStr);
            cliente = reservas.reservationDetails(reservas.getRoot(), ci);
            if (cliente != null){
                hab = use.asignarHab(cliente);
                title.setText("Recibo de "+cliente.getName()+" "+cliente.getLastName());
                String info = "Cedula: "+ci+"\nNumero de habitacion asignado: "+hab+"\nTipo de habitacion: "+cliente.getTipoHab();
                datos.setText(info);
                cedula.setText("");
                Habitacion prueba = (Habitacion) rooms.getDato(hab-1).getElement();
                prueba.setFree(true);
            } else{
                JOptionPane.showMessageDialog(null, "No existe ninguna reservacion con el N° de cedula "+ci);
                cedula.setText("");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No existe ningun check-in activo, ingrese una cedula para iniciar"+e);
            cedula.setText("");
        }
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * Metodo que cierra la ventana al pulsar el boton "Salir"
     * @param evt, evento llevado a cabo por el usuario 
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * Metodo que elimina los datos del check-in del cliente al tocar el boton "Cancelar"
     * @param evt, evento llevado a cabo por el usuario 
     */
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if (cliente != null){
        int choice = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cancelar el check-in?\nSe eliminara la habitacion asignada");
        if (choice != 1){
            JOptionPane.showMessageDialog(null, "Reservacion cancelada");
            Habitacion roomActual  = (Habitacion) rooms.getDato(hab-1).getElement();
            roomActual.setFree(true);
            cedula.setText("");
            title.setText("Recibo de ");
            datos.setText(""); 
            cliente = null;
        } } else{
            JOptionPane.showMessageDialog(null, "No existe ningun check-in activo, ingrese una cedula para iniciar");
        }
    
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * Metodo que realiza el check in del cliente y lo agrega a la lista de huespedes al tocar el boton de "Ingresar al Hotel"
     * @param evt, evento llevado a cabo por el usuario 
     */
    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        try{
        cliente.setRoomNum(hab);
        use.checkIn(cliente);
        JOptionPane.showMessageDialog(null, "Bienvenido! Esperamos disfrute su estadia");
        cedula.setText("");
        title.setText("Recibo de ");
        datos.setText("");
        cliente = null;}
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Recuerde ingresar una cedula valida!"+e);
        }
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextArea datos;
    private javax.swing.JButton exit;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
