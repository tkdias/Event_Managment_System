/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evet.managment.system;

/**
 *
 * @author Dewanganii
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEventdet = new javax.swing.JButton();
        btnWedding = new javax.swing.JButton();
        btnAnnvesary = new javax.swing.JButton();
        btnBday = new javax.swing.JButton();
        btnBusinessCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1378, 742));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home page");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 150, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Event Managment System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 50, 450, 48);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1400, 130);

        btnEventdet.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnEventdet.setText("Event Details");
        btnEventdet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEventdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventdetActionPerformed(evt);
            }
        });
        getContentPane().add(btnEventdet);
        btnEventdet.setBounds(540, 180, 190, 80);

        btnWedding.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnWedding.setText("Wedding");
        btnWedding.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeddingActionPerformed(evt);
            }
        });
        getContentPane().add(btnWedding);
        btnWedding.setBounds(200, 300, 180, 90);

        btnAnnvesary.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAnnvesary.setText("Anniversary");
        btnAnnvesary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnnvesary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnvesaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnnvesary);
        btnAnnvesary.setBounds(200, 510, 180, 90);

        btnBday.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnBday.setText("Birthday  Party");
        btnBday.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBdayActionPerformed(evt);
            }
        });
        getContentPane().add(btnBday);
        btnBday.setBounds(950, 290, 190, 90);

        btnBusinessCon.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnBusinessCon.setText("Business Confronts");
        btnBusinessCon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusinessCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessConActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusinessCon);
        btnBusinessCon.setBounds(950, 500, 190, 90);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 120, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeddingActionPerformed
        // TODO add your handling code here:
        Wedding wd = new Wedding();   
        wd.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnWeddingActionPerformed

    private void btnEventdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventdetActionPerformed
        // TODO add your handling code here:
        EventDetails Event_det = new EventDetails();
        Event_det.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEventdetActionPerformed

    private void btnBdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBdayActionPerformed
        // TODO add your handling code here:
        Parties bp = new Parties();
        bp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBdayActionPerformed

    private void btnAnnvesaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnvesaryActionPerformed
        // TODO add your handling code here:
        Anniversaries anv = new Anniversaries();   
        anv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnnvesaryActionPerformed

    private void btnBusinessConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusinessConActionPerformed
        // TODO add your handling code here:
        BusinessCo bc = new BusinessCo();   
        bc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBusinessConActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnvesary;
    private javax.swing.JButton btnBday;
    private javax.swing.JButton btnBusinessCon;
    private javax.swing.JButton btnEventdet;
    private javax.swing.JButton btnWedding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
