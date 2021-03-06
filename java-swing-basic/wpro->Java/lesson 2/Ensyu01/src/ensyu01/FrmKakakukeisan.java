/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensyu01;

import java.text.NumberFormat; //thu vien dinh dang so
import java.util.Locale; //thu vien dinh dang vi tri
import javax.swing.JOptionPane;

/**
 *
 * @author doanxuanquyet
 */
public class FrmKakakukeisan extends javax.swing.JFrame {
    private final double Tax = 0.08;

    /**
     * Creates new form FrmKakakukeisan
     */
    public FrmKakakukeisan() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTanka = new javax.swing.JTextField();
        txtSuryo = new javax.swing.JTextField();
        txtKakaku = new javax.swing.JTextField();
        btnKaisan = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("価格計算");

        jLabel1.setText("単価");

        jLabel2.setText("数量");

        jLabel3.setText("税込み価格");
        jLabel3.setToolTipText("");

        txtTanka.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtSuryo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtKakaku.setEditable(false);
        txtKakaku.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnKaisan.setText("計算");
        btnKaisan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaisanActionPerformed(evt);
            }
        });

        btnClear.setText("表示のクリア");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFinish.setText("終了");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTanka, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtSuryo)
                            .addComponent(txtKakaku)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinish)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKaisan)
                                .addGap(78, 78, 78)
                                .addComponent(btnClear)))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTanka, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSuryo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtKakaku, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaisan)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaisanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaisanActionPerformed
        // TODO add your handling code here:
        if(!txtTanka.getText().equals("") && !txtSuryo.getText().equals("")){
           
            
            //Integer.valueOf( string ) ep kieu sang int tra ve gai tri kieu object Integer()
            //intanceof kiem tra gia tri co thuoc lop day khong
            //isinstance cung kiem tra gia tri
            
            
            //viet ham tryprase ben duoi
            boolean ret1 = tryParseInt(txtTanka.getText());
            boolean ret2 = tryParseInt(txtSuryo.getText());
            if(ret1 == true && ret2 == true){
                //Integer.ParseInt tra ve kieu ngyen thuy int
                int Tanka = Integer.parseInt(txtTanka.getText());
                int Suryo = Integer.parseInt(txtSuryo.getText());
                int kakaku = (int)(Tanka * Suryo * Tax)+(Tanka * Suryo);
                
                //Integer.toString(int) ep kieu int sang tring
                //hoac dung String.valueOf(int)
                
                Locale loc = Locale.getDefault(); //tao bien vi tri hien tai(hoac dat nuoc muon the hien)
                NumberFormat nf = NumberFormat.getCurrencyInstance(loc);//tao doi tuong format voi vi tri da co
                String text = nf.format(kakaku); //luu ket qua vao mot chuoi hoac so
                txtKakaku.setText(text);
            }
            else
            {
               // JOptionPane.showMessageDialog(null, noi dung, tieu de, kieu_MESSAGE )
               // JOptionPane.showConfirmDialog(rootPane, ret2, title, WIDTH)
  
                JOptionPane.showMessageDialog(null, "単価、数量　は　数値を入力してください","入力エラー",JOptionPane.ERROR_MESSAGE);
            }
               
        }
        else
        {
            JOptionPane.showMessageDialog(null,"未入力の項目があります","入力エラー",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKaisanActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
       int ret = JOptionPane.showConfirmDialog(null,"終了していいですか？", "終了確認",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(ret == JOptionPane.YES_OPTION){
       System.exit(0);
       }
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtTanka.setText("");
       txtSuryo.setText("");
       txtKakaku.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(FrmKakakukeisan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKakakukeisan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKakakukeisan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKakakukeisan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKakakukeisan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnKaisan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtKakaku;
    private javax.swing.JTextField txtSuryo;
    private javax.swing.JTextField txtTanka;
    // End of variables declaration//GEN-END:variables

    boolean tryParseInt(String text) {
        try{
            Integer.parseInt(text);
            return true;
        } //To change body of generated methods, choose Tools | Templates.
        catch(NumberFormatException e)
        {
            return false;
        }
    }
}
