/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diegp
 */
public class frmcirculo extends javax.swing.JFrame {

    /**
     * Creates new form frmcirculo
     */
    public frmcirculo() {
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
        txtdiametro = new javax.swing.JTextField();
        btncalcularcircunferencia = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblcircu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setPreferredSize(new java.awt.Dimension(350, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Calcular la circunferencia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 210, 17);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("ingrese el diametro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 130, 20);

        txtdiametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiametroKeyTyped(evt);
            }
        });
        getContentPane().add(txtdiametro);
        txtdiametro.setBounds(153, 43, 98, 30);

        btncalcularcircunferencia.setText("calcular");
        btncalcularcircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularcircunferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcularcircunferencia);
        btncalcularcircunferencia.setBounds(87, 101, 90, 23);

        jButton2.setText("Regresar a ver otras funciones de la app");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 200, 290, 23);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("Resultado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(217, 81, 80, 17);

        lblcircu.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        getContentPane().add(lblcircu);
        lblcircu.setBounds(220, 100, 88, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mate3.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 350, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularcircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularcircunferenciaActionPerformed
       double diametro=Double.parseDouble(txtdiametro.getText());
       lblcircu.setText(String.valueOf(diametro*3.14));
    }//GEN-LAST:event_btncalcularcircunferenciaActionPerformed

    private void txtdiametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiametroKeyTyped
          
             
            char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }
              
          
        
        
    }//GEN-LAST:event_txtdiametroKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
       
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmcirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcirculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcularcircunferencia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcircu;
    private javax.swing.JTextField txtdiametro;
    // End of variables declaration//GEN-END:variables

    private JTextField setText(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
