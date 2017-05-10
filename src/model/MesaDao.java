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
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author l03e06
 */
public class MesaDao extends GenericDao {
    
    public void alterar(Mesa mesa) throws SQLException{
        String update = "UPDATE MESA " +
                    "SET descricao = ?, idstatus = ? " + 
                    "WHERE idmesa = ?";
        update(update, mesa.getIdMesa(), mesa.getDescricao(), mesa.getStatus());
    }
    
    public void desativarMesa(Mesa mesa) throws SQLException{
        String update = "UPDATE MESA " +
                    "SET idstatus = 0 " + 
                    "WHERE idmesa = ?";
        update(update, mesa.getIdMesa());
    }
    
     public void salvar(Mesa mesa) throws SQLException{
        String insert = "INSERT INTO MESA(descricao, idstatus) VALUES (?,?)";
        save(insert, mesa.getDescricao(), mesa.getStatus()); 
    }
    
    public void excluir (int idmesa) throws SQLException{
        String delete = "DELETE FROM MESA WHERE idmesa = ?";
        delete (delete, idmesa);
    }
    
    public List<Mesa> findMesa() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM MESA";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
    
    public List<Mesa> findStatus() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM STATUS";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
    
    
     public List<Mesa> findByDescricao (String descricao) throws SQLException{
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM mesa where descricao like ? '%'";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
     
     public List<Mesa> findMesaAtiva() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM MESA WHERE STATUS = 1 OR STATUS = 2";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
     
     public List<Mesa> findMesaEncerrar() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM MESA";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
     
     public Mesa findMesaPorId(int mesa_id) throws SQLException {
      
        String select = "SELECT * FROM mesa WHERE idmesa = ?";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setInt(1, mesa_id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        
       
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("idstatus"));
                      
        
        rs.close();
        stmt.close();
        return mesa;
    }
     
     

   
    
}
