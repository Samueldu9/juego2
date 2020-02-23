/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaljuego2;

import javax.swing.JOptionPane;

/**
 *
 * @author sapenaba
 */
public class FrmPPTLS extends javax.swing.JFrame {

    /**
     * Creates new form FrmPPTLS
     */
    int aleatorio;
    int piedra,papel,tijera,lagarto,spock;
    public FrmPPTLS() {
        initComponents();
        piedra=1;
        papel=2;
        tijera=3;
        lagarto=4;
        spock=5;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPiedra = new javax.swing.JButton();
        btnSpock = new javax.swing.JButton();
        btnLagarto = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaljuego2/piedra.png"))); // NOI18N
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnSpock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaljuego2/spock.png"))); // NOI18N
        btnSpock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpockActionPerformed(evt);
            }
        });

        btnLagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaljuego2/lagarto.png"))); // NOI18N
        btnLagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagartoActionPerformed(evt);
            }
        });

        btnTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaljuego2/tijera.png"))); // NOI18N
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaljuego2/papel.png"))); // NOI18N
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLagarto)
                    .addComponent(btnSpock))
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPiedra)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSpock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        aleatorio=(int)(Math.random()*5+1);
        System.out.print(aleatorio);
    }//GEN-LAST:event_formWindowOpened

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed

        if (aleatorio == piedra)
        {
            JOptionPane.showMessageDialog(null,"Empate");
        }
        else if (aleatorio == papel)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else if(aleatorio == spock)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        } 
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        if (aleatorio == papel)
        {
            JOptionPane.showMessageDialog(null,"Empate");
        }
        else if (aleatorio == tijera)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else if(aleatorio == lagarto)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        } 
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        if (aleatorio == tijera)
        {
            JOptionPane.showMessageDialog(null,"Empate");
        }
        else if (aleatorio == piedra)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else if(aleatorio == spock)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        } 
    }//GEN-LAST:event_btnTijeraActionPerformed

    private void btnLagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagartoActionPerformed
        if (aleatorio == lagarto)
        {
            JOptionPane.showMessageDialog(null,"Empate");
        }
        else if (aleatorio == tijera)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else if(aleatorio == piedra)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        } 
    }//GEN-LAST:event_btnLagartoActionPerformed

    private void btnSpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpockActionPerformed
        if (aleatorio == spock)
        {
            JOptionPane.showMessageDialog(null,"Empate");
        }
        else if (aleatorio == papel)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else if(aleatorio == lagarto)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        } 
    }//GEN-LAST:event_btnSpockActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPPTLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPPTLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPPTLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPPTLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPPTLS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLagarto;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnSpock;
    private javax.swing.JButton btnTijera;
    // End of variables declaration//GEN-END:variables
}
