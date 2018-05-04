/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import javax.swing.JOptionPane;
import model.Sorteio;

/**
 *
 * @author Biel
 */
public class FrmMegaSena extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMegaSena
     */
    
    Sorteio sorteioPremiado;
    
    public FrmMegaSena() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDezena1 = new javax.swing.JTextField();
        txtDezena2 = new javax.swing.JTextField();
        txtDezena3 = new javax.swing.JTextField();
        txtDezena4 = new javax.swing.JTextField();
        txtDezena5 = new javax.swing.JTextField();
        txtDezena6 = new javax.swing.JTextField();
        btnChecar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Mega Sena");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Número 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Número 3:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Número 4:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setText("Número 5:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setText("Número 6:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtDezena1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena1KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 300, -1));

        txtDezena2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena2KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 300, -1));

        txtDezena3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena3KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 300, -1));

        txtDezena4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena4KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 300, -1));

        txtDezena5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena5KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 300, -1));

        txtDezena6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDezena6KeyReleased(evt);
            }
        });
        getContentPane().add(txtDezena6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 300, -1));

        btnChecar.setText("Checar");
        btnChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecarActionPerformed(evt);
            }
        });
        getContentPane().add(btnChecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 66, 120, 166));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecarActionPerformed
        int numeroUsuario1 = Integer.parseInt(txtDezena1.getText());
        int numeroUsuario2 = Integer.parseInt(txtDezena2.getText());
        int numeroUsuario3 = Integer.parseInt(txtDezena3.getText());
        int numeroUsuario4 = Integer.parseInt(txtDezena4.getText());
        int numeroUsuario5 = Integer.parseInt(txtDezena5.getText());
        int numeroUsuario6 = Integer.parseInt(txtDezena6.getText());
        
        boolean acertouDezena1 = false;
        boolean acertouDezena2 = false;
        boolean acertouDezena3 = false;
        boolean acertouDezena4 = false;
        boolean acertouDezena5 = false;
        boolean acertouDezena6 = false;
        boolean acertouSorteio = false;
        
        if(acertouSorteio == false)
        {
            for (Sorteio s : FrmPrincipal.listaSorteios)
            {
               
                
                for (int i = 0; i <= 6; i++)
                {
                    if (numeroUsuario1 == s.getDezena(i+1))
                    {
                        acertouDezena1 = true;
                    }
                    if (numeroUsuario2 == s.getDezena(i+1))
                    {
                        acertouDezena2 = true;
                    }
                    if (numeroUsuario3 == s.getDezena(i+1))
                    {
                        acertouDezena3 = true;
                    }
                    if (numeroUsuario4 == s.getDezena(i+1))
                    {
                        acertouDezena4 = true;
                    }
                    if (numeroUsuario5 == s.getDezena(i+1))
                    {
                        acertouDezena5 = true;
                    }
                    if (numeroUsuario6 == s.getDezena(i+1))
                    {
                        acertouDezena6 = true;
                    }
                    
                    if (acertouDezena1 == true && acertouDezena2 == true && acertouDezena3 == true && acertouDezena4 == true && acertouDezena5 == true && acertouDezena6 == true)
                    {
                        acertouSorteio = true;
                        sorteioPremiado = s;
                    }
                }
                
                acertouDezena1 = false;
                acertouDezena2 = false;
                acertouDezena3 = false;
                acertouDezena4 = false;
                acertouDezena5 = false;
                acertouDezena6 = false;
                acertouSorteio = false;
            }
        }
        
        if (acertouSorteio == true)
        {
            JOptionPane.showMessageDialog(null ,"Parabéns! \n\n Você acertou os números do sorteio:"
                    + " " + sorteioPremiado.getNumeroJogo() + "# \n Dezena 1: " + sorteioPremiado.getDezena1()
                    + "\n Dezena 2: " + sorteioPremiado.getDezena2()
                    + "\n Dezena 3: " + sorteioPremiado.getDezena3()
                    + "\n Dezena 4: " + sorteioPremiado.getDezena4()
                    + "\n Dezena 5: " + sorteioPremiado.getDezena5()
                    + "\n Dezena 6: " + sorteioPremiado.getDezena6());
        }
    }//GEN-LAST:event_btnChecarActionPerformed

    private void txtDezena1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena1KeyReleased
        if (txtDezena1.getText().equals(txtDezena2.getText()))
        {
            txtDezena1.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena1.getText().equals(txtDezena3.getText()))
        {
            txtDezena1.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena1.getText().equals(txtDezena4.getText()))
        {
            txtDezena1.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena1.getText().equals(txtDezena5.getText()))
        {
            txtDezena1.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena1.getText().equals(txtDezena6.getText()))
        {
            txtDezena1.setText("Informe um número diferente dos anteriores");
        }   
    }//GEN-LAST:event_txtDezena1KeyReleased

    private void txtDezena2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena2KeyReleased
        if (txtDezena2.getText().equals(txtDezena1.getText()))
        {
            txtDezena2.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena2.getText().equals(txtDezena3.getText()))
        {
            txtDezena2.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena2.getText().equals(txtDezena4.getText()))
        {
            txtDezena2.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena2.getText().equals(txtDezena5.getText()))
        {
            txtDezena2.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena2.getText().equals(txtDezena6.getText()))
        {
            txtDezena2.setText("Informe um número diferente dos anteriores");
        }
    }//GEN-LAST:event_txtDezena2KeyReleased

    private void txtDezena3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena3KeyReleased
        if (txtDezena3.getText().equals(txtDezena2.getText()))
        {
            txtDezena3.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena3.getText().equals(txtDezena1.getText()))
        {
            txtDezena3.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena3.getText().equals(txtDezena4.getText()))
        {
            txtDezena3.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena3.getText().equals(txtDezena5.getText()))
        {
            txtDezena3.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena3.getText().equals(txtDezena6.getText()))
        {
            txtDezena3.setText("Informe um número diferente dos anteriores");
        }
    }//GEN-LAST:event_txtDezena3KeyReleased

    private void txtDezena4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena4KeyReleased
        if (txtDezena4.getText().equals(txtDezena2.getText()))
        {
            txtDezena4.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena4.getText().equals(txtDezena3.getText()))
        {
            txtDezena4.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena4.getText().equals(txtDezena1.getText()))
        {
            txtDezena4.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena4.getText().equals(txtDezena5.getText()))
        {
            txtDezena4.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena4.getText().equals(txtDezena6.getText()))
        {
            txtDezena4.setText("Informe um número diferente dos anteriores");
        }
    }//GEN-LAST:event_txtDezena4KeyReleased

    private void txtDezena5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena5KeyReleased
        if (txtDezena5.getText().equals(txtDezena2.getText()))
        {
            txtDezena5.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena5.getText().equals(txtDezena3.getText()))
        {
            txtDezena5.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena5.getText().equals(txtDezena4.getText()))
        {
            txtDezena5.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena5.getText().equals(txtDezena1.getText()))
        {
            txtDezena5.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena5.getText().equals(txtDezena6.getText()))
        {
            txtDezena5.setText("Informe um número diferente dos anteriores");
        }
    }//GEN-LAST:event_txtDezena5KeyReleased

    private void txtDezena6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDezena6KeyReleased
        if (txtDezena6.getText().equals(txtDezena2.getText()))
        {
            txtDezena6.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena6.getText().equals(txtDezena3.getText()))
        {
            txtDezena6.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena6.getText().equals(txtDezena4.getText()))
        {
            txtDezena6.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena6.getText().equals(txtDezena5.getText()))
        {
            txtDezena6.setText("Informe um número diferente dos anteriores");
        }
        if (txtDezena6.getText().equals(txtDezena1.getText()))
        {
            txtDezena6.setText("Informe um número diferente dos anteriores");
        }
    }//GEN-LAST:event_txtDezena6KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChecar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtDezena1;
    private javax.swing.JTextField txtDezena2;
    private javax.swing.JTextField txtDezena3;
    private javax.swing.JTextField txtDezena4;
    private javax.swing.JTextField txtDezena5;
    private javax.swing.JTextField txtDezena6;
    // End of variables declaration//GEN-END:variables
}
