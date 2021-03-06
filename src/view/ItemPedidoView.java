/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemPedidoController;
import controller.PedidoController;
import controller.ProdutoController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

/**
 *
 * @author guifarah
 */
public class ItemPedidoView extends javax.swing.JFrame {
    private List<Produto> produtoList = new ProdutoController().listaProdutos();
    private List<ItemPedido> itemPedidoList = new ItemPedidoController().listaItemPedido();

    private int registroAtual = 0;
    int permissao = 0;
    
   
    /**
     * Creates new form Pedido
     */
    public ItemPedidoView() {
        initComponents();
        registroAtual = 0;  
        getValores(registroAtual);
        
        cmb_nomeProd.removeAllItems();
         for( Produto produto: produtoList ){  
        cmb_nomeProd.addItem(produto.getIdProduto()+" - "+produto.getNome());
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiasPedidos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edt_idPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edt_idmesa = new javax.swing.JTextField();
        btn_primeiro = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmb_nomeProd = new javax.swing.JComboBox();
        edt_subtotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edt_valorunitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edt_qtd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pedido");

        jLabel2.setText("Nome do Produto");

        jLabel3.setText("Id Mesa");

        btn_primeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Primeiro.png"))); // NOI18N
        btn_primeiro.setEnabled(false);
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Voltar.png"))); // NOI18N
        btn_anterior.setEnabled(false);
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Avancar.png"))); // NOI18N
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Ultimo.png"))); // NOI18N
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Excluir.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Alterar.png"))); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.setPreferredSize(new java.awt.Dimension(99, 41));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Novo.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.setToolTipText("");
        btn_novo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_novo.setMaximumSize(new java.awt.Dimension(111, 41));
        btn_novo.setMinimumSize(new java.awt.Dimension(99, 41));
        btn_novo.setPreferredSize(new java.awt.Dimension(99, 41));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancelar.png"))); // NOI18N
        btn_cancelar1.setText("Cancelar");
        btn_cancelar1.setEnabled(false);
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        jLabel5.setText("SubTotal");

        cmb_nomeProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        edt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_subtotalActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor Unitario");

        jLabel4.setText("Quantidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cmb_nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(211, 211, 211)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edt_idmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(edt_valorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(edt_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_idmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_valorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        guiasPedidos.addTab("Pedido", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasPedidos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasPedidos)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
      
            String m = cmb_nomeProd.getSelectedItem().toString();
            String y = String.valueOf(m.charAt(0));
            
            String nomeProduto = m.substring(2);
             
            int idProduto = Integer.parseInt(y);            
            int idPedido = Integer.parseInt(edt_idPedido.getText());
            int idMesa = Integer.parseInt(edt_idmesa.getText());
            double subTotal = Double.parseDouble(edt_subtotal.getText());
            int qtd = Integer.parseInt(edt_qtd.getText());
            double valorUnitario = Double.parseDouble(edt_valorunitario.getText());
            ItemPedidoController cc = new ItemPedidoController();
         
        if (permissao==1){
            int id = itemPedidoList.get(registroAtual).getIdpedido();
           
            try {
                cc.alterar(id, idMesa, idPedido, idProduto, subTotal, valorUnitario, nomeProduto, qtd);
                JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso!");
                LimparCampos();
                itemPedidoList = new ItemPedidoController().listaItemPedido();
                registroAtual = -1;
                botao_Salvar();
                permissao = 0;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possivel alterar o pedido!\n" + e.getLocalizedMessage());
            }
        } else if (permissao == 0){


            try {
                cc.salvar(idMesa, idPedido, idProduto, subTotal, valorUnitario,nomeProduto, qtd);
                JOptionPane.showMessageDialog(this, "Pedido salvo com sucesso!");
                itemPedidoList = new ItemPedidoController().listaItemPedido();
                registroAtual = -1;
                LimparCampos();
                botao_Salvar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possivel salvar pedido!\n" + e.getLocalizedMessage());
            } catch (Exception ex) {
                Logger.getLogger(ItemPedidoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        LimparCampos();
        botao_Novo();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        permissao = 1;
        edt_idPedido.setEditable(true);
        edt_idmesa.setEditable(true);
        edt_subtotal.setEditable(true);
        edt_valorunitario.setEditable(true);
        botao_Alterar();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        ItemPedidoController cc = new ItemPedidoController();
        int id = itemPedidoList.get(registroAtual).getIditem();
        try {
            cc.excluir(id);
            JOptionPane.showMessageDialog(this, "Pedido exlcuido com sucesso!");
            LimparCampos();
            itemPedidoList = new ItemPedidoController().listaItemPedido();
            registroAtual = -1;
            botao_Excluir();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possivel excluir o pedido!\n" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        registroAtual = itemPedidoList.size() - 1;
        getValores(registroAtual);
        Ultimo();
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        if (registroAtual != itemPedidoList.size() - 1) {
            getValores(++registroAtual);
            btn_anterior.setEnabled(true);
            btn_primeiro.setEnabled(true);
            if (registroAtual == itemPedidoList.size() - 1) {
                btn_proximo.setEnabled(false);
                btn_ultimo.setEnabled(false);
            }

        }
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        if (registroAtual != 0) {
            getValores(--registroAtual);
            btn_proximo.setEnabled(true);
            btn_ultimo.setEnabled(true);
            if (registroAtual == 0) {
                btn_primeiro.setEnabled(false);
                btn_anterior.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        registroAtual = 0;
        getValores(registroAtual);
        Primeiro();
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void edt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_subtotalActionPerformed

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
            java.util.logging.Logger.getLogger(ItemPedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemPedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemPedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemPedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemPedidoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JComboBox cmb_nomeProd;
    private javax.swing.JTextField edt_idPedido;
    private javax.swing.JTextField edt_idmesa;
    private javax.swing.JTextField edt_qtd;
    private javax.swing.JTextField edt_subtotal;
    private javax.swing.JTextField edt_valorunitario;
    private javax.swing.JTabbedPane guiasPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void getValores(int index) {
    if (index <= itemPedidoList.size() - 1){
        
        ItemPedido itemPedidoAtual = itemPedidoList.get(index);
        String idmesa = String.valueOf(itemPedidoAtual.getIdmesa()) ;
        String idPedido = String.valueOf(itemPedidoAtual.getIdpedido());
        String quantidade = String.valueOf(itemPedidoAtual.getQuantidade());
        String subtotal = String.valueOf(itemPedidoAtual.getSubtotal());
        String valorUnitario = String.valueOf(itemPedidoAtual.getValorunitario());


        //JOptionPane.showMessageDialog(null, quantidade);
        edt_idPedido.setText(idPedido);
        edt_idmesa.setText(idmesa);
        edt_qtd.setText(quantidade);
        edt_subtotal.setText(subtotal);
        edt_valorunitario.setText(valorUnitario);
    }
}

private void LimparCampos(){
        edt_idPedido.setText("");
        edt_idmesa.setText("");
        edt_qtd.setText("");
        edt_subtotal.setText("");
        edt_valorunitario.setText("");
}
public void botao_Novo() {
        btn_salvar.setEnabled(true);
        btn_excluir.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_novo.setEnabled(false);       
        //btn_addItens.setEnabled(true);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(false);
        btn_ultimo.setEnabled(false);
        edt_idmesa.setEditable(true);
    }
    
    public void botao_Salvar(){
        btn_salvar.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        //btn_addItens.setEnabled(false);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(true);
        btn_ultimo.setEnabled(true);
        edt_idmesa.setEditable(false);
        
        
    }
    
    public void botao_Excluir(){
        btn_salvar.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        //btn_addItens.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_primeiro.setEnabled(false);
        btn_proximo.setEnabled(true);
        btn_ultimo.setEnabled(true);
    }

    public void botao_Cancelar() {
        btn_salvar.setEnabled(false);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_novo.setEnabled(true);
       // btn_addItens.setEnabled(false);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(true);
        btn_ultimo.setEnabled(true);
    }

public void Primeiro(){
       btn_primeiro.setEnabled(false);
       btn_anterior.setEnabled(false);
       btn_proximo.setEnabled(true);
       btn_ultimo.setEnabled(true);
    }
    
public void Ultimo(){
     btn_primeiro.setEnabled(true);
       btn_anterior.setEnabled(true);
       btn_proximo.setEnabled(false);
       btn_ultimo.setEnabled(false);    
    }
public void botao_Alterar(){
        btn_salvar.setEnabled(true);
        btn_alterar.setEnabled(false);
        btn_novo.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_alterar.setEnabled(false);
        //btn_addItens.setEnabled(true);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(false);
        btn_ultimo.setEnabled(false);
        
    }



/*
for( Produto produto: produtoList ){
          
          if(candidato.getPar_id()==partido.getIdPartido()){
              comboBoxPartido.setSelectedItem(partido.getIdPartido()+" - "+partido.getNomePartido());
          }
          
      }
*/
}
