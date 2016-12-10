/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalhofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author 01213820286
 */
public class ProdutoJFrame extends javax.swing.JFrame {
    
    private VisualizarProdutoJFrame telaVisualizarProduto;

    /**
     * Creates new form ProdutoJFrame
     */
    public ProdutoJFrame(VisualizarProdutoJFrame telaVisualizarProduto) {
        initComponents();
        this.telaVisualizarProduto = telaVisualizarProduto;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        campoNomeProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoValorCompraProduto = new javax.swing.JTextField();
        campoLucratividadeProduto = new javax.swing.JTextField();
        campoValorVendaProduto = new javax.swing.JTextField();
        checkBoxBloqueadoProduto = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cadastrarProduto = new javax.swing.JButton();
        limparProduto = new javax.swing.JButton();
        voltarProduto = new javax.swing.JButton();
        obterValorVendaProduto = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Produto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Produto.setText("Cadastro de Produto");

        jLabel1.setText("Nome:");

        campoValorCompraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorCompraProdutoActionPerformed(evt);
            }
        });

        checkBoxBloqueadoProduto.setText("Bloqueado para venda");
        checkBoxBloqueadoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBloqueadoProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor de Compra      R$");

        jLabel3.setText("Lucratividade           %");

        jLabel4.setText("Valor de Venda        R$");

        cadastrarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Botoes_Site_5745_Knob_Valid_Green.png"))); // NOI18N
        cadastrarProduto.setText("Cadastrar");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });

        limparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/vassoura.png"))); // NOI18N
        limparProduto.setText("Limpar");
        limparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparProdutoActionPerformed(evt);
            }
        });

        voltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Botoes_Site_5752_Knob_Left.png"))); // NOI18N
        voltarProduto.setText("Voltar");
        voltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarProdutoActionPerformed(evt);
            }
        });

        obterValorVendaProduto.setText("Calc. Valor Venda");
        obterValorVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obterValorVendaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarProduto)
                        .addGap(27, 27, 27)
                        .addComponent(limparProduto))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Produto)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(23, 23, 23)
                            .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoLucratividadeProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoValorCompraProduto)
                                .addComponent(campoValorVendaProduto)
                                .addComponent(checkBoxBloqueadoProduto)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obterValorVendaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltarProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Produto)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorCompraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLucratividadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(obterValorVendaProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(checkBoxBloqueadoProduto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProduto)
                    .addComponent(limparProduto)
                    .addComponent(voltarProduto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        Produto p = new Produto();
        p.setNome(campoNomeProduto.getText());
        p.setValor_compra(Double.parseDouble(campoValorCompraProduto.getText()));
        p.setLucratividade(Double.parseDouble(campoLucratividadeProduto.getText()));
        
        //calcula automaticamente o valor de venda com base na lucratividade digitada (porcentagem)
        p.setValor_venda(p.getValor_compra() + (p.getValor_compra() * p.getLucratividade()/100));
        
        campoValorVendaProduto.setText(Double.toString(p.getValor_venda()));
        
        //verifica se checkbox está marcado ou desmarcado
        if (checkBoxBloqueadoProduto.isSelected()){
            p.setBloqueado(true);                 
        }
        else
            p.setBloqueado(false);
        
        this.telaVisualizarProduto.addProduto(p);
        JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        limparCampos(); 
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void voltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarProdutoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.telaVisualizarProduto.setVisible(true);
        this.habilitarCampos();
        limparCampos();
    }//GEN-LAST:event_voltarProdutoActionPerformed

    private void limparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparProdutoActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_limparProdutoActionPerformed

    
    //método para botão "Calcular valor de venda", calculando o valor de venda com base na lucratividade
    private void obterValorVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obterValorVendaProdutoActionPerformed
        // TODO add your handling code here:
        double a = Double.parseDouble(campoValorCompraProduto.getText());
        double b = Double.parseDouble(campoLucratividadeProduto.getText());
        campoValorVendaProduto.setText(Double.toString(a + (a * b / 100)));
    }//GEN-LAST:event_obterValorVendaProdutoActionPerformed

    private void campoValorCompraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorCompraProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorCompraProdutoActionPerformed

    private void checkBoxBloqueadoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBloqueadoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxBloqueadoProdutoActionPerformed

    
    private void limparCampos(){
        campoNomeProduto.setText("");
        campoValorCompraProduto.setText("");
        campoLucratividadeProduto.setText("");
        campoValorVendaProduto.setText("");
        checkBoxBloqueadoProduto.setSelected(false);
    }
    
    public void mostrarProduto(Produto p){
        this.campoNomeProduto.setText(p.getNome());
        this.campoValorCompraProduto.setText(String.valueOf(p.getValor_compra()));
        this.campoLucratividadeProduto.setText(String.valueOf(p.getLucratividade()));
        this.campoValorVendaProduto.setText(String.valueOf(p.getValor_venda()));
        
        //verifica se variavel bloqueado é true ou false
        if (p.isBloqueado()){
            this.checkBoxBloqueadoProduto.setSelected(true);
            }else{
                this.checkBoxBloqueadoProduto.setSelected(false);
            }
            desabilitarCampos();
            this.setVisible(true);
        }
        
    public void desabilitarCampos(){
        this.campoNomeProduto.setEnabled(false);
        this.campoValorCompraProduto.setEnabled(false);
        this.campoLucratividadeProduto.setEnabled(false);
        this.campoValorVendaProduto.setEnabled(false);
        this.checkBoxBloqueadoProduto.setEnabled(false);
        this.obterValorVendaProduto.setEnabled(false);
        this.limparProduto.setEnabled(false);
        this.cadastrarProduto.setEnabled(false);
    }
    
    public void habilitarCampos(){
        this.campoNomeProduto.setEnabled(true);
        this.campoValorCompraProduto.setEnabled(true);
        this.campoLucratividadeProduto.setEnabled(true);
        this.campoValorVendaProduto.setEnabled(true);
        this.checkBoxBloqueadoProduto.setEnabled(true);
        this.obterValorVendaProduto.setEnabled(true);
        this.limparProduto.setEnabled(true);
        this.cadastrarProduto.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProdutoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Produto;
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JTextField campoLucratividadeProduto;
    private javax.swing.JTextField campoNomeProduto;
    private javax.swing.JTextField campoValorCompraProduto;
    private javax.swing.JTextField campoValorVendaProduto;
    private javax.swing.JCheckBox checkBoxBloqueadoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limparProduto;
    private javax.swing.JButton obterValorVendaProduto;
    private javax.swing.JButton voltarProduto;
    // End of variables declaration//GEN-END:variables
}
