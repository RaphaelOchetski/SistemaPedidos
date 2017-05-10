/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author L02E07
 */
public class TipoProdutoDao extends GenericDao {
    public void alterar (TipoProduto tipoproduto) throws SQLException{
        String update = "UPDATE TIPOPRODUTO " +
                    "SET descricao = ? " +
                    "WHERE idtipoproduto = ?";
        update(update, tipoproduto.getIdTipoProduto(), tipoproduto.getDescricao());
    }
    
     public void salvar(TipoProduto tipoproduto) throws SQLException{
        String insert = "INSERT INTO TIPOPRODUTO(descricao) VALUES (?)";
        save(insert, tipoproduto.getDescricao());
    }
    
    public void excluir (int idtipoprouto) throws SQLException{
        String delete = "DELETE FROM TIPOPRODUTO WHERE idtipoproduto = ?";
        delete (delete, idtipoprouto);
    }
    
    public List<TipoProduto> findTipoProduto() throws SQLException {
        List<TipoProduto> tipoprodutos = new ArrayList<TipoProduto>();
        String select = "SELECT * FROM TIPOPRODUTO";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            TipoProduto tipoproduto = new TipoProduto();
            tipoproduto.setIdTipoProduto(rs.getInt("idtipoproduto"));
            tipoproduto.setDescricao(rs.getString("descricao"));
            tipoprodutos.add(tipoproduto);
            
        }
        rs.close();
        stmt.close();
        return tipoprodutos;
    }
    
    public TipoProduto findByDescricao (String descricao) throws SQLException{
        String select = "select * from tipoproduto Where descricao like ? '%'";
        TipoProduto tipoproduto = null;
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            tipoproduto = new TipoProduto();
            tipoproduto.setDescricao(rs.getString("descricao"));
        }
        rs.close();
        stmt.close();
        return tipoproduto;
    }
    
     public TipoProduto findTipoPorId(int tipo_id) throws SQLException {
      
        String select = "SELECT * FROM tipoproduto WHERE idtipoproduto = ?";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setInt(1, tipo_id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        
       
            TipoProduto tipoProduto = new TipoProduto();
            tipoProduto.setIdTipoProduto(rs.getInt("idtipoproduto"));
            tipoProduto.setDescricao(rs.getString("descricao"));                     
        
        rs.close();
        stmt.close();
        return tipoProduto;
    }
    
    
}