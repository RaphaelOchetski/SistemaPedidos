/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ProdutoDao extends GenericDao {
    public void alterar(Produto produto) throws SQLException{
        String update = "UPDATE PRODUTO " +
                    "SET nome = ?, preco = ? " +
                    "WHERE idproduto = ?";
        update(update, produto.getIdProduto(), produto.getNome(), produto.getPreco());
    }
    
     public void salvar(Produto produto) throws SQLException{
        String insert = "INSERT INTO PRODUTO(nome, preco) VALUES (?,?)";
        save(insert, produto.getNome(), produto.getPreco());
    }
    
    public void excluir (int id) throws SQLException{
        String delete = "DELETE FROM PRODUTO WHERE idproduto = ?";
        delete (delete, id);
    }
    
    public List<Produto> findProdutos() throws SQLException {
        List<Produto> produtos = new ArrayList<Produto>();
        String select = "SELECT * FROM PRODUTO";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setIdProduto(rs.getInt("idproduto"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getDouble("preco"));
            produtos.add(produto);
            
        }
        rs.close();
        stmt.close();
        return produtos;
    }
    
   public ResultSet ConsultarTipo(ResultSet rs){  
        try {  
            Connection conexao = (Connection) ConnectionDataBase.getConnection();
        String select = "SELECT * FROM PRODUTO";
        Statement stmt = (Statement) conexao.createStatement();
        rs = stmt.executeQuery(select);             
            } catch (Exception erro) {  
            System.out.println(" Erro ao consultar estado: "+erro);  
        }  
     return rs;     
    }  
  

  /*  public ResultSet ConsultarTipoProduto(){  
      //  Connection conexao = Banco.getConexao();  
        try {              
        String select = "SELECT * FROM PRODUTO";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();             
            } catch (Exception erro) {  
            System.out.println(" Erro ao consultar estado: "+erro);  
        }
        while(rs.next()){  
        
}  
     return rs;    
    }  */

    public List<Produto> findByName (String nome) throws SQLException{
        String select = "select * from produto Where Nome like ? '%'";
        List<Produto> produtos = new ArrayList<Produto>();
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            Produto produto = new Produto();
            produto.setIdProduto(rs.getInt("idproduto"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getDouble("preco"));
            produtos.add(produto);
        }
        rs.close();
        stmt.close();
        return produtos;
    }
    
    public Produto findProdutoPorId(int produto_id) throws SQLException {
      
        String select = "SELECT * FROM produto WHERE idproduto = ?";
        java.sql.PreparedStatement stmt = (java.sql.PreparedStatement) getConnection().prepareStatement(select);
        stmt.setInt(1, produto_id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        
       
            Produto produto = new Produto();
            produto.setIdProduto(rs.getInt("idproduto"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getDouble("preco"));                     
        
        rs.close();
        stmt.close();
        return produto;
    }
        
}
