/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.view;

import aplikasibcs.kontrol.KontrolMain;
import javax.swing.JDesktopPane;

/**
 *
 * @author admin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    KontrolMain km;
    public MainFrame() {
        initComponents();
        km = new KontrolMain(this);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnInput = new javax.swing.JMenu();
        inBarang = new javax.swing.JMenuItem();
        inCustomer = new javax.swing.JMenuItem();
        inSupplier = new javax.swing.JMenuItem();
        mnTrans = new javax.swing.JMenu();
        trBarang = new javax.swing.JMenuItem();
        inventory = new javax.swing.JMenuItem();
        mnLapor = new javax.swing.JMenu();
        tmLapor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        mnInput.setText("Input");

        inBarang.setText("Barang");
        inBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inBarangActionPerformed(evt);
            }
        });
        mnInput.add(inBarang);

        inCustomer.setText("Customer");
        inCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCustomerActionPerformed(evt);
            }
        });
        mnInput.add(inCustomer);

        inSupplier.setText("Supplier");
        mnInput.add(inSupplier);

        jMenu1.add(mnInput);

        mnTrans.setText("Transaksi");

        trBarang.setText("jMenuItem1");
        mnTrans.add(trBarang);

        jMenu1.add(mnTrans);

        inventory.setText("Inventory");
        jMenu1.add(inventory);

        jMenuBar1.add(jMenu1);

        mnLapor.setText("Laporan");

        tmLapor.setText("Tampilkan Laporan");
        tmLapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmLaporActionPerformed(evt);
            }
        });
        mnLapor.add(tmLapor);

        jMenuBar1.add(mnLapor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmLaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmLaporActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmLaporActionPerformed

    private void inBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inBarangActionPerformed
        // TODO add your handling code here:
        km.tampilInBarang();
    }//GEN-LAST:event_inBarangActionPerformed

    private void inCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCustomerActionPerformed
        // TODO add your handling code here:
        km.tampilInCust();
    }//GEN-LAST:event_inCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JMenuItem inBarang;
    private javax.swing.JMenuItem inCustomer;
    private javax.swing.JMenuItem inSupplier;
    private javax.swing.JMenuItem inventory;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnInput;
    private javax.swing.JMenu mnLapor;
    private javax.swing.JMenu mnTrans;
    private javax.swing.JMenuItem tmLapor;
    private javax.swing.JMenuItem trBarang;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getDesk() {
        return desk;
    }

}
