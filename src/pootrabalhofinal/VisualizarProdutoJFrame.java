/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalhofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 01213820286
 */
public class VisualizarProdutoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarProdutoJFrame
     */
    
    //referência para tela de cadastro de produtos
    private ProdutoJFrame telaProduto;
    
    //array para "salvar" os produtos (durante a execução do programa)
    private ArrayList<Produto> array_produto;
    
    
    public VisualizarProdutoJFrame() {
        initComponents();
        
        
        telaProduto = new ProdutoJFrame(this);
        this.array_produto = new ArrayList<Produto>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        novoVisualizarProduto = new javax.swing.JButton();
        visualizarProduto = new javax.swing.JButton();
        excluirProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor Compra", "Lucrativdade", "Valor Venda", "Bloqueado Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        novoVisualizarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoVisualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Botoes_Site_5752_Knob_Add.png"))); // NOI18N
        novoVisualizarProduto.setText("Novo");
        novoVisualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoVisualizarProdutoActionPerformed(evt);
            }
        });

        visualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/visualizar.png"))); // NOI18N
        visualizarProduto.setText("Visualizar");
        visualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarProdutoActionPerformed(evt);
            }
        });

        excluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Botoes_Site_5750_Knob_Cancel.png"))); // NOI18N
        excluirProduto.setText("Excluir");
        excluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(novoVisualizarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visualizarProduto)
                .addGap(104, 104, 104)
                .addComponent(excluirProduto)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoVisualizarProduto)
                    .addComponent(visualizarProduto)
                    .addComponent(excluirProduto))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoVisualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoVisualizarProdutoActionPerformed
        // TODO add your handling code here:
        this.telaProduto.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_novoVisualizarProdutoActionPerformed

    private void visualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarProdutoActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaProdutos.getSelectedRow();
        
        if (linhaSelecionada < 0){
            JOptionPane.showMessageDialog(this, "Selecione um produto", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            this.telaProduto.mostrarProduto(array_produto.get(linhaSelecionada));
            this.setVisible(false);
        }
    }//GEN-LAST:event_visualizarProdutoActionPerformed

    private void excluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaProdutos.getSelectedRow();
        
        if (linhaSelecionada < 0){
            JOptionPane.showMessageDialog(this, "Selecione um produto", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            this.removeProduto(linhaSelecionada);
        }
    }//GEN-LAST:event_excluirProdutoActionPerformed

    //método para adicionar produto ao array e a tabela
    public void addProduto(Produto p){
        this.array_produto.add(p);
        this.addProdutoToTable(p);
    }
    
    //método para adicionar produto à tabela
    public void addProdutoToTable (Produto p){
        DefaultTableModel model = (DefaultTableModel)tabelaProdutos.getModel();
        model.addRow(new Object[]{p.getNome(), p.getValor_compra(), p.getLucratividade(), p.getValor_venda(), p.isBloqueado()});
    }
    
    //método para remover produto do array e da tabela
    public void removeProduto(int i){
        array_produto.remove(i);
        removeProdutoFromTable(i);
    }
    
    //método para remover produto da tabela
    public void removeProdutoFromTable(int i){
        DefaultTableModel model = (DefaultTableModel)tabelaProdutos.getModel();
        model.removeRow(i);
    }
    
    
    public void redesenhaTabela(){
        DefaultTableModel model = (DefaultTableModel)tabelaProdutos.getModel();
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }
        
        for (Produto p: array_produto){
            model.addRow(new Object[]{p.getNome(), p.getValor_compra(), p.getLucratividade(), p.getValor_venda(), p.isBloqueado()});
        }
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
            java.util.logging.Logger.getLogger(VisualizarProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarProdutoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton excluirProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoVisualizarProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JButton visualizarProduto;
    // End of variables declaration//GEN-END:variables
}