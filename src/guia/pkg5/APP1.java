/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

/**
 *
 * @author Diegp
 */
public class APP1 extends javax.swing.JFrame {

    /**
     * Creates new form APP1
     */
    public APP1() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnvolumencircunferencia = new javax.swing.JButton();
        btnvolumenesfera = new javax.swing.JButton();
        BTNVOLUMENCUBO = new javax.swing.JButton();
        BTNPROMEDIO = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 370));
        setMinimumSize(new java.awt.Dimension(400, 370));
        setPreferredSize(new java.awt.Dimension(400, 370));
        getContentPane().setLayout(null);

        jButton1.setText("Calcular el Area de una Figura de 4 lados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(54, 31, 275, 35);

        jLabel1.setText("¿Que desea hacer?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(156, 11, 160, 14);

        btnvolumencircunferencia.setText("Calcular circuferencia de un circulo");
        btnvolumencircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolumencircunferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolumencircunferencia);
        btnvolumencircunferencia.setBounds(54, 84, 275, 33);

        btnvolumenesfera.setText("Calcular Volumen de Una Esfera");
        btnvolumenesfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolumenesferaActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolumenesfera);
        btnvolumenesfera.setBounds(54, 135, 275, 31);

        BTNVOLUMENCUBO.setText("Calcular volumen de un cubo");
        BTNVOLUMENCUBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVOLUMENCUBOActionPerformed(evt);
            }
        });
        getContentPane().add(BTNVOLUMENCUBO);
        BTNVOLUMENCUBO.setBounds(54, 184, 275, 35);

        BTNPROMEDIO.setText("Calcular Promedio");
        BTNPROMEDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPROMEDIOActionPerformed(evt);
            }
        });
        getContentPane().add(BTNPROMEDIO);
        BTNPROMEDIO.setBounds(54, 230, 275, 35);

        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(150, 280, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mate.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm4lados jframe = new frm4lados();
        jframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnvolumencircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolumencircunferenciaActionPerformed
        frmcirculo jframe = new frmcirculo();
            jframe.setVisible(true);
    }//GEN-LAST:event_btnvolumencircunferenciaActionPerformed

    private void btnvolumenesferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolumenesferaActionPerformed
        frmesfera jframe= new frmesfera();
        jframe.setVisible(true);
    }//GEN-LAST:event_btnvolumenesferaActionPerformed

    private void BTNVOLUMENCUBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVOLUMENCUBOActionPerformed
        Frmcubo jframe= new Frmcubo ();
        jframe.setVisible(true);
    }//GEN-LAST:event_BTNVOLUMENCUBOActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BTNPROMEDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPROMEDIOActionPerformed
        frmpromedio jframe= new frmpromedio();
        jframe.setVisible(true);
    }//GEN-LAST:event_BTNPROMEDIOActionPerformed

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
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNPROMEDIO;
    private javax.swing.JButton BTNVOLUMENCUBO;
    private javax.swing.JButton btnvolumencircunferencia;
    private javax.swing.JButton btnvolumenesfera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
