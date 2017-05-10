/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import model.ItemPedido;
import model.ItemPedidoDao;
import model.Produto;
import model.ProdutoDao;
import model.TipoProduto;
import model.TipoProdutoDao;

/**
 *
 * @author Raphael
 */
public class ItemPedidoController {
    
    public List<ItemPedido> listaItemPedido(){
        ItemPedidoDao dao = new ItemPedidoDao();
        try {
            return dao.findItemPedido();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar item\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    
  

    public void alterar(int iditem, int idmesa, int idpedido, int idproduto, double subtotal, double valorunitario, String nomeprod, int qtd) throws SQLException{
        
        ItemPedido itemPedido = new ItemPedido();
            itemPedido.setIditem(iditem);
            itemPedido.setIdmesa(idmesa);
            itemPedido.setIdpedido(idpedido);
            itemPedido.setIdproduto(idproduto);
            itemPedido.setNomeprod(nomeprod);
            itemPedido.setQuantidade(qtd);
            itemPedido.setSubtotal(subtotal);
            itemPedido.setValorunitario(valorunitario);
         new ItemPedidoDao().alterar(itemPedido);
      }
    
    public void salvar (int idmesa, int idpedido, int idproduto, double subtotal, double valorunitario, String nomeprod, int qtd) throws SQLException{
       
           
            ItemPedido itemPedido = new ItemPedido();
                itemPedido.setIdmesa(idmesa);
                itemPedido.setIdpedido(idpedido);
                itemPedido.setIdproduto(idproduto);
                itemPedido.setNomeprod(nomeprod);
                itemPedido.setQuantidade(qtd);
                itemPedido.setSubtotal(subtotal);
                itemPedido.setValorunitario(valorunitario);
            new ItemPedidoDao().salvar(itemPedido);
    }
    
    public void excluir(int iditem) throws SQLException{
        new ItemPedidoDao().excluir(iditem);
    }
    
 /*  public List<Produto> buscaProdutoPorNome(String nome) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        return dao.findByName(nome);
    }
    
    public Produto buscaProdutoPorId(int produto_id) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        return dao.findProdutoPorId(produto_id);
    }
    */
}
