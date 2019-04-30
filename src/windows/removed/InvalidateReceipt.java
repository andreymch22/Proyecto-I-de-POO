/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows.removed;

import javax.swing.JOptionPane;
import main.Main;
import models.Receipt;
import models.Search;

/**
 *
 * @author Andrey M
 */
public class InvalidateReceipt extends javax.swing.JFrame {

    /**
     * Creates new form InvalidateBill
     */
    public InvalidateReceipt() {
        initComponents();
        this.setLocationRelativeTo(null);
        for (Receipt temp : Main.receipts) {
            receiptsComboBox.addItem(temp.getCode() + "/" 
                    + temp.getClient().getName()+ "/" + temp.getTotal());
        }
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method
     * is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        receiptsComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receiptsComboBox.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel1.setText("Select the receipt to be deleted(Code/Client Name/Total):");

        goBackButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(receiptsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addGap(127, 127, 127)
                        .addComponent(goBackButton)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(receiptsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(deleteButton))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeAndReturnToTheMenu(){
        if(Main.administratorConnected != null){
            Main.administratorMenu.setVisible(true);            
        }else{
            Main.cashierMenu.setVisible(true);
        }
        this.dispose();
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            //Take the ID of the selected item in the comboBox
            String receiptCode = receiptsComboBox.getSelectedItem().toString()
                .split("/")[0];
            
            Main.receipts.remove(Search.searchReceipt(receiptCode));
            JOptionPane.showMessageDialog(this, "The receipt was "
                    + "successfully removed");        
        } catch (NullPointerException exception) {
            JOptionPane.showMessageDialog(this, "There are no registered "
                    + "receipts");   
        }finally{
            Main.administratorMenu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        closeAndReturnToTheMenu();
    }//GEN-LAST:event_goBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InvalidateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvalidateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvalidateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvalidateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvalidateReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> receiptsComboBox;
    // End of variables declaration//GEN-END:variables
}