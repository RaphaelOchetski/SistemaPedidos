/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.TipoProduto;
import model.TipoProdutoDao;

/**
 *
 * @author L02E07
 */
public class TipoProdutoController {
    public List<TipoProduto> listaTipoProdutos(){
        TipoProdutoDao dao = new TipoProdutoDao();
        try {
            return dao.findTipoProduto();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Tipo Produto\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    
  

    public void alterar(int idtipoproduto, String descricao) throws SQLException{
        TipoProduto tipoProduto = new TipoProduto();
        tipoProduto.setIdTipoProduto(idtipoproduto);
        tipoProduto.setDescricao(descricao);
        new TipoProdutoDao().alterar(tipoProduto);
      }
    
    public void salvar(String descricao) throws SQLException{
        TipoProduto tipoProduto = new TipoProduto();
        tipoProduto.setDescricao(descricao);
        new TipoProdutoDao().salvar(tipoProduto);
    }
    public void excluir(int idtipoproduto) throws SQLException{
        new TipoProdutoDao().excluir(idtipoproduto);
    }
    
      public TipoProduto buscaTipoProdutoPorDescricao(String descricao) throws SQLException{
        TipoProdutoDao dao = new TipoProdutoDao();
        return dao.findByDescricao(descricao);
    }
      
     public TipoProduto buscaTipoProdutoPorId(int tipo_id) throws SQLException{
        TipoProdutoDao dao = new TipoProdutoDao();
        return dao.findTipoPorId(tipo_id);
     }
}
   
