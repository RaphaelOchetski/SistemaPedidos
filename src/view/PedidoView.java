/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PedidoController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pedido;

/**
 *
 * @author kira
 */
public class PedidoView extends javax.swing.JFrame {
    private List<Pedido> pedidoList = new PedidoController().listaPedidos();
    private int registroAtual = 0;
    int permissao = 0;
    /**
     * Creates new form Pedido
     */
    public PedidoView() {
        initComponents();
        registroAtual = 0;  
        getValores(registroAtual);
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
        edt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edt_data = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edt_status = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edt_total = new javax.swing.JTextField();
        btn_primeiro = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_addItens = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pedido");

        jLabel2.setText("Data");

        jLabel3.setText("Status");

        jLabel4.setText("Total");

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

        btn_addItens.setText("Adicionar Itens");
        btn_addItens.setEnabled(false);
        btn_addItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addItensActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(edt_id)
                            .addComponent(edt_data, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(edt_total, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(edt_status)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_addItens, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edt_total)
                    .addComponent(edt_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addItens, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        registroAtual = 0;
        getValores(registroAtual);
        Primeiro();
    }//GEN-LAST:event_btn_primeiroActionPerformed

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

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        if (registroAtual != pedidoList.size() - 1) {
            getValores(++registroAtual);
            btn_anterior.setEnabled(true);
            btn_primeiro.setEnabled(true);
            if (registroAtual == pedidoList.size() - 1) {
                btn_proximo.setEnabled(false);
                btn_ultimo.setEnabled(false);
            }

        }
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        registroAtual = pedidoList.size() - 1;
        getValores(registroAtual);
        Ultimo();
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        PedidoController cc = new PedidoController();
        int id = pedidoList.get(registroAtual).getIdpedido();
        try {
            cc.excluir(id);
            JOptionPane.showMessageDialog(this, "Pedido exlcuido com sucesso!");
            LimparCampos();
            pedidoList = new PedidoController().listaPedidos();
            registroAtual = -1;
            botao_Excluir();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possivel excluir o pedido!\n" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        permissao = 1;
        edt_data.setEditable(true);
        edt_status.setEditable(true);
        edt_total.setEditable(true);
        botao_Alterar();

    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        LimparCampos();
        botao_Novo();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (permissao==1){
            PedidoController cc = new PedidoController();
            int id = pedidoList.get(registroAtual).getIdpedido();            
            JOptionPane.showMessageDialog(null, id);
            int status = Integer.parseInt(edt_status.getText());
            double valortotal = Double.parseDouble(edt_total.getText());
            try {
                cc.alterar(id, status, valortotal);
                JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso!");
                LimparCampos();
                pedidoList = new PedidoController().listaPedidos();
                registroAtual = -1;
                botao_Salvar();
                permissao = 0;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possivel alterar o pedido!\n" + e.getLocalizedMessage());
            }
        } else if (permissao == 0){

            PedidoController cc = new PedidoController();
            
            try {
                cc.salvar();
                JOptionPane.showMessageDialog(this, "Pedido salvo com sucesso!");
                pedidoList = new PedidoController().listaPedidos();
                registroAtual = -1;
                LimparCampos();
                botao_Salvar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possivel salvar pedido!\n" + e.getLocalizedMessage());
            } catch (Exception ex) {
                Logger.getLogger(PedidoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_addItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addItensActionPerformed
        registroAtual = 0;
        getValores(registroAtual);
        botao_Cancelar();
        Primeiro();
    }//GEN-LAST:event_btn_addItensActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addItens;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JTextField edt_data;
    private javax.swing.JTextField edt_id;
    private javax.swing.JTextField edt_status;
    private javax.swing.JTextField edt_total;
    private javax.swing.JTabbedPane guiasPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void getValores(int index) {
    if (index <= pedidoList.size() - 1){
        Pedido pedidoAtual = pedidoList.get(index);
        String id = String.valueOf(pedidoAtual.getIdpedido()) ;
        String data = String.valueOf(pedidoAtual.getData());
        String status = String.valueOf(pedidoAtual.getStatus());
        String valortotal = String.valueOf(pedidoAtual.getValortotal());


        edt_id.setText(id);
        edt_data.setText(data);
        edt_status.setText(status);
        edt_total.setText(valortotal);
            }
}

private void LimparCampos(){
    edt_id.setText("");
    edt_data.setText("");
    edt_status.setText("");
    edt_total.setText("");
}
public void botao_Novo() {
        btn_salvar.setEnabled(true);
        btn_excluir.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_novo.setEnabled(false);       
        btn_addItens.setEnabled(true);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(false);
        btn_ultimo.setEnabled(false);
        edt_data.setEditable(true);
        edt_status.setEditable(true);
        edt_total.setEditable(true);
    }
    
    public void botao_Salvar(){
        btn_salvar.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_addItens.setEnabled(false);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(true);
        btn_ultimo.setEnabled(true);
        edt_data.setEditable(false);
        edt_status.setEditable(false);
        edt_total.setEditable(false);
        
        
    }
    
    public void botao_Excluir(){
        btn_salvar.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_addItens.setEnabled(false);
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
        btn_addItens.setEnabled(false);
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
        btn_addItens.setEnabled(true);
        btn_primeiro.setEnabled(false);
        btn_anterior.setEnabled(false);
        btn_proximo.setEnabled(false);
        btn_ultimo.setEnabled(false);
        
    }

}
