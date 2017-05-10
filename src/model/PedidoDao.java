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
 * @author Matheus
 */
public class PedidoDao extends GenericDao {
    
    public void alterar(Pedido pedido) throws SQLException{
        String update = "UPDATE PEDIDO " +
                    "SET IDSTATUS = ?, VALORTOTAL = ? " + 
                    "WHERE IDPEDIDO = ?";
        update(update, pedido.getIdpedido(), pedido.getStatus(), pedido.getValortotal());
    }
    
    public void encerrarPedido(Pedido pedido) throws SQLException{
        String update = "UPDATE Pedido " +
                    "SET idstatus = 0 " + 
                    "WHERE idpedido = ?";
        update(update, pedido.getIdpedido());
    }
    
     public void salvar() throws SQLException{
        String insert = "INSERT INTO Pedido(data, idstatus) VALUES (CURDATE(),1)";
        save(insert); 
    }
    
    public void excluir (int idpedido) throws SQLException{
        String delete = "DELETE FROM PEDIDO WHERE idpedido = ?";
        delete (delete, idpedido);
    }
    
    public List<Pedido> findPedido() throws SQLException {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        String select = "SELECT * FROM PEDIDO";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setIdpedido(rs.getInt("idpedido"));
            pedido.setData(rs.getString("data"));
            pedido.setStatus(rs.getInt("idstatus"));
            pedido.setValortotal(rs.getDouble("valortotal"));
            pedidos.add(pedido);
            
        }
        rs.close();
        stmt.close();
        return pedidos;
    }
    
   /** public List<Pedido> findStatus() throws SQLException {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        String select = "SELECT * FROM STATUS";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }**/
    
    
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
            mesa.setStatus(rs.getInt("status"));
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
            mesa.setStatus(rs.getInt("status"));
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
            mesa.setStatus(rs.getInt("status"));
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
            mesa.setStatus(rs.getInt("status"));
                      
        
        rs.close();
        stmt.close();
        return mesa;
    }
     
     

   
    
}
