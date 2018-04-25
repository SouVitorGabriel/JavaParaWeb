/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import javax.swing.JOptionPane;
import model.Produto;
import controller.CtrProduto;

/**
 *
 * @author Biel
 */
public class FrmProduto extends javax.swing.JInternalFrame {

    CtrProduto controller;

    public FrmProduto() {
        initComponents();
        controller = new CtrProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDescr = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtEstoque = new javax.swing.JTextField();
        txtEstMin = new javax.swing.JTextField();
        btnCad = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnConsultar = new javax.swing.JToggleButton();
        btnPrimeiro = new javax.swing.JToggleButton();
        btnAnterior = new javax.swing.JToggleButton();
        btnAvancar = new javax.swing.JToggleButton();
        btnUltimo = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Controle de Produto");
        setMinimumSize(new java.awt.Dimension(410, 350));
        setPreferredSize(new java.awt.Dimension(410, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cód:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Valor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setText("Estoque:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setText("Estoque minimo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 280, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 280, -1));
        getContentPane().add(txtDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 280, -1));
        getContentPane().add(txtEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 280, -1));
        getContentPane().add(txtEstMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 280, -1));

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        getContentPane().add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        btnPrimeiro.setText("<<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnAvancar.setText(">");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        /*
        int cod = Integer.parseInt(txtCod.getText());
        String nome = txtNome.getText();
        String descricao = txtDescr.getText();
        double valor = Double.parseDouble(txtValor.getText());
        int est = Integer.parseInt(txtEstoque.getText());
        int estMin = Integer.parseInt(txtEstMin.getText());
         */
        controller.cadastraProd(Integer.parseInt(txtCod.getText()),
                txtNome.getText(),
                txtDescr.getText(),
                Double.parseDouble(txtValor.getText()),
                Integer.parseInt(txtEstoque.getText()),
                Integer.parseInt(txtEstMin.getText()));
        limpadinha();
        mensagem("Produto cadastrado com sucesso!");
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        escreveNoFrm(controller.consultaProd(Integer.parseInt(txtCod.getText())));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        controller.removeObj(Integer.parseInt(txtCod.getText()));
        controller.cadastraProd(Integer.parseInt(txtCod.getText()),
                txtNome.getText(),
                txtDescr.getText(),
                Double.parseDouble(txtValor.getText()),
                Integer.parseInt(txtEstoque.getText()),
                Integer.parseInt(txtEstMin.getText()));
        limpadinha();
        mensagem("Produto alterado com sucesso!");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        controller.removeObj(Integer.parseInt(txtCod.getText()));
        limpadinha();
        mensagem("Produto excluido.");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed

        try {
            escreveNoFrm(controller.avanca());
        } catch (Exception e) {
            mensagem("Ultimo produto!");
        }
        /* if(indice == this.produtos.size())
            mensagem("Ultimo registro");
        else
        {
            escreveNoFrm(this.produtos.get(indice+1));
            indice++;
        } */

        // escreveNoFrm(controller.produtos.get(controller.avanca()));
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        try {
            escreveNoFrm(controller.retorna());
        } catch (Exception e) {
            mensagem("Primeiro produto!");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        escreveNoFrm(controller.ultimo());
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        escreveNoFrm(controller.primeiro());
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void escreveNoFrm(Produto p) {
        txtCod.setText(p.getCod() + "");
        txtNome.setText(p.getNome());
        txtValor.setText(p.getValor().toString());
        txtEstMin.setText(p.getEstMin() + "");
        txtDescr.setText(p.getDescri());
        txtEstoque.setText(p.getEstoque() + "");
    }

    private void limpadinha() {
        txtCod.setText("");
        txtNome.setText("");
        txtValor.setText("");
        txtEstMin.setText("");
        txtDescr.setText("");
        txtEstoque.setText("");
    }

    private void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Prova de Java", JOptionPane.OK_OPTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnAnterior;
    private javax.swing.JToggleButton btnAvancar;
    private javax.swing.JToggleButton btnCad;
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnPrimeiro;
    private javax.swing.JToggleButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDescr;
    private javax.swing.JTextField txtEstMin;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
