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
import model.Produto;
import model.ProdutoDao;
import model.TipoProduto;
import model.TipoProdutoDao;

/**
 *
 * @author Guilherme
 */
public class ProdutoController {
    
    public List<Produto> listaProdutos(){
        ProdutoDao dao = new ProdutoDao();
        try {
            return dao.findProdutos();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar produto\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    
  

    public void alterar(int id, String nome, double preco) throws SQLException{
        Produto produto = new Produto();
            produto.setIdProduto(id);
            produto.setNome(nome);
            produto.setPreco(preco);
         new ProdutoDao().alterar(produto);
      }
    
    public int salvar (String nome, double preco) throws Exception{
       
           if(nome.equalsIgnoreCase("") || preco <= 0.0){
                throw new Exception("Valores Invalidos");
             }
           else{
                Produto produto = new Produto();
                    produto.setNome(nome);
                    produto.setPreco(preco);
                new ProdutoDao().salvar(produto);
                return 1;
           }      
    }
    public void excluir(int id) throws SQLException{
        new ProdutoDao().excluir(id);
    }
    
    public List<Produto> buscaProdutoPorNome(String nome) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        return dao.findByName(nome);
    }
    
    public Produto buscaProdutoPorId(int produto_id) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        return dao.findProdutoPorId(produto_id);
    }
}
