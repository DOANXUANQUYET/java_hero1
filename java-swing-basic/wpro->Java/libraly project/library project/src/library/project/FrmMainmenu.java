/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.project;

/**
 *
 * @author doanxuanquyet
 */
public class FrmMainmenu extends javax.swing.JFrame {

    int x = 120;
    int y = 90;
    /**
     * Creates new form FrmMainmenu
     */
    public FrmMainmenu() {
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

        btnfrmkashidashi = new javax.swing.JButton();
        btnfrmhenkyaku = new javax.swing.JButton();
        btnfrmyoyaku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("メインメニュー");

        btnfrmkashidashi.setText("図書の貸出");
        btnfrmkashidashi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrmkashidashiActionPerformed(evt);
            }
        });

        btnfrmhenkyaku.setText("図書の返却");
        btnfrmhenkyaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrmhenkyakuActionPerformed(evt);
            }
        });

        btnfrmyoyaku.setText("貸出の予約");
        btnfrmyoyaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrmyoyakuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnfrmyoyaku, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(btnfrmkashidashi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnfrmhenkyaku, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfrmkashidashi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfrmhenkyaku, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnfrmyoyaku, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfrmkashidashiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrmkashidashiActionPerformed
        // TODO add your handling code here:
        FrmKashidashi frmkashidashi = new FrmKashidashi();
        x+=30;
        y+=30;
        frmkashidashi.setBounds(x, y, 630, 741);
        frmkashidashi.show();
    }//GEN-LAST:event_btnfrmkashidashiActionPerformed

    private void btnfrmhenkyakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrmhenkyakuActionPerformed
        // TODO add your handling code here:
        FrmHenkyaku frmhenkyaku = new FrmHenkyaku();
        x+=30;
        y+=30;
        frmhenkyaku.setBounds(x, y, 570, 299);
        frmhenkyaku.show();
    }//GEN-LAST:event_btnfrmhenkyakuActionPerformed

    private void btnfrmyoyakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrmyoyakuActionPerformed
        // TODO add your handling code here:
        FrmYoyaku frmyoyaku = new FrmYoyaku();
        x+=30;
        y+=30;
        frmyoyaku.setBounds(x, y, 859, 772);
        frmyoyaku.show();
    }//GEN-LAST:event_btnfrmyoyakuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfrmhenkyaku;
    private javax.swing.JButton btnfrmkashidashi;
    private javax.swing.JButton btnfrmyoyaku;
    // End of variables declaration//GEN-END:variables
}
